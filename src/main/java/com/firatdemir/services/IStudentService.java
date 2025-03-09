package com.firatdemir.services;

import java.util.List;

import com.firatdemir.dto.DTOStudent;
import com.firatdemir.dto.DtoStudentIU;
import com.firatdemir.entites.Student;
import com.firatdemir.repository.StudentRepository;

public interface IStudentService {
	public DTOStudent saveStudent(DtoStudentIU student);

	public List<DTOStudent> getAllStudents();

	public DTOStudent getStudentById(Integer id);

	public void deleteStudent(Integer id);
	
	public DTOStudent updaStudent(Integer id,DtoStudentIU dtoStudentIU);
}
