package com.huang.store.service.imp;

import com.huang.store.entity.book.*;
import com.huang.store.entity.dto.OrderBookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    int addBook(Book book);
    int modifyBook(Book book);
    int modifyBookPut(Long id,boolean put);//修改图书是否为上下架
    int modifyBookRec(Long id,boolean recommend);//修改图书是否为推荐图书
    int modifyBookNewPro(Long id,boolean newProduct);//修改图书是否为新品
    int modifyBookStock(Long id,int stockNum);//减库存stockNum
    int deleteBook(Long id);
    List<Book> getBooks();
    List<Book> getBooksByPage(int page,int pageSize);
    List<Book> getNewPutBookList(int page,int pageSize);

    List<OrderBookDto> getBatchBookList(Long[] ids);//根据ids数组，得到对应的图书集合
    List<OrderBookDto> getOneBookList(Long[] ids);//根据ids数组，得到对应的图书集合

    Long getBookId(String isbn);
    String getBookIsbn(Long id);
    Book getBook(Long id);//获取图书的所有
    Book getBookDetail(String ISBN);//获得图书用于后台页表展示的信息(除去图书详情页和部分图书相册)
    int getPublishBookNum(String publishName);//得到某一出版社的图书的数量
    int getBookCount();//得到图书的数量
    List<Book> getPublishBooks(String publishName);//得到某一个出版社的所有图书

    //对于bookimg表的操作
    int addBookImg(BookImg bookImg);
    int deleteBookImgOfOne(String isbn);//删除某本书的全部图片
    int deleteOneBookImg(String isbn,String imgSrc);
    String getBookCover(String isbn);//得到书的封面图
    int modifyBookImgList(String oldIsbn,String newIsbn);
    List<String> getBookImgSrcList(String isbn);


    int addToRecommend(Recommend recommend);
    int deleteFromRecommend(Long bookId);
    int modifyRecommendRank(Long bookId,int rank);
    int hasExistInRec(Long bookId);
    List<Book> getRecommendsByPage(int page,int pageSize);

    int addToNewProduct(Recommend newProduct);
    int deleteFromNewProduct(Long bookId);
    int modifyNewProductRank(Long bookId,int rank);
    int hasExistInNew(Long bookId);
    List<Book> getNewProductsByPage(int page,int pageSize);


    //添加图书到分类
    int addBookToSort(Long bookSortId ,Long bookId);
    int delBookFromSort(Long booSortId,Long bookId);
    int modifyBookSort(Long bookSortId,Long bookId);
    BookSort getBookSort(Long bookId);//得到某本书的分类名
    List<Book> getBooksByFirst(String sortName,int page,int pageSize);//得到级别一的所有分类书籍
    List<Book> getBookBySecond(Long bookSortId,int page,int pageSize);//得到级别二的所有分类图书
    int getFirstBookCount(String sortName);//得到一级分类图书的数量
    int getSecondBookCount(Long bookSortId);//得到二级分类图书的数量

    //批量处理图书
    int batchDelBook(Long[] idS);
    int batchPutBook(Long[] idS,boolean put);
    int batchRecBook(Long[] idS,boolean recommend);
    int batchNewProBook(Long[] idS,boolean newProduct);
}
