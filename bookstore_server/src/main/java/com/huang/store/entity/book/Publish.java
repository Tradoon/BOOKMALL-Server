
package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publish publish = (Publish) o;
        return showPublish == publish.showPublish && Objects.equals(name, publish.name) && Objects.equals(rank, publish.rank) && Objects.equals(num, publish.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, showPublish, rank, num);
    }

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
