package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.Puestos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPuestosDao extends JpaRepository<Puestos,Long> {
}
