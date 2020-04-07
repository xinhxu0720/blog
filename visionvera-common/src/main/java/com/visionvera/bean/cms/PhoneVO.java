package com.visionvera.bean.cms;

/** 
 * @ClassName: PhoneVO 
 * @Description: TODO 用户角色实体 
 * @author xiechs
 * @date 2016年12月5日 
 *  
 */
public class PhoneVO {
	private String phone;  				//手机号
	private String verifiCode;  		//验证码
	private String createTime; 		    //创建时间
	private String newPwd;              //新密码   应用于通过手机号重置密码接口
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getVerifiCode() {
		return verifiCode;
	}
	public void setVerifiCode(String verifiCode) {
		this.verifiCode = verifiCode;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
}
