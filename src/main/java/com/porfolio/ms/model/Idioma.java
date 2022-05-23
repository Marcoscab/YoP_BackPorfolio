
package com.porfolio.ms.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Idioma extends Habilidad implements Serializable{
    
    @Basic
    private String idioma;

    public Idioma() {
    }

    public Idioma(String idioma) {
        this.idioma = idioma;
    }

    public Idioma(String idioma, Long id, String nivel) {
        super(id, nivel);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
    
    
}
