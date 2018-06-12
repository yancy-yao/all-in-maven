package com.yancy.order;

import com.yancy.commons.results.DubboResult;
import com.yancy.order.dto.*;
import com.yancy.order.req.OrderQueryReq;
import com.yancy.order.resp.PageResp;

import java.util.List;
import java.util.Map;

/**
 * 订单api定义
 *
 * @author:yaoxin
 * @date:Created in 2018/6/11 14:13
 * @description:
 */
public interface OrderApi {

    /**
     * 创建订单
     *
     * @param createOrderInputDTO 创建餐饮订单实体
     * @return 订单id
     */
    DubboResult<Long> creatOrder(CreateOrderInputDTO createOrderInputDTO);

    /**
     * 获取订单详情
     *
     * @param orderId 订单id
     * @return 查询订单详情
     */
    DubboResult<OrderDetailDTO> getOrderDetail(Long orderId);

    /**
     * 商户获取订单详情
     *
     * @param orderId 订单id
     * @return 订单详情
     */
    @Deprecated
    DubboResult<MerchantOrderDetailDTO> getMerchantOrderDetail(Long orderId);

    /**
     * 根据券实例id获取订单详情
     *
     * @param couponId 券实例id
     * @return 查询订单详情
     */
    DubboResult<OrderDetailDTO> getOrderDetailByCouponId(Long couponId);

    /**
     * 获取买家的订单列表
     *<p>
     *     2018-03-22 shizan 需求更新<br>
     *</p>
     * @param accountId 订单id
     * @param orderType 订单类型 非必须，为null时所有类型全部返回 1:线下消费 3:核销 7:购券
     * @param page      第几页
     * @param pageSize  每页的条数
     * @param showNotPayFlag 是否显示未支付状态的订单，1 显示 0 不显示
     * @return 订单列表
     */
    DubboResult<PageResp<OrderSimpleinfoDTO>> getBuyerOrderList(Long accountId, List<Integer> orderType, Integer page, Integer pageSize, Integer showNotPayFlag);

    /**
     * 通过买家id和订单id获取订单详情信息的接口
     *
     * @param accountId 账户id
     * @param orderId 订单id
     * @return 订单详情
     */
    DubboResult<OrderDetailDTO> getBuyerOrderDetail(Long accountId, Long orderId);

    /**
     * 通过商家id和订单id获取订单详情的接口
     *
     * @param merchantId 商户id
     * @param orderId 订单id
     * @return 订单详情
     */
    DubboResult<OrderDetailDTO> getMechantOrderDetail(Long merchantId, Long orderId);

    /**
     * 生效订单
     *
     * @param orderId 订单id
     * @return 生效结果
     */
    DubboResult<Boolean> enabledOrder(Long orderId);


    /**
     * 生效券核销订单
     *
     * @param orderId 订单id
     * @return 生效结果
     */
    DubboResult enabledCouponUseOrder(Long orderId);

    /**
     * 条件查询订单(完成状态下的)
     *
     * @param queryReq 查询条件
     * @return 分页订单列表
     */
    DubboResult<PageResp<OrderSimpleinfoDTO>> getOrdersByQuery(OrderQueryReq queryReq);

    /**
     * 通过订单id，更新商户实际收到的金额
     *
     * @param orderId            订单id
     * @param merchantRealAmount 商户实际收到款项金额
     * @return
     */
    DubboResult<Boolean> updateMerchantRealAmountByOrderId(Long orderId, Long merchantRealAmount);

    /**
     * 现金收款
     * @param orderId 订单id
     * @return
     */
    DubboResult<Boolean> cashReceipts(Long orderId);


    /**
     * 根据就餐id获取订单id
     *
     * @param repastIds 就餐id
     * @return 就餐id订单id
     */
    DubboResult<Map<Long, Long>> getOrderIdsByRepastIds(List<Long> repastIds);

    /**
     * 根据accountid获取总订单数
     * @param accountId
     * @return 总订单数
     */
    DubboResult<Long>  getOrderNum(Long accountId);

    /**
     * 根据订单id获取账户订单详情
     * @param orderId 订单id
     * @return 订单详情
     */
    DubboResult<AccountOrderDetailDTO> getAccountOrderDetailByOrerId(Long orderId);


    /**
     * 获取订单详情(不去判断订单item)
     *
     * @param orderId 订单id
     * @return 查询订单详情
     */
    DubboResult<OrderDetailDTO> getOrderDetailWithoutItem(Long orderId);

    /**
     * 插入订单与券的关联
     * @param orderCouponRefDTOList
     * @return
     */
    DubboResult<Boolean> insertOrderCouponRef(List<OrderCouponRefDTO> orderCouponRefDTOList);

    /**
     * 将订单支付状态置为支付中
     * @param orderId 订单id
     * @return
     */
    DubboResult<Boolean> setOrderPaying(Long orderId);

    /**
     * 设置订单支付状态为手动关闭
     * @param orderId 订单id
     * @return
     */
    DubboResult<Boolean> setOrderManualLock(Long orderId);

    /**
     * 设置订单支付状态为退款中
     * @param orderId 订单id
     * @return
     */
    DubboResult<Boolean> setOrderRefunding(Long orderId);

    /**
     * 获取退款中超时未结束的订单
     * @return
     */
    DubboResult<List<OrderDetailDTO>> getRefundingTimeOutOrderDetail();

    /**
     * 获取支付中超时的订单
     * @return
     */
    DubboResult<List<OrderDetailDTO>> getPayingTimeOutOrderDetail();

    /**
     * 订单过期时间，单位分钟 shizan
     * @param orderType 订单类型 1:线下消费 3:核销 7:购券
     * @return 时间分钟
     */
    DubboResult<Integer> getOrderOutTime(Integer orderType);
}
