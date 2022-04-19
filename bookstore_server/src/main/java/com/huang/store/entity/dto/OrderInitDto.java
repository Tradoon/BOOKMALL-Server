package com.huang.store.entity.dto;

import com.huang.store.entity.order.Expense;
import com.huang.store.entity.user.Address;
import lombok.Data;

import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 初始化订单的交互类
 */
@Data
public class OrderInitDto {
    private String account;//用户账号
    private List<OrderBookDto> bookList;
    private List<Address> addressList;//返回给前端显示的某个用户的地址
    private Expense expense;
    private Address address;


    @Override
    public String toString() {
        return "OrderInitDto{" +
                "account='" + account + '\'' +
                ", bookList=" + bookList +
                ", addressList=" + addressList +
                ", expense=" + expense +
                ", address=" + address +
                '}';
    }
}
