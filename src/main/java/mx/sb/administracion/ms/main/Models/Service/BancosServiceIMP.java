package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.Bancos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Models.Dao.IBancosDao;

@Service
public class BancosServiceIMP implements IBancosService {
	 @Autowired
	    private IBancosDao BancosDao;

	@Override
	@Transactional(readOnly=true)
	public List<Bancos> findAll() {
		return (List<Bancos>) BancosDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Bancos> findNumeroClaveBanco(String numeroClaveBancos) {
		// TODO Auto-generated method stub
		return (List<Bancos>) BancosDao.findNumeroClaveBanco(numeroClaveBancos);
	}

}
