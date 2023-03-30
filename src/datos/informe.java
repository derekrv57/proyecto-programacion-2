/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import logica.config;

/**
 *
 * @author derek
 */
public class informe {
    private String dir = new config().getDir() + "/informe";
    
    String parqueoAlquilado, parqueoDevolver;
    String tipo;
    String horaAlquiler;
    String horaDevolver;
    long total;

    public informe() {
    }

    public informe(String parqueoAlquilado, String parqueoDevolver, String tipo, String horaAlquiler, long total) {
        this.parqueoAlquilado = parqueoAlquilado;
        this.parqueoDevolver = parqueoDevolver;
        this.tipo = tipo;
        this.horaAlquiler = horaAlquiler;
        this.total = total;
    }

    public String getDir() {
        return dir;
    }

    public String getParqueoAlquilado() {
        return parqueoAlquilado;
    }

    public String getParqueoDevolver() {
        return parqueoDevolver;
    }

    public String getTipo() {
        return tipo;
    }

    public String getHoraAlquiler() {
        return horaAlquiler;
    }

    public String getHoraDevolver() {
        return horaDevolver;
    }

    public long getTotal() {
        return total;
    }

    
    public informe[] getInforme(){
        String[] f = new archivo(dir).leer();
        int l = f.length;
        informe[] inf = new informe[l/5];
        int c = 0;
        for (int i = 0; i < l/5; i++) {
            inf[i] = new informe(f[c], f[c+1], f[c+2], f[c+3], Long.parseLong(f[c+4]));
            c+=5;
        }
        return inf;
    }
    
    public boolean generar(){
        System.out.println("Leyendo datos");
        String cnt = "";
        try {
            String[] f = new archivo(dir).leer();
            for (int i = 0; i < f.length; i++) {
                cnt += f[i] + "\n";
            }
            System.out.println("Generando informe");
        } catch (Exception e) {
            System.err.println("Generando informe");
        }
        try {
            cnt += parqueoAlquilado + "\n";
            cnt += parqueoDevolver + "\n";
            cnt += tipo + "\n";
            cnt += horaAlquiler + "\n";
            cnt += String.valueOf(total);
            new archivo(dir).escribir(cnt);
            System.out.println("Informe generado\n\n" + cnt);
            return true;
        } catch (Exception e) {
            System.err.println("Error al generar informe \n" + e);
            return false;
        }
    }
}

