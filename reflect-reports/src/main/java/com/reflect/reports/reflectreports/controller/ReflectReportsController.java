package com.reflect.reports.reflectreports.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reflect.reports.reflectreports.pojo.UserQuizDetails;
import com.reflect.reports.reflectreports.service.ReflectReportsServiceImpl;


@RestController
public class ReflectReportsController {

	@Autowired
	private ReflectReportsServiceImpl reflectReportsServiceImpl;
	
	@CrossOrigin(maxAge = 3600)
	@RequestMapping(method = RequestMethod.GET, value = "/downloadReport")
	@ResponseBody
	public List<UserQuizDetails> downloadReport() {
		List<UserQuizDetails> userQuizDetails = new ArrayList<UserQuizDetails>();
		userQuizDetails = reflectReportsServiceImpl.downloadReport();
		return userQuizDetails;
	}
	
}
