package mx.sb.administracion.ms.main.Models.Service;
import java.util.List;

import mx.sb.administracion.ms.main.Entity.Proveedores;
public interface IProveedoresService {
	public List<Proveedores> findAll();
	public Proveedores save(Proveedores asignacion);

}
