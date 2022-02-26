package net.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.model.Student;
import net.java.repository.StudentRepository;
@Service
public class StudentService implements IStudentService {
	@Autowired
    private StudentRepository repo;
	
	@Override
	public List<Student> listAll() {
		// TODO Auto-generated method stub
		  return repo.findAll();
	}

	@Override
	public void save(Student std) {
		 repo.save(std);
		
	}

	@Override
	public Student get(long id) {
		// TODO Auto-generated method stub
		  return repo.findById(id).get();
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		
	}

}
