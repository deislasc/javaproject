package mx.sb.administracion.ms.main.Models.Dao;

import mx.sb.administracion.ms.main.Entity.Tiendas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiendasDao extends JpaRepository <Tiendas,Long>{
    
}
