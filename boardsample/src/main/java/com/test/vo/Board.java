package com.test.vo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;
import lombok.NonNull;

@Data
public class Board {

	private int seq;
	private int depth;
	@Min(1)
	private String writer;
	@Min(1)
	@Max(12)
	private String pwd;
	@Min(1)
	private String title;
	@Min(1)
	private String content;
	private String readcount;
	private String regdate;
}
