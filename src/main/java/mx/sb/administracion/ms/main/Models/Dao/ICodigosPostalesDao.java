package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.CodigosPostales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICodigosPostalesDao extends JpaRepository <CodigosPostales,Long>{
    @Query("select c from CodigosPostales c where c.codigoPostal=?1")
    public List<CodigosPostales> findCp(String codigosPostales);
}
