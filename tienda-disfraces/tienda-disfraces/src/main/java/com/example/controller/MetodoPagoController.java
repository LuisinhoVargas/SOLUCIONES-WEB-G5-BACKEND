package com.example.controller;

import com.example.model.MetodoPago;
import com.example.service.Interfaces.IMetodoPagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodos-pago")
@RequiredArgsConstructor
public class MetodoPagoController {

    private final IMetodoPagoService service;

    @GetMapping
    public List<MetodoPago> findAll() throws Exception {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public MetodoPago findById(@PathVariable("id") Integer id) throws Exception {
        return service.findById(id);
    }

    @PostMapping
    public MetodoPago save(@RequestBody MetodoPago metodoPago) throws Exception {
        return service.save(metodoPago);
    }

    @PutMapping("/{id}")
    public MetodoPago update(@RequestBody MetodoPago metodoPago, @PathVariable("id") Integer id) throws Exception {
        return service.update(metodoPago, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) throws Exception {
        service.delete(id);
    }
}
