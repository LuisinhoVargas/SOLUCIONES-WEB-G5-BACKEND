package com.example.controller;

import com.example.model.Permiso;
import com.example.service.Interfaces.IPermisoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/permisos")
@RequiredArgsConstructor
public class PermisoController {

    private final IPermisoService service;

    @GetMapping
    public List<Permiso> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Permiso findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public Permiso save(@RequestBody Permiso permiso) throws Exception {
        return service.save(permiso);
    }

    @PutMapping("/{id}")
    public Permiso update(@RequestBody Permiso permiso, @PathVariable("id") Integer id) throws Exception {
        return service.update(permiso, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
