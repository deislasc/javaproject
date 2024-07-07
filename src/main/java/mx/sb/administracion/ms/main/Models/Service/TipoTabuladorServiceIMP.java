package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import mx.sb.administracion.ms.main.Entity.TipoTabulador;
import mx.sb.administracion.ms.main.Models.Dao.ITipoTabuladorDao;

@Service
public class TipoTabuladorServiceIMP  implements ITipoTabuladorService{
	@Autowired
	private ITipoTabuladorDao TipoTabuladorDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<TipoTabulador> findAll() {
	    return (List<TipoTabulador>) TipoTabuladorDao.findAll();
}
}
