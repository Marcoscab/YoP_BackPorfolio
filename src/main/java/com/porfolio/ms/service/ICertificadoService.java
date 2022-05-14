
package com.porfolio.ms.service;

import com.porfolio.ms.model.Certificado;
import java.util.List;

public interface ICertificadoService {
    
    public List<Certificado> findAll();
    public Certificado findCertificadoById(Long id);
    public void createCertificado(Certificado cer);
    public void editCertificado(Certificado cer);
    
    
        
        
    
}
