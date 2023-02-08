/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Empleados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renea
 */
public class EmpleadoDAO {
    
    
    public boolean insertar(Empleados empleado){
    
        boolean resultado = false;
        String query = "INSERT INTO EMPLEADOS (RUT, NOMBRES, APELLIDO_PATERNO,"
                + "APELLIDO_MATERNO, TELEFONO, TIPO_EMPLEO) VALUES (?,?,?,?,?,?)";
        
        try{
            PreparedStatement  ps = Conexion.getConnection().prepareStatement(query);
            
            int i = 1;
            ps.setString(i++, empleado.getRut());
            ps.setString(i++, empleado.getNombres());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setString(i++, empleado.getTelefono());
            ps.setString(i++, empleado.getTipoEmpleado());

            
            ps.execute();
            
            resultado = true;
        }catch(SQLException ex ){
        
            ex.printStackTrace();
        }
        
        return resultado;
    }
    
 
    public boolean actualizar(Empleados empleado){
    
        boolean resultado = false;
        String query = "UPDATE EMPLEADOS SET NOMBRES = ?, APELLIDO_PATERNO = ?, APELLIDO_MATERNO = ?,TELEFONO = ?,TIPO_EMPLEO = ? WHERE RUT = ?";

        try{
            PreparedStatement  ps = Conexion.getConnection().prepareStatement(query);
            
            int i = 1;
            ps.setString(i++, empleado.getNombres());
            ps.setString(i++, empleado.getApellidoPaterno());
            ps.setString(i++, empleado.getApellidoMaterno());
            ps.setString(i++, empleado.getTelefono());
            ps.setString(i++, empleado.getTipoEmpleado());
            ps.setString(i++, empleado.getRut());
            ps.execute();
            resultado = true;
        }catch(SQLException ex ){
        
            ex.printStackTrace();
        }        
        
        return resultado;
    }
    

    public boolean borrar(String rut){
    
        boolean resultado = false;
        
        String query = "DELETE FROM EMPLEADOS WHERE RUT = ?";
    
        try{
        
            PreparedStatement  ps = Conexion.getConnection().prepareStatement(query);
            int i = 1;
            ps.setString(i++, rut);
            
            ps.execute();
            resultado = true;
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }

        return resultado;
    }
    
    public List<Empleados> listar(){
    
        List<Empleados> empleados = new ArrayList<>();
        
        String query = "SELECT RUT, NOMBRES, APELLIDO_PATERNO, APELLIDO_MATERNO, TELEFONO ,TIPO_EMPLEO FROM EMPLEADOS";

        try{
        
            PreparedStatement  ps = Conexion.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                //Crear objeto paciente
                Empleados emp = new Empleados();
                emp.setRut(rs.getString("RUT"));
                emp.setNombres(rs.getString("NOMBRES"));
                emp.setApellidoPaterno(rs.getString("APELLIDO_PATERNO"));
                emp.setApellidoMaterno(rs.getString("APELLIDO_MATERNO"));
                emp.setTelefono(rs.getString("TELEFONO"));
                emp.setTipoEmpleado(rs.getString("TIPO_EMPLEO"));
                empleados.add(emp);
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        
        return empleados;
    }
    
    public Empleados buscarPorRut(String rut){
    
        Empleados pac = null;
        
        String query = "SELECT rut,nombres, apellido_paterno, apellido_materno, TELEFONO, tipo_empleo FROM  empleados WHERE RUT = ?";  
        
        try{
        
            PreparedStatement  ps = Conexion.getConnection().prepareStatement(query);
            
            int i = 1;
            ps.setString(i++, rut);
                        
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
            
                //Crear objeto paciente
                pac = new Empleados();
                pac.setRut(rs.getString("RUT"));
                pac.setNombres(rs.getString("NOMBRES"));
                pac.setApellidoPaterno(rs.getString("APELLIDO_PATERNO"));
                pac.setApellidoMaterno(rs.getString("APELLIDO_MATERNO"));
                pac.setTelefono(rs.getString("TELEFONO"));
                pac.setTipoEmpleado(rs.getString("TIPO_EMPLEO"));
;             
            }
            
        }catch(Exception ex){
        
            ex.printStackTrace();
        }
        
        return pac;
    }
    
}
