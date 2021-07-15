/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;

/**
 *
 * @author HP
 */
public interface CONTROLADOR {

    public String login(String ID_USER, String PASS_CUENTA);

    public List<Notas> listarNotas();

    public String ingNota(String ID_NOTA, String ID_PARCIAL, String ID_DOCENTE, String ID_ESTUD, Double NOTA);

    public List<Notas> filtrarNotas(String ID_PARCIAL, String ID_ESTUD);

    public List<Esrudiantes> obtenerParcial(String ID_USER);

    public List<Profesor> listarprof();

    public List<Profesor> obtProfesor(String ID_CUENTA);

    public List<Esrudiantes> obtEstudiante(String ID_CUENTA);

    public List<Esrudiantes> obtEstudiante();

    public void actualzarProm(Double prom1, Double prom2,String ID_CUENTA);

}
