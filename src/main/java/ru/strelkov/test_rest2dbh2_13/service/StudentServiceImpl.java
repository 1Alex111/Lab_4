package ru.strelkov.test_rest2dbh2_13.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.strelkov.test_rest2dbh2_13.dao.StudentDAO;
import ru.strelkov.test_rest2dbh2_13.entity.Student;

import java.util.List;
@Service

public class StudentServiceImpl implements StudentService{

    @Autowired

    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    public void deleteStudent(int id) {
               studentDAO.deleteStudent(id);
    }
}
