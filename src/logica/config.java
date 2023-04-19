/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.archivo;
import java.io.File;

/**
 *
 * @author derek
 */
public class config {
    double precioHora;
    public String moneda;
    String dir = ".ProyectoBicicletas";
    String[] subdirs = {"usuarios", "bicicletas", "parqueos"};

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
        f = new File(dir + "/config");
        if (!f.exists()) {
            new archivo(dir + "/config").escribir("₡\n2500");
        }
        String[] a = new archivo(dir + "/config").leer();
        moneda = a[0];
        precioHora = Double.parseDouble(a[1]);
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
  
    public void guardar(){
        new archivo(dir + "/config").escribir(moneda + "\n" + String.valueOf(precioHora));
    }
    
    
}
