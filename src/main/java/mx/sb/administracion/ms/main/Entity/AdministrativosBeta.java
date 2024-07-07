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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="administrativos_beta", schema ="administracion")
@Data
public class AdministrativosBeta implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="emp_id", length=15,unique = true)
	private String empId;
	@Column(name="emp_email", length=255)
	private String email;
	@Column(name="emp_password", length =255)
	@JsonIgnore
	private String password;
	@Column(name="emp_estatus", length=1)
	private String status;
	@Column(name="emp_nombre",length = 255)
	private String nombre;
	@Column(name="tienda_sucursal")
	private String tiendaSucursal;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="administrativos_tiendas", joinColumns= @JoinColumn(name="administrativos_empId"),
	inverseJoinColumns=@JoinColumn(name="tiendas_id"),
	uniqueConstraints= {@UniqueConstraint(columnNames= {"administrativos_empId", "tiendas_id"})})
	private List<Tiendas> tiendas;
	

	
	
	
	
}
