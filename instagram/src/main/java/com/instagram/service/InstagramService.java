package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface{

	public int createProfileService(InstagramUser iu) {
		InstagramDAOInterface iDao=new InstagramDAO();
		int i=iDao.createProfileDAO(iu);
		return i;
	}

}
