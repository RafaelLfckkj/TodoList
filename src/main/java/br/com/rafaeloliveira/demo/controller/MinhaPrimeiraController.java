package br.com.rafaeloliveira.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/ ---------------
public class MinhaPrimeiraController {

    /*
        * Metodos de acesso do HTTP*
        GET - Buscar uma informação
        POST - Adicionar um dado/informação
        PUT - Alterar um dado/informação
        DELETE - Remover um dado
        PATCH - Alterar somente uma parte da info/dado

     */
    // Metodo (Funcionalidade) de uma classe

@ GetMapping("/PrimeiroMetodo")
    public String PrimeiraMensagem() {
        return "funcionou haha  ";
    }
}
