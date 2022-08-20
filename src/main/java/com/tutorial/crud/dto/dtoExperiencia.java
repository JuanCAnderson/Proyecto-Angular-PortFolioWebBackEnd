/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tutorial.crud.dto;

import javax.validation.constraints.NotBlank;



public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String añoE;
    @NotBlank
    private String descripcionE;
    
    
    //Constructores 

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String añoE, String descripcionE) {
        this.nombreE = nombreE;
        this.añoE = añoE;
        this.descripcionE = descripcionE;
    }
    
    //getter setter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getAñoE() {
        return añoE;
    }

    public void setAñoE(String añoE) {
        this.añoE = añoE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
}
