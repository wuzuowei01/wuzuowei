package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.bean.GoodsBean;
import com.bw.mapper.GoodsMapper;


@Service
@Transactional
public class GoodsServiceImp implements GoodsService {

	@Resource
	private GoodsMapper gm;
	
	public List<GoodsBean> list() {
		// TODO Auto-generated method stub
		return gm.list();
	}

	public int Del(int gid) {
		// TODO Auto-generated method stub
		return gm.Del(gid);
	}

	public int Add(GoodsBean gb) {
		// TODO Auto-generated method stub
		return gm.Add(gb);
	}

	

}
