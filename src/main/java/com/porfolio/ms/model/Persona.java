
package com.porfolio.ms.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity //mapeamos la clase a una tabla en la DB.
public class Persona implements Serializable{
    
    //Definimos los atributos de persona
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;
    private String profesion;
    private String empresa_actual;
    private String domicilio;
    private String acerca_de;
    private String url_foto_perfil;
    private String url_banner;
    
    //COnstructor vacio
    public Persona() {
    }

    //Constructor full
    public Persona(Long id, String nombre, String apellido, Date fecha_nacimiento, String profesion, String empresa_actual, String domicilio, String acerca_de, String url_foto_perfil, String url_banner) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.profesion = profesion;
        this.empresa_actual = empresa_actual;
        this.domicilio = domicilio;
        this.acerca_de = acerca_de;
        this.url_foto_perfil = url_foto_perfil;
        this.url_banner = url_banner;
    }
    
    
    //Getters y Setters 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEmpresa_actual() {
        return empresa_actual;
    }

    public void setEmpresa_actual(String empresa_actual) {
        this.empresa_actual = empresa_actual;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getAcerca_de() {
        return acerca_de;
    }

    public void setAcerca_de(String acerca_de) {
        this.acerca_de = acerca_de;
    }

    public String getUrl_foto_perfil() {
        return url_foto_perfil;
    }

    public void setUrl_foto_perfil(String url_foto_perfil) {
        this.url_foto_perfil = url_foto_perfil;
    }

    public String getUrl_banner() {
        return url_banner;
    }

    public void setUrl_banner(String url_banner) {
        this.url_banner = url_banner;
    }
    
    
    //TO String

    @Override
    public String toString() {
        return "Persona{" + 
                "id=" + id + 
                ", nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", fecha_nacimiento=" + fecha_nacimiento + 
                ", profesion=" + profesion + 
                ", empresa_actual=" + empresa_actual + 
                ", domicilio=" + domicilio + 
                ", acerca_de=" + acerca_de + 
                ", url_foto_perfil=" + url_foto_perfil + 
                ", url_banner=" + url_banner + '}';
    }
    
    
    
    
    
            
    
            
    
    
}
