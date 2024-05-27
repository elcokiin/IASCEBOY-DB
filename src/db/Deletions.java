package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;
import java.util.Arrays;
import java.util.List;

import db.net.ConnectionDB;

public class Deletions {
    public void deleteRecord(int id, String nombreTabla) throws SQLException {
        // Lista de tablas permitidas
        List<String> validTables = Arrays.asList("tipos_adicional", "tipos_cliente", "tipos_afiliado",
                "tipos_documento");

        if (!validTables.contains(nombreTabla)) {
            throw new IllegalArgumentException("Tabla no válida: " + nombreTabla);
        }

        String sql = "DELETE FROM " + nombreTabla + " WHERE id = ?";

        try (Connection conn = ConnectionDB.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Constraint violation: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.err.println("Syntax error in SQL query: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.err.println("Query timeout: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.err.println("Temporary connection issue: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
            throw e; // Re-throw to indicate failure to caller
        }
    }

}
