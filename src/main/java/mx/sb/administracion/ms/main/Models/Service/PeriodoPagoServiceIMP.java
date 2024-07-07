package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.PeriodoPago;
import mx.sb.administracion.ms.main.Models.Dao.IPeriodoPagoDao;

@Service
public class PeriodoPagoServiceIMP implements IPeriodoPagoService {
	@Autowired
	private IPeriodoPagoDao PeriodoPagoDao;
	@Override
	@Transactional(readOnly=true)
	public List<PeriodoPago> findAll() {
	    return (List<PeriodoPago>) PeriodoPagoDao.findAll();
	}

}
