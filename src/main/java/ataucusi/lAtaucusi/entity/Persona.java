package ataucusi.lAtaucusi.entity;

import javax.persistence.*;

@Entity
@Table(name = "persona")
@Inheritance (strategy = InheritanceType.JOINED)
public class Persona{

    @Id
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "telefono", length = 50)
    private String telefono;

    @Column(name = "email", length = 50)
    private String email;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Direccion direccion;

    public Persona() {
    }

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(String nombre, String telefono, String email, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
}




