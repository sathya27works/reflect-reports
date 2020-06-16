package com.reflect.reports.reflectreports.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.reflect.reports.reflectreports.pojo.UserQuizDetails;
import com.reflect.reports.reflectreports.repo.UserQuizDetailsRepository;

@Component
public class ReflectReportsDAOImpl implements ReflectReportsDAO{

	@Autowired
	private UserQuizDetailsRepository userQuizDetailsRepository;
	
	@Autowired 
	private MongoOperations mongoOps;
	
	@Override
	public List<UserQuizDetails> downloadReport() {
		List<UserQuizDetails> userQuizDetails = new ArrayList<UserQuizDetails>();
		//userQuizDetails = userQuizDetailsRepository.findAll();
		Query query = new Query();
		query.fields().include("userName");
		query.fields().include("questionNo");
		query.fields().include("question");
		query.fields().include("selectedAnswer");		
		query.fields().include("userScore");
		userQuizDetails = mongoOps.find(query, UserQuizDetails.class);
		
		return userQuizDetails;
	}
	
}
