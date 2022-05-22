
package com.porfolio.ms.service;

import com.porfolio.ms.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> findAll();

    public Educacion findEducacionById(Long id);

    public void createEducacion(Educacion edu);

    public void editEducacion(Educacion edu);

    public void deleteEducacion(Long id);
    
    
}
