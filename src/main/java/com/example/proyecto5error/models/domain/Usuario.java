package com.example.proyecto5error.models.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario
{
    private Integer id;
    private String nombre;
    private String apellido;

    public Usuario()
    {

    }

    public Usuario(Integer id, String nombre, String apellido)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
