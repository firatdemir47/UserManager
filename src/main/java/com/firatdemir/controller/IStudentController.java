package com.firatdemir.controller;

import java.util.List;

import com.firatdemir.dto.DTOStudent;
import com.firatdemir.dto.DtoStudentIU;
import com.firatdemir.entites.Student;
import com.firatdemir.repository.StudentRepository;

public interface IStudentController {
	public DTOStudent savestudent(DtoStudentIU dtoStudentIU);

	public List<DTOStudent> getAllStudents();

	public DTOStudent getStudentById(Integer id);

	public void deleteStudent(Integer id);

	public DTOStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
