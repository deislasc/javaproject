package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Departamento;
import mx.sb.administracion.ms.main.Models.Dao.IDepartamentosDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceIMP implements IDepartamentoService{
    @Autowired
    private IDepartamentosDao DepartamentosDao;


    @Override
    @Transactional(readOnly = true)
    public List<Departamento> findAll() {
        return DepartamentosDao.findAll();
    }
}
