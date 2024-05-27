package presenter;
import model.*;

// .jar de Oracle
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;

public class App {

    // jdbc: driver de oracle. 172.19.80.1: ip del servidor. 1521: puerto de la base
    // de datos. ORCL: nombre de la base de datos
    private static final String DB_URL = "jdbc:oracle:thin:@172.19.80.1:1521:ORCL";
    private static final String DB_USER = "adminiasceboy";
    private static final String DB_PASSWORD = "a123";

    public static void main(String[] args) {
        try {
            // Establecer conexión con la base de datos
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Crear una instancia de la clase Person con los datos deseados
            Personas person = new Personas(55, 5432, 1, 1, 1, "Camilo Arias", "1234567", "juanperez@gmail.com",
                    "Calle 123");

            // Llamar al método para insertar la persona en la base de datos
            insertPerson(connection, person);

            // Cerrar la conexión con la base de datos
            connection.close();
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

    public static void insertPerson(Connection connection, Personas person) throws SQLException {
        String sql = "INSERT INTO PERSONAS (ID_PERSONA, NOMBRE_COMPLETO_PERSONA, NUMERO_DOCUMENTO_PERSONA, ID_TIPO_DOCUMENTO, " +
                "ID_TIPO_CLIENTE, ID_TIPO_AFILIADO, TELEFONO_PERSONA, CORREO_ELECTRONICO_PERSONA, DIRECCION_PERSONA) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, person.getIdPersona());
            statement.setString(2, person.getNombreCompletoPersona());
            statement.setString(3, String.valueOf(person.getNumeroDocumentoPersona()));
            statement.setInt(4, person.getIdTipoDocumento());
            statement.setInt(5, person.getIdTipoCliente());
            statement.setInt(6, person.getIdTipoAfiliado());
            statement.setString(7, person.getTelefonoPersona());
            statement.setString(8, person.getCorreoElectronicoPersona());
            statement.setString(9, person.getDireccionPersona());

            statement.executeUpdate();
        }
    }
}