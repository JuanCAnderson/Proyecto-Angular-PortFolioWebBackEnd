/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tutorial.crud.Interface;

import com.tutorial.crud.entity.Persona;
import java.util.List;


public interface iPersonaService {
    // Traer una lista de personas 
    
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo Persona 
    
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por ID
    
    public void deletePersona(Long id);
    
    // Buscar una persona 
    
    public Persona findPersona(Long id);
    
    
    
}
