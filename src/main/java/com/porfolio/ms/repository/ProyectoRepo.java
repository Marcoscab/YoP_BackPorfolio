
package com.porfolio.ms.repository;

import com.porfolio.ms.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProyectoRepo extends JpaRepository<Proyecto, Long>{
    
}
