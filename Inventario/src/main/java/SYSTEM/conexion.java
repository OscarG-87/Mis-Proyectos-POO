/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SYSTEM;
import java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.SQLException;  



/**
 *
 * @author Oscar
 */
public class conexion {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String DB = "inventario?serverTimezone=UTC";
    private  String user ="root" ;
    private  String password ="root";
    protected Connection conn = null;
    private Boolean conectado = false;

    public Boolean getConectado() {
        return conectado;
    }
    
    public Connection obtenerconexion(){
        return conn;
    
    }
    

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    public void iniciarconect (){
        try{
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL+DB,getUser(),getPassword());
            if (conn !=null){
                System.out.println("Conectado exitosamente");
                conectado = true;
            }
            
        }catch(Exception error){
            System.out.println("error de conexión"+error);
            conectado = false;
        
        }
        
    
    }
    
    
    
  
  
   
}
