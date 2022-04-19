package com.huang.store.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author: 黄龙
 * @date: 2020/7/20 15:50
 * @description: 书单图书
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicBook {
    private Long id;
    private String bookName;
    private String author;
    private String publish;//出版社
    private Timestamp birthday;//出版时间
    private String coverImg;//书的封面图
    private String isbn;
    private String recommendReason;//推荐理由



    @Override
    public String toString() {
        return "TopicBook{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", birthday=" + birthday +
                ", coverImg='" + coverImg + '\'' +
                ", isbn='" + isbn + '\'' +
                ", recommendReason='" + recommendReason + '\'' +
                '}';
    }
}
