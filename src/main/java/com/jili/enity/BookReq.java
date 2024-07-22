package com.jili.enity;

import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * ClassName: BookReq
 * Package com.jili.enity
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/18
 * @Version: v1.0
 */
@Data
@Getter
public class BookReq {

    private List<Integer> typeList;

    private String owner;

    private String cityCode;

    private Boolean idAdminFlag;

}
