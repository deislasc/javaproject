package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Esquemas;

import java.util.List;

public interface IEsquemasService {
    public List<Esquemas> findAll();
    public List<Esquemas> findTipoEsquema(String tipoEsquema);
}
