/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.File;
import logica.config;


public class parqueo {
    String nombre;
    int espacios;

    public parqueo(String nombre, int espacios) {
        this.nombre = nombre;
        this.espacios = espacios;
    }

    public parqueo(String f) {
        try {
            String[] config = new archivo(f).leer();
            this.nombre = f.replace(new config().getDir() + "/" + "parqueos/", "");
            setEspacios(Integer.parseInt(config[0]));
        } catch (Exception e) {
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEspacios() {
        return espacios;
    }

    public void setEspacios(int espacios) {
        if (espacios < 3) {
            espacios = 3;
        }
        if (espacios > 5) {
            espacios = 5;
        }
        this.espacios = espacios;
    }
    
    public void guardar(){
        new archivo(new config().getDir() + "/" + "parqueos/" + nombre).escribir(String.valueOf(espacios));
    }
    
    public void eliminar(){
        try {
            File f = new File(new config().getDir() + "/" + "parqueos/" + nombre);
            f.delete();
        } catch (Exception e) {
        }
    }
}
