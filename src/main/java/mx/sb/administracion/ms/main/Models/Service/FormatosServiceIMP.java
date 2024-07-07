package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Formatos;
import mx.sb.administracion.ms.main.Models.Dao.IFormatosDao;
@Service
public class FormatosServiceIMP implements IFormatosService{
    @Autowired
    private IFormatosDao FormatosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Formatos> findAll() {
        // TODO Auto-generated method stub
        return (List<Formatos>) FormatosDao.findAll();
    }

}