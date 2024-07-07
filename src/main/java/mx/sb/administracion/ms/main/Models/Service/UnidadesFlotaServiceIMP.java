package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.UnidadesFlota;
import mx.sb.administracion.ms.main.Models.Dao.IUnidadesFlotaDao;
@Service
public class UnidadesFlotaServiceIMP implements IUnidadesFlotaService{
	
	@Autowired
	private IUnidadesFlotaDao UnidadesFlotaDao;

	@Override
	@Transactional(readOnly=true)
	public List<UnidadesFlota> findAll() {
		
		return (List<UnidadesFlota>) UnidadesFlotaDao.findAll();
	}

	@Override
	public UnidadesFlota save(UnidadesFlota unidadesFlota) {
		UnidadesFlotaDao.save(unidadesFlota);
		return unidadesFlota;
	}

	@Override
	public Long findPlacas(String placas) {
		return UnidadesFlotaDao.findPlacas(placas) ;
	}


}
