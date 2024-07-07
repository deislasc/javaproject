package mx.sb.administracion.ms.main.Models.Dao;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.Bancos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface IBancosDao extends JpaRepository<Bancos,Long>{
	@Query("select a from Bancos a where a.numeroClaveBanco = ?1")
	public List<Bancos> findNumeroClaveBanco(String numeroClaveBancos);

}
