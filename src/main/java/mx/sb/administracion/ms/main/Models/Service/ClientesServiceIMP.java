package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Clientes;
import mx.sb.administracion.ms.main.Models.Dao.IClientesDao;
@Service
public class ClientesServiceIMP implements IClientesService{
    @Autowired
    private IClientesDao ClientesDao;

    @Override
    @Transactional(readOnly=true)
    public List<Clientes> findAll() {
        // TODO Auto-generated method stub
        return (List<Clientes>) ClientesDao.findAll();
    }

}