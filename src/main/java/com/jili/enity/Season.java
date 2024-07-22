package com.jili.enity;

/**
 * ClassName: Seaon
 * Package com.jili.enity
 * Description:
 *
 * @Author: 廖继礼
 * @Create: 2024/7/18
 * @Version: v1.0
 */
public enum Season {

    SPRING(1, "春天", "温暖"),
    SUMMER(2, "夏天", "炎热"),
    AUTUMN(3, "秋天", "凉爽"),
    WINTER(4, "冬天", "凉爽");

    private final Integer value;

    private final String name;

    private final String desc;

    Season(Integer value, String name, String desc){
        this.value = value;
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }


    public String getDesc() {
        return desc;
    }
}
