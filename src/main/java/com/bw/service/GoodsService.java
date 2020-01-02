package com.bw.service;

import java.util.List;

import com.bw.bean.GoodsBean;

public interface GoodsService {
	
	//列表
	public List<GoodsBean> list();
	
	//删除
	public int Del(int gid);
	
	//添加
	public int Add(GoodsBean gb);
	
	
	
}
