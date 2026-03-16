package br.com.rafaeloliveira.demo.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Modificador public Private protected
 */
@RestController
@RequestMapping("/users")
public class UserController {

    /*

    String (Texto)
    Interger (int) numeros inteiros
    Double (double) numeros decimais
    Float (float) numeros decimais tmb
    char (A C) caracteres
    date (data)
    void - tecnicamente não é um tipo de dado, mas sim a ausência de um tipo de dado. Ele é usado para indicar que um método não retorna nenhum valor.
    
    */

    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
    }
}
