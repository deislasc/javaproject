package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.Clientes;

public interface IClientesService {
    public List<Clientes> findAll();

}
