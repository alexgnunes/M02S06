package br.com.futurodev.M02S06.controller;

import br.com.futurodev.M02S06.model.Student;
import br.com.futurodev.M02S06.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Student>> listar() {
        List<Student> responseEntity = studentService.listar();
        return responseEntity.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(responseEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> buscarPorId(@PathVariable("id") Integer id) {
        Student responseEntity = studentService.buscarPorId(id);
        return responseEntity == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(responseEntity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable("id") Integer id) {
         studentService.remover(id);
        return ResponseEntity.noContent().build();
    }
}
