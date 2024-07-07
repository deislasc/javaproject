package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.AsignacionTienda;
import mx.sb.administracion.ms.main.Models.Dao.IAsignacionTiendaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AsignacionTiendaServiceIMP implements IAsignacionTiendaService{
	@Autowired
	private IAsignacionTiendaDao AsignacionTiendaDao;

	@Override
	@Transactional(readOnly=true)
	public List<AsignacionTienda> findbyEmp(String empId) {
		
		return AsignacionTiendaDao.findbyEmp(empId);
	}
}
