package com.visionvera.enums;

/**
 * 向其他平台推送用户的操作类型枚举
 */
public enum PushUserTypeEnum {
    /** 添加用户操作类型 */
    ADD("添加用户操作类型"),
    /** 修改用户操作类型 */
    EDIT("修改用户操作类型"),
    /** 删除用户操作类型 */
    DEL("删除用户操作类型");

    private String desc;

    PushUserTypeEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
