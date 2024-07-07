package mx.sb.administracion.ms.main.Models.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.sb.administracion.ms.main.Entity.Estados;
public interface IEstadosDao extends JpaRepository<Estados,Long>{

}
