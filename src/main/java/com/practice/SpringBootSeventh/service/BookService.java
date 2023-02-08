package com.practice.SpringBootSeventh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.SpringBootSeventh.entities.Book;

@Component
public class BookService {

	private static List<Book> bookList = new ArrayList<>();
	
	static {
		bookList.add(new Book(222,"DEF","Shyam"));
		bookList.add(new Book(333,"GHI","Bhram"));
		bookList.add(new Book(444,"JKL","Dharam"));
	}
	
	public List<Book> getAllBooks()
	{
		return bookList;
	}
	
	public Book getBookById(int id)
	{
		Book book = null;
		book = bookList.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
}
