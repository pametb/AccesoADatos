/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos;
//
//import java.sql.Connection;

import accesoadatos.modelo.Alumno;
import accesoadatos.modelo.AlumnoData;
import accesoadatos.modelo.Conexion;
import java.time.LocalDate;

//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.logging.Level;
//import java.util.logging.Logger;


/**
 *
 * @author programador
 */
public class AccesoAdatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /*    
        try {
            String url="jdbc:mysql://localhost/prueba";
            String usuario="root";
            String password="";
            
            Class.forName("org.mariadb.jdbc.Driver");
            
            try {
                Connection con= DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC" 
                        + "&user=" + usuario + "&password=" + password);
                
                
                PreparedStatement ps=con.prepareStatement("INSERT INTO Alumno(nombre,fecNac,activo) VALUES (?,?,?);");
                
                ps.setString(1,"Sosa Juan");
                
                LocalDate nac=LocalDate.of(2018,Month.MARCH,10);
                ps.setDate(2,Date.valueOf(nac));
                
                ps.setBoolean(3,true);
                int filas=ps.executeUpdate();
            System.out.println("Filas agregadas "+filas);

                
                
                
                
            } catch (SQLException ex) {
                Logger.getLogger(AccesoAdatos.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoAdatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   */     
    }
  

  Conexion conexion= new Conexion();
    
  AlumnoData alumnosData = new AlumnoData (conexion);
  
  Alumno alumno1 = new Alumno("Loéz Karina", LocalDate.of(1976,01,20),true);
  
  alumnoData.guardarAlumno(alumno1);
  
  for (Alumno it: alumnoData.ObtenerAlumnos()){
      System.out.println("Id: "+it.getId());
      System.out.println("Nombre: "+it.getNombre());
      
   }
  
  System.out.println("El id del alumno es: "+alumno1.getId());
  
  alumnoData.obtenerAlumnos().forEach{ alumno->(System.out.println("Nombre: "+alumno.getNombre()));
  });
  
}catch (Exception e){
System.out.println("Error al intanciar la clase conexion: "+e.getMessage());

}
