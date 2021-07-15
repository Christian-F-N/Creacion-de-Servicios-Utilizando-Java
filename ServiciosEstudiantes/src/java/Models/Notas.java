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
public class Notas {
    String ID_NOTA,ID_PARCIAL,ID_DOCENTE,ID_ESTUD;
    Double NOTA;

    public Notas() {
    }

    public Notas(String ID_NOTA, String ID_PARCIAL, String ID_DOCENTE, String ID_ESTUD, Double NOTA) {
        this.ID_NOTA = ID_NOTA;
        this.ID_PARCIAL = ID_PARCIAL;
        this.ID_DOCENTE = ID_DOCENTE;
        this.ID_ESTUD = ID_ESTUD;
        this.NOTA = NOTA;
    }

    public String getID_NOTA() {
        return ID_NOTA;
    }

    public void setID_NOTA(String ID_NOTA) {
        this.ID_NOTA = ID_NOTA;
    }

    public String getID_PARCIAL() {
        return ID_PARCIAL;
    }

    public void setID_PARCIAL(String ID_PARCIAL) {
        this.ID_PARCIAL = ID_PARCIAL;
    }

    public String getID_DOCENTE() {
        return ID_DOCENTE;
    }

    public void setID_DOCENTE(String ID_DOCENTE) {
        this.ID_DOCENTE = ID_DOCENTE;
    }

    public String getID_ESTUD() {
        return ID_ESTUD;
    }

    public void setID_ESTUD(String ID_ESTUD) {
        this.ID_ESTUD = ID_ESTUD;
    }

    public Double getNOTA() {
        return NOTA;
    }

    public void setNOTA(Double NOTA) {
        this.NOTA = NOTA;
    }
    
}
