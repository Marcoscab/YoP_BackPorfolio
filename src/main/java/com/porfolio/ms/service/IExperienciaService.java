/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.porfolio.ms.service;

import com.porfolio.ms.model.Experiencia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IExperienciaService {

    public List<Experiencia> findAll();

    public Experiencia findExperienciaById(Long id);

    public void createExperiencia(Experiencia exp);

    public void editExperiencia(Experiencia exp);

    public void deleteExperiencia(Long id);

}
