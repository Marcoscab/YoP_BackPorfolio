package com.porfolio.ms.controller;

import com.porfolio.ms.model.Persona;
import com.porfolio.ms.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/porfolio")//defino ruta por defecto.
public class Controller {

    //Inyecto el Servicio de persona
    @Autowired
    private PersonaService personaService;

    //Metodo para traer los datos de la persona
    @GetMapping("/{id}")
    @ResponseBody //Esta anotation indica que devulva la Persona en formato Json.
    public Persona getPersona(@PathVariable Long id) {

        return personaService.findPersonadById(id);

    }

}
