package mx.sb.administracion.ms.main.Models.Service;

import mx.sb.administracion.ms.main.Entity.Tiendas;

import java.util.List;

public interface ITiendasService {
    public List<Tiendas> findAll();
    public Tiendas save(Tiendas tiendas);

}
