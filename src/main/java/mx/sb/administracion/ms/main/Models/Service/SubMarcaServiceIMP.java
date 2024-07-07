package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.SubMarcas;
import mx.sb.administracion.ms.main.Models.Dao.ISubMarcasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SubMarcaServiceIMP implements ISubMarcaService  {
    @Autowired
    private ISubMarcasDao SubMarcasDao;
    @Override
    @Transactional(readOnly = true)
    public List<SubMarcas> findAll() {
        return SubMarcasDao.findAll();
    }
}
