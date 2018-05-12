package com.cidenet.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("/personas")
    public List<Persona> getAllPersonas() {
        return personaService.getAllPersonas();
    }


    @RequestMapping("/personas/{id}")
    public ResponseEntity<Persona> handleRequest(@PathVariable int id) {
        Persona p = personaService.getPersona(id);

        if (p != null) {
            return new ResponseEntity<Persona>(p,
                    HttpStatus.OK);
        } else {

            return new ResponseEntity<Persona>(p,
                    HttpStatus.NOT_FOUND);
        }

    }


    @RequestMapping(method = RequestMethod.POST, value = "/personas")
    public void addPersonas(@RequestBody Persona persona) {
        personaService.addPersona(persona);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/personas/{id}")
    public void updatePersonas(@RequestBody Persona persona, @PathVariable String id) {
        personaService.updatePersona(id, persona);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/personas/{id}")
    public void deletePersonas(@PathVariable int id) {
        personaService.deletePersona(id);
    }


}
