package com.instagram.controller;

import java.util.Scanner;

import com.instagram.entity.InstagramUser;
import com.instagram.service.InstagramService;
import com.instagram.service.InstagramServiceInterface;

public class InstagramController implements InstagramControllerInterface{
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
		
		//how to transfer data from one layer to other layer
		//using DTO(data transfer object) design pattern in form of object
		//object of which class?
		//object of entity class like InstagramUser
		
		InstagramUser iu=new InstagramUser();
		iu.setName(name);
		iu.setPassword(password);
		iu.setEmail(email);
		iu.setAddress(address);
		
		
		InstagramServiceInterface iService=new InstagramService();
		int i=iService.createProfileService(iu);
		
		if(i>0) {
		
		System.out.println("profile created and your details is "+name+"  "+password+"   "+email+"   "+address);
		}
		else {
			System.out.println("could not create profile");
		}
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
