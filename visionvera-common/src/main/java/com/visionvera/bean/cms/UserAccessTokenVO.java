package com.visionvera.bean.cms;

/** 
 * @ClassName: UserAccessTokenVO 
 * @Description: TODO 用户-接口调用凭据实体 
 * @author xiechs
 * @date 2016年12月13日 
 *  
 */
public class UserAccessTokenVO {
	private String userId;  		    //用户ID（主键）
	private String accessToken;  		//接口调用凭据
	private Integer clientType;  		//webservice登录设备类型。1移动端，2PC端
	private String createTime; 		    //创建时间
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getClientType() {
		return clientType;
	}
	public void setClientType(Integer clientType) {
		this.clientType = clientType;
	}
	
}
