package mx.sb.administracion.ms.main.Models.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import mx.sb.administracion.ms.main.Entity.Tabuladores;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ITabuladoresDao  extends JpaRepository<Tabuladores,Long >{
    @Query(value="select tab.id,tab.tc_estatus,tab.con_unidad,z.tipo_zona,esq.tipo_esquema,esq.descripcion,tab.salario_diario,tab.salario_mensual,tab.gas_mensual,tab.pago_pedido_a7,tab.pago_pedido_7mas,tab.bono,tab.renta,tab.total,tab.limite_infonavit,tab.carga_social,tab.total_ingreso_carga_social,tab.comentario,p.periodo_pago"
            + " from tabuladores tab"
            + " inner join  zonas z on tab.tipo_zona=z.id inner join esquemas esq on tab.tipo_esquema=esq.id left join periodo_pago p on tab.periodo_pago=p.id  ",nativeQuery = true)
    public List<Tabuladores> findTab();

}
