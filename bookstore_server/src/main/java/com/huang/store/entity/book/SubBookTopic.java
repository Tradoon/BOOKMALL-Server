package com.huang.store.entity.book;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 黄龙
 * @date: 2020/6/18 11:33
 * @description: 书单专题的成员变量，用来表示书单有哪些书籍
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SubBookTopic {
    private Long topicId;//书单id
    private Long bookId;
    private String recommendReason;//推荐理由


    @Override
    public String toString() {
        return "SubBookTopic{" +
                "topicId='" + topicId + '\'' +
                ", bookId=" + bookId +
                ", recommendReason='" + recommendReason + '\'' +
                '}';
    }
}
