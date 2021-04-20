package com.example.springTest;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class serviceimpl implements StudentService{
        StudentRepository studentRepository;
        public serviceimpl(StudentRepository studentRepository){
            this.studentRepository=studentRepository;
        }



    @Override
    public List<StudentTable> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public StudentTable findById(Long id) {

        return studentRepository.findById(id).get();
    }

    @Override
    public StudentTable create(StudentTable student) {
        return studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
            StudentTable studentTabledelete=studentRepository.findById(id).get();
            if(studentTabledelete!=null){
                studentRepository.delete(studentTabledelete);
            }

    }


}
