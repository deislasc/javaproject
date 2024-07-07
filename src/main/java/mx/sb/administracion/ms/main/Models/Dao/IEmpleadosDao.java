package mx.sb.administracion.ms.main.Models.Dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.sb.administracion.ms.main.Entity.EmpTipo;
import mx.sb.administracion.ms.main.Entity.Empleados;



public interface IEmpleadosDao extends CrudRepository<Empleados,String>{
	@Query("select a from Empleados a where a.empId= ?1")
	public Empleados findByempId(String empId);
	@Query("select a.empTipo from Empleados a where a.empId= ?1")
	public List<EmpTipo> findByempIdA(String term);
	@Query("select d from Empleados d where d.empId= ?1 and d.password=?2")
	public Empleados findByEmpIdandPass(String empId, String password);
	@Query("select f from Empleados f where f.tiendaSucursal=?1")
	public List<Empleados> findTiendaEmp(String tiendaSucursal);
	@Query("select count(g) from Empleados g where g.empId like %?1%")
	Long countEmpleado(String nomEmp);
	
	
	
}
