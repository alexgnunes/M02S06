package br.com.futurodev.M02S06.model;

import java.util.Objects;

public class Student {
    private Integer registro;
    private String name;
    private String email;

    public Student() {
    }

    public Student(Integer registro, String name, String email) {
        this.registro = registro;
        this.name = name;
        this.email = email;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(registro, student.registro);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(registro);
    }

    @Override
    public String toString() {
        return "Student{" + "registro=" + registro + ", name=" + name + ", email=" + email + '}';
    }
}
