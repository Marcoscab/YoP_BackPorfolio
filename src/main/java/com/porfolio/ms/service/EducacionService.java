
package com.porfolio.ms.service;

import com.porfolio.ms.model.Educacion;
import com.porfolio.ms.repository.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{

    @Autowired
    private EducacionRepo educacionRepo;
    
    @Override
    public List<Educacion> findAll() {
        return educacionRepo.findAll();
    }

    @Override
    public Educacion findEducacionById(Long id) {
        return educacionRepo.findById(id).orElse(null);
    }

    @Override
    public void createEducacion(Educacion edu) {
        educacionRepo.save(edu);
    }

    @Override
    public void editEducacion(Educacion edu) {
        educacionRepo.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        educacionRepo.deleteById(id);
    }
    
}
