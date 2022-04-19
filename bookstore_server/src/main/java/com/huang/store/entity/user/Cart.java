package com.huang.store.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
/**
 * @author: tradoon
 * @date: 2022
 * @description: 购物车类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private String account;
    private Long id;
    private Integer num;
    private Timestamp addTime;//添加到购物车的时间



    @Override
    public String toString() {
        return "Cart{" +
                "account='" + account + '\'' +
                ", id='" + id + '\'' +
                ", num=" + num +
                ", addTime=" + addTime +
                '}';
    }
}
