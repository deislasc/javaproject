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
@Table(name="asignacion_tienda", schema = "administracion")
@Data
public class AsignacionTienda implements Serializable{


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;
    @Column(name="emp_id", length=15)
    private String empId;
    @Column(name="tienda_sucursal")
    private String tiendaSucursal;
    @Column(name="nom_tienda_meli")
    private String nomTiendaMeli;









}

