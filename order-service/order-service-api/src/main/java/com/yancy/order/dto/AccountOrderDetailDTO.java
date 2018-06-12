package com.yancy.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/12/13 15:30 $$
 */
@Getter
@Setter
public class AccountOrderDetailDTO implements Serializable {
    private static final long serialVersionUID = 1917672323535218851L;

    /**
     * 物理主键
     */
    private Long id;

    /**
     * 积分
     */
    private Long point;

    /**
     * 余额
     */
    private Long balance;

    /**
     * 标价总金额
     */
    private Long totalAmount;
    /**
     * 实际总金额
     */
    private Long realTotalAmount;

    /**
     * 不参与优惠金额
     */
    private Long noDiscountAmount;

    /**
     * 支付状态(0:未支付完成,1:已支付完成)
     */
    private Integer payStatus;

    /**
     * 门店id(卖家)
     */
    private Long storeId;

    /**
     * 桌台名称
     */
    private String seatName;

    /**
     * 创建时间
     */
    private Date create;

    /**
     * 菜品总数量
     */
    private Long itemNum;

    /**
     * 菜品
     */
    private List<OrderItemDTO> orderItems;
}
