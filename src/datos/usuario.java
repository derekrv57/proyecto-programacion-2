/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.awt.Component;
import java.io.File;
import javax.swing.JOptionPane;
import logica.admin;
import logica.config;

/**
 *
 * @author derek
 */
public class usuario {

    private String usuario, correo, nombre, direccion;
    private boolean trabajador;

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean isTrabajador() {
        return trabajador;
    }
    
    
    
    public boolean registrar(Component p, String usuario, String contra, String correo, String nombre, String direccion, boolean actualizar) {
        boolean valido = true;
        if (!existe(usuario) || actualizar) {
            if (contra.length() >= 6 && contra.length() <= 10) {
                boolean caracter = false;
                String[] caracteres = {"!", "#", "$", "%", "&", "/", ",", ".", "*", "-", "+"};
                for (int i = 0; i < caracteres.length; i++) {
                    if (contra.contains(caracteres[i])) {
                        caracter = true;
                    }
                }
                if (caracter) {
                    if (!contra.toLowerCase().equals(contra)) {
                        contra = new contra().encriptar(contra);
                        new archivo(new config().getDir() + "/" + "usuarios/" + usuario).escribir(contra + "\n" + correo + "\n" + nombre + "\nusuario\n" + direccion);
                        if (actualizar) {
                            JOptionPane.showMessageDialog(p, "Usuario actualizado");
                        }
                        else{
                            JOptionPane.showMessageDialog(p, "Usuario creado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(p, "La contraseña debe contener euna mayuscula");
                        valido = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(p, "Debe contener un carcter especial");
                    valido = false;
                }
            } else {
                JOptionPane.showMessageDialog(p, "La contraseña debe contener entre 6 y 10 caracteres");
                valido = false;
            }
        } else {
            JOptionPane.showMessageDialog(p, "El usuario ya existe");
            valido = false;
        }
        return valido;
    }
    
    public boolean existe(String usuario) {
        return new File(new config().getDir() + "/" + "usuarios/" + usuario).exists();
    }
    
    public boolean login(Component c, String usuario, String contra){
        if (existe(usuario)) {
            contra = new contra().encriptar(contra);
            String[] dataUsuario = new archivo(new config().getDir() + "/" + "usuarios/" + usuario).leer();
            if (dataUsuario[0].equals(contra)) {
                this.usuario = usuario;
                this.correo = dataUsuario[1];
                this.nombre = dataUsuario[2];
                this.trabajador = dataUsuario[3].equals("trabajador=true");
                this.direccion = "";
                for (int i = 4; i < dataUsuario.length - 1; i++) {
                    this.direccion += dataUsuario[i] + "\n";
                }
                this.direccion += dataUsuario[dataUsuario.length- 1 ];
                return true;
            }
            else{
                JOptionPane.showMessageDialog(c, "Contraseña incorrecta");
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(c, "Usuario no existente");
            return false;
        }
    }
    
    public boolean eliminar(String usuario){
        try {
            File f = new File(new config().getDir() + "/" + "usuarios/" + usuario);
            f.delete();
            new admin();
            return !f.exists();
        } catch (Exception e) {
            return false;
        }
    }
}
