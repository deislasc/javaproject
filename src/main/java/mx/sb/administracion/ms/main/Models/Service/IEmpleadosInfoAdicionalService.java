package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;
import java.util.Optional;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;

public interface IEmpleadosInfoAdicionalService {
	public Optional<EmpleadosInfoAdicional> findById(String empId);
	public List<EmpleadosInfoAdicional> findAll();
	public EmpleadosInfoAdicional save(EmpleadosInfoAdicional empleadosInfoAdicional);
	public Long findByEmpCurp(String empCurp);
}
