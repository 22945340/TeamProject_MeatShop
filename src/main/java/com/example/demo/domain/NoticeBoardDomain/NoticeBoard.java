package com.example.demo.domain.NoticeBoardDomain;

import java.time.*;

import lombok.*;

@Data
public class NoticeBoard {
	
	private Integer id;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime inserted;
}