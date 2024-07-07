package mx.sb.administracion.ms.main.Entity;

import java.io.Serializable;



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

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="unidades_flota", schema = "catalogos")
@Data
public class UnidadesFlota implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="unidad_id")
	private Long unidadId;
	@Column(name="num_economico")
	private String numEconomico;
	@Column(name="propietario", length=80)
	private String propietario;
	@Column(name="tipo_unidad", length=30)
	private String tipoUnidad;
	@Column(name="esquema_unidad", length=20)
	private String esquemaUnidad;
	@Column(name="tabulador", length=20)
	private String tabulador;
	@Column(name="facturante", length=80)
	private String facturante;
	@Column(name="nombre_aseguradora", length=100)
	private String nombreAseguradora;
	@Column(name="marca", length=40)
	private String marca;
	@Column(name="sub_marca", length=80)
	private String subMarca;
	@Column(name="placas", unique=true,length=15)
	private String placas;
	@Column(name="num_poliza_seguro")
	private String numPolizaSeguro;
	@Column(name="polizaDigital", length=255)
	private String polizaDigital;
	@Column(name="fecha_vigencia_poliza", length=50)
	private String fechaVigenciaPoliza;
	@Column(name="fecha_verificacion", length=50)
	private String fechaVerificacion;
	@Column(name="estado", length=25)
	private String estado;
	@Column(name="serie", length=60)
	private String serie;
	@Column(name="año", length=50)
	private String año;
	@Column(name="color", length=15)
	private String color;
	@Column(name="auto_foto")
	private String autoFoto;
	@Column(name="tarjeta_circulacion", length=60)
	private String tarjetaCirculacion;
	@Column(name="doc_tarjeta_circulacion")
	private String docTarjetaCirculacion;
	@Column(name="status", length=10)
	private String status;
	@Column(name="nombre_poliza_seguro")
	private String nombrePolizaSeguro;
	@Column(name="modelo")
	private String modelo;
	@Column(name="motor")
	private String motor;
	@Column(name="poliza_seguro")
	private String polizaSeguro;
	@Column(name="unidad")
	private String unidad;

	
	
	



	
	
}
