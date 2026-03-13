package com.grupo.movilidad.controller;

import com.grupo.movilidad.model.Vehiculo;
import com.grupo.movilidad.service.VehicleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehicleService vehicleService;

    // Obtener todos los vehículos
    @GetMapping
    public List<Vehiculo> obtenerVehiculos() {
        return vehicleService.getAllVehicles();
    }

    // Crear un nuevo vehículo
    @PostMapping
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehicleService.createVehicle(vehiculo);
    }

    // Obtener vehículo por ID
    @GetMapping("/{id}")
    public Vehiculo obtenerVehiculoPorId(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

}