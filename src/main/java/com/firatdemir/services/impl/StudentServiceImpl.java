package com.firatdemir.services.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firatdemir.controller.IStudentController;
import com.firatdemir.dto.DTOStudent;
import com.firatdemir.dto.DtoStudentIU;
import com.firatdemir.entites.Student;
import com.firatdemir.repository.StudentRepository;
import com.firatdemir.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public DTOStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DTOStudent response = new DTOStudent();
		Student student = new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);
		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;
	}

	@Override
	public List<DTOStudent> getAllStudents() {
		List<DTOStudent> dtoList = new ArrayList<>();
		List<Student> studentList = studentRepository.findAll();
		for (Student student : studentList) {
			DTOStudent dto = new DTOStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public DTOStudent getStudentById(Integer id) {
		DTOStudent dto = new DTOStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent = optional.get();
			BeanUtils.copyProperties(dbStudent, dto);
		}
		return dto;
	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}

	@Override
	public DTOStudent updaStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DTOStudent dto = new DTOStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent = optional.get();
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());
			Student updateStudent = studentRepository.save(dbStudent);
			BeanUtils.copyProperties(updateStudent, dto);
			return dto;
		}
		return null;

	}
}
