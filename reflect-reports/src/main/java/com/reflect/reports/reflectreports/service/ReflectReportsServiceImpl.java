package com.reflect.reports.reflectreports.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.reflect.reports.reflectreports.dao.ReflectReportsDAOImpl;
import com.reflect.reports.reflectreports.pojo.UserQuizDetails;

@Component
public class ReflectReportsServiceImpl implements ReflectReportsService {
	
	@Autowired
	private ReflectReportsDAOImpl reflectReportsDAOImpl;
	
	@Override
	public List<UserQuizDetails> downloadReport(){
		List<UserQuizDetails> userQuizDetailsList = new ArrayList<UserQuizDetails>();
		userQuizDetailsList = reflectReportsDAOImpl.downloadReport();
		return userQuizDetailsList;
	}
}
