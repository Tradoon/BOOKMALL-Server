package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 图书分类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSort {
    private Long id;
    private String sortName;
    private String upperName;//上一级的标签名
    private String level;
    private int rank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSort bookSort = (BookSort) o;
        return rank == bookSort.rank && Objects.equals(sortName, bookSort.sortName) && Objects.equals(upperName, bookSort.upperName) && Objects.equals(level, bookSort.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortName, upperName, level, rank);
    }

    @Override
    public String toString() {
        return "BookSort{" +
                "id=" + id +
                ", sortName='" + sortName + '\'' +
                ", upperName='" + upperName + '\'' +
                ", level='" + level + '\'' +
                ", rank=" + rank +
                '}';
    }
}
