package com.felzan.school.service;

import com.felzan.school.request.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service // Anotacao q diz pro Spring q essa eh uma classe de service
@RequiredArgsConstructor // A mesma anotacao do lombok pra criar o construtor
public class StudentService { // Classe de servico de estudante
// A maior parte da "logica de negocio"/"business rules"

    public void SaveStudent(StudentRequest request) {
        //
    }
}
