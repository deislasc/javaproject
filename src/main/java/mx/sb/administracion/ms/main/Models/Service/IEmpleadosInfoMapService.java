package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoMap;




public interface IEmpleadosInfoMapService {
	public List<EmpleadosInfoMap> empInfoMap();
	public List<EmpleadosInfoMap> empInfoMapSucursal(String tiendaSucursal);
	public List<EmpleadosInfoMap> empInfoMapPuesto(String puesto);
	
}
