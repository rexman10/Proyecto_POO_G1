/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alex_
 */
public class Mascota {
    private String nombre;
    private String tipoMascota;
    private String raza;
    private String fechaNacimiento;
    private String urlFoto;
    private Dueño dueño;
    private String codigo;

    public Mascota(String nombre, String tipoMascota, String raza, String fechaNacimiento, String urlFoto, Dueño dueño) {
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.urlFoto = urlFoto;
        this.dueño = dueño;
        short x  = (short) (100*Math.random()+1);
        codigo = tipoMascota + x + "-" + raza.substring(0,3);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public String getRaza() {
        return raza;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public String getCodigo() {
        return codigo;
    }
    
    
}
