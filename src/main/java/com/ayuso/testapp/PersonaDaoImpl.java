/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayuso.testapp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ayuso
 */
@Repository
public class PersonaDaoImpl implements PersonaDao {

    @Override
    public List<Persona> obtenerPersonas() {
        List<Persona> personas = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Persona p = new Persona();
            p.setId(i);
            p.setNombre("Persona" + i);
            p.setApellidos("Apellido" + i);
            personas.add(p);
        }
        return personas;
    }

}
