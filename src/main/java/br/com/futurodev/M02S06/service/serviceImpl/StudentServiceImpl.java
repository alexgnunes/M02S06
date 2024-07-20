package br.com.futurodev.M02S06.service.serviceImpl;

import br.com.futurodev.M02S06.model.Database;
import br.com.futurodev.M02S06.model.Student;
import br.com.futurodev.M02S06.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public Student cadastrar(Student student) {
        return Database.cadastrar(student);
    }

    @Override
    public List<Student> listar() {
        return Database.listar();
    }

    @Override
    public Student buscarPorId(Integer id) {
        return Database.buscarPorId(id);
    }
}
