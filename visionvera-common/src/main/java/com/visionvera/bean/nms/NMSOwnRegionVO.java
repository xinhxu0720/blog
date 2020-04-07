package com.visionvera.bean.nms;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/** 
 * <pre>项目名称：    
 * 类名称：NMSOwnRegionVO    
 * 类描述： 视联网行政区域占有数bean实例 
 * 创建人：王思萌
 * 创建时间：2018年6月4日
 * 修改备注：       
 * @version </pre>    
 */
@XmlRootElement(name = "items")
@XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class NMSOwnRegionVO {
	
	public NMSOwnRegionVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NMSOwnRegionVO(int gradeid, int own) {
		this.gradeid = gradeid;
		this.own = own;
	}

	private int gradeid;//行政区域级别
	private int count;//行政区域总个数
	private int own;//占有行政区域个数
	
	
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getOwn() {
		return own;
	}
	public void setOwn(int own) {
		this.own = own;
	}
	
	
	
}
