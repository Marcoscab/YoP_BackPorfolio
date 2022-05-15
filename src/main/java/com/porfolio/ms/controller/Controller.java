package com.porfolio.ms.controller;

import com.porfolio.ms.model.Certificado;
import com.porfolio.ms.model.Persona;
import com.porfolio.ms.service.CertificadoService;
import com.porfolio.ms.service.PersonaService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/porfolio")
public class Controller {

    //Inyecto el Servicio de persona
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private CertificadoService certificadoService;

    //-----------METODOS PERSONA--------------------------------------------------------------//
    //Metodo para traer los datos de la persona
    @GetMapping("/{id}")
    @ResponseBody //Esta anotation indica que devulva la Persona en formato Json serializado
    public Persona getPersona(@PathVariable Long id) {
        
        return personaService.findPersonaById(id);
    }

    //Metodo para actualizar Persona
    @PutMapping("/editar/{id}")
    public Persona updatePersona(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String apellido,
            @RequestParam String acerca_de,
            @RequestParam String domicilio,
            @RequestParam String empresa_actual,
            @RequestParam String profesion,
            @RequestParam String url_banner,
            @RequestParam String url_foto_perfil,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date fecha_nacimiento) {

        //Busco la persona y actualizo con los datos recibidos.                      
        Persona per = personaService.findPersonaById(id);

        //actaulizo con los datos recibidos siempre y cuando tengan info nueva
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setAcerca_de(acerca_de);
        per.setDomicilio(domicilio);
        per.setEmpresa_actual(empresa_actual);
        per.setProfesion(profesion);
        per.setUrl_foto_perfil(url_foto_perfil);
        per.setUrl_banner(url_banner);
        per.setFecha_nacimiento(fecha_nacimiento);

        //Llamo al servicio para actualizar.
        personaService.editPersona(per);
        return per;
     
    }
      //Metodo para actualizar Persona
    @PutMapping("/editar2/{id}")
    public Persona update2Persona(@PathVariable("id") Long id, @RequestBody Persona persona){
        //Busco la persona y actualizo con los datos recibidos.                      
        Persona per = personaService.findPersonaById(id);

        //actaulizo con los datos recibidos siempre y cuando tengan info nueva
        per.setNombre(persona.getNombre());
        per.setApellido(persona.getApellido());
        per.setAcerca_de(persona.getAcerca_de());
        per.setDomicilio(persona.getDomicilio());
        per.setEmpresa_actual(persona.getEmpresa_actual());
        per.setProfesion(persona.getProfesion());
        per.setUrl_foto_perfil(persona.getUrl_foto_perfil());
        per.setUrl_banner(persona.getUrl_banner());
        per.setFecha_nacimiento(persona.getFecha_nacimiento());

        //Llamo al servicio para actualizar.
        personaService.editPersona(per);
        return per;
        
        
    }
    

    //-----------METODOS CERTIFICADO--------------------------------------------------------------//
    //Busca todos los certificados
    @GetMapping("/certificado/all")
    @ResponseBody
    public List<Certificado> getAllCertidicado() {
        
        return certificadoService.findAll();
        
    }

    //Busca un certificado por id
    @GetMapping("/certificado/{id}")
    @ResponseBody
    public Certificado getCertificado(@PathVariable Long id) {
        return certificadoService.findCertificadoById(id);
    }

    //Crea un certificado
    @PostMapping("/certificado/add")
    public Certificado addCertificad(@RequestBody Certificado cer) {
        
        certificadoService.createCertificado(cer);
        return cer;
    }

    //Actualiza un certidicado
    @PutMapping("/certificado/edit/{id}")
    public Certificado updateCertificado(@PathVariable Long id, @RequestParam String cer) {
        
        Certificado certificado = certificadoService.findCertificadoById(id);
        certificado.setCertificado(cer);
        certificadoService.editCertificado(certificado);
        return certificado;
        
    }

    //Borra Certificado
    @DeleteMapping("/certificado/delete/{id}")
    public void deleteCertificado(@PathVariable Long id) {
        
        certificadoService.deleteCertificado(id);
        
    }
    
}
