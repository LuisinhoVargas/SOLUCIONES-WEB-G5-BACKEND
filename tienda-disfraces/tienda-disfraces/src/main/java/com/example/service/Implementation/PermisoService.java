package com.example.service.Implementation;

import com.example.model.Permiso;
import com.example.repository.Interfaces.IPermisoRepository;
import com.example.service.Interfaces.IPermisoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermisoService implements IPermisoService {
    private final IPermisoRepository repo;

    @Override
    public Permiso save(Permiso permiso) throws Exception {
        return repo.save(permiso);
    }

    @Override
    public Permiso update(Permiso permiso, Integer id) throws Exception {
        return repo.save(permiso);
    }

    @Override
    public List<Permiso> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Permiso findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new Permiso());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}