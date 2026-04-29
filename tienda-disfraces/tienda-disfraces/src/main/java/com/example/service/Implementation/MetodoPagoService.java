package com.example.service.Implementation;

import com.example.model.MetodoPago;
import com.example.repository.Interfaces.IMetodoPagoRepository;
import com.example.service.Interfaces.IMetodoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodoPagoService implements IMetodoPagoService {
    private final IMetodoPagoRepository repo;

    @Override
    public MetodoPago save(MetodoPago metodoPago) throws Exception {
        return repo.save(metodoPago);
    }

    @Override
    public MetodoPago update(MetodoPago metodoPago, Integer id) throws Exception {
        return repo.save(metodoPago);
    }

    @Override
    public List<MetodoPago> findAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public MetodoPago findById(Integer id) throws Exception {
        return repo.findById(id).orElse(new MetodoPago());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}