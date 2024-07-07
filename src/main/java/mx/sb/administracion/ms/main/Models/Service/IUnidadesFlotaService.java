package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.UnidadesFlota;

public interface IUnidadesFlotaService {
	public List<UnidadesFlota> findAll();
	public UnidadesFlota save(UnidadesFlota unidadesFlota);
	public Long findPlacas(String placas);
}
