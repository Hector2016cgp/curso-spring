package com.hector.spring.springboot_web.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller //Un controlador es el componente que se encarga de recibir las peticiones HTTP entrantes de los usuarios (a través del navegador, una aplicación móvil, etc.) y determinar qué lógica de negocio se debe ejecutar o qué vista se debe mostrar.
public class UserController {

    @GetMapping("/details") //Especifica que este método debe manejar las peticiones GET dirigidas a la ruta (o endpoint) /details.
    //xej: http://tudominio.com/details.
    
    public String details(Model model){
        model.addAttribute("title", "Hola mundo Spring Boot");
        model.addAttribute("name", "Hector");
        model.addAttribute("lastname", "Guerrero");
        return "details";
    }
}
