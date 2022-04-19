package com.huang.store.entity.dto;

import com.huang.store.entity.book.BookSort;
import lombok.Data;

import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 分类集合
 */
@Data
public class SortResponse {
    private BookSort upperSort;//父级的分类名
    private List<BookSort> children;//分类的子集


    @Override
    public String toString() {
        return "SortResponse{" +
                "upperSort=" + upperSort +
                ", children=" + children +
                '}';
    }
}
