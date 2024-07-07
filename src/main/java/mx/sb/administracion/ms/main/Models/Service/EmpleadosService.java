package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;


import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.sb.administracion.ms.main.Entity.EmpTipo;
import mx.sb.administracion.ms.main.Entity.Empleados;

import mx.sb.administracion.ms.main.Models.Dao.IEmpleadosDao;


@Service
public class EmpleadosService implements IEmpleadosService,UserDetailsService{
	private Logger logger= LoggerFactory.getLogger(Empleados.class);
	@Autowired
	private IEmpleadosDao empleadosDao;
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String empId) throws UsernameNotFoundException {

		Empleados empleado= empleadosDao.findByempId(empId);
		
		if(empleado == null) {
			logger.error("Error No existe usuario:'"+empId+"' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: noo existe usuario '"+empId+"' en el sistema!");
		}
		
		List<GrantedAuthority> authorities = empleado.getEmpTipo().stream().map(empTipo -> new SimpleGrantedAuthority(empTipo.getNombre())).peek(authority ->  logger.info("Status:"+authority.getAuthority())).collect(Collectors.toList());
		return new User(empleado.getEmpId(), empleado.getPassword(),true,true,true,true, authorities);
	}
	@Override
	@Transactional(readOnly = true)
	public Empleados findByempId(String empId) {
		
		return empleadosDao.findByempId(empId);
	}
	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findAll(){
		return (List<Empleados>) empleadosDao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public List<EmpTipo> findByempIdA(String term) {
		
		return empleadosDao.findByempIdA(term);
	}
	@Override
	public Empleados save(Empleados empleados) {
		empleadosDao.save(empleados);
		return empleados;
	}
	
	@Override
	@Transactional(readOnly = true)
	public Empleados findByEmpIdandPass(String empId, String password) {
		
		return empleadosDao.findByEmpIdandPass(empId, password) ;
	}

	@Override
	@Transactional(readOnly = true)
	public Long countEmpleado(String nomEmp) {
		return empleadosDao.countEmpleado(nomEmp);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Empleados> findTiendaEmp(String tiendaSucursal) {
		
		return empleadosDao.findTiendaEmp(tiendaSucursal);
	}
	
	
	
	
	
	
	
		
	
}