
package com.porfolio.ms.service;

import com.porfolio.ms.model.LenguajeProgramacion;
import com.porfolio.ms.repository.LenguajeProgramacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LenguajeProgramacionService implements ILenguajeProgramacionService{

    @Autowired
    private LenguajeProgramacionRepo leguajeRepo;
    
    @Override
    public List<LenguajeProgramacion> findAll() {
        return leguajeRepo.findAll();
    }

    @Override
    public LenguajeProgramacion findLenguajeProgramacionById(Long id) {
        return leguajeRepo.findById(id).orElse(null);
    }

    @Override
    public void createLenguajeProgramacion(LenguajeProgramacion lenguaje) {
        this.leguajeRepo.save(lenguaje);
    }

    @Override
    public void editLenguajeProgramacion(LenguajeProgramacion lenguaje) {
        this.leguajeRepo.save(lenguaje);
    }

    @Override
    public void deleteLenguajeProgramacion(Long id) {
        this.leguajeRepo.deleteById(id);
    }
    
    
    
}
