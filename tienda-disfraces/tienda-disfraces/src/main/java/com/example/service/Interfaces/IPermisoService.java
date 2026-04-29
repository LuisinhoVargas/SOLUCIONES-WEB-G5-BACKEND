package com.example.service.Interfaces;

import com.example.model.Permiso;
import java.util.List;

public interface IPermisoService {
    Permiso save(Permiso permiso) throws Exception;
    Permiso update(Permiso permiso, Integer id) throws Exception;
    List<Permiso> findAll() throws Exception;
    Permiso findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}