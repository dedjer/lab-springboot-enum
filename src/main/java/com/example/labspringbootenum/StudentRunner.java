package com.example.labspringbootenum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner
{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String...args) throws Exception {

        Student student = new Student();
        student.setName("Test");
        student.setPassportNumber("TEST1234");
        student.setStatus(Enum.Status.ENROLLED);

        studentRepository.save(student);
    }
}


