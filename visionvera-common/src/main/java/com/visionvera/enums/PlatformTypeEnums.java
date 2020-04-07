package com.visionvera.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 行业名称模式，提供给业务信息使用
 * @author Bianjf
 *
 */
public enum PlatformTypeEnums {
	/**
	 * （301 唐古拉； 401 流媒体web平台； 501 内容管理平台 601 会管 701终端 801 视联汇APP 901 Gis
	 */
	TGL("唐古拉", "tgl","301"),
	LMT("流媒体web平台", "lmt","401"),
	NRGL("内容管理平台", "nrgl","501"),
	HG("会管", "hg","601"),
	ZD("终端", "zd","701"),
	SLHAPP("视联汇APP", "slhapp","801"),
	GIS("GIS", "gis","901");

    //节点名称
    private String name; 
    //key必须唯一：节点KEY
    private String key;
    //对应编码
    private String id;  
    private static final List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	static {
		for (PlatformTypeEnums s : EnumSet.allOf(PlatformTypeEnums.class)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", s.getId());
			map.put("name", s.getName());
			map.put("key", s.getKey());
			list.add(map);
		}
	}
	// 构造方法  
    private PlatformTypeEnums(String name,String key, String id) {  
        this.name = name;  
        this.key = key; 
        this.id = id;  
        
    } 
  
    // 根据id获得 name
    public static String getName(String id) {  
        for (PlatformTypeEnums c : PlatformTypeEnums.values()) {  
            if (c.getId().equals(id)) {  
                return c.name;  
            }  
        }  
        return null;  
    }
    // 根据id获得 key
    public static String getKey(String id,String name) {  
        for (PlatformTypeEnums c : PlatformTypeEnums.values()) {  
            if (c.getId().equals(id) ||c.getName().equals(name)) {  
                return c.key;  
            }  
        }  
        return null;  
    }
   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static List<Map<String, Object>> getList() {
		return list;
	}
}
