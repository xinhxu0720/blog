package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: DeviceVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年11月13日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class DevDetail {

	private String devno;					//设备唯一标识
	private String regionId; 				//行政区域ID
	private String xmname;					//项目名称
	private String name;					//设备名称
	private String lxr;				//联系人1
	private String lxrzw;			//联系人1职务
	private String lxrdh;			    //联系人1电话
	private String lxr2;			    //联系人2
	private String lxrzw2;			        //联系人2职务
	private String lxrdh2;			        //联系人2电话
	private String lxr3;			        //联系人3
	private String lxrzw3;			    //联系人3职务
	private String lxrdh3;			    //联系人3电话
	private String yysm;			//运营商名
	private String yyslxr;		//运营商联系人
	private String yyslxrdh;			//运营商联系人电话
	private String xxdz;              //详细地址
	private String zonedevno;           	//8位设备号码
	private String svr_region_id;     //设备所属子级行政区域
	
	

	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
	public String getDevno() {
		return devno;
	}
	public void setDevno(String devno) {
		this.devno = devno;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getXmname() {
		return xmname;
	}
	public void setXmname(String xmname) {
		this.xmname = xmname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLxr() {
		return lxr;
	}
	public void setLxr(String lxr) {
		this.lxr = lxr;
	}
	public String getLxrzw() {
		return lxrzw;
	}
	public void setLxrzw(String lxrzw) {
		this.lxrzw = lxrzw;
	}
	public String getLxrdh() {
		return lxrdh;
	}
	public void setLxrdh(String lxrdh) {
		this.lxrdh = lxrdh;
	}
	public String getLxr2() {
		return lxr2;
	}
	public void setLxr2(String lxr2) {
		this.lxr2 = lxr2;
	}
	public String getLxrzw2() {
		return lxrzw2;
	}
	public void setLxrzw2(String lxrzw2) {
		this.lxrzw2 = lxrzw2;
	}
	public String getLxrdh2() {
		return lxrdh2;
	}
	public void setLxrdh2(String lxrdh2) {
		this.lxrdh2 = lxrdh2;
	}
	public String getLxr3() {
		return lxr3;
	}
	public void setLxr3(String lxr3) {
		this.lxr3 = lxr3;
	}
	public String getLxrzw3() {
		return lxrzw3;
	}
	public void setLxrzw3(String lxrzw3) {
		this.lxrzw3 = lxrzw3;
	}
	public String getLxrdh3() {
		return lxrdh3;
	}
	public void setLxrdh3(String lxrdh3) {
		this.lxrdh3 = lxrdh3;
	}
	public String getYysm() {
		return yysm;
	}
	public void setYysm(String yysm) {
		this.yysm = yysm;
	}
	public String getYyslxr() {
		return yyslxr;
	}
	public void setYyslxr(String yyslxr) {
		this.yyslxr = yyslxr;
	}
	public String getYyslxrdh() {
		return yyslxrdh;
	}
	public void setYyslxrdh(String yyslxrdh) {
		this.yyslxrdh = yyslxrdh;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	public String getZonedevno() {
		return zonedevno;
	}
	public void setZonedevno(String zonedevno) {
		this.zonedevno = zonedevno;
	}
	
	
}