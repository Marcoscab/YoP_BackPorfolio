
package com.porfolio.ms.service;

import com.porfolio.ms.model.Experiencia;
import com.porfolio.ms.repository.ExperienciaRepo;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    
    private ExperienciaRepo experienciaRepo;
    
    
    @Override
    public List<Experiencia> findAll() {
        return experienciaRepo.findAll();
    }

    @Override
    public Experiencia findExperienciaById(Long id) {
        return experienciaRepo.findById(id).orElse(null);
    }

    @Override
    public void createExperiencia(Experiencia exp) {
       experienciaRepo.save(exp);
    }

    @Override
    public void editExperiencia(Experiencia exp) {
        experienciaRepo.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        experienciaRepo.deleteById(id);
    }
    
    
    
    
}
