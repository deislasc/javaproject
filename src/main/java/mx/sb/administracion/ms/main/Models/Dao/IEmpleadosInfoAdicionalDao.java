package mx.sb.administracion.ms.main.Models.Dao;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;

public interface IEmpleadosInfoAdicionalDao extends CrudRepository<EmpleadosInfoAdicional,String>{
	@Query("select count(empInf) from EmpleadosInfoAdicional empInf where empInf.empCurp=?1")
    public Long findByEmpCurp(String empCurp);
}
