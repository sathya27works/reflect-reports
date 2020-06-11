package com.reflect.reports.reflectreports.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.reflect.reports.reflectreports.pojo.UserQuizDetails;

public interface UserQuizDetailsRepository extends MongoRepository<UserQuizDetails, String> {

}
