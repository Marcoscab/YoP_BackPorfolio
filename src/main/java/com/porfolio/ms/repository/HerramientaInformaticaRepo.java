
package com.porfolio.ms.repository;

import com.porfolio.ms.model.HerramientaInformatica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HerramientaInformaticaRepo extends JpaRepository<HerramientaInformatica, Long>{
    
}
