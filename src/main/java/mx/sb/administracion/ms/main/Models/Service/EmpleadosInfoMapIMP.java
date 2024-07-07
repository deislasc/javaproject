package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoMap;
import mx.sb.administracion.ms.main.Models.Dao.IEmpleadosInfoMapDao;

@Service
public class EmpleadosInfoMapIMP implements IEmpleadosInfoMapService{
	@Autowired
	private IEmpleadosInfoMapDao EmpleadosInfoMapDao;


	

	@Override
	public List<EmpleadosInfoMap> empInfoMapSucursal(String tiendaSucursal) {
		
		return EmpleadosInfoMapDao.empInfoMapSucursal(tiendaSucursal);
	}

	@Override
	@Transactional(readOnly = true)
	public List<EmpleadosInfoMap> empInfoMapPuesto(String puesto) {
		return EmpleadosInfoMapDao.empInfoMapPuesto(puesto) ;
	}


	@Override
	@Transactional(readOnly = true)
	public List<EmpleadosInfoMap> empInfoMap() {
		
		return EmpleadosInfoMapDao.empInfoMap();
	}




	


	


	


	
	

	
	
	
	
	
	

}
