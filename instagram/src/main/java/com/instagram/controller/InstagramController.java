package com.instagram.controller;

import java.util.Scanner;

public class InstagramController {
	public void createProfile() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter name");
		String name=sc.next();
		
		System.out.println("enter password");
		String password=sc.next();
		
		System.out.println("enter email");
		String email=sc.next();
		
		System.out.println("enter address");
		String address=sc.next();
		
		System.out.println("profile created and your details is "+name+"  "+password+"   "+email+"   "+address);
	}
	public void viewProfile() {
		System.out.println("profile viewed");
	}
	public void editProfile() {
		System.out.println("profile edited");
	}
	public void deleteProfile() {
		System.out.println("profile deleted");
	}
	public void searchProfile() {
		System.out.println("profile search");
	}
	public void viewAllProfile() {
		System.out.println("all profile viewed");
	}
	public void loginProfile() {
		System.out.println("profile login");
	}

}
