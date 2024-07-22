package com.jili.mapper;

import com.jili.enity.Book;
import com.jili.enity.BookReq;
import com.jili.enity.User;
import com.jili.enity.UserVo;
import com.jili.req.BookQueryReq;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package com.jili.mapper
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/3
 * @Version: v1.0
 */
public interface BookMapper {

    List<Book> queryBooksByIds(List<Long> ids);

    List<Book> fuzzyQueryBooks(BookQueryReq req);

    List<Book> queryBooksByCondition(BookQueryReq req);

    Long addBook(Book book);

    int updateBookById(Book book);

    List<Book> queryBooksByTrimWhere(BookQueryReq req);

    int updateBooksByTrimSet(BookQueryReq req);

    List<Book> getStudentsByArray(Long[] ids);

    List<Book> getStudentsByList(List<Long> ids);

    List<Book> queryBooksByTypes(BookReq bookReq);

    Book queryBySwitch(BookQueryReq bookQueryReq);


    List<Book> selectBookByTrim(BookQueryReq book);

    int updateBookByTrim(Book book);

    int addBookTrim(Book book);

    List<Book> batchQueryByArray(Long[] ids);

    int batchDeleteByArray(Long[] userIds);

    List<UserVo> queryAllUserInfo();


    int insertUserWithEnum(User user);

}
