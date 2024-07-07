package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.AsignacionTienda;

public interface IAsignacionTiendaService {
    public List<AsignacionTienda> findbyEmp(String empId);
}
