package ataucusi.lAtaucusi.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "direccion")
@Inheritance (strategy = InheritanceType.JOINED)
public class Direccion {

 @Id
 @GeneratedValue (strategy =  GenerationType.IDENTITY)
  @Column(name = "idDireccion")
  private Long idDireccion;

  @Column(name = "calle", length = 50)
  private  String calle;

  @Column(name = "ciudad", length = 50)
  private  String ciudad;

  @Column(name = "estado", length = 50)
  private  String estado;

  @Column(name = "codigoPostal", length = 50)
  private  String codigoPostal;

 @Column(name = "pais", length = 50)
  private  String pais;

    @OneToMany(mappedBy = "direccion")
    private List <Persona> personaList;

    public Direccion() {
    }

    public Direccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public Direccion(String calle, String ciudad, String estado, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public Long getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Long idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }
}
