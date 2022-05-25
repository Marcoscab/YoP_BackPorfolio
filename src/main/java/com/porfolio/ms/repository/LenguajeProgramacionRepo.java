
package com.porfolio.ms.repository;

import com.porfolio.ms.model.LenguajeProgramacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LenguajeProgramacionRepo extends JpaRepository<LenguajeProgramacion, Long> {
    
}
