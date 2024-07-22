package com.jili.enity;

import lombok.Data;

import java.util.List;

/**
 * ClassName: User
 * Package com.jili.enity
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/20
 * @Version: v1.0
 */
@Data
public class UserVo {

    private Long id;

    private String username;

    private Integer age;

    private String phone;

    private List<Book> books;
}
