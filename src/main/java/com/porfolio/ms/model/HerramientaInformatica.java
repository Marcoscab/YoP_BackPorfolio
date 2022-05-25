
package com.porfolio.ms.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class HerramientaInformatica extends Habilidad implements Serializable{
    
    @Basic
    private String herramienta;

    public HerramientaInformatica() {
    }

    public HerramientaInformatica(String herramienta) {
        this.herramienta = herramienta;
    }

    public HerramientaInformatica(String herramienta, Long id, String nivel) {
        super(id, nivel);
        this.herramienta = herramienta;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }
    
    
    
}
