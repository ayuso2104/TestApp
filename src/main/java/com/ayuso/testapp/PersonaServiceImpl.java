/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ayuso.testapp;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author ayuso
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Resource
    private PersonaDao personaDao;

    @Override
    public List<Persona> obtenerPersonas() {
        return personaDao.obtenerPersonas();
    }

}
