package com.visionvera.bean.alarm;

/**
 * 运维中心层级Bean
 */
public class YwTreeB {

    //private Long id;            //自增主键
    private String uuid;        //运维中心唯一uuid
    private String regionid;    //运维中心区域id
    private String puuid;         //上级运维中心uuid
    private String name;        //运维中心名称
    private Integer levelType;     //层级 0：本级  1:其他
    private Integer useflag;        //0：废弃，1：启用
    private Integer bits;       //区分16/64位套装配置
    private String alarmUrl;    //本运维中心接口地址

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevelType() {
        return levelType;
    }

    public void setLevelType(Integer levelType) {
        this.levelType = levelType;
    }

    public Integer getUseflag() {
        return useflag;
    }

    public void setUseflag(Integer useflag) {
        this.useflag = useflag;
    }

    public Integer getBits() {
        return bits;
    }

    public void setBits(Integer bits) {
        this.bits = bits;
    }

    public String getAlarmUrl() {
        return alarmUrl;
    }

    public void setAlarmUrl(String alarmUrl) {
        this.alarmUrl = alarmUrl;
    }
}
