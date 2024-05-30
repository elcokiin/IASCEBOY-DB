package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;

public class Deletions {

    Connection connection;

    // contructor
    public Deletions(Connection connection) {
        this.connection = connection;
    }

    public void deleteRecord(int id, String nombreTabla, String nombreId) {

        String sql = "DELETE FROM " + nombreTabla + " WHERE " + nombreId + " = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error de Constraint: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.err.println("Syntax error en SQL query: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.err.println("Tiempo de espera exedido: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.err.println("Error de tiempo de conexion: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

}
