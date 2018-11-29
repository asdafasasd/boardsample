package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.vo.Board;

@Repository
public interface BoardDao {
	List<Board> ListAll();
	List<Board> SelectBoardList();
}
