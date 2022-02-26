package net.java.service;

import java.util.List;

import net.java.model.Student;

public interface IStudentService {
	public List<Student> listAll() ; 
	 public void save(Student std); 
	  public Student get(long id)  ; 
	  public void delete(long id) ; 
}
