/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author HP
 */
public class Esrudiantes {
     String ID_ESTUD,ID_CUENTA,NOMBRE,APELLIDO;
   double PROMEDIO1,PROMEDIO2; 

    public Esrudiantes() {
    }

    public Esrudiantes(String ID_ESTUD, String ID_CUENTA, String NOMBRE, String APELLIDO, double PROMEDIO1,double PROMEDIO2) {
        this.ID_ESTUD = ID_ESTUD;
        this.ID_CUENTA = ID_CUENTA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
        this.PROMEDIO1 = PROMEDIO1;
         this.PROMEDIO2 = PROMEDIO2;
    }

    public double getPROMEDIO1() {
        return PROMEDIO1;
    }

    public void setPROMEDIO1(double PROMEDIO1) {
        this.PROMEDIO1 = PROMEDIO1;
    }

    public double getPROMEDIO2() {
        return PROMEDIO2;
    }

    public void setPROMEDIO2(double PROMEDIO2) {
        this.PROMEDIO2 = PROMEDIO2;
    }

    public String getID_ESTUD() {
        return ID_ESTUD;
    }

    public void setID_ESTUD(String ID_ESTUD) {
        this.ID_ESTUD = ID_ESTUD;
    }

    public String getID_CUENTA() {
        return ID_CUENTA;
    }

    public void setID_CUENTA(String ID_CUENTA) {
        this.ID_CUENTA = ID_CUENTA;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO() {
        return APELLIDO;
    }

    public void setAPELLIDO(String APELLIDO) {
        this.APELLIDO = APELLIDO;
    }


   
}
