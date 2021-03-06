package com.huang.store.service.imp;

import com.huang.store.entity.dto.CartBookDto;
import com.huang.store.entity.user.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CartService {
    int addProduct(String account,Long id,int num);
    int existProduct(String account,Long id);//判断购物车中是否已经存在某本图书
    int deleteProduct(String account,Long id);
    int delBatchProduct(String account,Long[] ids);//批量删除图书
    int modifyProductNum(String account,Long id,int num);//修改购物车某本图书的数量
    List<CartBookDto> getCartsByPage(String account, int page, int pageSize);
    int count(String account);//得到某人的购物车商品总数
    int getBookCount(String account,Long id);//得到某本书在购物车中的数量
}
