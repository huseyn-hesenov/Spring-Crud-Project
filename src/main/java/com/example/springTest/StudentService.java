package com.example.springTest;

import java.util.List;

public interface StudentService {
    List<StudentTable> findAll();
    StudentTable findById(Long id);
    StudentTable create(StudentTable student);

    void delete(Long id);


}
