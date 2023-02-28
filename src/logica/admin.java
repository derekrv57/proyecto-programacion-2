/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.archivo;
import datos.usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author derek
 */
public class admin {

    public admin() {
        usuario usu = new usuario();
        if (!usu.existe("admin")) {
            JOptionPane.showMessageDialog(null, "Usuario: admin\nContraseña: Admin*");
            usu.registrar(null, "admin", "Admin*", "admin@localhost", "Administrador", "N/A", false);
        }
        setAdmin("admin", true);
    }
    
    public void setAdmin(String usuario, boolean admin){
        archivo arch = new archivo(new config().getDir() + "/" + "usuarios/" + usuario);
        String[] usu = arch.leer();
        if (admin) {
            usu[3] = "trabajador=true";
        }
        else{
            usu[3] = "usuario";
        }
        String data = "";
        for (int i = 0; i < usu.length-1; i++) {
            data += usu[i] + "\n";
        }
        data += usu[usu.length-1];
        arch.escribir(data);
    }
    
    public boolean isAdmin(String usuario){
        return new archivo(new config().getDir() + "/" + "usuarios/" + usuario).leer()[3].equals("trabajador=true");
    }
}
