package com.grupo.movilidad.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Genera getters y setters, toString, equals y hashCode
@NoArgsConstructor //Crea constructor vacío
@AllArgsConstructor //Crea constructor con todos los parámetros
@Entity //Esto indica que la clase se convierte en una tabla
@Table(name = "vehiculos") //Define el nombre de la tabla
public class Vehiculo {
    @Id//Define la clave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Define el id autoincrementable
    private int id;
    @Enumerated(EnumType.STRING)//guarda los ENUM como String
    private TipoVehiculo tipoVehiculo;
    private String marca;
    private String modelo;
    @Enumerated(EnumType.STRING)
    private EstadoVehiculo estadoVehiculo;

}
