/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Serrperry
 */
public class Alumno {
    private int numExp;
    private Double notaMedia;
    private String ape12Nombre;
    private Date fechaNac;
    private SimpleDateFormat dateForm;
    public Alumno(int numExp, Double notaMedia,String ape12Nombre, Date fechaNac){
        this.dateForm = new SimpleDateFormat("dd/MM/yyyy");
        this.numExp = numExp;
        this.notaMedia = notaMedia;
        this.ape12Nombre = ape12Nombre;
        this.fechaNac = fechaNac;
    }

    public int getNumExp() {
        return numExp;
    }

    public void setNumExp(int numExp) {
        this.numExp = numExp;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getApe12Nombre() {
        return ape12Nombre;
    }

    public void setApe12Nombre(String ape12Nombre) {
        this.ape12Nombre = ape12Nombre;
    }

    public Date getFechaNacCompleto() {
        return fechaNac;
    }
    public Date getFechaNacDia() {
        return fechaNac;
    }
    public Date getFechaNacMes() {
        return fechaNac;
    }
    public Date getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
