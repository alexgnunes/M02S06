package br.com.futurodev.M02S06.controller;

import br.com.futurodev.M02S06.model.Student;
import br.com.futurodev.M02S06.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> cadastrar(@Valid @RequestBody Student student) {
        Student responseEntity = studentService.cadastrar(student);
        return ResponseEntity.ok(responseEntity);
    }

}
