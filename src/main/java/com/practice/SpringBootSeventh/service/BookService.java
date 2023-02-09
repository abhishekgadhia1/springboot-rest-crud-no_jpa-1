package com.practice.SpringBootSeventh.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.SpringBootSeventh.entities.Book;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
	
	static {
		list.add(new Book(201,"svva","gvevesvserbsrb"));
		list.add(new Book(301,"svvawfwf","klvjoevon"));
		list.add(new Book(401,"svvmlva","kjviojeiovnpoan"));
	}
	
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	public Book getBookById(int id)
	{
		Book book = null;
		book = list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
}
