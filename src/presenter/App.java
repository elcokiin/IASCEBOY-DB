package presenter;

import db.*;
import db.net.ConnectionDB;

import view.*;

// .jar de Oracle
import java.sql.Connection;
import java.sql.SQLException;

public class App {

    // Todo sobre la vista
    View view;
    Menus menu;

    // crud
    Insertions insert;

    // conexion a la base de datos
    Connection connection;

    public static void main(String[] args) {
        new App().run();
    }

    public App() {
        this.view = new View();
        this.menu = new Menus(view);
    }

    public void run() {
        try {

            // Establecer conexión con la base de datos
            connection = ConnectionDB.getConnection();

            insert = new Insertions(connection);

            principalMenu();            

            ConnectionDB.close(connection);

        } catch(SQLException e) {
            e.getStackTrace();
        }
    }

    public void principalMenu() {
        menu.principal();

        int option = menu.getOption(1, 5);

        switch (option) {
            case 1:
                insertMenu();
                break;
            case 2:
                // deleteMenu();
                break;
            case 3:
                // updateMenu();
                break;
            case 4:
                // consultMenu();
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
        }
    }

    public void insertMenu() {
        menu.insert();
        // Esta clase contiene los inputs para cada una de las insersiones
        InputTables it = new InputTables(view);

        int option = menu.getOption(1, 19);

        switch (option) {
        // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento, tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos, adicionales, personas, cargos_personas, pasadias, reservas, estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
            case 1:
                insert.tiposAdicional(it.tiposAdicional());
                break;
            case 2:
                insert.tiposCliente(it.tiposCliente());
                break;
            case 3:
                insert.tiposAfiliado(it.tiposAfiliado());
                break;
            case 4:
                insert.tiposDocumento(it.tiposDocumento());
                break;
            case 5:
                insert.tiposAlojamiento(it.tiposAlojamiento());
                break;
            case 6:
                insert.estadosReserva(it.estadosReserva());
                break;
            case 7:
                insert.cargos(it.cargos());
                break;
            case 8:
                insert.temporadas(it.temporadas());
                break;
            case 9:
                insert.alojamientos(it.alojamientos());
                break;
            case 10:
                insert.adicionales(it.adicionales());
                break;
            case 11:
                insert.personas(it.personas());
                break;
            case 12:
                insert.cargosPersonas(it.cargosPersonas());
                break;
            case 13:
                insert.pasadias(it.pasadias());
                break;
            case 14:
                insert.reservas(it.reservas());
                break;
            case 15:
                insert.estadosReservacion(it.estadosReservacion());
                break;
            case 16:
                insert.reservacionesAlojamientos(it.reservacionesAlojamiento());
                break;
            case 17:
                insert.recibos(it.recibos());
                break;
            case 18:
                insert.adicionalesRecibos(it.adicionalesRecibos());
                break;
            case 19:
                principalMenu();
                break;
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
        // Personas person1 = new Personas(135, 5433, 1, 1, 1, "Samir Molinares", "1234567", "juanperez@gmail.com",
        //         "Calle 123");
        // Insertions.insertPerson(connection, person1);

        // Personas person2 = new Personas(16, 6789, 2, 2, 2, "Maria González", "9876543", "mariagonzalez@gmail.com",
        //         "Avenida 456");
        // Insertions.insertPerson(connection, person2);
    }
}