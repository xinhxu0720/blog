package com.visionvera.bean.datacore;

/**
 * Created by jianxin on 2019/9/27
 */
public class RegionBean {

    private String id;					//行政单位ID（主键）
    private String pid;				//上级行政单位ID
    private String name; 				//行政单位名称
    private Integer gradeId;			//行政级别

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }
}
