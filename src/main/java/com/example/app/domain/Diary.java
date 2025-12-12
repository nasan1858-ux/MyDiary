package com.example.app.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Diary {

	private Integer id;
	private LocalDateTime writtenAt;
	private String title;
	private Author author;
	
}
