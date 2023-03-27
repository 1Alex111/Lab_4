package ru.strelkov.test_rest2dbh2_13.service;

import org.springframework.stereotype.Service;
import ru.strelkov.test_rest2dbh2_13.entity.Student;

import java.util.List;
@Service
public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}


