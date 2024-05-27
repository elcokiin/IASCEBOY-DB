package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Personas;

public class Modifications {
    public static void updatePerson(Connection connection, Personas person) throws SQLException {
        String sql = "UPDATE PERSONAS SET NOMBRE_COMPLETO_PERSONA = ?, NUMERO_DOCUMENTO_PERSONA = ?, ID_TIPO_DOCUMENTO = ?, " +
                "ID_TIPO_CLIENTE = ?, ID_TIPO_AFILIADO = ?, TELEFONO_PERSONA = ?, CORREO_ELECTRONICO_PERSONA = ?, DIRECCION_PERSONA = ? " +
                "WHERE ID_PERSONA = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, person.getNombreCompletoPersona());
            statement.setString(2, String.valueOf(person.getNumeroDocumentoPersona()));
            statement.setInt(3, person.getIdTipoDocumento());
            statement.setInt(4, person.getIdTipoCliente());
            statement.setInt(5, person.getIdTipoAfiliado());
            statement.setString(6, person.getTelefonoPersona());
            statement.setString(7, person.getCorreoElectronicoPersona());
            statement.setString(8, person.getDireccionPersona());
            statement.setInt(9, person.getIdPersona());

            statement.executeUpdate();
        }
    }
}
