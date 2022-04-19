package com.huang.store.entity.dto;
import com.huang.store.entity.book.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 某一个子分类的和这个子分类所包含的14本图书
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SortBookRes {
     private Long sortId;
     private String sortName;
     private List<Book> bookList;



    @Override
    public String toString() {
        return "SortAndBook{" +
                "sortId=" + sortId +
                ", sortName='" + sortName + '\'' +
                ", bookList=" + bookList +
                '}';
    }
}
