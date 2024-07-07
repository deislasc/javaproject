package mx.sb.administracion.ms.main.Models.Service;

import java.util.List;

import mx.sb.administracion.ms.main.Entity.Tabuladores;

public interface ITabuladoresService {
	public List<Tabuladores> findAll();
	public List<Tabuladores> findTab();

}
