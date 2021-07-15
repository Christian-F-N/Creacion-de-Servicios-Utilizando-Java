/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Funciones implements CONTROLADOR {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();

    @Override
    public String login(String ID_USER, String PASS_CUENTA) {
        try {
            //1 Conectarme a la BD.
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            //2 Crear la sentencia SQL.
            String sql = "";
            sql = "SELECT * FROM USUARIOS WHERE ID_USER='" + ID_USER + "'AND PASS_CUENTA='" + PASS_CUENTA + "'";
            //3 Preparar la sentencia SQL.
            Statement ps = cn.createStatement();
            ResultSet rs = ps.executeQuery(sql);

            //4 Ejecutar la sentencia SQL.
            if (rs.next()) {

                String sql2 = "";
                sql = "SELECT * FROM USUARIOS WHERE ID_USER='" + ID_USER + "'AND TIPO_USER='" + 1 + "'";
                //3 Preparar la sentencia SQL.
                Statement ps1 = cn.createStatement();
                ResultSet rs2 = ps1.executeQuery(sql);

                //4 Ejecutar la sentencia SQL.
                if (rs2.next()) {
                    return "PROFESOR";
                } else {
                    return "ESTUDIANTE";
                }
            } else {
                return "CLAVE O USUARIO INCORRECTO";
            }

        } catch (Exception e) {
        }
        return "NO CONECTADO";
    }

    @Override
    public List<Notas> listarNotas() {
        List<Notas> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from notas";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Notas t1 = new Notas();
                t1.setID_NOTA(rs.getString("ID_NOTA"));
                t1.setID_PARCIAL(rs.getString("ID_PARCIAL"));
                t1.setID_DOCENTE(rs.getString("ID_DOCENTE"));
                t1.setID_ESTUD(rs.getString("ID_ESTUD"));
                t1.setNOTA(rs.getDouble("NOTA"));
                datos.add(t1);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    @Override
    public String ingNota(String ID_NOTA, String ID_PARCIAL, String ID_DOCENTE, String ID_ESTUD, Double NOTA) {
        try {
            //1 Conectarme a la BD.
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            //2 Crear la sentencia SQL.
            String sql = "";
            sql = "INSERT INTO NOTAS VALUES (?,?,?,?,?)";
            //3 Preparar la sentencia SQL.
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, ID_NOTA);
            ps.setString(2, ID_PARCIAL);
            ps.setString(3, ID_DOCENTE);
            ps.setString(4, ID_ESTUD);
            ps.setDouble(5, NOTA);

            //4 Ejecutar la sentencia SQL.
            ps.executeUpdate();
            return "NOTA INSERTADA";
        } catch (Exception e) {
        }
        return "VERIFIQUE LOS DATOS";
    }

    @Override
    public List<Notas> filtrarNotas(String ID_PARCIAL,String ID_ESTUD) {
        List<Notas> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from notas where ID_ESTUD='" + ID_ESTUD + "'AND ID_PARCIAL='"+ID_PARCIAL+"'";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Notas t1 = new Notas();
                t1.setID_NOTA(rs.getString("ID_NOTA"));
                t1.setID_PARCIAL(rs.getString("ID_PARCIAL"));
                t1.setID_DOCENTE(rs.getString("ID_DOCENTE"));
                t1.setID_ESTUD(rs.getString("ID_ESTUD"));
                t1.setNOTA(rs.getDouble("NOTA"));
                datos.add(t1);
            }
        } catch (Exception e) {
        }
        return datos;
    }

    @Override
    public List<Esrudiantes> obtEstudiante(String ID_CUENTA) {
        List<Esrudiantes> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from estudiantes where ID_CUENTA='" + ID_CUENTA + "'";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Esrudiantes t1 = new Esrudiantes();
                t1.setID_ESTUD(rs.getString("ID_ESTUD"));
                t1.setID_CUENTA(rs.getString("ID_CUENTA"));
                t1.setNOMBRE(rs.getString("NOBRE"));
                t1.setAPELLIDO(rs.getString("APELLIDO"));
                t1.setPROMEDIO1(rs.getDouble("PROMEDIO"));
                t1.setPROMEDIO2(rs.getDouble("PROMEDIO2"));

                datos.add(t1);
            }
        } catch (Exception e) {

        }
        return datos;
    }

    @Override
    public List<Profesor> listarprof() {
        List<Profesor> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from profesor";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profesor t1 = new Profesor();
                t1.setID_PRO(rs.getString("ID_PRO"));
                t1.setID_CUENTA(rs.getString("ID_CUENTA"));
                t1.setNOMBRE(rs.getString("NOMBRE"));
                t1.setAPELLIDO(rs.getString("APELLIDO"));

                datos.add(t1);
            }
        } catch (Exception e) {

        }
        return datos;
    }

    @Override
    public List<Esrudiantes> obtEstudiante() {
     List<Esrudiantes> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from estudiantes";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Esrudiantes t1 = new Esrudiantes();
                t1.setID_ESTUD(rs.getString("ID_ESTUD"));
                t1.setID_CUENTA(rs.getString("ID_CUENTA"));
                t1.setNOMBRE(rs.getString("NOBRE"));
                t1.setAPELLIDO(rs.getString("APELLIDO"));
                t1.setPROMEDIO1(rs.getDouble("PROMEDIO"));
                t1.setPROMEDIO2(rs.getDouble("PROMEDIO2"));

                datos.add(t1);
            }
        } catch (Exception e) {

        }
        return datos;
    }

    @Override
    public List<Profesor> obtProfesor(String ID_CUENTA) {
   List<Profesor> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from profesor where ID_CUENTA='" + ID_CUENTA + "'";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profesor t1 = new Profesor();
                t1.setID_PRO(rs.getString("ID_PRO"));
                t1.setID_CUENTA(rs.getString("ID_CUENTA"));
                t1.setNOMBRE(rs.getString("NOMBRE"));
                t1.setAPELLIDO(rs.getString("APELLIDO"));
              
                datos.add(t1);
            }
        } catch (Exception e) {

        }
        return datos;  }

    @Override
    public List<Esrudiantes> obtenerParcial(String ID_USER) {
       List<Esrudiantes> datos = new ArrayList<>();
        //2 Crear la sentencia SQL.
        String sql = "select * from estudiantes where ID_CUENTA='" + ID_USER + "'";
        try {
            con = conex.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Esrudiantes t1 = new Esrudiantes();
                t1.setID_ESTUD(rs.getString("ID_ESTUD"));
                t1.setID_CUENTA(rs.getString("ID_CUENTA"));
                t1.setNOMBRE(rs.getString("NOBRE"));
                t1.setAPELLIDO(rs.getString("APELLIDO"));
                t1.setPROMEDIO1(rs.getDouble("PROMEDIO"));
                t1.setPROMEDIO2(rs.getDouble("PROMEDIO2"));

                datos.add(t1);
            }
        } catch (Exception e) {

        }
        return datos;  }

    @Override
    public void actualzarProm(Double prom1, Double prom2,String ID_CUENTA) {
       try {
            //1 Conectarme a la BD.
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            //2 Crear la sentencia SQL.
            String sql = "";
            sql = "UPDATE ESTUDIANTES SET PROMEDIO='"+prom1+"', PROMEDIO2='"+prom2+"' WHERE ID_CUENTA='"+ID_CUENTA+"'";
            //3 Preparar la sentencia SQL.
            PreparedStatement ps = cn.prepareStatement(sql);
            //4 Ejecutar la sentencia SQL.
            ps.executeUpdate();   
        } catch (Exception e) {
        }
        
    } 
}
