package com.visionvera.enums;

/**
 * 行业名称模式，提供给业务信息使用
 * @author Bianjf
 *
 */
public enum IndustryNamePatternEnums {
	政法("政法"),
	综治("综治"),
	法院("法院"),
	检察院("检察院"),
	食药("食药"),
	中医药("中医药"),
	粮食("粮食"),
	水利("水利"),
	医疗("医疗"),
	卫计委("卫计委"),
	医院("医院"),
	教育("教育"),
	学校("学校");
	
	private String desc;

	private IndustryNamePatternEnums(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
