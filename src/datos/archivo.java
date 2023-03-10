/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author derek
 */
public class archivo {

    File archivo;
    public archivo(String f){
        archivo = new File(f);
    }
    
    public String[] leer() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(archivo));
            LinkedList<String> line = new LinkedList<String>();
            while (br.ready()) {
                line.add(br.readLine());
            }
            return line.toArray(new String[0]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(archivo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void escribir(String str){
        try {
            FileWriter myWriter = new FileWriter(archivo);
            myWriter.write(str);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
