package mx.sb.administracion.ms.main.Models.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.Proveedores;
import mx.sb.administracion.ms.main.Models.Dao.IProveedoresDao;

@Service
public class ProveedoresServiceIMP implements IProveedoresService{
	@Autowired
	private IProveedoresDao ProveedoresDao;
	@Override
	@Transactional(readOnly=true)
	public List<Proveedores> findAll() {
		// TODO Auto-generated method stub
		return (List<Proveedores>) ProveedoresDao.findAll();
	}

	@Override
	public Proveedores save(Proveedores proveedores) {
		// TODO Auto-generated method stub
		ProveedoresDao.save(proveedores);
		return proveedores;
	}

}
