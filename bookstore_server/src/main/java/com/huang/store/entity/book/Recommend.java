package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 推荐类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recommend {

    private Long id;//编号
    private Long bookId;//图书的编号
    private int rank;//推荐值
    private Timestamp addTime;//添加到推荐的时间


    @Override
    public String toString() {
        return "Recommend{" +
                "id=" + id +
                ", bookId='" + bookId + '\'' +
                ", rank=" + rank +
                ", addTime=" + addTime +
                '}';
    }
}
