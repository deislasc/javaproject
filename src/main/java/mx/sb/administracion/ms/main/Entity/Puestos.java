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
@Table(name="puestos", schema = "catalogos")
@Data
public class Puestos   implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="tipo_puesto",length=255)
    private String tipoPuesto;
    @Column(name="id_departamento", length = 3)
    private String idDepartamento;
    private static final long serialVersionUID = 1L;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipoPuesto() {
        return tipoPuesto;
    }
    public void setTipoPuesto(String tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
