package com.visionvera.bean.cms;

/** 
 * <pre>项目名称：cmsweb    
 * 类名称：AlarmTypeVO    
 * 类描述： 会议告警类型bean实例   
 * 创建人：周逸芳  
 * 创建时间：2018年4月16日 下午5:57:58    
 * 修改人：周逸芳     
 * 修改时间：2018年4月16日 下午5:57:58    
 * 修改备注：       
 * @version </pre>    
 */
public class AlarmTypeVO {
	private Integer id;//告警类型序号
	private String name;//告警类型名称
	private String description;//告警类型描述
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
