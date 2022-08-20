/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.crud.service;

import com.tutorial.crud.entity.Experiencia;
import com.tutorial.crud.repository.rExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class sExperiencia {
    @Autowired
    rExperiencia Rexperiencia;
    
    public List<Experiencia> list(){
        return Rexperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return Rexperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return Rexperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia expe){
        Rexperiencia.save(expe);
    }
    
    public void delete(int id){
        Rexperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return Rexperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return Rexperiencia.existsByNombreE(nombreE);
    }
}
