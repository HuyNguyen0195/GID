package com.Language;

import java.util.Scanner;

public class TestClient {
	public static void main(String[] args) {
		Clang c=new Clang();
		JavaLang java=new JavaLang();
		// create thread for C
		Thread tC=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				c.showMessage();
			}
		});
		//create thread for Java
		Thread tJava=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				java.showMessage();
			}
		});
		System.out.println("which one you want run first");
		System.out.println("1-C Program");
		System.out.println("2-Java Program");
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		sc.close();
		
		switch (choice) {
		case "C":
			tC.setPriority(10);
			tJava.setPriority(1);
			tC.start();
			tJava.start();
			break;
		case "Java":
			tC.setPriority(1);
			tJava.setPriority(10);
			tJava.start();
			tC.start();
		default:
			break;
		}
		
		
	}
	
}
