package com.hector.spring.springboot_web.controllers;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Por medio de este controller devolvemos todo en JSON. 
public class UserRestController {

    @GetMapping("/details2") //Especifica que este método debe manejar las peticiones GET dirigidas a la ruta (o endpoint) /details.
    //xej: http://tudominio.com/details.
    
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo Spring Boot");
        body.put("name", "Hector");
        body.put("lastname", "Guerrero");
        return body;
    }

}
