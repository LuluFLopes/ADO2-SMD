package br.com.senac.demo.controller;

import br.com.senac.demo.dto.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response")
public class HelloController {

    /*
    Json para teste no postman.
    {
    "mensagem": "Hello World"
    }
    */

    @GetMapping("/get")
    public String get(){
        return "Olá Mundo";
    }

    @PostMapping("/post")
    public ResponseEntity<HelloWorld> post(@RequestBody HelloWorld hw) {
        return ResponseEntity.ok(hw);
    }

    @PutMapping("/put")
    public ResponseEntity<HelloWorld> put(@RequestBody HelloWorld hw) {
        return ResponseEntity.ok(hw);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<HelloWorld> delete(@RequestBody HelloWorld hw) {
        return ResponseEntity.ok(hw);
    }

}
