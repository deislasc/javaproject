package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;
import mx.sb.administracion.ms.main.Models.Dao.IEmpleadosInfoAdicionalDao;

@Service
public class EmpleadosInfoAdicionalIMP implements IEmpleadosInfoAdicionalService{

	@Autowired
	private IEmpleadosInfoAdicionalDao EmpleadosInfoAdicionalDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<EmpleadosInfoAdicional> findAll() {
		
		return (List<EmpleadosInfoAdicional>) EmpleadosInfoAdicionalDao.findAll();
	}

	@Override
	public EmpleadosInfoAdicional save(EmpleadosInfoAdicional empleadosInfoAdicional) {
		EmpleadosInfoAdicionalDao.save(empleadosInfoAdicional);
		return empleadosInfoAdicional;
	}

	@Override
	public Long findByEmpCurp(String empCurp) {

		return EmpleadosInfoAdicionalDao.findByEmpCurp(empCurp);
	}

	@Override
	@Transactional(readOnly=true)
	public Optional<EmpleadosInfoAdicional> findById(String empId) {
		
		return (Optional<EmpleadosInfoAdicional>) EmpleadosInfoAdicionalDao.findById(empId);
	}

	

	

	

}
