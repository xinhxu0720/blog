package com.visionvera.bean.alarm;

/**
 * 告警中心同步告警配置
 */
public class PushServerB {

    private Long id;            //自增主键
    private String url;         //数据中心web服务地址
    private Integer dataCount;  //单次最大操作数据条数
    private Integer useFlag;    //是否启用数据上报 0:关闭 1:开启
    private Integer type;   //推送方向 1：上级，2：同级

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public Integer getUseFlag() {
        return useFlag;
    }

    public void setUseFlag(Integer useFlag) {
        this.useFlag = useFlag;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
