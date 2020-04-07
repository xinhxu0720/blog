package com.visionvera.bean.alarm;

/**
 * Created by always on 2018/6/15.
 */
public class NameAndIntegerValueDomain {
    private String name;
    private Integer value;

    public NameAndIntegerValueDomain() {
    }

    public NameAndIntegerValueDomain(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
