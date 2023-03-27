package ru.strelkov.test_rest2dbh2_13.dao;

import org.springframework.stereotype.Repository;
import ru.strelkov.test_rest2dbh2_13.entity.Student;

import java.util.List;
@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

     Student saveStudent(Student student);

     Student getStudent(int id);

     void deleteStudent(int id);
}
