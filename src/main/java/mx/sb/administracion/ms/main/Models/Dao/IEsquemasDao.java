package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.Esquemas;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEsquemasDao extends JpaRepository<Esquemas,Long> {

@Query("select a from Esquemas a where a.tipoEsquema=?1")
public List<Esquemas> findTipoEsquema(String tipoEsquema);
}
