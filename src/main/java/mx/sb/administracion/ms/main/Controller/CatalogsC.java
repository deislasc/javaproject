package mx.sb.administracion.ms.main.Controller;


import java.util.List;


import mx.sb.administracion.ms.main.Models.Service.ICiudadesService;
import mx.sb.administracion.ms.main.Models.Service.IClientesService;
import mx.sb.administracion.ms.main.Models.Service.IFormatosService;
import mx.sb.administracion.ms.main.Models.Service.IProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.sb.administracion.ms.main.Entity.Ciudades;
import mx.sb.administracion.ms.main.Entity.Clientes;
import mx.sb.administracion.ms.main.Entity.Proyectos;
import mx.sb.administracion.ms.main.Entity.Formatos;

@RestController
@RequestMapping("/beta/catalogs")
public class CatalogsC {
    @Autowired
    private ICiudadesService CiudadesService;
    @Autowired
    private IClientesService ClientesService;
    @Autowired
    private IProyectosService ProyectosService;
    @Autowired
    private IFormatosService FormatosService;

@GetMapping("/ciudades/todos")
public List<Ciudades> ciudad(){
        return CiudadesService.findAll();
        }

@GetMapping("/clientes/todos")
public List<Clientes> cliente(){
        return ClientesService.findAll();
        }

@GetMapping("/proyectos/todos")
public List<Proyectos> proyecto(){
        return ProyectosService.findAll();
        }

@GetMapping("/formatos/todos")
public List<Formatos> formato(){
        return FormatosService.findAll();
        }
}