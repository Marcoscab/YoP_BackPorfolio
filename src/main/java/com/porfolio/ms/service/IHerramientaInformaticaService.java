
package com.porfolio.ms.service;

import com.porfolio.ms.model.HerramientaInformatica;
import java.util.List;


public interface IHerramientaInformaticaService {
     public List<HerramientaInformatica> findAll();

    public HerramientaInformatica findHerramientaInformaticaById(Long id);

    public void createHerramientaInformatica(HerramientaInformatica herramienta);

    public void editHerramientaInformatica(HerramientaInformatica herramienta);

    public void deleteHerramientaInformatica(Long id);  
}
