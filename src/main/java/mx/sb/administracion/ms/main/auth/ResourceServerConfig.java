	package mx.sb.administracion.ms.main.auth;

import java.util.Arrays;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers(HttpMethod.GET,"/beta/cfdi-traslado/todos","/beta/Admin/login/{empId}/{pss}","/beta/Admin/perm/{empId}","/beta/rutas/meli/entity/{entity_id}","/beta/rutas/meli/shipments/{fecha}","/beta/rutas/meli/asignadas/{empId}/{fecha}","/beta/CfdiTrasladoMeli/{rutaId}","/beta/CfdiTrasladoMeli/find/cfdi/{rutaId}","/beta/empleadosInfoAdicional/find/{empId}","/beta/empleadosInfoAdicional/findCurp/{empCurp}","/beta/empleados/departamentos","/beta/empleados/marcas","/beta/empleados/submarcas","/beta/empleados/proveedores","/beta/empleados/tabulador","/beta/registro/aliados/todos","/beta/rutas/meli/shipments/data/{shipment}",
															"/beta/operacion/todos","/beta/empleados/reporte/{fecha}/{id}","/beta/empleados/reporte/administrativos/{fecha}/{puesto}","/beta/empleados/reporte/rh/{fecha}","/beta/empleados/tienda/{tienda}","/beta/empleados/tiendas","/beta/empleados/esquemas/{tipoEsquema}","/beta/casaley/articulos/{pedidoIdS}","/beta/casaley/pedidos/todos","/beta/casaley/articulos/todos","/beta/CfdiTrasladoMeli/todos","/beta/empleados/empId/{empId}","/beta/CfdiTrasladoMeliTimbrado/total","/beta/CfdiTrasladoMeliTimbrado/rutaId/{rutaId}","/beta/empleados/reporte",
															"/beta/casaley/empleadoEstatus/todos","/beta/empleados/asignacion/reporte/{fecha}","/beta/empleados/asignacion/{esquema}/{dia}","/beta/empleados/asignacion/unidad/{empId}/{dia}","/beta/empleados/asignacion/filtrar/{sucursal}/{dia}","/beta/empleados/todos","/beta/InfoMap/reporte/{puesto}","/beta/InfoMap/todos","/beta/InfoMap/filtrar/{tiendaSucursal}","/beta/empleados/asistencia/{empId}/{dia}","/beta/empleados/asistencia/{dia}",
															"/beta/casaley/pedidos/filtrar/{term}","/beta/flotaunidades/todos","/beta/flotaunidades/placas/{placa}","/beta/asignacion/tienda/{empId}","/beta/rutas/meli/{term}/{tienda}/{nomTienda}/{ruta}/{fecha}/{hora}/{empId}/{nombre}/{tipoServicio}","/beta/rutas/meli/Rutas/{nomTiendaMeli}/{fecha}","/beta/pedidos/empPedidos/{dia}/{empId}","/beta/catalogs/ciudades/todos","/beta/catalogs/clientes/todos","/beta/catalogs/proyectos/todos","/beta/catalogs/formatos/todos",
															"/beta/asistencianov/todos","/beta/asistencianov/buscar/{id}","/beta/devolucionNov/todos","/beta/asistencianov/filtrar/{term}/{dia}","/beta/empleados/login/{{empId}}/{{pss}}","/beta/asistencianov/devolucion/{empid}/{dev}","/beta/CfdiIngresoMeli/todos","/beta/unidadesgps/{gpsId}/{latitud}/{longitud}/{fecha}/{hora}","/beta/empleados/periodo_pago","/beta/empleados/tipo_tabulador","/beta/empleados/zona",
															"/beta/empleados/img/upload/{nombreFoto:.+}","/beta/viajes/prov","/beta/viajes/tripId/{trip_id}","/beta/viajes/{dia}","/beta/viajes/reporte/{dia}/{empId}","/beta/flotaunidades/img/upload/{nombreFoto:.+}","/beta/flotaunidades/todos","/beta/empleados/todos","/beta/viajes/todos","/beta/pedidos/todos","/beta/pedidos/tienda/{tienda}","/beta/pedidos/{trip_id}","/beta/viajes/{empId}/{dia}","/beta/viajes/tiendas/{tienda}","/beta/empleados/bancos/{numeroClaveBanco}","/beta/empleados/estados")
															.permitAll().antMatchers(HttpMethod.POST, "/beta/empleados/checar","/beta/chatboot/recibir","/beta/empleados/upload","/beta/empleados/areas","/beta/empleados/puestos","/beta/empleados/count","/beta/casaley/empleadoEstatus/save","/beta/casaley/pedidos/save","/beta/CfdiIngresoMeliTimbrado/save",
																									"/beta/empleados/img/upload","/beta/empleados/save","/beta/empleados/edit","/beta/asistencianov/save","/beta/flotaunidades/save","/beta/flotaunidades/img/flota","/beta/rutas/meli/save","/beta/CfdiTrasladoMeli/save","/beta/CfdiTrasladoMeli/cfdi/save","/beta/CfdiIngresoMeli/save","/beta/empleadosInfoAdicional/upload/doc","/beta/empleados/cp","/beta/administracion/tiendas/save"
																									,"/beta/asistencianov/img/evidenciaOperacion","/beta/asistencianov/img/evidenciaDevolucion","/beta/empleadosInfoAdicional/save","/beta/empleadosInfoAdicional/edit","/beta/empleados/asignacion/save","/beta/viajes/save","/beta/pedidos/save","/carso/cfdi-traslado/Mercancias/save","/carso/cfdi-traslado/Viaje/save","/beta/cfdi-traslado/save","/beta/registro/aliados/save","/beta/registro/aliados/registrar","/beta/empleados/empleadostiendas").permitAll().antMatchers(HttpMethod.PUT,"/beta/viajes/{trip_id}").permitAll().anyRequest().authenticated();
	}	
	@Bean  
	public CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration config= new CorsConfiguration();
		config.setAllowedOrigins(Arrays.asList("http://localhost","http://localhost:8081","http://localhost:8100","https://superbeta-lastmile-admin.netlify.app","http://localhost:8080","http://localhost:8761"));
		config.setAllowedMethods(Arrays.asList("GET","POST","DELETE","OPTIONS","PUT"));
		config.setAllowCredentials(true);
		config.setAllowedHeaders(Arrays.asList("Content-Type","Authorization"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", config);
		return source;
		
	}
	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter(){
		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(corsConfigurationSource()));
		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return bean; 
	}
}
