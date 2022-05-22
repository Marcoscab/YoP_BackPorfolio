
package com.porfolio.ms.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String entidad;
    private String titulo;
    private String fecha_cursado;
    private String domicilio;
    private String url_logo;    

    public Educacion() {
    }

    public Educacion(Long id, String entidad, String titulo, String fecha_cursado, String domicilio, String url_logo) {
        this.id = id;
        this.entidad = entidad;
        this.titulo = titulo;
        this.fecha_cursado = fecha_cursado;
        this.domicilio = domicilio;
        this.url_logo = url_logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha_cursado() {
        return fecha_cursado;
    }

    public void setFecha_cursado(String fecha_cursado) {
        this.fecha_cursado = fecha_cursado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getUrl_logo() {
        return url_logo;
    }

    public void setUrl_logo(String url_logo) {
        this.url_logo = url_logo;
    }
    
    
    
    
    
}
