package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Proyectos;
import mx.sb.administracion.ms.main.Models.Dao.IProyectosDao;
@Service
public class ProyectosServiceIMP implements IProyectosService{
    @Autowired
    private IProyectosDao ProyectosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Proyectos> findAll() {
        // TODO Auto-generated method stub
        return (List<Proyectos>) ProyectosDao.findAll();
    }

}