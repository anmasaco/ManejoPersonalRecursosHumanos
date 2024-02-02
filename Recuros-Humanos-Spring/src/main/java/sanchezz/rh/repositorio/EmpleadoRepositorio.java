package sanchezz.rh.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import sanchezz.rh.modelo.Empleado;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
