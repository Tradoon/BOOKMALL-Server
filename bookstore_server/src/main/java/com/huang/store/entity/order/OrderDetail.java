package com.huang.store.entity.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 订单明细
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private String orderId;//订单号
    private Long bookId; //图书id
    private int num;//某本图书的下单数量
    private double price;//下单时候图书的单价



    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", bookId=" + bookId +
                ", num=" + num +
                ", price=" + price +
                '}';
    }
}
