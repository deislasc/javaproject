package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Areas;
import mx.sb.administracion.ms.main.Models.Dao.IAreasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreasServiceIMP implements IAreasService {
    @Autowired
    private IAreasDao AreasDao;


    @Override
    @Transactional(readOnly=true)
    public List<Areas> findAll() {
        return (List<Areas>) AreasDao.findAll() ;
    }
}
