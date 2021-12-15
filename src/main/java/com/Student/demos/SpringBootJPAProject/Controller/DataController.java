package com.Student.demos.SpringBootJPAProject.Controller;


import com.Student.demos.SpringBootJPAProject.Model.Student;
import com.Student.demos.SpringBootJPAProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    UserService userService;

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable("id") int id){
        Student st = userService.getStObject(id);
        if (st != null){
        return st.getStudentName() + "      "+ st.getStream();}
        else {
            return "Not Found Object";
        }
    }
    @GetMapping("/student/stream/{stream}")
    public String getByStream(@PathVariable("stream") String stream, Model model){
        List<Student> studentList = userService.findByStream(stream);
        model.addAttribute("data",studentList);
        return "next.html";
    }
    @GetMapping("/student/grade/A")
    public List<Student> getByStream(){
        List<Student> studentList = userService.findByGrade("A");
        return studentList;
    }

    //for returning HTML

}
