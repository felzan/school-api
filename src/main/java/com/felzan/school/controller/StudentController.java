package com.felzan.school.controller;

import com.felzan.school.request.StudentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping // Metodo HTTP POST, serve principalmente para incluir algo
    // Como nao foi configurado nenhum caminho, vai responder a um
    // POST /v1/students {}
    public void PostStudent(@RequestBody StudentRequest request) {

    }

}
