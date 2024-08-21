package com.web.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.web.demo.entity.NaverReviews;
import com.web.demo.repository.NaverReviewsRepository;

@Service
public class NaverReviewsService {
	@Autowired
	private NaverReviewsRepository naverReviewsRepository;
	//페이징 계산시 기준이 되는 페이지당 게시물의 개수 => 환경변수도 가능 , 10개로 설정
	private final int PAGE_SIZE = 10;
	/**
	 *  입력 : 특정 페이지 번호
	 *  결과 : 해당 페이지에 속한 게시물 데이터 (DTO제공, 페이징 객체를 활용 제공)
	 */
	
	public Page<NaverReviews> getList(int page){
		// 데이터 정렬은 미포함 상태
		//내부적으로 특정 위치에서 특정 개수 만큼 jpa를 통해 데이터를 획득하여 페이지어블 형태로 반환
		Pageable pageable = PageRequest.of(page, PAGE_SIZE);
		return naverReviewsRepository.findAll(pageable);
	}
	
	
	
}















