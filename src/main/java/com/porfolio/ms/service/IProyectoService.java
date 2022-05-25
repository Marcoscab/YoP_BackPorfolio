
package com.porfolio.ms.service;

import com.porfolio.ms.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> findAll();

    public Proyecto findProyectoById(Long id);

    public void createProyecto(Proyecto proyecto);

    public void editProyecto(Proyecto proyecto);

    public void deleteProyecto(Long id); 
    
}
