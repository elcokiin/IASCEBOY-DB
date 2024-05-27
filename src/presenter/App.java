package presenter;
import model.*;
import db.*;

// .jar de Oracle
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;

import db.net.ConnectionDB;

public class App {
    public static void main(String[] args) {
        try {
            // Establecer conexión con la base de datos
            Connection connection = ConnectionDB.getConnection();

            // Crear una instancia de la clase Person con los datos deseados
            Personas person = new Personas(15, 5433, 1, 1, 1, "Samir Molinares", "1234567", "juanperez@gmail.com",
                    "Calle 123");

            Insertions.insertPerson(connection, person);

           ConnectionDB.close(connection);
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error en la sintaxis de la consulta SQL. Por favor, verifica tu consulta.");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println(
                    "Error de restricción de integridad. Puede que estés intentando insertar un duplicado o violando una restricción.");
                    e.printStackTrace();
        } catch (SQLTimeoutException e) {
            System.out.println("La operación ha tardado demasiado en completarse. Inténtalo de nuevo más tarde.");
        } catch (SQLTransientConnectionException e) {
            System.out.println("Problema transitorio de conexión. Inténtalo de nuevo más tarde.");
        } catch (SQLException e) {
            System.out.println("Ocurrió un error con la base de datos. Por favor, contacta al administrador.");
            e.printStackTrace(); // También puedes registrar el error para análisis posterior
        }
    }
}