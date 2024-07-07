package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Puestos;
import mx.sb.administracion.ms.main.Models.Dao.IPuestosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PuestosServiceIMP implements IPuestosService {
    @Autowired
    private IPuestosDao PuestosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Puestos> findALl() {
        return (List<Puestos>) PuestosDao.findAll() ;
    }
}
