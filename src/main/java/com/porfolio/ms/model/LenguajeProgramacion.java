
package com.porfolio.ms.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;


@Entity
public class LenguajeProgramacion extends Habilidad implements Serializable{
    
    @Basic
    private String lenguaje;

    public LenguajeProgramacion() {
    }

    public LenguajeProgramacion(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public LenguajeProgramacion(String lenguaje, Long id, String nivel) {
        super(id, nivel);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
    
}
