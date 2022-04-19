package com.huang.store.entity.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: tradoon
 * @date: 2022
 * @description: 图书图片类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookImg {
    private Long id;
    private String isbn;//书的ISBN
    private String imgSrc;
    private boolean cover;//是否封面显示

}
