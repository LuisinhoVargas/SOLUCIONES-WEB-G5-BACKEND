package com.example.service.Interfaces;

import com.example.model.UsuarioPermiso;
import java.util.List;

public interface IUsuarioPermisoService {
    UsuarioPermiso save(UsuarioPermiso usuarioPermiso) throws Exception;
    UsuarioPermiso update(UsuarioPermiso usuarioPermiso, Integer id) throws Exception;
    List<UsuarioPermiso> findAll() throws Exception;
    UsuarioPermiso findById(Integer id) throws Exception;
    void delete(Integer id) throws Exception;
}