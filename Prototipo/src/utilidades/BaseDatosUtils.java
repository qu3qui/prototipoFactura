/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Factura;
import entidades.Persona;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbuitrago
 */
public class BaseDatosUtils {

    public static Connection iniciarConexion() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prototipo", "postgres", "Asdf1234$");
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Persona consultarPersona(String cedula) {
        Connection conexion = iniciarConexion();
        Statement stmt;
        ResultSet rs = null;
        Persona personaResultado = null;
        try {
            stmt = conexion.createStatement();
            rs = stmt.executeQuery("select * from persona where persona_cedula='" + cedula + "'");
            while (rs.next()) {
                personaResultado = convertirSQLaPersona(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            cerrarConexion(conexion);
        }
        return personaResultado;
    }

    public static Persona convertirSQLaPersona(ResultSet rs) {
        Persona persona = new Persona();
        try {
            persona.setNombre(rs.getString("persona_nombre"));
            persona.setTelefono(rs.getString("persona_telefono"));
            persona.setCedula(rs.getString("persona_cedula"));
        } catch (SQLException ex) {
            System.out.println("Problemas casteando el resultSet a Personas");
        }
        return persona;
    }
    
    public static void crearPersona(Persona persona){
        Connection conexion = iniciarConexion();
        Statement stmt;
        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate("insert into persona VALUES ('"+persona.getNombre()+"','"+persona.getTelefono()+"','"+persona.getCedula()+"')");
            //System.out.println("La persona ha sido creada correctamente");
        } catch (SQLException ex) {
            //Se deben dividir los mensajes, de esta manera uno va para el usuario y otro para el log del programa
            //System.out.println("No se ha podido crear a la persona");
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            cerrarConexion(conexion);
        }
    };
    
    public static String crearFactura(Factura factura, String cedula){
        String mensajeResultado = "null";
        Connection conexion = iniciarConexion();
        Statement stmt;
        try {
            stmt = conexion.createStatement();
            stmt.executeUpdate("insert into factura Values ('"+factura.getFecha()+
                    "','"+factura.getDescripcion()+"','"+factura.getMarca()+"',"+
                    factura.getValor()+","+factura.getClave()+",DEFAULT,'"+cedula+"','"+factura.getEmei()+"')");
            mensajeResultado = "La factura se ha creado de manera correcta";
            return mensajeResultado;
        } catch (SQLException ex) {
            //Se deben dividir los mensajes, de esta manera uno va para el usuario y otro para el log del programa
            Logger.getLogger(BaseDatosUtils.class.getName()).log(Level.SEVERE, null, ex);
            mensajeResultado = "No se ha podido crear la factura";
            return mensajeResultado;  
        }
        finally{
            cerrarConexion(conexion);
        }
    };
    
    
    public static String generarFactura(Factura factura, Persona personaFactura){
        //primero ver si la persona existe
        Persona personaConsulta = consultarPersona(personaFactura.getCedula());
        if(personaConsulta == null){
            //Funcion que se encarga de crear una persona en base de datos
            crearPersona(personaFactura);
        }
            //Creamos una factura donde le asociamos el numero de cedula que tenemos en la parte de  arriba    
            return crearFactura(factura, personaFactura.getCedula());
    }
    
}
