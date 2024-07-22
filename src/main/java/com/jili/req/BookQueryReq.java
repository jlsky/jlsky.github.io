package com.jili.req;

import lombok.Data;

/**
 * ClassName: UserQueryReq
 * Package com.jili.req
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/3
 * @Version: v1.0
 */
@Data
public class BookQueryReq {

    private Long id;

    private String title;

    private String author;

    private String owner;

}
