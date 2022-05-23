package com.porfolio.ms.service;

import com.porfolio.ms.model.Idioma;
import com.porfolio.ms.repository.IdiomaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {

    @Autowired
    private IdiomaRepo idiomaRepo;

    @Override
    public List<Idioma> findAll() {
        return idiomaRepo.findAll();
    }

    @Override
    public Idioma findIdiomaById(Long id) {

        return idiomaRepo.findById(id).orElse(null);
    }

    @Override
    public void createIdioma(Idioma idioma) {
        idiomaRepo.save(idioma);
    }

    @Override
    public void editIdioma(Idioma idioma) {
        idiomaRepo.save(idioma);
    }

    @Override
    public void deleteIdioma(Long id) {
        idiomaRepo.deleteById(id);
    }

}
