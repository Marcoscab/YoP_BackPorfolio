
package com.porfolio.ms.service;

import com.porfolio.ms.model.Persona;

public interface IPersonaService {
    
    //Declaracion de Métodos.
    //En este caso solo necesitamos el metodo de buscar por Id pq vamos a tener solo una persona
    //que es el titular del Porfolio.
   public Persona findPersonaById(Long id);
   public void editPersona(Persona persona);
    
}
