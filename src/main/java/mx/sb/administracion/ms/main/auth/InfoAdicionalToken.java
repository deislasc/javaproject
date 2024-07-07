package mx.sb.administracion.ms.main.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;

import mx.sb.administracion.ms.main.Entity.Empleados;
import mx.sb.administracion.ms.main.Entity.EmpleadosInfoAdicional;
import mx.sb.administracion.ms.main.Models.Service.IEmpleadosInfoAdicionalService;
import mx.sb.administracion.ms.main.Models.Service.IEmpleadosService;



@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private IEmpleadosService empleadosService;
	@Autowired
	private IEmpleadosInfoAdicionalService EmpleadosInfoAdicionalService;
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		
		Empleados empleado= empleadosService.findByempId(authentication.getName());
		Optional<EmpleadosInfoAdicional> empleadosInfoAdicional=EmpleadosInfoAdicionalService.findById(authentication.getName());
		Map<String, Object> info =new HashMap<>();
		info.put("info adicional", "hola que tal ".concat(authentication.getName()));
		info.put("nombre_empleado",empleado.getEmpId());
		info.put("nombre",empleado.getNombre());
		info.put("tienda_sucursal", empleado.getTiendaSucursal());
		info.put("puesto", empleadosInfoAdicional.get().getPuesto());
		//info.put("permisos", empleado.getTiendas());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
		
		return accessToken;
	}

}

