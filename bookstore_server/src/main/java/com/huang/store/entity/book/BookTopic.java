package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 书单专题
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookTopic {
    private Long id;//书单编号
    private String topicName;//书单专题名
    private String subTitle;//副标题
    private String cover;//书单封面
    private int rank;
    private boolean put;
    private List<SubBookTopic> subBookTopics;//书单包含的图书



    @Override
    public String toString() {
        return "BookTopic{" +
                "id=" + id +
                ", topicName='" + topicName + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", cover='" + cover + '\'' +
                ", rank=" + rank +
                ", put=" + put +
                ", subBookTopics=" + subBookTopics +
                '}';
    }
}
