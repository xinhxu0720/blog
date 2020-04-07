package com.visionvera.vo;

import java.util.Date;

public class Track {
    private int id;
    private Date createDate;
    private Date  modifyDate;
    private int version;
    private String ip;
    private String country;//国家
    private String area;//地址
    private String region;//省会
    private String city;//市区
    private String county;//XX
    private String isp;//通信
    private int countryId;//国家id
    private int areaId;//地址id
    private int regionId;//地区id
    private int cityId;//城市id
    private int countyId;//县id
    private int ispId;//通信id

    public Track() {
        super();
    }

    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", modifyDate=" + modifyDate +
                ", version=" + version +
                ", ip='" + ip + '\'' +
                ", country='" + country + '\'' +
                ", area='" + area + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", isp='" + isp + '\'' +
                ", countryId=" + countryId +
                ", areaId=" + areaId +
                ", regionId=" + regionId +
                ", cityId=" + cityId +
                ", countyId=" + countyId +
                ", ispId=" + ispId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public int getIspId() {
        return ispId;
    }

    public void setIspId(int ispId) {
        this.ispId = ispId;
    }
}