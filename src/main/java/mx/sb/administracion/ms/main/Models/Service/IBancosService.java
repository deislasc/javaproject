package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.Bancos;


public interface IBancosService {
	public List<Bancos> findAll();
	public List<Bancos> findNumeroClaveBanco(String numeroClaveBancos);

}
