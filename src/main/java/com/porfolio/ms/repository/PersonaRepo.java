
package com.porfolio.ms.repository;

import com.porfolio.ms.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long>{

   // public Optional findPersonaById(Long id);
    
}
