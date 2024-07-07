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
@Table(name="codigos_postales", schema = "catalogos")
@Data
public class CodigosPostales implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="codigo_postal",length=5)
	private String codigoPostal;
	@Column(name="colonia",length=255)
	private String colonia;
	@Column(name="municipio",length=255)
	private String municipio;
	@Column(name="estado",length=255)
	private String estado;
}
