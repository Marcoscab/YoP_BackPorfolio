
package com.porfolio.ms.service;

import com.porfolio.ms.model.Certificado;
import com.porfolio.ms.repository.CertificadoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadoService implements ICertificadoService{

    @Autowired
    private CertificadoRepo certificadoRepo;
    
    
    @Override
    public List<Certificado> findAll() {
        return this.certificadoRepo.findAll();
    }

    @Override
    public Certificado findCertificadoById(Long id) {
      return this.certificadoRepo.findById(id).orElse(null);
    }

    @Override
    public void createCertificado(Certificado cer) {
        this.certificadoRepo.save(cer);
    }

    @Override
    public void editCertificado(Certificado cer) {
        this.certificadoRepo.save(cer);
    }

    @Override
    public void deleteCertificado(Long id) {
        certificadoRepo.deleteById(id);
    }
    
}
