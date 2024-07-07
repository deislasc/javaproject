package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import mx.sb.administracion.ms.main.Entity.Zonas;
import mx.sb.administracion.ms.main.Models.Dao.IZonaDao;

@Service
public class ZonaServiceIMP  implements IZonaService{
	@Autowired
	private IZonaDao ZonaDao;

	@Override
	@Transactional(readOnly=true)
	public List<Zonas> findAll() {
	    return (List<Zonas>) ZonaDao.findAll();
	}


}
