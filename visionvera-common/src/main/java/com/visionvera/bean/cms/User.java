/**   
 * @Title: UserVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:26:56 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: UserVO
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author xiechs
 * @date 2017年11月13日
 * 
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class User {
	private String uuid; 				//用户uuid
	private String name; 				//用户名称
	private String login_pwd;			//登录密码
	private String login_name;			//登录名称
	private String phone;			    //用户手机
	private String telPhone;			//固定电话
	private String mail;				//邮箱
	private Integer grade;				//等级 级别 1超级管理员 2审批管理员 3预约操作员
	private String depart;				//用户所属部门ID
	private Integer status;				//用户状态 0不在线 1在线
	private String description;			//备注
	private Integer isvalid;            //webservice专用，判断注册的用户是否生效（0无效，1有效）
	private String org_id;              //工作单位编号
	private String area;                //所在区域编号
	private Integer isWsLogin;          //webservice专用，是否从webservice登录过。0未登录过，1登录过
	private String img_url;             //用户头像url
	private String dev_id;              //终端号码，多个值用,分割
	private String org_name;            //工作单位名称
	private String depart_name;         //所在部门名称
	private String post_name;			//岗位
	private String rank_name;			//职级
	private String id_card;             //身份证号
	private Integer web_login;          //是否允许登录会管 0-不允许，1-允许
	private Integer info_ok;            //用户信息是否合法（终端号是否正确） 0-不合法，1-合法
	private String create_time; 		//申请时间
	private String area_name; 			//行政区域名称：类似于 浙江省 杭州市
	private String svr_region_id;		//数据来源-子系统行政区域ID
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin_pwd() {
		return login_pwd;
	}
	public void setLogin_pwd(String login_pwd) {
		this.login_pwd = login_pwd;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTelPhone() {
		return telPhone;
	}
	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getIsvalid() {
		return isvalid;
	}
	public void setIsvalid(Integer isvalid) {
		this.isvalid = isvalid;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getIsWsLogin() {
		return isWsLogin;
	}
	public void setIsWsLogin(Integer isWsLogin) {
		this.isWsLogin = isWsLogin;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getDev_id() {
		return dev_id;
	}
	public void setDev_id(String dev_id) {
		this.dev_id = dev_id;
	}
	public String getOrg_name() {
		return org_name;
	}
	public void setOrg_name(String org_name) {
		this.org_name = org_name;
	}
	public String getDepart_name() {
		return depart_name;
	}
	public void setDepart_name(String depart_name) {
		this.depart_name = depart_name;
	}
	public String getPost_name() {
		return post_name;
	}
	public void setPost_name(String post_name) {
		this.post_name = post_name;
	}
	public String getRank_name() {
		return rank_name;
	}
	public void setRank_name(String rank_name) {
		this.rank_name = rank_name;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public Integer getWeb_login() {
		return web_login;
	}
	public void setWeb_login(Integer web_login) {
		this.web_login = web_login;
	}
	public Integer getInfo_ok() {
		return info_ok;
	}
	public void setInfo_ok(Integer info_ok) {
		this.info_ok = info_ok;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getArea_name() {
		return area_name;
	}
	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}
	public String getSvr_region_id() {
		return svr_region_id;
	}
	public void setSvr_region_id(String svr_region_id) {
		this.svr_region_id = svr_region_id;
	}
}
