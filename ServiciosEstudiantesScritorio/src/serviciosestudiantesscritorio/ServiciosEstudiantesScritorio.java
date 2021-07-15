/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosestudiantesscritorio;

import java.util.List;
import ws.Esrudiantes;
import ws.Notas;

/**
 *
 * @author HP
 */
public class ServiciosEstudiantesScritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login log= new Login();
        log.setVisible(true);
//        Double aux = 0.0;
//        String usuario = "USER02";
//        List<Esrudiantes> c = obtEstudiante(usuario);
//        String b = (String.valueOf(c.get(0).getIDESTUD()));
//        List<Notas> p1 = filtroNotas("P1", b);
//        for (int i = 0; i < p1.size(); i++) {
//            Double a = (Double.valueOf(p1.get(i).getNOTA()));
//            aux += a;
//        }
//        int total = p1.size();
//        Double prom = aux / Double.valueOf(total);
//    }
//
//    private static java.util.List<ws.Notas> filtroNotas(java.lang.String arg0, java.lang.String arg1) {
//        ws.Servicio_Service service = new ws.Servicio_Service();
//        ws.Servicio port = service.getServicioPort();
//        return port.filtroNotas(arg0, arg1);
//    }
//
//    private static java.util.List<ws.Esrudiantes> obtEstudiante(java.lang.String arg0) {
//        ws.Servicio_Service service = new ws.Servicio_Service();
//        ws.Servicio port = service.getServicioPort();
//        return port.obtEstudiante(arg0);
}

}
