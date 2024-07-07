package mx.sb.administracion.ms.main.Models.Dao;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.AsignacionTienda;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAsignacionTiendaDao extends CrudRepository<AsignacionTienda,Long>{
    @Query("select a from AsignacionTienda a where a.empId=?1")
    public List<AsignacionTienda> findbyEmp(String empId);
}
