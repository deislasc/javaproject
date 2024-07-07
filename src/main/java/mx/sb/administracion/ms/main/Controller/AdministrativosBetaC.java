package mx.sb.administracion.ms.main.Controller;

import mx.sb.administracion.ms.main.Models.Service.IAdministrativosBetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beta/Admin")
public class AdministrativosBetaC {
	@Autowired
	private IAdministrativosBetaService AdministrativosBetaService;
	
	@GetMapping("/login/{empId}/{pss}")
	public ResponseEntity<?> login(@PathVariable String empId,@PathVariable String pss){
		return ResponseEntity.ok(AdministrativosBetaService.FindEmpLog(empId, pss));
	}
	@GetMapping("/perm/{empId}")
	public ResponseEntity<?> permisos(@PathVariable String empId){
		return ResponseEntity.ok(AdministrativosBetaService.FindEmpAd(empId));
	}
}
