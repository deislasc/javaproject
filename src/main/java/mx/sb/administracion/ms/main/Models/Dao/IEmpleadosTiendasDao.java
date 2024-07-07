package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.EmpleadosTiendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEmpleadosTiendasDao extends JpaRepository<EmpleadosTiendas,Long> {
    @Query("select e from EmpleadosTiendas e where e.empleadosEmpId=?1")
    public EmpleadosTiendas findEmp(Long empleadosEmpId);
}
