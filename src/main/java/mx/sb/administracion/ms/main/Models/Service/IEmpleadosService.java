package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;



import mx.sb.administracion.ms.main.Entity.EmpTipo;
import mx.sb.administracion.ms.main.Entity.Empleados;



public interface IEmpleadosService {
	public Empleados findByempId(String empId);
	public List<Empleados> findAll();
	public List<EmpTipo> findByempIdA(String term);
	public Empleados save(Empleados empleados);
	public List<Empleados> findTiendaEmp(String tiendaSucursal);
	public Empleados findByEmpIdandPass(String empId, String password);
	Long countEmpleado(String nomEmp);
}
