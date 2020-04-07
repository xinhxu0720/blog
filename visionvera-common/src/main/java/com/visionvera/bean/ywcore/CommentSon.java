package com.visionvera.bean.ywcore;

import java.util.Date;

public class CommentSon {
    private String name; //回复人名字
    private String reply;//回复内容
    private Date   time;//回复时间
    private Integer replyLikeNum;//点赞数量
    private String replyImgUrl;//回复人头像
    private String replyName;

    public CommentSon() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getReplyLikeNum() {
        return replyLikeNum;
    }

    public void setReplyLikeNum(Integer replyLikeNum) {
        this.replyLikeNum = replyLikeNum;
    }

    public String getReplyImgUrl() {
        return replyImgUrl;
    }

    public void setReplyImgUrl(String replyImgUrl) {
        this.replyImgUrl = replyImgUrl;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }
}