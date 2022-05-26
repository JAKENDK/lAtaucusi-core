package ataucusi.lAtaucusi.service;

import ataucusi.lAtaucusi.entity.Estudiante;

public interface iEstudianteService {
    Estudiante obtenerEstudianteByCodigo(String codigo);
    Estudiante ObtenerEstudianteByNombreOrApellido(String nombre, String Apellido);
}
