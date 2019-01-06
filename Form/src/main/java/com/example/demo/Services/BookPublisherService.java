package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Beans.BookPublisherBean;
import com.example.demo.Dao.BookPublisherRepository;
import com.example.demo.Dao.CustomRepository;
import com.example.demo.Entity.Book;
import com.example.demo.Entity.BookPublisher;
import com.example.demo.Entity.Publisher;



@Service
public class BookPublisherService {

	@Autowired
	CustomRepository customRepository;

	@Autowired
	BookPublisherRepository bookPublisherRepository;

	public void saveBookPublisher(BookPublisherBean bookPublisherBean) {

Book b=new Book();
b.setName(bookPublisherBean.getBookName());


Publisher  p=new Publisher();
p.setName(bookPublisherBean.getPublisherName());





	BookPublisher bp=new BookPublisher();
	bp.setBook(b);
	bp.setPublisher(p);
	
	bookPublisherRepository.save(bp);
	}

}
