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
@Table(name="esquemas", schema = "catalogos")
@Data
public class Esquemas implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tipo_esquema")
	private String tipoEsquema;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipoEsquema() {
		return tipoEsquema;
	}
	public void setTipoEsquema(String tipoEsquema) {
		this.tipoEsquema = tipoEsquema;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
