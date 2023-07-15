package com.ramana.springbootrestapi.cntroller;

import com.ramana.springbootrestapi.bean.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student(1, "Pade", "Ramanaiah");
        log.info("Student: {}", student);
        return student;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Pade", "ramanaiah"),
                new Student(2, "Pade", "Ravi"),
                new Student(4, "Y", "Lavanya")
        );
    }
}
