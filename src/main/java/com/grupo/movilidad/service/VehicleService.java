package com.grupo.movilidad.service;

import com.grupo.movilidad.model.Vehiculo;
import com.grupo.movilidad.repository.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehiculoRepositorio VehiculoRepositorio;

    // Método para listar todos los vehículos
    public List<Vehiculo> getAllVehicles() {
        return VehiculoRepositorio.findAll();
    }

    // Método para crear un nuevo vehículo
    public Vehiculo createVehicle(Vehiculo vehiculo) {
        return VehiculoRepositorio.save(vehiculo);
    }

    // Método para buscar un vehículo específico por su ID
    public Vehiculo getVehicleById(Long id) {
        return VehiculoRepositorio.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehiculo no encontrado con ID: " + id));
    }
}