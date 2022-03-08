package com.felzan.school.service;

import com.felzan.school.domain.Student;
import com.felzan.school.entity.StudentEntity;
import com.felzan.school.repository.StudentRepository;
import com.felzan.school.request.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Anotacao q diz pro Spring q essa eh uma classe de service
@RequiredArgsConstructor // A mesma anotacao do lombok pra criar o construtor
public class StudentService { // Classe de servico de estudante
// A maior parte da "logica de negocio"/"business rules"

    private final StudentRepository repository; // Defino q a classe StudentService vai utilizar o repositorio de estudantes

    public Integer saveStudent(StudentRequest request) {
        // Cria um objeto de estidade com os valores do estudate da request
        StudentEntity entity = new StudentEntity();
        entity.setName(request.getName());
        entity.setAge(request.getAge());
        StudentEntity saved = repository.save(entity); // Salva a entidade
        return saved.getId(); // retorno o ID da entidade q foi criada
    }

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>(); // Crio uma lista vazia de Student
        repository.findAll().forEach(entity -> students.add(new Student(entity.getId(), entity.getName(), entity.getAge())));
        // Percorre todos os estudantes q vieram do banco, e cria um obejto Student
        // Como os objetos sao de tipos DIFERENTES precisa criar um objeto a partir de outro
        return students; // retorna a lista
    }
}
