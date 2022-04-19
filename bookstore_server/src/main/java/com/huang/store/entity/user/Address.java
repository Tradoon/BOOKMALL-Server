package com.huang.store.entity.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 地址类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private Long id;//编号
    private String account;
    private String name;//收货人姓名
    private String phone;//收货人电话
    private String addr;//具体地址
    private String label;//标签
    private boolean off;//是否被设置为删除(这里的删除不是真的删除，只是这个地址不在出现在用户的地址列表中)



    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", addr='" + addr + '\'' +
                ", label='" + label + '\'' +
                ", off=" + off +
                '}';
    }
}
