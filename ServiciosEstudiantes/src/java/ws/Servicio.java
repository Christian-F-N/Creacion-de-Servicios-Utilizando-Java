/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import Models.Esrudiantes;
import Models.Funciones;
import Models.Notas;
import Models.Profesor;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    Funciones user = new Funciones();

    /**
     * This is a sample web service operation
     */
    public String Login(@WebParam(name = "id_user") String id_user, @WebParam(name = "pass_user") String pass_user) {
        return user.login(id_user, pass_user);
    }

    /**
     * Web service operation
     */
    public List<Notas> listarNotas() {
        List datos = user.listarNotas();
        return datos;
    }

    /**
     * Web service operation
     */
    public String addNota(String id_notar, String id_parcial, String id_docente, String id_estud, double nota) {

        return user.ingNota(id_notar, id_parcial, id_docente, id_estud, nota);
    }

    /**
     * Web service operation
     */
    public List<Notas> filtroNotas(String ID_PARCIAL,String is_estud) {
        List datos = user.filtrarNotas(ID_PARCIAL,is_estud);
        return datos;
    }

    /**
     * Web service operation
     */
    public List<Esrudiantes> Estudianteslist() {
        List datos = user.obtEstudiante();
        return datos;
    }

    /**
     * Web service operation
     */
    public List<Profesor> listaProfes() {
        List datos = user.listarprof();
        return datos;
    }

    /**
     * Web service operation
     */
    public List<Esrudiantes> obtEstudiante(String ID_CUNETA) {
       List datos = user.obtEstudiante(ID_CUNETA);
        return datos;
    }

    /**
     * Web service operation
     */
    public List<Profesor> filtrarProfe(String ID_CUENTA) {
        List datos = user.obtProfesor(ID_CUENTA);
        return datos;
    }

    /**
     * Web service operation
     */
    public List<Esrudiantes> notasP1P2(String ID_USER) {
        List datos = user.obtenerParcial(ID_USER);
        return datos;
    }

    /**
     * Web service operation
     */
    public void addProm(double prom1, double prom2, String ID_USER) {
        user.actualzarProm(prom1, prom2, ID_USER);
    }
    

}
