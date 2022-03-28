package com.greatLearning.restStudentManagement.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.restStudentManagement.entity.Student;
import com.greatLearning.restStudentManagement.repository.StudentRepository;
import com.greatLearning.restStudentManagement.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	@Transactional
	public List<Student> findAll() {
		List<Student> students = studentRepo.findAll();
		return students;
	}

	@Override
	@Transactional
	public Student findById(int id) {
		Student student= studentRepo.findById(id).get();
		return student;
	}

	@Override
	@Transactional
	public void save(Student student) {
		studentRepo.save(student);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		studentRepo.deleteById(id);

	}

}
