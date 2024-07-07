package mx.sb.administracion.ms.main.Controller;


import mx.sb.administracion.ms.main.Models.Service.IEmpleadosInfoMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beta/InfoMap")
public class EmpleadosInfoMapC {
	@Autowired
	private IEmpleadosInfoMapService EmpleadosInfoMapService;
	/*@GetMapping("/permiso/{fecha}/{id}")
	public ResponseEntity<?> empInfoMap(@PathVariable String fecha, @PathVariable Long id){
		return ResponseEntity.ok(EmpleadosInfoMapService.empInfoMap(fecha,id));
	}*/
	@GetMapping("/filtrar/{tiendaSucursal}")
	public ResponseEntity<?> filtrarTienda(@PathVariable String tiendaSucursal){
		return ResponseEntity.ok(EmpleadosInfoMapService.empInfoMapSucursal(tiendaSucursal));
	}
	@GetMapping("/todos")
	public ResponseEntity<?> empInfoMap(){
		return ResponseEntity.ok(EmpleadosInfoMapService.empInfoMap());
	}
	@GetMapping("/reporte/{puesto}")
	public ResponseEntity<?> empInfoMapPuesto(@PathVariable String puesto){
		return ResponseEntity.ok(EmpleadosInfoMapService.empInfoMapPuesto(puesto) );
	}
}
