package sanchezz.rh.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data//Metodos Get y Set
@NoArgsConstructor//Constructor sin agumentos
@AllArgsConstructor//Constructor con todos los agumentos
@ToString//Imprime datos del Empleado
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;
}
