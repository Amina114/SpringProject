package net.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}