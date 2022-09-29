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
    public Alumno(int numExp, Double notaMedia,String ape12Nombre, Date fechaNac){
        SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/yyyy");
        this.numExp = numExp;
        this.notaMedia = notaMedia;
        this.ape12Nombre = ape12Nombre;
        this.fechaNac = fechaNac;
    }
}
