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
@Table(name="tipo_tabulador", schema = "catalogos")
@Data
public class TipoTabulador implements Serializable {
	@Id
	private Long id;
	@Column(name="tipo_tabulador", length=255)
	private String tipoTabulador;

}
