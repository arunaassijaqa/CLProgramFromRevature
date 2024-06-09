package com.instagram.view;

import java.util.Scanner;

import com.instagram.controller.InstagramController;
import com.instagram.controller.InstagramControllerInterface;

public class InstagramView {

	public static void main(String[] args) {
		
		String ss="y";
		
		while(ss.equals("y")) {
		
		System.out.println("*********************MAIN MENU**************");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to view all profile");
		System.out.println("press 7 to login profile");
		
		System.out.println("please enter your choice");
		
		//Scanner class is use to take input on console
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		System.out.println(choice);
		
		//non static function can not be called inside static function so how to call?
		//via object of class we can call non static function inside static function
		//for static variable and function system will generate memory and load those properties into that memory
		//but for non static variable and function system will not create any memory so we have to create object to access non static properties
		
		InstagramControllerInterface iw=new InstagramController();  //receptionist
		
		switch(choice) {
		case 1: iw.createProfile();
			break;
		case 2:iw.viewProfile();
			break;
		case 3: iw.editProfile();
			break;
		case 4:iw.deleteProfile();
			break;
		case 5:iw.searchProfile();
			break;
		case 6:iw.viewAllProfile();
			break;
		case 7:iw.loginProfile();
			break;
			default : System.out.println("wrong choice");
		}
		
		System.out.println("to continue press y");
		ss=sc.next();
		}

	}
	
	
}
