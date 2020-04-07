package com.visionvera.bean.ywcore;


import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
* @Description:  评论实体类 目前主要对应着会议的评论
* @Params:
* @return:
* @Author: 徐鑫辉
* @Date:  2019.3.19
*/

public class CommentsVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String   uuid;            //主键uuid
    private Date     createTime;      //评论创建时间
    private String   content;         //评论内容
    private Integer  likeNum;         //点赞数量
    private Integer  isCheck;          //审核是否通过 1通过,0未通过
    private Integer  isFatSonGra;     //评论1为父 2为子 3为孙
    private String   userId;          //对应着评论用户的id
    private String   headlinesId;     //对应着视联头条的id
    private String   scheduleId;      //对应着会议的id
    private String   commentId;       //如果为回复 对应着自己的id
    private String   replyId;            //扩展字段1
    private String   ext2;            //扩展字段2
    private String   ext3;            //扩展字段3

    //以下为扩展字段
    private String userName;
    private String replyName;

    /*private String imgUrl;*/
 /*   private List<CommentSon>  commentSons;*/
    
    public CommentsVO() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getIsFatSonGra() {
        return isFatSonGra;
    }

    public void setIsFatSonGra(Integer isFatSonGra) {
        this.isFatSonGra = isFatSonGra;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHeadlinesId() {
        return headlinesId;
    }

    public void setHeadlinesId(String headlinesId) {
        this.headlinesId = headlinesId;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

   /* public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<CommentSon> getCommentSons() {
        return commentSons;
    }

    public void setCommentSons(List<CommentSon> commentSons) {
        this.commentSons = commentSons;
    }*/
}
