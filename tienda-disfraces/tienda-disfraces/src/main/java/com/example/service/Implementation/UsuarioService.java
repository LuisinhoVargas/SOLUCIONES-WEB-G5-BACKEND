package com.example.service.Implementation;

import com.example.model.Usuario;
import com.example.repository.Interfaces.IUsuarioRepository;
import com.example.service.Interfaces.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements IUsuarioService {
    private final IUsuarioRepository repo;

    @Override
    public Usuario save(Usuario usuario) throws Exception {
        return repo.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario, Integer id) throws Exception {
        return repo.save(usuario);
    }

    @Override
    public List<Usuario> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Usuario findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Usuario());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}