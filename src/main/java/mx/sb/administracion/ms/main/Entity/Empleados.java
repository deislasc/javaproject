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
@Table(name="empleados", schema = "administracion")
@Data
public class Empleados implements Serializable {

 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name="emp_id", length=15,unique = true)
		private String empId;
		@Column(name="emp_email", length=255)
		private String email;
		@Column(name="emp_password", length =255)
		private String password;
		@Column(name="emp_estatus", length=1)
		private String status;
		@Column(name="emp_nombre",length = 255)
		private String nombre;
		@Column(name="cliente_id")
		private String clienteId;
		@Column(name="tienda_sucursal")
		private String tiendaSucursal;
		
		
		@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinTable(name="empleados_emp_tipo",schema = "administracion",joinColumns= @JoinColumn(name="empleados_emp_id"),
		inverseJoinColumns=@JoinColumn(name="emp_tipo_emp_id"),
		uniqueConstraints= {@UniqueConstraint(columnNames= {"empleados_emp_id", "emp_tipo_emp_id"})})
		private List<EmpTipo> empTipo;
		
		@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinTable(name="empleados_tiendas",schema = "administracion",joinColumns= @JoinColumn(name="empleados_emp_id"),
		inverseJoinColumns=@JoinColumn(name="tiendas_id"),
		uniqueConstraints= {@UniqueConstraint(columnNames= {"empleados_emp_id", "tiendas_id"})})
		private List<Tiendas> tiendas;

		
		
}
