package com.visionvera.util;

import java.util.ArrayList;
import java.util.List;

public class RegionUtil {
	//将行政单位节点末尾的0去除（如110000000000只取11）
	public static String getBase(String regionId){
		String base = regionId;
		for(int i=regionId.length(); i>=0; i--){
			if(regionId.substring(i-1, i).equals("0")){
				base = base.substring(0,i-1);
			}else{
				break;
			}
		}
		if(base.length() % 2 != 0){//长度为奇数时补零
			base += "0";
		}
		return base;
	}
	//根据base查找所有父级节点（含本节点）
	public static void getAllPids(String str, List<String> searchIds){
		String[] strs = new String[str.length()/2];
		for(int i=0; i<=str.length()-2; i+=2){
			strs[i/2] = str.substring(i,i+2);
		}
		String base = "";
		String temp = "";
		for(int i=0; i<strs.length; i++){
			base += strs[i];
			temp += base + "0000000000";
			if(!searchIds.contains(temp.substring(0,12))){
				searchIds.add(temp.substring(0,12));//截取前12位
			}
			temp = "";
		}
	}
	
	public static void main(String args[]){
		getAllPids("101010000000", new ArrayList<String>());
		System.out.println("hello");
	}
}
