
package com.porfolio.ms.service;

import com.porfolio.ms.model.Persona;
import com.porfolio.ms.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepo personaRepo;
    

    
    
    @Override
    public Persona findPersonaById(Long id) {
        
        
    }
    
}
