package br.com.futurodev.M02S06.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {

    public static List<Student> students = new ArrayList<>();

    public static Student cadastrar(Student student) {
        if (FindByRegistro(student.getRegistro()) != null) {
            throw new IllegalArgumentException("Um estudante com este registro já foi cadastrado!");
        }
        students.add(student);
        return FindByRegistro(student.getRegistro());
    }

    public static void remover(Integer registro) {
        students.removeIf(student -> student.getRegistro().equals(registro));
    }

    public static List<Student> listar() {
        return students;
    }

    public static Student FindByRegistro(Integer registro) {
        Optional<Student> optionalStudent = students.stream()
                .filter(task -> task.getRegistro().equals(registro)).findFirst();
        return optionalStudent.orElse(null);
    }
}
