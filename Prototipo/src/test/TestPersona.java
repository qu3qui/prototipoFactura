/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entidades.Persona;
import utilidades.BaseDatosUtils;
import static utilidades.BaseDatosUtils.consultarPersona;

/**
 *
 * @author Sebastian
 */
public class TestPersona {
    
    public static void main (String [] args){
        //Prueba sobre Consulta de personas
        //System.out.println("jaja");
        //System.out.println(consultarPersona("1053888679"));
        
        Persona persona = new Persona();
        persona.setNombre("Sebastian");
        persona.setTelefono("319319");
        persona.setCedula("2345");
        BaseDatosUtils.crearPersona(persona);
 
    }
    
}
