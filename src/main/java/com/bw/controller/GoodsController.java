package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bw.bean.GoodsBean;
import com.bw.service.GoodsService;


@Controller
public class GoodsController {
	
	@Resource
	private GoodsService gs;
	
	//列表
	@RequestMapping("list.do")
	public String list(Model model){
		List<GoodsBean> list = gs.list();
		model.addAttribute("list", list);
		return "list";
	}
	
	//删除
	@RequestMapping("del.do")
	public String Del(int gid){
		int i = gs.Del(gid);
		if(i>0){
			return "redirect:list.do";
		}else{
			return "del";
		}
	}
	
	//添加
	
	
	
	
}
