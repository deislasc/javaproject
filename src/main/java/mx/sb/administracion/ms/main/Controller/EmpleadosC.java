package mx.sb.administracion.ms.main.Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import mx.sb.administracion.ms.main.Data.Nomenclatura;
import mx.sb.administracion.ms.main.Data.ReporteEmpleados;


import mx.sb.administracion.ms.main.Entity.*;
import mx.sb.administracion.ms.main.Mutation.EmpleadosM;
import mx.sb.administracion.ms.main.Models.Service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/beta/empleados")
public class EmpleadosC {

	@Autowired
	private IEmpleadosService EmpleadosService;
	@Autowired
	private EmpleadosM empleadosMut;
	@Autowired
	private ICodigosPostalesService CodigosPostalesService;
	@Autowired
	private IProveedoresService ProveedoresService;
	@Autowired
	private ITiendasService TiendasService;
	@Autowired
	private IEsquemasService EsquemasService;
	@Autowired
	private ITabuladoresService TabuladoresService;
	@Autowired
	private ITipoTabuladorService TipoTabuladorService;
	@Autowired
	private IPeriodoPagoService PeriodoPagoService;
	@Autowired
	private IZonaService ZonaService;
	@Autowired
	private IBancosService BancosService;
	@Autowired
	private IEstadoService EstadosService;
	@Autowired
	private IEmpleadosTiendasService EmpleadosTiendasService;
	@Autowired
	private IAreasService AreasService;
	@Autowired
	private IPuestosService PuestosService;
	@Autowired
	private IDepartamentoService DepartamentoService;
	@Autowired
	private IMarcaUnidadService MarcaUnidadService;
	@Autowired
	private ISubMarcaService SubMarcaService;
	private final Logger log=LoggerFactory.getLogger(EmpleadosC.class);

	@GetMapping("/todos")
	public List<Empleados> index(){

		return EmpleadosService.findAll();
	}

	@GetMapping("/filtrar/{term}")
	public ResponseEntity<?> filtrar(@PathVariable String term){
		return ResponseEntity.ok(EmpleadosService.findByempIdA(term));
	}
	@GetMapping("/empId/{empId}")
	public ResponseEntity<?> findEmpId(@PathVariable String empId){
		return ResponseEntity.ok(EmpleadosService.findByempId(empId));
	}

	@GetMapping("/login/{empId}/{pss}")
	public ResponseEntity<?> login(@PathVariable String empId,@PathVariable String pss){
		return ResponseEntity.ok(EmpleadosService.findByEmpIdandPass(empId, pss));
	}
	@GetMapping("/tienda/{tienda}")
	public ResponseEntity<?> findTiendaEmp(@PathVariable String tienda)
	{
		return ResponseEntity.ok(EmpleadosService.findTiendaEmp(tienda));
	}

	@PostMapping(value="/save")
	public ResponseEntity<?> save(@RequestBody Empleados empleado){
		Map<String,Object> response =new HashMap<>();
		Long idTienda= Long.parseLong(empleado.getTiendaSucursal());
		System.out.println("empleado-----------"+empleado);
		EmpleadosTiendas empTiendas= new EmpleadosTiendas();
		empTiendas.setTiendasId(idTienda);

		try {

			System.out.println("empleado.getEmpId()+totalEmp-----------"+empleado.getEmpId());
			Empleados obj=EmpleadosService.save(empleado);
			empTiendas.setEmpleadosEmpId(obj.getId());
			EmpleadosTiendasService.save(empTiendas);
			return new ResponseEntity<Empleados>(obj, HttpStatus.OK);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al intentar dar el Alta en la app");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}



	}
	@PostMapping(value="/edit")
	public ResponseEntity<?> edit(@RequestBody Empleados empleado){
		Map<String,Object> response =new HashMap<>();
		Long idTienda= Long.parseLong(empleado.getTiendaSucursal());
		System.out.println("empleado.getId()-----------"+empleado.getId());
		EmpleadosTiendas empTiendas= new EmpleadosTiendas();


		try {
			EmpleadosTiendas empTienda=	EmpleadosTiendasService.findEmp(empleado.getId());
			empTiendas.setId(null);
			empTiendas.setEmpleadosEmpId(empTienda.getEmpleadosEmpId());
			empTiendas.setTiendasId(idTienda);
			System.out.println("empTiendas-----------"+empTiendas.toString());
			if(empleado.getStatus().equals("B")){
				empleado.setPassword(null);
			}
			Empleados obj=EmpleadosService.save(empleado);

			EmpleadosTiendasService.save(empTienda);
			EmpleadosTiendasService.save(empTiendas);
			return new ResponseEntity<Empleados>(obj, HttpStatus.OK);
		}catch(DataAccessException e) {
			response.put("mensaje", "Error al intentar dar el Alta en la app");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}



	}
	@GetMapping("/proveedores")
	public ResponseEntity<?> findProveedores()
	{
		return ResponseEntity.ok(ProveedoresService.findAll());
	}
	@GetMapping("/tiendas")
	public ResponseEntity<?> tiendas()
	{
		return ResponseEntity.ok(TiendasService.findAll());
	}
	@GetMapping("/esquemas/{tipoEsquema}")
	public ResponseEntity<?> esquemas(@PathVariable String tipoEsquema)
	{
		return ResponseEntity.ok(EsquemasService.findTipoEsquema(tipoEsquema));
	}
	@GetMapping("/tabulador")
	public ResponseEntity<?> tabulador(){
		return ResponseEntity.ok(TabuladoresService.findTab());

	}
	/*@GetMapping("/tipo_tabulador")
	public ResponseEntity<?> TipoTabulador(){
		return ResponseEntity.ok(TipoTabuladorService.findAll());
		
	}
	@GetMapping("/periodo_pago")
	public ResponseEntity<?> PeriodoPago(){
		return ResponseEntity.ok(PeriodoPagoService.findAll());
	}	
	@GetMapping("/zona")
	public ResponseEntity<?> zona(){

		return ResponseEntity.ok(ZonaService.findAll());
}
	@PostMapping(value = "/cp")
	public ResponseEntity<List<CodigosPostales>>cp(@RequestBody Cp cp){
		System.out.println("cp-----------"+cp);

		List<CodigosPostales> codigo=CodigosPostalesService.findCp(cp.getCp());

		return new ResponseEntity<List<CodigosPostales>>(codigo, HttpStatus.OK);
	}*/
	@GetMapping("/bancos/{numeroClaveBanco}")
	public ResponseEntity<?> bancos(@PathVariable String numeroClaveBanco)
	{
		return ResponseEntity.ok(BancosService.findNumeroClaveBanco(numeroClaveBanco));
	}
	@GetMapping("/estados")
	public ResponseEntity<?> estados(){
		return ResponseEntity.ok(EstadosService.findAll());
	}
	@PostMapping(value="/empleadostiendas")
	public ResponseEntity<EmpleadosTiendas> saveEmpleadosTiendas(@RequestBody EmpleadosTiendas empleadosTiendas){
		EmpleadosTiendas obj= EmpleadosTiendasService.save(empleadosTiendas);
		return new ResponseEntity<EmpleadosTiendas>(obj, HttpStatus.OK);
	}
	@PostMapping(value="/count")
	public Long count(@RequestBody Nomenclatura nomEmp){
		log.info(nomEmp.getNomEmp());
		Long total=EmpleadosService.countEmpleado(nomEmp.getNomEmp());
		return total;
	}
	@PostMapping(value = "/areas")
	public ResponseEntity<List<Areas>> areas(){

		List<Areas> areas=AreasService.findAll();

		return new ResponseEntity<List<Areas>>(areas, HttpStatus.OK);
	}
	@PostMapping(value = "/puestos")
	public ResponseEntity<List<Puestos>> puestos(){

		List<Puestos> puestos=PuestosService.findALl() ;

		return new ResponseEntity<List<Puestos>>(puestos, HttpStatus.OK);
	}
	@GetMapping("/departamentos")
	public ResponseEntity<?> departamentos(){

		return ResponseEntity.ok(DepartamentoService.findAll());
	}
	@GetMapping("/marcas")
	public ResponseEntity<?> Marcas(){

		return ResponseEntity.ok(MarcaUnidadService.findAll());
	}
	@GetMapping("/submarcas")
	public ResponseEntity<?> subMarcas(){

		return ResponseEntity.ok(SubMarcaService.findAll());
	}
	@GetMapping("/reporte")
	public ResponseEntity<List<ReporteEmpleados>>  reporte(){

		List<ReporteEmpleados> result=empleadosMut.reporteEmpleados();

		return new ResponseEntity<List<ReporteEmpleados>>(result, HttpStatus.OK);
	}
}

