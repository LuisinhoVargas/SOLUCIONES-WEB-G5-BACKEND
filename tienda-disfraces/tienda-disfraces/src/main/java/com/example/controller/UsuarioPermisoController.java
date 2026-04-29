package com.example.controller;

import com.example.model.UsuarioPermiso;
import com.example.service.Interfaces.IUsuarioPermisoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario-permisos")
@RequiredArgsConstructor
public class UsuarioPermisoController {

    private final IUsuarioPermisoService service;

    @GetMapping
    public List<UsuarioPermiso> findAll() throws Exception {
        return service.findAll();
    }

    @PostMapping
    public UsuarioPermiso save(@RequestBody UsuarioPermiso usuarioPermiso) throws Exception {
        return service.save(usuarioPermiso);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}