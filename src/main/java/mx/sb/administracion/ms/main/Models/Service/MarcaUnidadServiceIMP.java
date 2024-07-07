package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.MarcasUnidades;
import mx.sb.administracion.ms.main.Models.Dao.IMarcasUnidadesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MarcaUnidadServiceIMP implements IMarcaUnidadService{
    @Autowired
    private IMarcasUnidadesDao MarcasUnidadesDao;

    @Override
    @Transactional(readOnly = true)
    public List<MarcasUnidades> findAll() {
        return MarcasUnidadesDao.findAll();
    }
}
