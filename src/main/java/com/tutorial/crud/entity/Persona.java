

package com.tutorial.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
     
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String img;
    
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String telefono;
     
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ciudad;
      
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String edad;
       
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String email;
    
    
    //Getter setter

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
    
    
    
    
}
