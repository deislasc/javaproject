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
@Table(name="departamento", schema = "catalogos")
@Data
public class Departamento implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="tipo_departamento",length=255)
    private String tipoDepartamento;
    @Column(name="tipo_area", length=100)
    private Long tipoArea ;
    private static final long serialVersionUID = 1L;
    public Long getTipoArea() {
        return tipoArea;
    }
    public void setTipoArea(Long tipoArea) {
        this.tipoArea = tipoArea;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTipoDepartamento() {
        return tipoDepartamento;
    }
    public void setTipoDepartamento(String tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

}
