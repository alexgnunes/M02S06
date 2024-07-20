package br.com.futurodev.M02S06.model;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Student> students = new ArrayList<>();

    public static void adicionar(Student student) {
        students.add(student);
    }

    public static void remover(Integer registro) {
        students.removeIf(student -> student.getRegistro().equals(registro));
    }

    public static List<Student> listar() {
        return students;
    }

    public static Student FindByRegistro(Integer registro) {
        for (Student student : students) {
            if (student.getRegistro().equals(registro)) {
                return student;
            }
        }
        return null;
    }
}
