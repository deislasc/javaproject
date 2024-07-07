package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.MarcasUnidades;

import java.util.List;

public interface IMarcaUnidadService {
    public List<MarcasUnidades> findAll();
}
