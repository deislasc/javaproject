package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.CodigosPostales;
import mx.sb.administracion.ms.main.Models.Dao.ICodigosPostalesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CodigosPostalesServiceIMP implements ICodigosPostalesService{

    @Autowired
    private ICodigosPostalesDao CodigosPostalesDao;

    @Override
    @Transactional(readOnly=true)
    public List<CodigosPostales> findCp(String codigosPostales) {
        return (List<CodigosPostales>) CodigosPostalesDao.findCp(codigosPostales) ;
    }
}
