package com.visionvera.enums;

/**
 * Created by jianxin on 2019/8/5
 */
public enum NetworkEnum {
    zzw("综治网"),
    qyw("企业网"),
    all("");

    private String desc;

    private NetworkEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void main(String[] args) {
        System.out.println(NetworkEnum.valueOf("zz").getDesc());
    }
}
