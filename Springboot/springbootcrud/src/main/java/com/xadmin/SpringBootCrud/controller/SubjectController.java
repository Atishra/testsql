package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.Subjectservice;

@RestController
public class SubjectController {
	@Autowired
	private Subjectservice subjectService;
	@RequestMapping("/subjects")
public List<Subject> getAllSubject()
{
	return  subjectService.getAllSubject();
}

 
 

}

	



