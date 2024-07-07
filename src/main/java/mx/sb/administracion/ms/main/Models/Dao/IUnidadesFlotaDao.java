package mx.sb.administracion.ms.main.Models.Dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mx.sb.administracion.ms.main.Entity.UnidadesFlota;

public interface IUnidadesFlotaDao extends CrudRepository<UnidadesFlota, Long>{
    @Query("select count(unidades) from UnidadesFlota unidades where unidades.placas=?1")
	public Long findPlacas(String placas);


}
