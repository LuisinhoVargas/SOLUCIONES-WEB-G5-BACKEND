package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MetodoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMetodoPago;

    @Column(nullable = false, length = 100)
    private String nombreMetodoPago;

    @Column(length = 255)
    private String descripcion;

    @Column(nullable = false)
    private Boolean esActivo;
}