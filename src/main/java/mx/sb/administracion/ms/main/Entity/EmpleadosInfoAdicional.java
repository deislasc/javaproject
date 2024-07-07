package mx.sb.administracion.ms.main.Entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name="empleados_info_adicional", schema = "administracion")
public class EmpleadosInfoAdicional implements Serializable{
	
	@Id
	@Column(name="emp_id", length=15)
		private String empId;
	@Column(name="empresa", length=100)
		private String empresa;
	@Column(name="emp_lugar_nacimiento", length=120)
	private String empLugarNacimiento;
	@Column(name="emp_pais", length=15)
		private String empPais;
	@Column(name="emp_nacionalidad", length=30)
		private String empNacionalidad;
	@Column(name="emp_doc_migratorio", length=90)
		private String empDocMigratorio;
	@Column(name="emp_direccion",length=255)
		private String empDireccion;
	@Column(name="emp_cp",length=11)
		private Long empCP;
	@Column(name="emp_estado_municipio", length=50)
		private String empEstadoMunicipio;
	@Column(name="emp_calle")
	private String empCalle;
	@Column(name="emp_numero_exterior", length=100)
	private String empNumeroExterior;
	@Column(name="emp_numero_interior", length=100)
	private String empNumeroInterior;
	@Column(name="emp_colonia")
	private String empColonia;
	@Column(name="emp_sexo",length=10)
		private String empSexo;
	@Column(name="emp_ine", length=60)
		private String empIne;
	@Column(name="emp_curp", unique=true, length=60)
		private String empCurp;
	@Column(name="emp_nss", length=60)
		private String empNss;
	@Column(name="emp_rfc", length= 15)
		private String empRFC;
	@Column(name="emp_licencia", length=30)
		private String empLicencia;
	@Column(name="emp_sueldo", length=30)
		private Float empSueldo;
	@Column(name="emp_tel_fijo", length=13)
	private Long empTelFijo;
	@Column(name="emp_tel_cel", length=13)
	private Long empTelCel;
	@Column(name="emp_id_jefe", length=30)
	private String empIdJefe;
	@Column(name="emp_fecha_nacimiento", length=200)
	private String empFechaNacimiento;
	@Column(name="emp_edad")
	private Long empEdad;
	@Column(name="emp_cve_area", length=30)
	private String empCveArea;
	@Column(name="area", length=100)
	private String area;
	@Column(name="emp_cve_departamento", length=30)
	private String empCveDepartamento;
	@Column(name="departamento", length=100)
	private String departamento;
	@Column(name="emp_cve_puesto", length=30)
	private String empCvePuesto;
	@Column(name="puesto", length=100)
	private String puesto;
	@Column(name="emp_fecha_ingreso", length=40)
	private String empFechaIngreso;
	@Column(name="emp_fecha_baja", length=40)
	private String empFechaBaja;
	@Column(name="emp_correo", length=150)
	private String empCorreo;
	@Column(name="arrendador", length=100)
	private String arrendador;
	@Column(name="esquema", length=40)
	private String esquema;
	@Column(name="doc_ine")
	private String docIne;
	@Column(name="doc_licencia", length=255)
	private String docLicencia;
	@Column(name="num_nom")
	private String numNom;
	@Column(name="placa_asignada")
	private String placaAsiganda;
	@Column(name="tabulador")
	private String tabulador;
	@Column(name="banco")
	private String banco;
	@Column(name="proveedor")
	private String proveedor;



}