package com.xuyj.ssm3.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xuyj.ssm3.dto.AppointExecution;
import com.xuyj.ssm3.dto.Result;
import com.xuyj.ssm3.entity.Book;
import com.xuyj.ssm3.service.BookService;


@Controller
@RequestMapping("/book")
public class BookController {

	private Logger logger =  LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookService bookService;
	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	@ResponseBody
	private Result detail(@RequestParam("bookId")int bookId,Model model) {
		if(bookId==0) {
			return new Result(false,"id不能为空");
			
		}
		Book book = null;
		try {
			book=bookService.getById(bookId);

		}catch(Exception e) {
			return new Result(false,e.getMessage());

		}
		return new Result<Book>(true,book);
		
	}
}
