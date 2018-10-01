package com.example.demo.service;

import com.example.demo.model.School;
import com.example.demo.model.Student;
import com.example.demo.repository.SchoolRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public void findStudentInfo() {
        School school = new School("매력고");
        schoolRepository.save(school);

        Student stu1 = new Student("나라");
        Student stu2 = new Student("민하");
        Student stu3 = new Student("나나");

        stu1.setSchool(school);
        stu2.setSchool(school);
        stu3.setSchool(school);

        studentRepository.save(stu1);
        studentRepository.save(stu2);
        studentRepository.save(stu3);

        List<Student> students = studentRepository.findAll();

        for (Student s : students) {
            System.out.println(s.getUserName() + "," + s.getSchool().getName());
        }
    }
}
