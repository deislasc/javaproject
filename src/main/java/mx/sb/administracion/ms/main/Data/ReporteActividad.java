
package mx.sb.administracion.ms.main.Data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="reporte_actividad")
@Data
public class ReporteActividad implements Serializable {

    @Id
    @Column(name="pedido_id")
    private String pedidoId;
    @Column(name="emp_id_administrativo")
    private String empIdAdministrativo;
    @Column(name="sucursal")
    private String sucursal;
    @Column(name="emp_nombre")
    private String empNombreOperaciones;

    @Column(name="emp_id")
    private String empId;
    @Column(name="agregados")
    private String agregados;
    @Column(name="sustitutos")
    private String sustitutos;
    @Column(name="cancelados")
    private String cancelados;
    @Column(name="comentario")
    private String comentario;
    @Column(name="coord_cargando")
    private String coordenadasCargando;
    @Column(name="coord_entrega")
    private String coordenadasEntrega;
    @Column(name="coord_ruta")
    private String coordenadasRuta;
    @Column(name="dia")
    private String dia;
    @Column(name="evidencia")
    private String evidencia;
    @Column(name="faltantes")
    private String faltantes;
    @Column(name="hora_cargando")
    private String horaCargando;
    @Column(name="hora_ruta")
    private String horaRuta;
    @Column(name="hora_entrega")
    private String horaEntrega;
    @Column(name="hora_tienda")
    private String RegresoTiendaHora;
    @Column(name="nombre_cliente")
    private String nombreCliente;
    @Column(name="ruta_id")
    private String rutaId;
    @Column(name="status")
    private String status;
    @Column(name="numero_articulos")
    private Long numeroArticulos;
    @Column(name="orders_by_trip")
    private Long ordersByTrip;
    @Column(name="puesto")
    private String puesto;



}
