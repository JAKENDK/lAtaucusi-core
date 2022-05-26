package ataucusi.lAtaucusi.service.impl;

import ataucusi.lAtaucusi.dao.iEstudianteDao;
import ataucusi.lAtaucusi.entity.Estudiante;
import ataucusi.lAtaucusi.service.iEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl implements iEstudianteService {

    @Autowired
    private iEstudianteDao estudianteDao;

    @Override
    public Estudiante obtenerEstudianteByCodigo(String codigo) {
        return this.estudianteDao.findByCodigo(codigo);
    }

    @Override
    public Estudiante ObtenerEstudianteByNombreOrApellido(String nombre, String Apellido) {
        return null;
    }
}
