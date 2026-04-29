package com.example.service.Interfaces;

import com.example.model.MetodoPago;
import java.util.List;

public interface IMetodoPagoService {
    MetodoPago save(MetodoPago metodoPago) throws Exception;
    MetodoPago update(MetodoPago metodoPago, Integer id) throws Exception;
    List<MetodoPago> findAll() throws Exception;
    MetodoPago findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}