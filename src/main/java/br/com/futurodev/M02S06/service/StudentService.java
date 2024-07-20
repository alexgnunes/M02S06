package br.com.futurodev.M02S06.service;

import br.com.futurodev.M02S06.model.Student;

import java.util.List;

public interface StudentService {

    Student cadastrar(Student student);

    List<Student> listar();

    Student buscarPorId(Integer id);

    void remover(Integer id);

}
