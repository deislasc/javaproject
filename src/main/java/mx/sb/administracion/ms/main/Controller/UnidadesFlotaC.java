package mx.sb.administracion.ms.main.Controller;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import mx.sb.administracion.ms.main.Models.Service.IUnidadesFlotaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.sb.administracion.ms.main.Entity.UnidadesFlota;


@RestController
@RequestMapping("/beta/flotaunidades/")
public class UnidadesFlotaC {
	
	@Autowired
	private IUnidadesFlotaService UnidadesFlotaService;
	
	private final Logger log=LoggerFactory.getLogger(EmpleadosC.class);
	@GetMapping("/todos")
	public List<UnidadesFlota> index(){
		return (List<UnidadesFlota>) UnidadesFlotaService.findAll();
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<UnidadesFlota> save(@RequestBody UnidadesFlota unidadesFlota){
		UnidadesFlota obj= UnidadesFlotaService.save(unidadesFlota);
		return new ResponseEntity<UnidadesFlota>(obj,HttpStatus.OK);
				
	}
	@GetMapping("/placas/{placa}")
	public long countPlacas(@PathVariable String placa){
		return UnidadesFlotaService.findPlacas(placa);
	}
	
	
	
	/*@PostMapping("img/flota")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file, @RequestParam("empId") String empId)
	{
		Map<String, Object> response =new HashMap<>();
		UnidadesFlota unidadesFlota= UnidadesFlotaService.findByempId(empId);
		if(!file.isEmpty()) {
			String nombreArchivo=file.getOriginalFilename().replace(" ", "");
			Path rutaArchivo=Paths.get("autos").resolve(nombreArchivo).toAbsolutePath();
			log.info(rutaArchivo.toString());
			try {
				Files.copy(file.getInputStream(), rutaArchivo);
			} catch (IOException e) {
				response.put("mensaje","Error al subir la imagen:"+ nombreArchivo);
				response.put("error", e.getMessage().concat(":").concat(e.getMessage()));
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR );
			}
			unidadesFlota.setAutoFoto(nombreArchivo);
			UnidadesFlotaService.save(unidadesFlota);
			response.put("unidadFlota", unidadesFlota);
			response.put("mensaje","Has subido correctamente la imagen:"+ nombreArchivo);
		}
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
	}*/
	@GetMapping("/img/upload/{nombreFoto:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto){
		Path rutaArchivo=Paths.get("autos").resolve(nombreFoto).toAbsolutePath();
		log.info(rutaArchivo.toString());
		Resource recurso=null;
		try {
			recurso=new UrlResource(rutaArchivo.toUri());
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		if(!recurso.exists() && !recurso.isReadable()) {
			throw new RuntimeException("Error no se pudo cargar la imagen" + nombreFoto);
		}
		HttpHeaders cabecera = new HttpHeaders();
		cabecera.add(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+recurso.getFilename()+"\"");
		
		return new ResponseEntity<Resource>(recurso,cabecera, HttpStatus.OK);
	}
}
