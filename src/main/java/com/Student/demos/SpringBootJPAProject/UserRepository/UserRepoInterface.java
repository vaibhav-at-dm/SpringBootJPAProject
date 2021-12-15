package com.Student.demos.SpringBootJPAProject.UserRepository;

import com.Student.demos.SpringBootJPAProject.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepoInterface extends JpaRepository<Student,Integer> {
     List<Student> findByStream(String stream);
     List<Student> findByGrade(String grade);
//     @Query(value = "select studentName,grade ")
}
