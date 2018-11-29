package com.test.service;

import java.util.List;

import com.test.vo.Board;

public interface BoardService {
	List<Board> ListAll();
	List<Board> SelectBoardList();
}
