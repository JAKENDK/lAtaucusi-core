package ataucusi.lAtaucusi.controller;


import ataucusi.lAtaucusi.entity.Persona;
import ataucusi.lAtaucusi.service.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("persona")
public class personaController {

    @Autowired
    private iPersonaService personaService;

    @GetMapping("/listarPersona")
    public List <Persona> listaPersona(){
        return this.personaService.listaPersona();
    }


}
