package mx.sb.administracion.ms.main.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="empleados_info_map", schema = "administracion")
@Data
public class EmpleadosInfoMap implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name="emp_id", length=15)
	private String empId;
	@Column(name="emp_nombre",length = 255)
	private String nombre;
	@Column(name="puesto", length=80)
	private String puesto;
	@Column(name="esquema")
	private String esquema;
	/*@JsonIgnore
	private String urlSeguro;
	@JsonIgnore
	private String dia;
	@JsonIgnore
	private String coordInicioJornada;
	@JsonIgnore
	private String horaInicioJornada;
	@JsonIgnore
	private String coordFinJornada;
	@JsonIgnore
	private String horaFinJornada;*/
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="empleados_tiendas", joinColumns= @JoinColumn(name="empleados_empId"),
			inverseJoinColumns=@JoinColumn(name="tiendas_id"),
			uniqueConstraints= {@UniqueConstraint(columnNames= {"empleados_empId", "tiendas_id"})})
	private List<Tiendas> tiendasEmpleados;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="administrativos_tiendas", joinColumns= @JoinColumn(name="administrativos_empId"),
			inverseJoinColumns=@JoinColumn(name="tiendas_id"),
			uniqueConstraints= {@UniqueConstraint(columnNames= {"administrativos_empId", "tiendas_id"})})
	private List<Tiendas> tiendasAdmin;








	private static final long serialVersionUID = 1L;

}
