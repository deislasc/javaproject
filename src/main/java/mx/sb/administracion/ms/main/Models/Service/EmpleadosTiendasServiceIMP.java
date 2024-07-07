package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.EmpleadosTiendas;
import mx.sb.administracion.ms.main.Models.Dao.IEmpleadosTiendasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosTiendasServiceIMP implements IEmpleadosTiendasService{
    @Autowired
    private IEmpleadosTiendasDao EmpleadosTiendasDao;
    @Override
    public EmpleadosTiendas save(EmpleadosTiendas empleadosTiendas) {
        EmpleadosTiendasDao.save(empleadosTiendas);

        return empleadosTiendas;
    }

    @Override
    public EmpleadosTiendas findEmp(Long empleadosEmpId) {
        return EmpleadosTiendasDao.findEmp(empleadosEmpId) ;
    }
}
