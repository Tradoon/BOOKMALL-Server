package com.huang.store.entity.dto;

import com.huang.store.entity.book.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 订单明细类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDetailDto {
    private String orderId;//订单号
    private Book book; //图书
    private String num;//某本图书的下单数量
    private double price;//下单时候图书的单价



    @Override
    public String toString() {
        return "OrderDetailDto{" +
                "orderId='" + orderId + '\'' +
                ", book=" + book +
                ", num='" + num + '\'' +
                ", price=" + price +
                '}';
    }
}
