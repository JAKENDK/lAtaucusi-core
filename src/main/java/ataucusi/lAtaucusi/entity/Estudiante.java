package ataucusi.lAtaucusi.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 50)
    private String codigo;

    @Column(name = "serie", length = 50)
    private String serie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idPersona, String codigo, String serie) {
        super(idPersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String nombre, String telefono, String email, Direccion direccion, String codigo, String serie) {
        super(nombre, telefono, email, direccion);
        this.codigo = codigo;
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
