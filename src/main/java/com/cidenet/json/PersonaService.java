package com.cidenet.json;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonaService {

    private List<Persona> personas = new ArrayList<>(Arrays.asList(
            new Persona("santiago", 26, "ing sistemas",
                    "san marcos", "colombiana", 33),
            new Persona("sebastian", 23, "diseño",
                    "barranquilla", "peruana", 43),
            new Persona("Esteban", 22, "ing industrial",
                    "Buenos aires", "ecuatoriana", 24),
            new Persona("santiago", 20, "ing electrica",
                    "Bello", "colombiana", 22)));

    public List<Persona> getAllPersonas() {
        return personas;
    }

    public Persona getPersona(int id) {

        for (Persona persona : personas) {

            if (persona.getId() == id) {
                System.out.println(persona);
                return persona;
            }


        }
        return null;
    }


    public void addPersona(Persona persona) {
        personas.add(persona);
    }

    public void updatePersona(String id, Persona persona) {

        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            if (personas.get(i).equals(id)) {
                personas.set(i, persona);
                return;
            }
        }
    }

    public void deletePersona(int id) {
        personas.removeIf(p -> p.getId() == (id));
    }
}