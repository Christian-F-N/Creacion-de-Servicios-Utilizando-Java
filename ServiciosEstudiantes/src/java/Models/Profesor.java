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
public class Profesor {
     String ID_PRO, ID_CUENTA, NOMBRE, APELLIDO;

    public Profesor() {
    }

    public Profesor(String ID_PRO, String ID_CUENTA, String NOMBRE, String APELLIDO) {
        this.ID_PRO = ID_PRO;
        this.ID_CUENTA = ID_CUENTA;
        this.NOMBRE = NOMBRE;
        this.APELLIDO = APELLIDO;
    }

    public String getID_PRO() {
        return ID_PRO;
    }

    public void setID_PRO(String ID_PRO) {
        this.ID_PRO = ID_PRO;
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
