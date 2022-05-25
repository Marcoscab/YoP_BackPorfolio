
package com.porfolio.ms.service;

import com.porfolio.ms.model.LenguajeProgramacion;
import java.util.List;


public interface ILenguajeProgramacionService {
    
    public List<LenguajeProgramacion> findAll();

    public LenguajeProgramacion findLenguajeProgramacionById(Long id);

    public void createLenguajeProgramacion(LenguajeProgramacion lenguaje);

    public void editLenguajeProgramacion(LenguajeProgramacion lenguaje);

    public void deleteLenguajeProgramacion(Long id);  
    
}
