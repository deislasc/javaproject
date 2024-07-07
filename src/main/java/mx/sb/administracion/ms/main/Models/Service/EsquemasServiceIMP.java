package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Esquemas;
import mx.sb.administracion.ms.main.Models.Dao.IEsquemasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EsquemasServiceIMP implements IEsquemasService{
    @Autowired
    private IEsquemasDao EsquemasDao;

    @Override
    @Transactional(readOnly=true)
    public List<Esquemas> findAll() {
        return (List<Esquemas>) EsquemasDao.findAll();
    }

	@Override
	@Transactional(readOnly=true)
	public List<Esquemas> findTipoEsquema(String tipoEsquema) {
		// TODO Auto-generated method stub
		return (List<Esquemas>) EsquemasDao.findTipoEsquema(tipoEsquema);
	}
}
