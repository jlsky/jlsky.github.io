package com.jili.enity;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * ClassName: Student
 * Package com.jili.enity
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/3
 * @Version: v1.0
 */
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private Long id;

    private Long userId;

    private String title;

    private String author;

    private BigDecimal price;

    private LocalDateTime createTime;

    private Integer type;

    private String cityCode;

    private String owner;

}
