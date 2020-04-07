/**   
 * @Title: FunctionVO.java 
 * @Package com.visionvera.cms.bean 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author zhaolei
 * @date 2016年8月12日 下午5:28:11 
 * @version V1.0   
 */
package com.visionvera.bean.cms;

/** 
 * @ClassName: Function 
 * @Description: TODO 权限
 * @author zhaolei
 * @date 2016年8月12日 下午5:28:11 
 *  
 */
public class Function {
	private String uuid;	//uuid
	private String name;	//权限名称
	private Integer code;	//权限代码
	private String url;		//权限模块
	
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
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
