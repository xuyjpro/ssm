package com.xuyj.ssm3.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuyj.ssm3.dao.AppointmentDao;
import com.xuyj.ssm3.dao.BookDao;
import com.xuyj.ssm3.dto.AppointExecution;
import com.xuyj.ssm3.entity.Book;
import com.xuyj.ssm3.service.BookService;
@Service
public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private BookDao bookDao;

	@Autowired
	private AppointmentDao appointmentDao;


	@Override
	public Book getById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AppointExecution appoint(long bookId, long studentId) {
		// TODO Auto-generated method stub
		return null;
	}

}
