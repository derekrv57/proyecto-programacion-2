/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import interfaz.usuario.fDevolver;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import logica.config;

/**
 *
 * @author derek
 */
public class bicicleta {
    int id;
    String parqueo;
    boolean disponible = true;
    String tipo;
    String hora;
    String usuario;

    public bicicleta(int id, String parqueo, boolean disponible, String tipo) {
        this.id = id;
        this.parqueo = parqueo;
        this.disponible = disponible;
        this.tipo = tipo;
    }

    public bicicleta(String f) {
        try {
            String[] config = new archivo(f).leer();
            id = Integer.parseInt(f.replace(new config().getDir() + "/" + "bicicletas/", ""));
            parqueo = config[0];
            tipo = config[1];
            disponible = config[2].equals("") || config[2] == null;
            if (!disponible) {
                hora = config[2];
                usuario = config[3];
            }
        } catch (Exception e) {
        }
    }

    public int getId() {
        return id;
    }

    public String getParqueo() {
        return parqueo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHora() {
        return hora;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public boolean alquilar(usuario usu){
        if (disponible) {
            hora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
            disponible = false;
            this.usuario = usu.getUsuario();
            new archivo(new config().getDir() + "/" + "bicicletas/" + id).escribir(parqueo + "\n" + tipo + "\n" + hora + "\n" + usuario);
        }
        return !disponible;
    }
    
    public boolean devolver(){
        if (!disponible) {
            disponible = true;
            new archivo(new config().getDir() + "/" + "bicicletas/" + id).escribir(parqueo + "\n" + tipo);
        }
        return disponible;
    }
}