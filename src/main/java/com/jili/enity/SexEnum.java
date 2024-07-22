package com.jili.enity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;


/**
 * ClassName: SexEnum
 * Package com.jili.enity
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/22
 * @Version: v1.0
 */

@AllArgsConstructor
@Getter
public enum SexEnum {

    MALE("男", 1),

    FEMALE("女", 0);

    private final String name;

    private final Integer code;

    public static Integer getCode(String name) {
        if (StringUtils.isBlank(name)) {
            return null;
        }
        return Arrays.stream(SexEnum.values()).filter(s -> s.getName().equals(name)).map(SexEnum::getCode).findFirst().orElse(null);
    }
}
