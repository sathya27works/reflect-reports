package com.reflect.reports.reflectreports.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reflect.reports.reflectreports.pojo.UserQuizDetails;
import com.reflect.reports.reflectreports.repo.UserQuizDetailsRepository;

@Component
public class ReflectReportsDAOImpl implements ReflectReportsDAO{

	@Autowired
	private UserQuizDetailsRepository userQuizDetailsRepository;
	
	@Override
	public List<UserQuizDetails> downloadReport() {
		List<UserQuizDetails> userQuizDetails = new ArrayList<UserQuizDetails>();
		userQuizDetails = userQuizDetailsRepository.findAll();
		return userQuizDetails;
	}
	
}
