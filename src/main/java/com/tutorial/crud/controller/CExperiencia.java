/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.crud.controller;

import com.tutorial.crud.dto.dtoExperiencia;
import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.security.controller.Mensaje;
import com.tutorial.crud.service.sExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/explab")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    sExperiencia Sexperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = Sexperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")

    public ResponseEntity<Experiencia> getById(@PathVariable("id") int id){

        if(!Sexperiencia.existsById(id))

            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);

        Experiencia experiencia = Sexperiencia.getOne(id).get();

        return new ResponseEntity(experiencia, HttpStatus.OK);

    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!Sexperiencia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Sexperiencia.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoExp){
        if(StringUtils.isBlank(dtoExp.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatioro"),HttpStatus.BAD_REQUEST);
        
        if(Sexperiencia.existsByNombreE(dtoExp.getNombreE()))
            return new ResponseEntity (new Mensaje ("La experiencia ya existe"),HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = new Experiencia(dtoExp.getNombreE(), dtoExp.getAñoE(), dtoExp.getDescripcionE());
        Sexperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia/Educacion agregada"),HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoExp){
        //Validar si existe id
        if(!Sexperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El id no existe"),HttpStatus.BAD_REQUEST);
        
        if(Sexperiencia.existsByNombreE(dtoExp.getNombreE())&& Sexperiencia.getByNombreE(dtoExp.getNombreE()).get().getId()!= id)
            return new ResponseEntity(new Mensaje("Esa experiencia o educacion ya existe"),HttpStatus.BAD_REQUEST);
        //Campo no puede estar vacio
        if(StringUtils.isBlank(dtoExp.getNombreE()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"),HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = Sexperiencia.getOne(id).get();
        experiencia.setNombreE(dtoExp.getNombreE());
        experiencia.setAñoE(dtoExp.getAñoE());
        experiencia.setDescripcionE(dtoExp.getDescripcionE());
        
        Sexperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia/Educacion actualizada"),HttpStatus.OK);
        
    }
}
    
   
