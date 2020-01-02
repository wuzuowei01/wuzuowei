package com.bw.mapper;

import java.util.List;

import com.bw.bean.GoodsBean;

public interface GoodsMapper {
	
	//列表
	public List<GoodsBean> list();
	
	//删除
	public int Del(int gid);
	
	//添加
	public int Add(GoodsBean gb);
	
	
}
