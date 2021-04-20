package com.example.springTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/student")
public class StudentController {
    StudentService studentService;
    @GetMapping(path = "/students")
    public List<StudentTable> findall(){
        return studentService.findAll();
    }

    @GetMapping(path = "/students{id}")
    public StudentTable findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PostMapping(path = "/create")
    public StudentTable create(@RequestBody StudentTable student){
        return studentService.create(student);
    }

    @DeleteMapping(path = "/delete{id}")
    public void delete(@PathVariable Long id){
         studentService.delete(id);
    }

}
