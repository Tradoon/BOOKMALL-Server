package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 图书和分类关联类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSortList {
    private Long bookSortId;
    private Long bookId;



    @Override
    public String toString() {
        return "BookSortList{" +
                "bookSortId=" + bookSortId +
                ", bookId=" + bookId +
                '}';
    }
}
