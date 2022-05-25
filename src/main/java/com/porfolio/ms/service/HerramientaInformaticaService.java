
package com.porfolio.ms.service;


import com.porfolio.ms.model.HerramientaInformatica;
import com.porfolio.ms.repository.HerramientaInformaticaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HerramientaInformaticaService implements IHerramientaInformaticaService{

    @Autowired
    private HerramientaInformaticaRepo herramientaRepo;
    
    
    @Override
    public List<HerramientaInformatica> findAll() {
       return this.herramientaRepo.findAll();
    }

    @Override
    public HerramientaInformatica findHerramientaInformaticaById(Long id) {
        return this.herramientaRepo.findById(id).orElse(null);
    }

    @Override
    public void createHerramientaInformatica(HerramientaInformatica herramienta) {
        this.herramientaRepo.save(herramienta);
    }

    @Override
    public void editHerramientaInformatica(HerramientaInformatica herramienta) {
        this.herramientaRepo.save(herramienta);
    }

    @Override
    public void deleteHerramientaInformatica(Long id) {
        this.herramientaRepo.deleteById(id);
    }
    
    
}
