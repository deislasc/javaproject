package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Tiendas;
import mx.sb.administracion.ms.main.Models.Dao.ITiendasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TiendasServiceIMP implements ITiendasService{
    @Autowired
    private ITiendasDao TiendasDao;
    @Override
    @Transactional(readOnly=true)
    public List<Tiendas> findAll() {
        return (List<Tiendas>) TiendasDao.findAll();
    }

    @Override
    public Tiendas save(Tiendas tiendas) {
        TiendasDao.save(tiendas);
        return tiendas;
    }
}
