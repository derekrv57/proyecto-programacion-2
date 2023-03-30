/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.File;

/**
 *
 * @author derek
 */
public class config {
    double precioHora = 2500;
    public String moneda = "₡";
    String dir = ".ProyectoBicicletas";
    String[] subdirs = {"usuarios", "bicicletas"};

    public config() {
        File f = new File(dir);
        if (!f.exists()) {
           f.mkdir();
        }
        for (int i = 0; i < subdirs.length; i++) {
            f = new File(dir+"/"+subdirs[i]);
            if (!f.exists()) {
                f.mkdir();
            }
        }
    }

    public String getDir() {
        return dir;
    }

    public String[] getSubdirs() {
        return subdirs;
    }

    public double getPrecioHora() {
        return precioHora;
    }
  
    
    
}
