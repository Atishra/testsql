package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class Subjectservice {
	@Autowired
	public SubjectRepository subjectRepo;
	
	
	
	public List<Subject> getAllSubject()
	{
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
}



	/*public void addSubject(subject ) {
		subjectRepo.save(subject);*/
		
	
}