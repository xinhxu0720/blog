package com.visionvera.vo;

import java.util.Date;

public class Trait {
    private Integer id;

    private Date createDate;

    private Date modifyDate;

    private Integer version;

    private String yTitle;

    private String yContent;

    private String img;

    private String title;

    private String content;

    @Override
    public String toString() {
        return "Trait{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", version=" + version +
                ", yTitle='" + yTitle + '\'' +
                ", yContent='" + yContent + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Trait() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getyTitle() {
        return yTitle;
    }

    public void setyTitle(String yTitle) {
        this.yTitle = yTitle == null ? null : yTitle.trim();
    }

    public String getyContent() {
        return yContent;
    }

    public void setyContent(String yContent) {
        this.yContent = yContent == null ? null : yContent.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}