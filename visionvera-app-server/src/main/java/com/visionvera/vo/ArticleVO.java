package com.visionvera.vo;

import scala.Int;

import java.util.Date;

/**
 * @ClassName ArticleVO
 * @Description TODO
 * @Author 徐鑫辉
 * @Date 2020年04月02日 12:06
 **/
public class ArticleVO {

    private Integer id;
    private Date createTime;
    private Date updateTime;
    private Integer version;
    private String author;
    private String coverImage;
    private String content;
    private String title;
    private Integer clicks;
    private Integer replyNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(Integer replyNumber) {
        this.replyNumber = replyNumber;
    }
}
