package ataucusi.lAtaucusi.entity;


import javax.persistence.*;


@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName = "idPersona")
public class Profesor extends Persona  {
    @Column (name = "salario", length = 50)
    private  String salario;

    public Profesor(String salario) {
        this.salario = salario;
    }
    public Profesor() {
    }

    public Profesor(Long idPersona, String salario) {
        super(idPersona);
        this.salario = salario;
    }

    public Profesor(String nombre, String telefono, String email, Direccion direccion, String salario) {
        super(nombre, telefono, email, direccion);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
