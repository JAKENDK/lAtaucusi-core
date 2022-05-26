package ataucusi.lAtaucusi.dao;

import ataucusi.lAtaucusi.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface iEstudianteDao extends JpaRepository <Estudiante,Long> {

    Estudiante findByCodigo(String codigo);


}
