package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.AdministrativosBeta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IAdministrativosBetaDao extends CrudRepository<AdministrativosBeta,Long>{
	@Query(value="select d.id,d.emp_id,d.emp_email,d.emp_password,d.emp_estatus,d.emp_nombre,d.tienda_sucursal,b.puesto from administrativos_beta d inner join empleados_info_adicional b on d.emp_id=b.emp_id where d.emp_id=?1 and d.emp_password=?2",nativeQuery = true)
	public AdministrativosBeta FindEmpLog(String empId, String password);
	@Query("select c from AdministrativosBeta c where c.empId=?1" )
	public AdministrativosBeta FindEmpAd(String empId);
}
