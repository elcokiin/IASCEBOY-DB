package db.net;

// .jar de Oracle
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String URL = "jdbc:oracle:thin:@172.19.80.1:1521:ORCL";
    private static final String USER = "adminiasceboy";
    private static final String PASSWORD = "a123";

    // constructor
    public ConnectionDB() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // close connection
    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
