package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 图书实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private Long id;
    private String bookName;
    private String author;
    private String isbn;
    private String publish;//出版社
    private Timestamp birthday;//出版时间
    private double marketPrice;//书的原价
    private double price;//书的售价
    private Integer stock;//库存
    private String description;//书的概述，在详情页展示
    //todo
    private List<String> ImgSrc;//书的图片地址
    private boolean put;//是否上架
    private String coverImg;//书的封面图
    private int rank;//权重值
    private boolean newProduct;
    private boolean recommend;
    //todo
    private Long bookSort[];




    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publish='" + publish + '\'' +
                ", birthday=" + birthday +
                ", marketPrice=" + marketPrice +
                ", price=" + price +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", ImgSrc=" + ImgSrc +
                ", put=" + put +
                ", coverImg='" + coverImg + '\'' +
                ", rank=" + rank +
                ", newProduct=" + newProduct +
                ", recommend=" + recommend +
                ", bookSort=" + Arrays.toString(bookSort) +
                '}';
    }
}
