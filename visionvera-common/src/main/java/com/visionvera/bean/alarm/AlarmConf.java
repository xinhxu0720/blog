package com.visionvera.bean.alarm;

/**
 * 告警中心配置参数
 */
public class AlarmConf {

    private String uuid;    //运维中心唯一标识，对应ywTreeB的uuid
    private String regionid;    //运维中心行政区域编码
    private String puuid;     //上级运维中心uuid
    private String name;    //运维中心名称
    private Long pushServerId;   //推送信息表id,对应pushServerB的id
    private String url;     //上级中心地址和端口
    private Integer dataCount;  //单次最大操作数据条数
    private Integer useFlag;    //是否启用数据上报 0:关闭 1:开启
    private String pushUrl64;  //64位推送url
    private Integer dataCount64;    //64位推送最大条数
    private Integer useFlag64;    //是否启用数据上报 0：关闭，1：开启

    private Integer bits;   //标识是64位套装还是16位套装
    private String alarmUrl;    //套装告警中心访问地址


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

    public Long getPushServerId() {
        return pushServerId;
    }

    public void setPushServerId(Long pushServerId) {
        this.pushServerId = pushServerId;
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

    public String getPushUrl64() {
        return pushUrl64;
    }

    public void setPushUrl64(String pushUrl64) {
        this.pushUrl64 = pushUrl64;
    }

    public Integer getDataCount64() {
        return dataCount64;
    }

    public void setDataCount64(Integer dataCount64) {
        this.dataCount64 = dataCount64;
    }

    public Integer getUseFlag64() {
        return useFlag64;
    }

    public void setUseFlag64(Integer useFlag64) {
        this.useFlag64 = useFlag64;
    }
}
