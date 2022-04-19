
package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 出版社类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publish {
    private Long id;//编号
    private String name;//出版社姓名
    private boolean showPublish;//出版社是否显示
    private Integer rank;//排序值
    private Integer num;//该出版社中有多少书


    @Override
    public String toString() {
        return "Publish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", showPublish=" + showPublish +
                ", rank=" + rank +
                ", num=" + num +
                '}';
    }
}
