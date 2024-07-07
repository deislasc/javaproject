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
@Table(name="empleados_emp_tipo", schema = "administracion")
@Data
public class EmpleadosEmpTipo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="empleados_emp_id")
    private Long empleadosEmpId;
    @Column(name="emp_tipo_emp_id")
    private Long empTipoEmpId;


}
