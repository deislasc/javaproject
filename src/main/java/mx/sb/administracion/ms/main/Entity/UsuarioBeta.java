package mx.sb.administracion.ms.main.Entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="usuario_beta", schema = "administracion")
@Data
public class UsuarioBeta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="no_identificacion",unique = false, length=2)
	private String noIdentificacion;
	@Column(name="beta_nomenclatura", length=5)
	private String betaNomenclatura;
	@Column(name="prov", length=1)
	private String prov;
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "esquema", referencedColumnName = "id")
	private Esquemas esquema;*/
	private static final long serialVersionUID = 1L;

}

