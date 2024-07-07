package mx.sb.administracion.ms.main.Controller;

import mx.sb.administracion.ms.main.Models.Service.IAsignacionTiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/beta/asignacion/tienda")
public class AsignacionTiendaC {
	@Autowired
	private IAsignacionTiendaService AsignacionTiendaService;
	
	
	@GetMapping("/{empId}")
	public ResponseEntity<?> tiendasAsignadas(@PathVariable String empId){
		return ResponseEntity.ok(AsignacionTiendaService.findbyEmp(empId));
	}
}
