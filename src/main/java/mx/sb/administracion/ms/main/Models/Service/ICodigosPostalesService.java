package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.CodigosPostales;

import java.util.List;

public interface ICodigosPostalesService {
    public List<CodigosPostales> findCp(String codigosPostales);
}
