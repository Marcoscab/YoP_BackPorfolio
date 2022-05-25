
package com.porfolio.ms.service;

import com.porfolio.ms.model.Proyecto;
import com.porfolio.ms.repository.ProyectoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    private ProyectoRepo proyectoRepo;
    
    
    @Override
    public List<Proyecto> findAll() {
        return this.proyectoRepo.findAll();
    }

    @Override
    public Proyecto findProyectoById(Long id) {
        return this.proyectoRepo.findById(id).orElse(null);
    }

    @Override
    public void createProyecto(Proyecto proyecto) {
        this.proyectoRepo.save(proyecto);
    }

    @Override
    public void editProyecto(Proyecto proyecto) {
        this.proyectoRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        this.proyectoRepo.deleteById(id);
    }
    
}
