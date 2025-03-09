package com.firatdemir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.firatdemir.entites.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	//bu iki şekilde manul olarak da yazılabilir 
	
	/*HQL : Sınıfın ismi ve değişken isimleri kullanılarak sorgular yazılır 
	@Query(value = "from Student" ,nativeQuery = false)
	List<Student> findAllStudents();*/
	
	
	/* SQL : tablo ismi ve tablo içerisindeki kolon isimleri ile sorgular yazılır 
	 * @Query(value = "select * from student.student" ,nativeQuery = true)
	List<Student> findAllStudents();
	 * */
}
