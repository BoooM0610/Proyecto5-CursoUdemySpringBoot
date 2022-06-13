package com.example.proyecto5error.errors;

public class UsuarioNoEncontradoException extends RuntimeException
{
    public UsuarioNoEncontradoException(String id)
    {
        super("Usario con id: ".concat(id).concat(" no existe en el sistema."));
    }
}
