package mx.sb.administracion.ms.main.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.sb.administracion.ms.main.Models.Service.IEmpleadosService;
import mx.sb.administracion.ms.main.Models.Service.CloudinaryService;
import mx.sb.administracion.ms.main.Models.Service.IEmpleadosInfoAdicionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;


@RestController
@RequestMapping("beta/empleadosInfoAdicional/")
public class
EmpleadosInfoAdicionalC {

	@Autowired
	private IEmpleadosInfoAdicionalService EmpleadosInfoAdicionalService;
	@Autowired
    CloudinaryService cloudinaryService;
	@Autowired
	private IEmpleadosService EmpleadosService;
	@GetMapping("/todos")
	public List<EmpleadosInfoAdicional> index(){
		return (List<EmpleadosInfoAdicional>) EmpleadosInfoAdicionalService.findAll();
	}
	@GetMapping("/find/{empId}")
	public ResponseEntity<?> filtrarFormato(@PathVariable String empId){
		return ResponseEntity.ok(EmpleadosInfoAdicionalService.findById(empId));
	}

	@PostMapping(value="/save")
	public ResponseEntity<?> save(@RequestBody EmpleadosInfoAdicional empleadosInfoAdicional){
		Map<String,Object> response =new HashMap<>();
		String user=empleadosInfoAdicional.getEmpId();
		try{
			Long totalEmp=EmpleadosService.countEmpleado(empleadosInfoAdicional.getEmpId())+4000;
			empleadosInfoAdicional.setEmpId(user+totalEmp);
			EmpleadosInfoAdicional obj=EmpleadosInfoAdicionalService.save(empleadosInfoAdicional);
			return new ResponseEntity<EmpleadosInfoAdicional>(obj,HttpStatus.OK);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al intentar dar el Alta en info adicional");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PostMapping(value="/edit")
	public ResponseEntity<?> edit(@RequestBody EmpleadosInfoAdicional empleadosInfoAdicional){
		Map<String,Object> response =new HashMap<>();
		String user=empleadosInfoAdicional.getEmpId();
		try{
			if(empleadosInfoAdicional.getEmpCurp().equals("")){
				empleadosInfoAdicional.setEmpCurp(null);
			}

			EmpleadosInfoAdicional obj=EmpleadosInfoAdicionalService.save(empleadosInfoAdicional);
			return new ResponseEntity<EmpleadosInfoAdicional>(obj,HttpStatus.OK);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al intentar dar el Alta en info adicional");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	@PostMapping("/upload/doc")
		public ResponseEntity<?> uploadFotoIne(@RequestParam MultipartFile multipartFile) throws IOException{
		Map<String,Object> response =new HashMap<>();
		try {
			Map result = cloudinaryService.uploadDoc(multipartFile);
			response.put("mensaje", "Se agrego Correctamente¡¡");

			return new ResponseEntity<Map<String,Object>>(result, HttpStatus.OK);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al intentar subir el viaje");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}




	}
	@GetMapping("/findCurp/{empCurp}")
	public ResponseEntity<?> findCurp(@PathVariable String empCurp){
		return ResponseEntity.ok(EmpleadosInfoAdicionalService.findByEmpCurp(empCurp));
	}
}
