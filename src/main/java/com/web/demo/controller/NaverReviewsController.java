/**
 *  클라이언트에게 네이버 영화 리뷰 테이터를 게시판 형태로 제공
 */

package com.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.demo.service.NaverReviewsService;

@RequestMapping("/bbs")
@Controller
public class NaverReviewsController {
	@Autowired
	private NaverReviewsService naverReviewsService;
	
	// ~/bbs/list?page=1 이런 바익으로 호출
	@GetMapping("/list")
	public String list(Model model,
					@RequestParam(value="page", defaultValue = "0") int page) {
		// 1. 특정 페이지(인자)에 해당되는 페이징 데이터 획득
		Page<Pageable> paging = this.naverReviewsService.getList(page);
		// 2. html에 전달
		model.addAllAttributes("paging", paging);
		return "naver_reviews_list";				
	}
	
	
	
	

}
