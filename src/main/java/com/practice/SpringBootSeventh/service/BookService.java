package com.practice.SpringBootSeventh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	public Book addBook(Book book)
	{
		list.add(book);
		return book;
	}

	public void deleteBook(int bid) {
		list = list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
		
	}

	public void updateBook(Book book, int id) {
		list = list.stream().map(b ->{
			if(b.getId()==id)
			{
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
		
		
	}
}
