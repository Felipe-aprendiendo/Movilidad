package com.grupo.movilidad.repository;

import com.grupo.movilidad.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

}

//JpaRepository incluye métodos como: save(), findAll(), findById() y deleteById()
//Ejemplos:
// vehiculoRepositorio.save(vehiculo)
//vehiculoRepositorio.findAll()