package com.porfolio.ms.service;

import com.porfolio.ms.model.Persona;
import com.porfolio.ms.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    //Realizamos inyeccion de dependecia
    @Autowired
    private PersonaRepo personaRepo;

    //Metodo para buscar por id, en caso q no se encuentre devuelve null
    @Override
    public Persona findPersonadById(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

}
