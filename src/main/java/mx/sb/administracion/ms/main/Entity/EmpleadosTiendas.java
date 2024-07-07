package mx.sb.administracion.ms.main.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="empleados_tiendas", schema ="administracion")
@Data
public class EmpleadosTiendas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="empleados_emp_id")
    private Long empleadosEmpId;
    @Column(name="tiendas_id")
    private Long tiendasId;
    private static final long serialVersionUID = 1L;
}
