package com.huang.store.mapper;

import com.huang.store.entity.book.Book;
import com.huang.store.entity.book.BookTopic;
import com.huang.store.entity.book.SubBookTopic;
import com.huang.store.entity.dto.SubTopicRes;
import com.huang.store.entity.dto.TopicBook;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TopicMapper {

    //对于总书单专题的操作
    int addBookTopic(BookTopic bookTopic);
    int delBookTopic(Long id);//这个需要多表删除
    int modifyBookTopic(BookTopic bookTopic);//这个是根据编号修改的，这样才可以连同书单名也是可以修改的
    BookTopic getBookTopic(Long id);
    List<BookTopic> getBookTopicList(int page, int pageSize);
    int getTopicCount();

    //对于书单内含有的哪些图书的操作
    int addSubBookTopic(SubBookTopic subBookTopic);
    int batchAddSubTopic(List<SubBookTopic> item);//批量添加图书到书单中
    int delSubBookTopic(Long topicId,Long bookId);
    int batchDelSubTopic(List<SubBookTopic> item);
    int modifySubBookTopic(SubBookTopic subBookTopic);
    SubBookTopic getSubBookTopic(Long topicId,Long bookId);
    List<Book> getSubBookTopicList(Long topicId, int page, int pageSize);
    int getSubTopicCount(Long topicId);
    String getReason(Long topicId,Long bookId);//得到某本书的推荐理由


    List<Book> getNoAddBookPage(Long topicId, int page, int pageSize);//按页得到所有未添加到某书单的所有图书
    List<TopicBook> getTopicBookList(Long topicId);//得到所有添加到指定书单的所有图书
    int getNoAddCount(Long topicId);//得到总共有多少书未添加到指定的书单中

//todo
    List<Map<String,Object>> getSubTopicResList(Long topicId);
    List<SubTopicRes> getResList(Long topicId);
    List<Book> getRecBookList(Long id);

}
