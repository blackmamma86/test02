/** 
 * 네이버 영화 리뷰 데이터를 담는 테이블과 연관된 엔티티
 */

package com.web.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
public class ChatbotSheet {
	
	@Id
	// 오라클 11g 미지원, 18이상은 지원
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//11g에 맞게 수정	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator6")
	@SequenceGenerator(name = "sequence_generator6", sequenceName = "sequence_name6", allocationSize = 1)
	private Integer id;
	
	@Column(length = 2048)
	private String question;

	@Column(length = 2048)
	private String answer;
	
	private Integer label;
}






















