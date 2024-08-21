/** 
 * 챗봇
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
public class NaverReviews {
	@Id
	// 오라클 11g 미지원, 18이상은 지원
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//11g에 맞게 수정	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator5")
	@SequenceGenerator(name = "sequence_generator5", sequenceName = "sequence_name5", allocationSize = 1)
	private Integer id;

	@Column(length = 2048)
	private String document;
	
	private Integer label;
}






















