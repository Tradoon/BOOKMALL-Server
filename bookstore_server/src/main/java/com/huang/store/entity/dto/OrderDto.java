package com.huang.store.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.huang.store.entity.order.Expense;
import com.huang.store.entity.user.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 前后端交互的订单类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private Long id;//编号
    private String orderId;//订单号
    private String account;//账户
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date orderTime;//下单时间
    private Date shipTime;//发货时间
    private Date getTime;//收货时间
    private Date evaluateTime;//评价时间
    private Date closeTime;//结束时间
    private Date confirmTime;//自动确认收货的时间 默认14天
    private String orderStatus;//订单状态
    private String logisticsNum;//物流单号
    private List<OrderDetailDto> OrderDetailDtoList;//订单
    private Expense expense;//订单费用明细
    private Address address;//收货地址
    private List<String> coverImgList;


    @Override
    public String toString() {
        return "OrderDto{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", account='" + account + '\'' +
                ", orderTime=" + orderTime +
                ", shipTime=" + shipTime +
                ", getTime=" + getTime +
                ", evaluateTime=" + evaluateTime +
                ", closeTime=" + closeTime +
                ", confirmTime=" + confirmTime +
                ", orderStatus='" + orderStatus + '\'' +
                ", logisticsNum='" + logisticsNum + '\'' +
                ", OrderDetailDtoList=" + OrderDetailDtoList +
                ", expense=" + expense +
                ", address=" + address +
                '}';
    }
}
