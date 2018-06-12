package com.yancy.order.statecode;

import com.yancy.commons.results.CommonStateCodes;
import com.yancy.commons.results.StateCode;

/**
 * 订单服务状态码定义
 *
 * @author
 * @since $$Revision:1.0.0, $$Date: 2017/6/17 下午5:26 $$
 */
public interface OrderServiceStateCodes extends CommonStateCodes {

    //创建订单
    StateCode ORDER_REPASTORDER_CREATORDER_NO_CREATORDERINPUTDTO_ERROR = StateCode.newBuilder().code(107000100010001L).desc("对象[CreateOrderInputDTO]缺失").build();
    StateCode ORDER_REPASTORDER_CREATORDER_NO_TITLE_ERROR = StateCode.newBuilder().code(107000100010002L).desc("参数[title]缺失").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ACCOUNTID_ERROR = StateCode.newBuilder().code(107000100010003L).desc("参数[accountId]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_REPASTID_ERROR = StateCode.newBuilder().code(107000100010004l).desc("参数[repastid]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_REPASTLOCATIONKEY_ERROR = StateCode.newBuilder().code(107000100010005l).desc("参数[repastLocationKey]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_STOREID_ERROR = StateCode.newBuilder().code(107000100010006l).desc("参数[storeId]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_PRODUCTS_ERROR = StateCode.newBuilder().code(107000100010007l).desc("参数[products]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_NO_ORDERITEMDTO_ERROR = StateCode.newBuilder().code(107000100010008l).desc("对象[orderItemDTO]为空").build();
    StateCode ORDER_REPASTORDER_CREATORDER_NO_ORDERITEMDTO_PRODUCTNAME_ERROR = StateCode.newBuilder().code(107000100010019l).desc("订单商品参数[productName]为空").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_ITEMTOTALAMOUNT_ERROR = StateCode.newBuilder().code(107000100010009l).desc("订单商品参数[itemTotalAmount]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_PRODUCTID_ERROR = StateCode.newBuilder().code(107000100010010l).desc("订单商品参数[productId]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_REALITEMTOTALAMOUNT_ERROR = StateCode.newBuilder().code(107000100010011l).desc("订单商品参数[realItemTotalAmount]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_REALPRICE_ERROR = StateCode.newBuilder().code(107000100010012l).desc("订单商品参数[realPrice]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_NUM_ERROR = StateCode.newBuilder().code(107000100010013l).desc("订单商品参数[num]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_PICURL_ERROR = StateCode.newBuilder().code(107000100010014l).desc("订单商品参数[picUrl]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDERITEMDTO_PRICE_ERROR = StateCode.newBuilder().code(107000100010015l).desc("订单商品参数[price]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDER_TOTALAMOUNT_ERROR = StateCode.newBuilder().code(107000100010016l).desc("订单商品参数[totalAmount]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_ILLEGAL_ORDER_REALTOTALAMOUNT_ERROR = StateCode.newBuilder().code(107000100010017l).desc("订单商品参数[realTotalAmount]非法").build();
    StateCode ORDER_REPASTORDER_CREATORDER_DUPLICATE_ORDER_ERROR = StateCode.newBuilder().code(107000100010018l).desc("重复订单").build();
    //获取订单信息
    StateCode ORDER_REPASTORDER_GETORDERDETAIL_ILLEGAL_REPASTORDERID_ERROR = StateCode.newBuilder().code(107000100020001L).desc("参数[repastOrderId]非法").build();
    StateCode ORDER_REPASTORDER_GETORDERDETAIL_RESULT_ORDER_NULL_ERROR = StateCode.newBuilder().code(107000100020002L).desc("未找到订单信息").build();
    StateCode ORDER_REPASTORDER_GETORDERDETAIL_RESULT_ORDERITEM_NULL_ERROR = StateCode.newBuilder().code(107000100020003L).desc("未找到订单商品信息").build();

    //获取订单列表
    StateCode ORDER_REPASTORDER_GETBUYERORDERLIST_ILLEGAL_ACCOUNTID_ERROR = StateCode.newBuilder().code(107000100030001L).desc("参数[accountId]非法").build();
    StateCode ORDER_REPASTORDER_GETBUYERORDERLIST_ILLEGAL_PAGE_ERROR = StateCode.newBuilder().code(107000100030002L).desc("参数[page]非法").build();
    StateCode ORDER_REPASTORDER_GETBUYERORDERLIST_ILLEGAL_PAGESIZE_ERROR = StateCode.newBuilder().code(107000100030003L).desc("参数[pageSize]非法").build();


    StateCode ORDER_REPASTORDER_GETBUYERORDERDETAIL_ILLEGAL_ACCOUNTID_ERROR = StateCode.newBuilder().code(107000100040001L).desc("参数[accountId]非法").build();
    StateCode ORDER_REPASTORDER_GETBUYERORDERDETAIL_ILLEGAL_ORDERID_ERROR = StateCode.newBuilder().code(107000100040002L).desc("参数[orderId]非法").build();
    StateCode ORDER_REPASTORDER_GETBUYERORDERDETAIL_RESULT_ORDER_NULL_ERROR = StateCode.newBuilder().code(107000100040003L).desc("未找到订单信息").build();
    StateCode ORDER_REPASTORDER_GETBUYERORDERDETAIL_RESULT_ORDERITEM_NULL_ERROR = StateCode.newBuilder().code(107000100040004L).desc("未找到订单商品信息").build();


    StateCode ORDER_REPASTORDER_GETMECHANTORDERDETAIL_ILLEGAL_MERCHANTID_ERROR = StateCode.newBuilder().code(107000100050001L).desc("参数[merchantId]非法").build();
    StateCode ORDER_REPASTORDER_GETMECHANTORDERDETAIL_ILLEGAL_ORDERID_ERROR = StateCode.newBuilder().code(107000100050002L).desc("参数[orderId]非法").build();
    StateCode ORDER_REPASTORDER_GETMECHANTORDERDETAIL_RESULT_ORDER_NULL_ERROR = StateCode.newBuilder().code(107000100050003L).desc("未找到订单信息").build();
    StateCode ORDER_REPASTORDER_GETMECHANTORDERDETAIL_RESULT_ORDERITEM_NULL_ERROR = StateCode.newBuilder().code(107000100050004L).desc("未找到订单商品信息").build();


}
