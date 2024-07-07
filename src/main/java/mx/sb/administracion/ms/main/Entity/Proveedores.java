package mx.sb.administracion.ms.main.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="proveedores", schema = "catalogos")
@Data
public class Proveedores implements Serializable{
	@Id
	@Column(name="clave_indentificador", length=2,unique = true)
	private String claveIndentificador;
	@Column(name="nombre_comercial", length=255)
	private String nombreComercial;
	@Column(name="prov_nombre", length =255)
	private String provNombre;
	@Column(name="prov_apellidopaterno", length=255)
	private String provApellidoPaterno;
	@Column(name="prov_apellidomaterno",length = 255)
	private String provApellidoMaterno;
	@Column(name="prov_rfc", length = 16)
	private String provRfc;
	@Column(name="prov_email", length =255)
	private String provEmail;
	@Column(name="prov_tel_cel",length = 10)
	private Long provTelCel;
	@Column(name="prov_fecha_ingreso",length =15)
	private String provFechaIngreso;
	@Column(name="prov_fecha_baja", length = 15)
	private String provFechaBaja;
	@Column(name="prov_tipo_aliado", length =255)
	private String provTipoAliado;
	@Column(name="prov_periodo_pago", length = 255)
	private String provPeriodoPago;
	@Column(name="prov_opinion_cumplimiento_SAT", length=255)
	private String provOpinionCumplimientoSat;
	@Column(name="prov_constancia_fiscal", length =255)
	private String provConstanciaFiscal;
	@Column(name="prov_comprobante_domicilio", length =255)
	private String provComprobanteDomicilio;
	@Column(name="prov_cuenta_bancaria", length=255)
	private String provCuentaBancaria;
	@Column(name="prov_actaconstitutiva", length=255)
	private String provActaconstitutiva;
	@Column(name="prov_identifiacion_oficial_representantelegal", length=255)
	private String provIdentificacionOficialRepresentantelegal;
	@Column(name="prov_contrato", length = 255 )
	private String provContrato;
	@OneToMany
	@JoinColumn(name = "no_identificacion", referencedColumnName = "clave_indentificador")
	private List<UsuarioBeta> usuarioBeta;
	private static final long serialVersionUID = 1L;
}
 

