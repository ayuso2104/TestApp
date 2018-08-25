/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayuso.testapp;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ayuso
 */
@RestController("/")
public class ControllerPersona {

    @Resource
    private PersonaService personaService;

    @RequestMapping(value = "/personas", produces = "application/json")
    public List<Persona> obtenerPersonas() {
        return personaService.obtenerPersonas();
    }

}
