package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Personas;

public class Insertions {

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
