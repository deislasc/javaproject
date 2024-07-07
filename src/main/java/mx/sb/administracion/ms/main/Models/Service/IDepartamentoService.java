package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Departamento;

import java.util.List;

public interface IDepartamentoService {
    public List<Departamento> findAll();
}
