package com.huang.store.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 购物车的前后端交互实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartBookDto {
    private String account;
    private Long id;//图书的id
    private Integer num;
    private Timestamp addTime;//添加到购物车的时间
    private String bookName;
    private String author;
    private String isbn;
    private String publish;//出版社
    private Timestamp birthday;//出版时间
    private double marketPrice;//书的原价
    private double price;//书的售价
    private Integer stock;//库存
    private String description;//书的概述，在详情页展示
    private String coverImg;//书的封面图
    private boolean put;//是否上架



    @Override
    public String toString() {
        return "CartBookDto{" +
                "account='" + account + '\'' +
                ", id=" + id +
                ", num=" + num +
                ", addTime=" + addTime +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publish='" + publish + '\'' +
                ", birthday=" + birthday +
                ", marketPrice=" + marketPrice +
                ", price=" + price +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", coverImg='" + coverImg + '\'' +
                ", put=" + put +
                '}';
    }
}
