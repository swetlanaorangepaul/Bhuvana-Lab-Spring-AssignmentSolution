package com.greatLearning.restStudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.restStudentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
