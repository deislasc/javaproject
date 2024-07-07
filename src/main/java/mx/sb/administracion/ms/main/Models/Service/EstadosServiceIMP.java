package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Estados;
import mx.sb.administracion.ms.main.Models.Dao.IEstadosDao;
@Service
public class EstadosServiceIMP implements IEstadoService{
	@Autowired
    private IEstadosDao EstadosDao;

	@Override
	@Transactional(readOnly=true)
	public List<Estados> findAll() {
		// TODO Auto-generated method stub
		return (List<Estados>) EstadosDao.findAll();
	}

}
