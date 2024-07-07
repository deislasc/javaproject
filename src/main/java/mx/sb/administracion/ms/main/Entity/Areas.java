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
@Table(name="areas", schema = "catalogos")
@Data
public class Areas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="tipo_area",length=255)
    private String tipoArea;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipoArea() {
        return tipoArea;
    }
    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
