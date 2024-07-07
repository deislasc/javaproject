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
@Table(name="bancos", schema = "catalogos")
@Data

public class Bancos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="numero_clave_banco",length=3)
	private String numeroClaveBanco;
	@Column(name="nombre_institucion",length=255)
	private String nombreInstitucion;
	@Column(name="numero_institucion",length=10)
	private String numeroInstitucion;
	@Column(name="como_anotamos",length=255)
	private String comoAnotamos;
	@Column(name="clave_transfer",length=255)
	private String claveTransfer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroClaveBanco() {
		return numeroClaveBanco;
	}
	public void setNumeroClaveBanco(String numeroClaveBanco) {
		this.numeroClaveBanco = numeroClaveBanco;
	}
	public String getNombreInstitucion() {
		return nombreInstitucion;
	}
	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	public String getNumeroInstitucion() {
		return numeroInstitucion;
	}
	public void setNumeroInstitucion(String numeroInstitucion) {
		this.numeroInstitucion = numeroInstitucion;
	}
	public String getComoAnotamos() {
		return comoAnotamos;
	}
	public void setComoAnotamos(String comoAnotamos) {
		this.comoAnotamos = comoAnotamos;
	}
	public String getClaveTransfer() {
		return claveTransfer;
	}
	public void setClaveTransfer(String claveTransfer) {
		this.claveTransfer = claveTransfer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
