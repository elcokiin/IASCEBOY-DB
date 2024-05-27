package presenter;

import model.*;
import db.*;
import db.net.ConnectionDB;

// .jar de Oracle
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run() {
        try {

            // Establecer conexión con la base de datos
            Connection connection = ConnectionDB.getConnection();

            this.insertions(connection);
            // Deletions delete = new Deletions();
            // delete.deleteRecord(1, "cargos", "id_cargo");
            

            ConnectionDB.close(connection);

        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error en la sintaxis de la consulta SQL. Por favor, verifica tu consulta.");
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println(
                    "Error de restricción de integridad. Puede que estés intentando insertar un duplicado o violando una restricción.");
        } catch (SQLTimeoutException e) {
            System.out.println("La operación ha tardado demasiado en completarse. Inténtalo de nuevo más tarde.");
        } catch (SQLTransientConnectionException e) {
            System.out.println("Problema transitorio de conexión. Inténtalo de nuevo más tarde.");
        } catch (SQLException e) {
            System.out.println("Ocurrió un error con la base de datos. Por favor, contacta al administrador.");
            e.printStackTrace();
        }
    }   

    public void insertions(Connection connection) throws SQLException {
        // // Creación de instancias para insertar en la tabla tipos_adicional
        // TiposAdicional tipoAdicional1 = new TiposAdicional(1, "Servicio de limpieza");
        // Insertions.insertTipoAdicional(connection, tipoAdicional1);

        // TiposAdicional tipoAdicional2 = new TiposAdicional(2, "Desayuno incluido");
        // Insertions.insertTipoAdicional(connection, tipoAdicional2);

        // // Creación de instancias para insertar en la tabla tipos_cliente
        // TiposCliente tipoCliente1 = new TiposCliente(1, "Cliente frecuente");
        // Insertions.insertTipoCliente(connection, tipoCliente1);

        // TiposCliente tipoCliente2 = new TiposCliente(2, "Cliente ocasional");
        // Insertions.insertTipoCliente(connection, tipoCliente2);

        // // Creación de instancias para insertar en la tabla tipos_afiliado
        // TiposAfiliado tipoAfiliado1 = new TiposAfiliado(1, "Afiliado Oro");
        // Insertions.insertTipoAfiliado(connection, tipoAfiliado1);

        // TiposAfiliado tipoAfiliado2 = new TiposAfiliado(2, "Afiliado Plata");
        // Insertions.insertTipoAfiliado(connection, tipoAfiliado2);

        // // Creación de instancias para insertar en la tabla tipos_documento
        // TiposDocumento tipoDocumento1 = new TiposDocumento(1, "Cedula de ciudadanía");
        // Insertions.insertTipoDocumento(connection, tipoDocumento1);

        // TiposDocumento tipoDocumento2 = new TiposDocumento(2, "Pasaporte");
        // Insertions.insertTipoDocumento(connection, tipoDocumento2);

        // // Creación de instancias para insertar en la tabla tipos_alojamiento
        // TiposAlojamiento tipoAlojamiento1 = new TiposAlojamiento(1, "Suite", 200);
        // Insertions.insertTipoAlojamiento(connection, tipoAlojamiento1);

        // TiposAlojamiento tipoAlojamiento2 = new TiposAlojamiento(2, "Habitación Estándar", 100);
        // Insertions.insertTipoAlojamiento(connection, tipoAlojamiento2);

        // // Creación de instancias para insertar en la tabla estados_reserva
        // EstadosReserva estadoReserva1 = new EstadosReserva(1, "Reservado");
        // Insertions.insertEstadoReserva(connection, estadoReserva1);

        // EstadosReserva estadoReserva2 = new EstadosReserva(2, "Cancelado");
        // Insertions.insertEstadoReserva(connection, estadoReserva2);

        // // Creación de instancias para insertar en la tabla cargos
        // Cargos cargo1 = new Cargos(1, "Gerente");
        // Insertions.insertCargo(connection, cargo1);

        // Cargos cargo2 = new Cargos(2, "Recepcionista");
        // Insertions.insertCargo(connection, cargo2);

        // Creación de instancias para insertar en la tabla personas
        Personas person1 = new Personas(135, 5433, 1, 1, 1, "Samir Molinares", "1234567", "juanperez@gmail.com",
                "Calle 123");
        Insertions.insertPerson(connection, person1);

        Personas person2 = new Personas(16, 6789, 2, 2, 2, "Maria González", "9876543", "mariagonzalez@gmail.com",
                "Avenida 456");
        Insertions.insertPerson(connection, person2);
    }
}