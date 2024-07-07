package mx.sb.administracion.ms.main.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="tabuladores", schema = "catalogos")
@Data
public class Tabuladores implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="tipo_zona")
	private String tipoZona;
	@Column(name="tipo_esquema")
	private String tipoEsquema;
	@Column(name="salario_mensual", length=100)
	private Long salarioMensual;
	@Column(name="gas_mensual", length=100)
	private Long gasMensual;
	@Column(name="pago_pedido_a7", length=100)
	private Long pagoPedidoA7;
	@Column(name="pago_pedido_7mas", length=100)
	private Long pagoPedido7mas;
	@Column(name="bono", length=100)
	private Long bono;
	@Column(name="renta", length=100)
	private Long renta ;
	@Column(name="total", length=100)
	private Long total;
	@Column(name="limite_infonavit", length=100)
	private Long limiteInfonavit;
	@Column(name="periodo_pago", length=255)
	private String periodoPago;
	@Column(name="con_unidad", length=255)
	private String conUnidad;
	@Column(name="salario_diario", length=100)
	private Long salarioDiario;
	@Column(name="total_ingreso_carga_social", length=100)
	private Long totalIngresoCargaSocial;
	@Column(name="carga_social", length=100)
	private Long cargaSocial;
	@Column(name="comentario", length=255)
	private String comentario;
	@Column(name="descripcion", length=255)
	private String descripcion;
	@Column(name="tc_estatus", length=1)
	private String tcEstatus;

}
