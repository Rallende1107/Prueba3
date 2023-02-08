/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

/**
 *
 * @author renea
 */
public class ControlErrores {

    public ControlErrores() {
    }

 
        public static boolean RutVacio(String rut) {
        boolean largoRut = false;
        if (rut.isEmpty()){
            largoRut = false;
        }
        else{
            largoRut = true;
        }
        
        
        return largoRut;
    }
    
    
    public static boolean validarLargoRut(String rut) {
        boolean largoRut = false;
        if (rut.length()>18){
            largoRut = false;
        }
        else{
            largoRut = true;
        }
        
        
        return largoRut;
    }
    
    public static boolean validarRut(String rut) {

        boolean validaRut = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validaRut = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validaRut;
    }

    public static boolean largoNombre(String nombre) {
        // String nom =nombre;
        boolean respuesta = false;

        if (nombre.length() >= 60) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public static boolean largoApellidoP(String apellidoP) {
        // String ap =apellidoP;
        boolean respuesta = false;

        if (apellidoP.length() >= 60) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public static boolean largoApellidoM(String apellidoM) {
        // String ap =apellidoP;
        boolean respuesta = false;

        if (apellidoM.length() >= 60) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public static boolean largoTelefono(String telefono) {
        //String fono=String.valueOf(telefono);//Now it will return "10"  
        boolean respuesta = false;

        if (telefono.length() > 9) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;
    }

    public static boolean validaLargoMinino(String nombre, String apellidoP, String apellidoM, String telefono) {

        boolean respuesta = false;

        if (telefono.length() <= 2 || nombre.length() <= 2 || apellidoP.length() <= 2 || apellidoM.length() <= 2) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;

    }

    public static boolean valBox(String combobox) {
        String cbox = combobox;
        boolean respuesta = false;

        if (cbox.equals("Seleccione..")) {
            respuesta = false;
        } else {
            respuesta = true;
        }
        return respuesta;

    }
   
    

    

}
