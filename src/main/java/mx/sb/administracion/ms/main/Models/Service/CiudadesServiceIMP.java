package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Ciudades;
import mx.sb.administracion.ms.main.Models.Dao.ICiudadesDao;
@Service
public class CiudadesServiceIMP implements ICiudadesService{
    @Autowired
    private ICiudadesDao CiudadesDao;

    @Override
    @Transactional(readOnly=true)
    public List<Ciudades> findAll() {
        // TODO Auto-generated method stub
        return (List<Ciudades>) CiudadesDao.findAll();
    }

}