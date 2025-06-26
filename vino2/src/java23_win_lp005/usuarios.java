/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java23_win_lp005;

/**
 *
 * @author frber
 */
import java.io.Serializable;
public class usuarios implements Serializable{
      private String id;
     private String nombre;
     private String clave;
    

    public usuarios(String id, String nombre, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

   
    public String getClave() {
        return clave;
    }

  

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setClave(String clave) {
        this.clave = clave;
    }

   
}
