package com.BookUtil;

import java.util.Scanner;

import com.Book.Book;
import com.Book.BookStore;

public class BookUtil {
	public static void main(String[] args) {
		BookStore store =new BookStore();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<3;i++) {
			System.out.println("enter Book ID start with 'B'");
			String id=sc.next();
			System.out.println("enter Book Title");
			String title=sc.next();
			System.out.println("enter Book Author");
			String author=sc.next();
			System.out.println("enter Book Category in [Science,Fiction,Technology,Others]");
			String cate=sc.next();
			System.out.println("enter Book price > 0");
			Float price=sc.nextFloat();
			Book b=new Book(id, title, author, cate, price);
			store.addBook(b);
		}
		Book b1=new Book("B001","java","huy","Others",10);
		store.addBook(b1);
		Book b2=new Book("B002","love","philip","Science",10);
		store.addBook(b2);
		Book b3=new Book("B003","movie","john","Fiction",10);
		store.addBook(b3);
	
		store.searchByAuthor("other");
		store.searchByTitle("java");
		store.displayAll();
	}
	
	
}
