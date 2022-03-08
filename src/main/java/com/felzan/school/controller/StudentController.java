package com.felzan.school.controller;

import com.felzan.school.domain.Student;
import com.felzan.school.request.StudentRequest;
import com.felzan.school.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Essa anotacao eh pro Spring saber q essa classe tem rotas
@RequiredArgsConstructor // Essa anotacao eh pra criar um construtor das dependencias
// O construtor com as dependencias serve pro Spring saber quais classes ele tem q instanciar (criar)
// para que essa classe funcione
@RequestMapping("/v1/students") // Caminho q faz acessar essa controller
// geralmente se usa v1, v2, v3, etc para versionar a rota. Em caso de alteraracoes na rota poderia ser criado uma v2
// e manter essa rota sem modificacoes
public class StudentController { // Essa eh a nomenclatura mais utilizada NomeController.
// Uma classe controller contem as rotas
// Como essa classe eh uma StudentController, significa que essa classe vai ter as rotas para gerenciar estudantes

    private final StudentService service; // Defino q a classe StudentController vai utilizar o service de estudantes

    @PostMapping // Metodo HTTP POST, serve principalmente para incluir algo
    // Como nao foi configurado nenhum caminho, vai responder a um
    // POST /v1/students { "name": "Nome do Estudante", "age": 20 }
    public ResponseEntity<Integer> postStudent(@RequestBody StudentRequest request) {
        Integer StudentId = service.saveStudent(request); // Salva student e pego o id criado
        return ResponseEntity.status(HttpStatus.CREATED).body(StudentId); // Cria uma resposta "bonita" do Spring
        // com o status 201 (created) e o id criado como corpo de resposta
    }

    @GetMapping // Metodo HTTP GET, serve pricipalmente para buscas
    // GET /v1/students/
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = service.getAllStudent();
        return ResponseEntity.ok().body(students);
    }

}
