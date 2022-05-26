package ataucusi.lAtaucusi.service.impl;

import ataucusi.lAtaucusi.dao.iPersonaDao;
import ataucusi.lAtaucusi.entity.Persona;
import ataucusi.lAtaucusi.service.iPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonaServiceImpl implements iPersonaService {
    @Autowired
    private iPersonaDao personaDao;

    @Override
    public List<Persona> listaPersona() {

        List<Persona> personas = this.personaDao.findAll();
        for (Persona persona:personas){
            System.out.println(persona.toString());
        }
        return this.personaDao.findAll();
    }
}
