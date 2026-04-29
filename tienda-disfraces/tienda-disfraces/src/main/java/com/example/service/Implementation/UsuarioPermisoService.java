package com.example.service.Implementation;

import com.example.model.UsuarioPermiso;
import com.example.repository.Interfaces.IUsuarioPermisoRepository;
import com.example.service.Interfaces.IUsuarioPermisoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioPermisoService implements IUsuarioPermisoService {
    private final IUsuarioPermisoRepository repo;

    @Override
    public UsuarioPermiso save(UsuarioPermiso usuarioPermiso) throws Exception {
        return repo.save(usuarioPermiso);
    }

    @Override
    public UsuarioPermiso update(UsuarioPermiso usuarioPermiso, Integer id) throws Exception {
        return repo.save(usuarioPermiso);
    }

    @Override
    public List<UsuarioPermiso> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public UsuarioPermiso findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new UsuarioPermiso());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
