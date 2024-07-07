package mx.sb.administracion.ms.main.Models.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoMap;

public interface IEmpleadosInfoMapDao extends CrudRepository<EmpleadosInfoMap,Long>{
	
	@Query(value="select a.id,a.emp_id,a.emp_nombre,a.tienda_sucursal, b.puesto,b.esquema"
			+ " from empleados a"
			+ " inner join empleados_info_adicional b on a.emp_id=b.emp_id where c.tienda_sucursal like %?1%",nativeQuery = true)
	public List<EmpleadosInfoMap> empInfoMapSucursal(String tiendaSucursal);
	
	@Query(value="select a.id,a.emp_id,a.emp_nombre, b.puesto,b.esquema"
			+ " from empleados a"
			+ " left join empleados_info_adicional b on a.emp_id=b.emp_id where a.emp_estatus='A'",nativeQuery = true)
	public List<EmpleadosInfoMap> empInfoMap();
	@Query(value="select a.id,a.emp_id,a.emp_nombre, b.puesto,b.esquema"
			+ " from administrativos_beta a"
			+ " left join empleados_info_adicional b on a.emp_id=b.emp_id where a.emp_estatus='A' and b.puesto=?1",nativeQuery = true)
	public List<EmpleadosInfoMap> empInfoMapPuesto(String puesto);
	
}
