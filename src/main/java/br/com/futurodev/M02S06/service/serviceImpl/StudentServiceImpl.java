package br.com.futurodev.M02S06.service.serviceImpl;

import br.com.futurodev.M02S06.model.Database;
import br.com.futurodev.M02S06.model.Student;
import br.com.futurodev.M02S06.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Override
    public Student cadastrar(Student student) {
        return Database.cadastrar(student);
    }
}
