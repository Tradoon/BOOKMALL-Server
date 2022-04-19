package com.huang.store.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 子书单明细
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubTopicRes {
    private Long id;
    private String bookName;
    private String isbn;
    private String author;
    private String recommendReason;


    @Override
    public String toString() {
        return "SubTopicRes{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", recommendReason='" + recommendReason + '\'' +
                '}';
    }
}
