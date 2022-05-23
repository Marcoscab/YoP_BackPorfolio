
package com.porfolio.ms.service;

import com.porfolio.ms.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public List<Idioma> findAll();

    public Idioma findIdiomaById(Long id);

    public void createIdioma(Idioma idioma);

    public void editIdioma(Idioma idioma);

    public void deleteIdioma(Long id);
    
    
    
}
