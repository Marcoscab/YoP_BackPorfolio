package com.porfolio.ms.service;

import com.porfolio.ms.model.Persona;
import com.porfolio.ms.repository.PersonaRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    //Realizamos inyeccion de dependecia
    @Autowired
    public PersonaRepo personaRepo;

    @Override
    public Persona findPersonadById(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

}
