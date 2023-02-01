package com.Book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	List<Book> bookList;

	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
		bookList=new ArrayList<>();
	}
	
	public void addBook(Book b) {
		bookList.add(b);
		System.out.println("added");
	}
	public void searchByTitle(String title) 	{
		boolean toggle=false;
		System.out.println("searching for "+title+" :");
		for(Book b: bookList) {
			if(b.getTitle().equals(title)) {
				toggle=true;
				System.out.println("founded");
				System.out.print(b.getBookID()+"-");
				System.out.print(b.getTitle()+"-");
				System.out.print(b.getAuthor()+"-");
				System.out.print(b.getCategory()+"-");
				System.out.print(b.getPrice()+"-");
				System.out.println();
			}
			
		}
		if(!toggle) {
			System.out.println("not founed");
		}
	}
	public void searchByAuthor(String author) {	
		boolean toggle=false;
		System.out.println("searching for "+author+" :");
		for(Book b: bookList) {
			if(b.getTitle().equals(author)) {
				toggle=true;
				System.out.println("founded");
				System.out.print(b.getBookID()+"-");
				System.out.print(b.getTitle()+"-");
				System.out.print(b.getAuthor()+"-");
				System.out.print(b.getCategory()+"-");
				System.out.print(b.getPrice()+"-");
				System.out.println();
			}
		}
		if(!toggle) {
			System.out.println("not founed");
		}
	}
	public void displayAll() {
		System.out.println("showing all:");
		for(Book b:bookList) {
			System.out.print(b.getBookID()+"-");
			System.out.print(b.getTitle()+"-");
			System.out.print(b.getAuthor()+"-");
			System.out.print(b.getCategory()+"-");
			System.out.print(b.getPrice()+"-");
			System.out.println();		
		}
	}
}
