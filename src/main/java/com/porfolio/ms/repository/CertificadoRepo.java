
package com.porfolio.ms.repository;

import com.porfolio.ms.model.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CertificadoRepo extends JpaRepository<Certificado, Long>{
    
}
