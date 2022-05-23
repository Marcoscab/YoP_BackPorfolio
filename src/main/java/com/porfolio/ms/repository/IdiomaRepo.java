
package com.porfolio.ms.repository;

import com.porfolio.ms.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepo extends JpaRepository<Idioma, Long>{
    
}
