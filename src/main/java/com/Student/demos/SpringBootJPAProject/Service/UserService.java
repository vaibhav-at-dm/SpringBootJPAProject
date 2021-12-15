package com.Student.demos.SpringBootJPAProject.Service;

import com.Student.demos.SpringBootJPAProject.Model.Student;
import com.Student.demos.SpringBootJPAProject.UserRepository.UserRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepoInterface userRepoInterface;

    public Student getStObject(int id){
        Student st = userRepoInterface.findById(id).get();
        return st;
    }
    public List<Student> findByStream(String stream){
        List<Student> list = userRepoInterface.findByStream(stream);
        return list;
    }
    public List<Student> findByGrade(String stream){
        List<Student> list = userRepoInterface.findByGrade(stream);
        return list;
    }


}
