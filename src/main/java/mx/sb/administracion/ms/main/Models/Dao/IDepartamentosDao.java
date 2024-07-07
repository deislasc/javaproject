package mx.sb.administracion.ms.main.Models.Dao;


import mx.sb.administracion.ms.main.Entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartamentosDao extends JpaRepository<Departamento,Long> {
}
