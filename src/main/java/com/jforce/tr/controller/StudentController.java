package com.jforce.tr.controller;

import java.security.PublicKey;
import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.dao.StudentDao;
import com.jforce.tr.dao.StudentDaoImpl;
import com.jforce.tr.model.Student;

@RestController
@ResponseBody

public class StudentController {

	@Autowired
	private StudentDaoImpl studentDao;

	@RequestMapping(path = "/students", method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents() {
		
		return ResponseEntity.ok(studentDao.getStudentList());

	}

@RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
	public Student getStudentId(@PathVariable Integer id) {
	Student student= studentDao .getStudentById(id);
	
	return student;
}

@RequestMapping(path = "/del/{id}",method =RequestMethod.GET)
	public void del(@PathVariable Integer id) {
	studentDao.delete(id);
	}

@RequestMapping(path = "/update/{id}",method = RequestMethod.POST)
	public void update(@RequestBody Student student) {
	studentDao.update(student);
}
@RequestMapping(path = "/add/{id}",method = RequestMethod.POST)
public String add(@RequestBody Student student) {
	studentDao.add(student);
	return "ogrenci eklenmistir";
}


}
