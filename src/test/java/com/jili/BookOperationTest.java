package com.jili;

import com.jili.enity.*;
import com.jili.mapper.BookMapper;
import com.jili.req.BookQueryReq;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * ClassName: UserOperationTest
 * Package com.jili
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/3
 * @Version: v1.0
 */
@SpringBootTest
@Slf4j
public class BookOperationTest {
    @Resource
    private BookMapper bookMapper;

    @DisplayName("多个id查询")
    @Test
    public void test_query_users_byIds() {
        List<Long> ids = Arrays.asList(1L, 2L, 3L, 5L);
        List<Book> books = bookMapper.queryBooksByIds(ids);
        log.info("books : {}", books);
    }

    @DisplayName("模糊查询")
    @Test
    public void test_fuzzy_query() {
        BookQueryReq req = new BookQueryReq();
        req.setTitle("史");
        List<Book> books = bookMapper.fuzzyQueryBooks(req);
        log.info("books: {}", books);
    }

    @Test
    public void test_when_query() {
        BookQueryReq req = new BookQueryReq();
        req.setAuthor("罗贯中");
        List<Book> books = bookMapper.queryBooksByCondition(req);
        log.info("books: {}", books);
    }

    @Test
    public void add_book() {
        Book book = new Book();
        book.setTitle("《我的外婆》");
        book.setUserId(1L);
        book.setAuthor("廖继礼");
        book.setPrice(new BigDecimal(50));
        book.setCreateTime(LocalDateTime.now());
        Long id = bookMapper.addBook(book);
        log.info("id: {}", id);

    }

    @Test
    public void update_book() {
        Book book = new Book();
        book.setTitle("《白鹿原》");
        book.setAuthor("陈忠实");
        book.setId(12L);
        book.setPrice(new BigDecimal(300));
        bookMapper.updateBookById(book);
    }

    @Test
    public void queryBooksByTrimWhere() {
        BookQueryReq req = new BookQueryReq();
        req.setTitle("史");
        req.setAuthor("司马迁");
        List<Book> books = bookMapper.queryBooksByTrimWhere(req);
        log.info("books: {}", books);
    }

    @Test
    public void updateBooksByTrimSet(){
        BookQueryReq req = new BookQueryReq();
        // req.setTitle("《我的外婆》");
        req.setAuthor("廖继礼");
        req.setId(13L);
        bookMapper.updateBooksByTrimSet(req);
    }

    @Test
    public void getStudentsByArray(){
        Long[] ids = {1L,3L, 8L};
        List<Book> books = bookMapper.getStudentsByArray(ids);
        log.info("books: {}", books);
    }

    @Test
    public void getStudentsByList(){
        List<Long> list = Arrays.asList(1L, 3L, 5L);
        List<Book> studentsByList = bookMapper.getStudentsByList(list);
        log.info("studentsByList: {}", studentsByList);
    }


    // 查询1, 2, 3中，1查询cityCode的数据，1不需要，查询所有
    @Test
    public void test_query_books_byType() {
        BookReq bookReq = new BookReq();
        bookReq.setTypeList(Arrays.asList(1));
        bookReq.setIdAdminFlag(true);
        bookReq.setOwner("1247721");
        List<Book> books = bookMapper.queryBooksByTypes(bookReq);
        log.info("books : {}", books);
    }

    @Test
    public void test_queryBySwitch(){
        BookQueryReq bookQueryReq = new BookQueryReq();
        bookQueryReq.setOwner("兰陵笑笑生");
        Book book = bookMapper.queryBySwitch(bookQueryReq);
        log.info("book：{}", book);
    }

    @Test
    public void selectBookByTrim(){
        BookQueryReq bookQueryReq = new BookQueryReq();
        bookQueryReq.setTitle("史");
        List<Book> books = bookMapper.selectBookByTrim(bookQueryReq);
        log.info("books：{}", books);
    }

    @Test
    public void updateBookByTrim(){
        Book book = new Book(){
            {setAuthor("温倩怡");
            setTitle("《我的奋斗》");
            setId(13L);}
        };
        int row = bookMapper.updateBookByTrim(book);
        log.info("row: {}", row);
    }

    @Test
    public void addBookTrim(){
        Book book = Book.builder().title("a little women").author("廖继礼").type(7).userId(1L).build();
        int result = bookMapper.addBookTrim(book);
        log.info("结果为: {}", result);
    }

    @Test
    public void batchQueryByArray(){
        Long[] userIds = {1L, 3L, 5L, 7L, 10L};
        List<Book> books = bookMapper.batchQueryByArray(userIds);
        log.info("books：{}", books);
    }

    @Test
    public void batchDeleteByArray(){
        Long[] userIds = {13L, 14L};
        int result = bookMapper.batchDeleteByArray(userIds);
        log.info("result: {}", result);

    }

    @Test
    public void queryAllUserInfo(){
        List<UserVo> userVos = bookMapper.queryAllUserInfo();
        log.info("userVos {}", userVos );
    }

    @Test
    public void insertUserWithEnum() {
        User user = new User() {
            {
                setUsername("刘亦菲");
                setAge(35);
                setPhone("13006698976");
                setSex(SexEnum.getCode("女"));
            }
        };
        int result = bookMapper.insertUserWithEnum(user);
        log.info("result: {}", result);

    }




}
