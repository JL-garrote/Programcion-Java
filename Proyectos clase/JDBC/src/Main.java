import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Scanner keyboard = new Scanner(System.in);

        String nombre;
        String apellido;
        int edad;
        int nota;

        nombre = keyboard.next();
        apellido = keyboard.next();
        edad = keyboard.nextInt();
        nota = keyboard.nextInt();

        String URL = "jdbc:mysql://localhost:3306/programacion";
        String USER = "root";
        String PASS = "admin";

        Connection conn = null;
        Statement state = null;

        String consulta = "INSERT INTO alumnos (id, nombre, apellidos,edad,nota) VALUES (2,\"" + nombre +"\"," + apellido + "\"," + edad + "," + nota;

        conn = DriverManager.getConnection(URL,USER,PASS);
        state = conn.createStatement();
        int f = state.executeUpdate(consulta);


    }
}