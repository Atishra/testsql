package com.xadmin.SpringBootCrud.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Subject;

public interface SubjectRepository  extends CrudRepository<Subject,Long>{


	ArrayList<Subject> findAll();

}
