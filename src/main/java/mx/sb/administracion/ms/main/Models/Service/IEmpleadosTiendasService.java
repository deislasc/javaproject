package mx.sb.administracion.ms.main.Models.Service;


import mx.sb.administracion.ms.main.Entity.EmpleadosTiendas;

public interface IEmpleadosTiendasService {
    public EmpleadosTiendas save(EmpleadosTiendas EmpleadosTiendas);
    public EmpleadosTiendas findEmp(Long empleadosEmpId);
}
