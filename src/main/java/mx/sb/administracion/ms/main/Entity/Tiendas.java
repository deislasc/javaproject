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
@Table(name="tiendas", schema = "catalogos")
@Data
public class Tiendas implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="zona", length=20)
	private String zona;
	@Column(name="estado", length=30)
	private String estado;
	@Column(name="sub_zona", length=30)
	private String subZona;
	@Column(name="ciudad", length=50)
	private String ciudad;
	@Column(name="cliente_id")
	private Long clienteId;
	@Column(name="nombre_cliente", length=80)
	private String nombreCliente;
	@Column(name="proyecto", length=60)
	private String proyecto;
	@Column(name="formato",nullable=true, length=30)
	private String formato;
	@Column(name="nomenclatura",length=10)
	private String nomenclatura;
	@Column(name="sucursal",nullable=true, length=60)
	private String sucursal;
	@Column(name="tienda_tipo",length=20)
	private String tiendaTipo;
	@Column(name="determinante")
	private String determinante;
	@Column(name="direccion",length=255)
	private String direccion;
	@Column(name="coordenadas", length=40)
	private String coordenadas;
	@Column(name="unidades_fijas")
	private Long unidadesFijas;
	@Column(name="recolectores")
	private Long recolectores;
	@Column(name="aduanales")
	private Long aduanales;
	@Column(name="shoppers")
	private Long shoppers;
	@Column(name="unidad_spot")
	private Long unidad_spot;
	@Column(name="status")
	private String status;
	@Column(name="correo_ger",length=255)
	private String correoGer;
	@Column(name="correo_Sub",length=255)
	private String correoSub;
	@Column(name="gerente",length=255)
	private String gerente;
	@Column(name="subgerente",length=255)
	private String subgerente;
	@Column(name="sup_picker",length=255)
	private String supPicker;
	@Column(name="telefono_ger",length=255)
	private String telefonoGer;
	@Column(name="telefono_sub",length=255)
	private String telefonoSub;
	
	private static final long serialVersionUID = 1L;




	
	
}
