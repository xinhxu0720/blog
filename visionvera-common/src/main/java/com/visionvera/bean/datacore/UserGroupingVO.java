package com.visionvera.bean.datacore;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @ClassName UserGroupingVO
 * @Description TODO 用户分组实体类
 * @Author 徐鑫辉
 * @Date 2019年03月28日 19:35
 **/
public class UserGroupingVO implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
    * 唯一键
    */
    private String  uuid;
    /**
     * 分组创建时间
     */
    private Date    createTime;
    /**
     * 分组名字
     */
    private String  name;
    /**
     * 是否已经删除 0未删除,1已删除
     */
    private Integer isDelete;
    /**
     * 用户id
     */
    private String  userId;
    /**
     * 扩展字段1
     */
    private String  ext1;
    /**
     * 扩展字段2
     */
    private String  ext2;
    /**
     * 分组用户集合
     */
    private List<UserGroupingMidVO> userGroupingMidVOList;


    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        UserGroupingVO that = (UserGroupingVO) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(name, that.name) &&
                Objects.equals(isDelete, that.isDelete) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(ext1, that.ext1) &&
                Objects.equals(ext2, that.ext2) &&
                Objects.equals(userGroupingMidVOList, that.userGroupingMidVOList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uuid, createTime, name, isDelete, userId, ext1, ext2, userGroupingMidVOList);
    }

    public UserGroupingVO() {
        super();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public List<UserGroupingMidVO> getUserGroupingMidVOList() {
        return userGroupingMidVOList;
    }

    public void setUserGroupingMidVOList(List<UserGroupingMidVO> userGroupingMidVOList) {
        this.userGroupingMidVOList = userGroupingMidVOList;
    }

}
