package mx.sb.administracion.ms.main.Models.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Tabuladores;
import mx.sb.administracion.ms.main.Models.Dao.ITabuladoresDao;
@Service
public class TabuladoresServiceIMP  implements ITabuladoresService{
@Autowired
private ITabuladoresDao TabuladoresDao;

@Override
@Transactional(readOnly=true)
public List<Tabuladores> findAll() {
    return (List<Tabuladores>) TabuladoresDao.findAll();
}

    @Override
    @Transactional(readOnly=true)
    public List<Tabuladores> findTab() {
        return (List<Tabuladores>) TabuladoresDao.findTab();
    }


}
