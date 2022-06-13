package com.example.proyecto5error.services;

import com.example.proyecto5error.models.domain.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService
{
    private List<Usuario> lista;

    public UsuarioServiceImpl()
    {
        this.lista = new ArrayList<>();
        this.lista.add(new Usuario(1, "Edu", "Martínez"));
        this.lista.add(new Usuario(2, "Pepa", "García"));
        this.lista.add(new Usuario(3, "Lusi", "Fernández"));
        this.lista.add(new Usuario(4, "Manolo", "Escobar"));
        this.lista.add(new Usuario(5, "Juan", "Nuñez"));
        this.lista.add(new Usuario(6, "Paco", "Pérez"));
        this.lista.add(new Usuario(7, "Pablo", "Cruz"));
    }

    @Override
    public List<Usuario> listar()
    {
        return this.lista;
    }

    @Override
    public Usuario obtenerPorId(Integer id)
    {
        Usuario result = null;
        for (Usuario usuario : this.lista)
        {
            if (usuario.getId().equals(id))
            {
                result = usuario;
                break;
            }
        }

        return result;
    }

    @Override
    public Optional<Usuario> obtenerPorIdOptional(Integer id)
    {
        Usuario usuario = this.obtenerPorId(id);

        return Optional.ofNullable(usuario);
    }
}
