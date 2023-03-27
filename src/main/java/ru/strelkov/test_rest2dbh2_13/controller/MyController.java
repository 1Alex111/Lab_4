package ru.strelkov.test_rest2dbh2_13.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.strelkov.test_rest2dbh2_13.entity.Student;
import ru.strelkov.test_rest2dbh2_13.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private  StudentService studentService;


    @GetMapping("/students")
    public List<Student> showAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
        private Student getStudent(@PathVariable("id") int id){
       return studentService.getStudent(id);

    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;

    }

    @DeleteMapping( "/students/{id}")
    public void updateStudent(@PathVariable("id") int id){
        studentService.deleteStudent(id);
    }
}

