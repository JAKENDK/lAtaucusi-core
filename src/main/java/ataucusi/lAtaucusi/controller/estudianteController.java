package ataucusi.lAtaucusi.controller;

import ataucusi.lAtaucusi.entity.Estudiante;
import ataucusi.lAtaucusi.service.iEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("estudiante")
public class estudianteController {
    @Autowired
    private iEstudianteService estudianteService;

    @GetMapping ("/buscarEstudiante")
    public Estudiante buscarEstudiante(@RequestParam ("codigo") String codigo){
        return this.estudianteService.obtenerEstudianteByCodigo(codigo);
    }
}
