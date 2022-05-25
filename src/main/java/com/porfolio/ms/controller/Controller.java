package com.porfolio.ms.controller;

import com.porfolio.ms.model.Certificado;
import com.porfolio.ms.model.Educacion;
import com.porfolio.ms.model.Experiencia;
import com.porfolio.ms.model.HerramientaInformatica;
import com.porfolio.ms.model.Idioma;
import com.porfolio.ms.model.LenguajeProgramacion;
import com.porfolio.ms.model.Persona;
import com.porfolio.ms.model.User;
import com.porfolio.ms.service.CertificadoService;
import com.porfolio.ms.service.EducacionService;
import com.porfolio.ms.service.ExperienciaService;
import com.porfolio.ms.service.HerramientaInformaticaService;
import com.porfolio.ms.service.IdiomaService;
import com.porfolio.ms.service.LenguajeProgramacionService;
import com.porfolio.ms.service.PersonaService;
import com.porfolio.ms.service.UserService;
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

    //Inyecto los Servicios
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private CertificadoService certificadoService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private ExperienciaService experienciaService;
    
    @Autowired
    private EducacionService educacionService;
    
    @Autowired
    private IdiomaService idiomaService;
    
    @Autowired
    private LenguajeProgramacionService lenguajeService;
    
    @Autowired
    private HerramientaInformaticaService herramientaService;

    //-----------METODOS PERSONA--------------------------------------------------------------//
    //Metodo para traer los datos de la persona
    @GetMapping("/{id}")
    @ResponseBody //Esta anotation indica que devulva la Persona en formato Json serializado
    public Persona getPersona(@PathVariable Long id) {
        
        return personaService.findPersonaById(id);
    }

    //Metodo para actualizar Persona
/*    @PutMapping("/editar/{id}")
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
        
    }*/

//Metodo para actualizar Persona
    @PutMapping("/editar2/{id}")
    public Persona update2Persona(@PathVariable("id") Long id, @RequestBody Persona persona) {
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
    @ResponseBody
    public Certificado updateCertificado(@PathVariable Long id, @RequestBody Certificado cer) {
        
        Certificado certificado = certificadoService.findCertificadoById(id);
        certificado.setCertificado(cer.getCertificado());
        certificadoService.editCertificado(certificado);
        return certificado;
        
    }

    //Borra Certificado
    @DeleteMapping("/certificado/delete/{id}")
    public void deleteCertificado(@PathVariable Long id) {
        
        certificadoService.deleteCertificado(id);
        
    }

    //-----------METODOS USER--------------------------------------------------------------//
    @GetMapping("/user/{id}")
    @ResponseBody
    public User getUser(@PathVariable("id") Long id) {
        
        return userService.findUserById(id);
        
    }

    //-----------METODOS EXPERIENCIA--------------------------------------------------------------//
    @GetMapping("/experiencia/all")
    @ResponseBody
    public List<Experiencia> getAllExperciencia() {
        
        return this.experienciaService.findAll();
    }
    
    @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Experiencia getExperienciaById(@PathVariable("id") Long id) {
        
        return experienciaService.findExperienciaById(id);
    }
    
    @PostMapping("/experiencia/add")
    public void addExperiencia(@RequestBody Experiencia exp) {
        
        experienciaService.createExperiencia(exp);
    }
    
    @PutMapping("/experiencia/edit/{id}")
    public void updateExperiencia(@PathVariable Long id, Experiencia exp) {
        
        experienciaService.editExperiencia(exp);
    }
    
    @DeleteMapping("/experiencia/delete/{id}")
    public void deleteExpericencia(@PathVariable Long id) {
        
        experienciaService.deleteExperiencia(id);
    }

//-----------METODOS EDUCACION--------------------------------------------------------------//
    @GetMapping("/educacion/all")
    @ResponseBody
    public List<Educacion> getAllEducacion() {
        return educacionService.findAll();
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion getEducacionById(@PathVariable("id") Long id) {
        
        return educacionService.findEducacionById(id);
    }
    
    @PostMapping("/educacion/add")
    public void addEducacion(@RequestBody Educacion edu) {
        
        educacionService.createEducacion(edu);
    }
    
    @PutMapping("/educacion/edit/{id}")
    public void updateEducacion(@PathVariable Long id, @RequestBody Educacion edu) {
        
        educacionService.editEducacion(edu);
    }
    
    @DeleteMapping("/educacion/delete/{id}")
    public void deleteEducacion(@PathVariable Long id) {
        
        educacionService.deleteEducacion(id);
    }

//-----------METODOS HABILIDADES IDIOSMAS--------------------------------------------------------------//
    @GetMapping("/habilidad/idioma/all")
    @ResponseBody
    public List<Idioma> getAllIdioma() {
        return idiomaService.findAll();
    }
    
    @GetMapping("/habilidad/idioma/{id}")
    @ResponseBody
    public Idioma getIdiomaById(@PathVariable("id") Long id) {
        
        return idiomaService.findIdiomaById(id);
    }
    
    @PostMapping("/habilidad/idioma/add")
    public void addIdioma(@RequestBody Idioma idioma) {
        
        idiomaService.createIdioma(idioma);
    }
    
    @PutMapping("/habilidad/idioma/edit/{id}")
    public void updateIdioma(@PathVariable Long id, @RequestBody Idioma idioma) {
        
        idiomaService.editIdioma(idioma);
    }
    
    @DeleteMapping("/habilidad/idioma/delete/{id}")
    public void deleteIdioma(@PathVariable Long id) {
        
        idiomaService.deleteIdioma(id);
    }

    //-----------METODOS HABILIDADES LENGUAJE PROGRAMACION--------------------------------------------------------------//
    @GetMapping("/habilidad/lenguaje/all")
    @ResponseBody
    public List<LenguajeProgramacion> getAllLenguaje() {
        return lenguajeService.findAll();
    }
    
    @GetMapping("/habilidad/lenguaje/{id}")
    @ResponseBody
    public LenguajeProgramacion getLenguajeById(@PathVariable("id") Long id) {
        
        return lenguajeService.findLenguajeProgramacionById(id);
    }
    
    @PostMapping("/habilidad/lenguaje/add")
    public void addLenguaje(@RequestBody LenguajeProgramacion lenguaje) {
        
        lenguajeService.createLenguajeProgramacion(lenguaje);
    }
    
    @PutMapping("/habilidad/lenguaje/edit/{id}")
    public void updateLenguaje(@PathVariable Long id, @RequestBody LenguajeProgramacion lenguaje) {
        
        lenguajeService.editLenguajeProgramacion(lenguaje);
    }
    
    @DeleteMapping("/habilidad/lenguaje/delete/{id}")
    public void deleteLenguaje(@PathVariable Long id) {
        
        lenguajeService.deleteLenguajeProgramacion(id);
    }
    
    
    //-----------METODOS HABILIDADES HERRAMIENTA INFORMATICA--------------------------------------------------------------//
    @GetMapping("/habilidad/herramienta/all")
    @ResponseBody
    public List<HerramientaInformatica> getAllHerramienta() {
        return herramientaService.findAll();
    }
    
    @GetMapping("/habilidad/herramienta/{id}")
    @ResponseBody
    public HerramientaInformatica getHerramientaById(@PathVariable("id") Long id) {
        
        return herramientaService.findHerramientaInformaticaById(id);
    }
    
    @PostMapping("/habilidad/herramienta/add")
    public void addHerramienta(@RequestBody HerramientaInformatica herramienta) {
        
        herramientaService.createHerramientaInformatica(herramienta);
    }
    
    @PutMapping("/habilidad/herramienta/edit/{id}")
    public void updateHerramienta(@PathVariable Long id, @RequestBody HerramientaInformatica herramienta) {
        
        herramientaService.editHerramientaInformatica(herramienta);
    }
    
    @DeleteMapping("/habilidad/herramienta/delete/{id}")
    public void deleteHerramienta(@PathVariable Long id) {
        
        herramientaService.deleteHerramientaInformatica(id);
    }
    
}
