package com.Book;

public class Book {
	String bookID;
	String title;
	String author;
	String category;
	float price;
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookID, String title, String author, String category, float price) {
		super();
		// book has start with 'B' and length is 4
		if(bookID.charAt(0) != 'B' || bookID.length() != 4) {
			throw new InvalidBookException("bookId invalid");
		}else {
			this.bookID = bookID;
		}
		
		this.title = title;
		this.author = author;
		
		if(category.equals("Science") || category.equals("Fiction") ||
			category.equals("Technology") || category.equals("Others")){
				this.category=category;
			}
			else {
				throw new InvalidBookException("category invalid");
			}
		// price have to be > 0
		if(price<0) {
			throw new InvalidBookException("price invalid");
		}else {
					this.price = price;
		}
	}
}
