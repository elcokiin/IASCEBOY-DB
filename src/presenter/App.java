package presenter;

import db.*;
import db.net.ConnectionDB;
import model.*;
import view.*;

// .jar de Oracle
import java.sql.Connection;
import java.sql.SQLException;

public class App {

    // Todo sobre la vista
    private View view;
    private Menus menu;

    // crud
    private Insertions insert;
    private Deletions delete;
    private Read read;
    private Updates update;

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
            view.print("conexion con la base de datos establecida");

            insert = new Insertions(connection);
            delete = new Deletions(connection);
            read = new Read(connection);
            update = new Updates(connection);

            this.principalMenu();

            ConnectionDB.close(connection);

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    private void principalMenu() {
        int option = 0;

        while (option != 5) {
            menu.principal();
            option = menu.getOption(1, 5);
            switch (option) {
                case 1:
                    insertMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    // updateMenu();
                    break;
                case 4:
                    readMenu();
                    break;
                case 5:
                    view.print("Saliendo...");
                    break;
            }
        }
    }

    private void readMenu() {
        menu.read();
        int option = menu.getOption(1, 19);
        view.print("Ingrese el id a consultar de la tabla seleccionada: ");
        int id = view.readInt();

        // pide por consola el id a consultar y llama al metodo de consulta de la clase
        // Read
        switch (option) {
            case 1:
                read.readTipoAdicional(id);
                break;
            case 2:
                read.readTipoCliente(id);
                break;
            case 3:
                read.readTipoAfiliado(id);
                break;
            case 4:
                read.readTipoDocumento(id);
                break;
            case 5:
                read.readTipoAlojamiento(id);
                break;
            case 6:
                read.readEstadoReserva(id);
                break;
            case 7:
                read.readCargo(id);
                break;
            case 8:
                read.readTemporada(id);
                break;
            case 9:
                read.readAlojamiento(id);
                break;
            case 10:
                read.readAdicional(id);
                break;
            case 11:
                read.readPersona(id);
                break;
            case 12:
                read.readCargoPersona(id);
                break;
            case 13:
                read.readPasadia(id);
                break;
            case 14:
                read.readReserva(id);
                break;
            case 15:
                read.readEstadoReservacion(id);
                break;
            case 16:
                read.readReservacionAlojamiento(id);
                break;
            case 17:
                read.readRecibo(id);
                break;
            case 18:
                read.readAdicionalRecibo(id);
                break;
            case 19:
                view.print("Regresando al menú principal");
                break;
        }
    }

    private void insertMenu() {
        menu.insert();
        // Esta clase contiene los inputs para cada una de las insersiones
        InputTables it = new InputTables(view);

        int option = 0;

        while (option != 19) {
            option = menu.getOption(1, 19);
            switch (option) {
                // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento,
                // tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos,
                // adicionales, personas, cargos_personas, pasadias, reservas,
                // estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
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
                    view.print("Regresando al menú principal");
                    break;
            }
        }
    }

    private void deleteMenu() {
        menu.delete();
        int option = menu.getOption(1, 19);
        view.print("Ingrese el id a eliminar de la tabla seleccionada: ");
        int id = view.readInt();

        // pide por consola el id a eliminar y llama al metodo de eliminacion de la
        // clase Delete use de method deleteRecord
        switch (option) {
            case 1:
                delete.deleteRecord(id, "tipos_adicional", "id_tipo_adicional");
                break;
            case 2:
                delete.deleteRecord(id, "tipos_cliente", "id_tipo_cliente");
                break;
            case 3:
                delete.deleteRecord(id, "tipos_afiliado", "id_tipo_afiliado");
                break;
            case 4:
                delete.deleteRecord(id, "tipos_documento", "id_tipo_documento");
                break;
            case 5:
                delete.deleteRecord(id, "tipos_alojamiento", "id_tipo_alojamiento");
                break;
            case 6:
                delete.deleteRecord(id, "estados_reserva", "id_estado_reserva");
                break;
            case 7:
                delete.deleteRecord(id, "cargos", "id_cargo");
                break;
            case 8:
                delete.deleteRecord(id, "temporadas", "id_temporada");
                break;
            case 9:
                delete.deleteRecord(id, "alojamientos", "id_alojamiento");
                break;
            case 10:
                delete.deleteRecord(id, "adicionales", "id_adicional");
                break;
            case 11:
                delete.deleteRecord(id, "personas", "id_persona");
                break;
            case 12:
                delete.deleteRecord(id, "cargos_personas", "id_cargo_persona");
                break;
            case 13:
                delete.deleteRecord(id, "pasadias", "id_pasadia");
                break;
            case 14:
                delete.deleteRecord(id, "reservas", "id_reserva");
                break;
            case 15:
                delete.deleteRecord(id, "estados_reservacion", "id_estado_reservacion");
                break;
            case 16:
                delete.deleteRecord(id, "reservaciones_alojamientos", "id_reservacion_alojamiento");
                break;
            case 17:
                delete.deleteRecord(id, "recibos", "id_recibo");
                break;
            case 18:
                delete.deleteRecord(id, "adicionales_resibos", "id_adicional_recibo");
                break;
            case 19:
                view.print("Regresando al menú principal");
                break;
        }
    }

   /* private void updateMenu() {
        menu.update();
        int option = menu.getOption(1, 19);
        view.print("Ingrese el id a actualizar de la tabla seleccionada: ");
        int id = view.readInt();

        // Variables para almacenar los valores actuales del registro
        String nombreActual, descripcionActual;
        int valorActual;

        // Pide por consola el id a actualizar y realiza una consulta para obtener los
        // valores actuales
        switch (option) {
            case 1: // tipos_adicional
                TiposAdicional tipoAdicional = read.readTipoAdicional(id);
                if (tipoAdicional != null) {
                    nombreActual = tipoAdicional.getNombreTipoAdicional();
                    view.print("Nombre actual: " + nombreActual);
                    view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreActual;

                    // Llamada al método update para actualizar los valores
                    update.updateTipoAdicional(id, nombreNuevo);
                }
                break;

            case 2: // tipos_cliente
                TiposCliente tipoCliente = read.readTipoCliente(id);
                if (tipoCliente != null) {
                    nombreActual = tipoCliente.getNombreTipoCliente();
                    view.print("Nombre actual: " + nombreActual);
                    view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreActual;

                    // Llamada al método update para actualizar los valores
                    update.updateTipoCliente(id, nombreNuevo);
                }
                break;

            // Repetir para las demás tablas
            case 3: // tipos_afiliado
                TiposAfiliado tipoAfiliado = read.readTipoAfiliado(id);
                if (tipoAfiliado != null) {
                    nombreActual = tipoAfiliado.getNombreTipoAfiliado();
                    view.print("Nombre actual: " + nombreActual);
                    view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreActual;

                    update.updateTipoAfiliado(id, nombreNuevo);
                }
                break;
            case 4: // tipos_documento
                TiposDocumento tipoDocumento = read.readTipoDocumento(id);
                if (tipoDocumento != null) {
                    nombreActual = tipoDocumento.getNombreTipoDocumento();
                    view.print("Nombre actual: " + nombreActual);
                    view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreActual;

                    update.updateTipoDocumento(id, nombreNuevo);
                }
                break;

            // Repetir este bloque de código para todas las demás tablas (tipos_alojamiento,
            // estados_reserva, cargos, temporadas, alojamientos, adicionales, personas,
            // cargos_personas, pasadias, reservas, estados_reservacion,
            // reservaciones_alojamientos, recibos, adicionales_resibos)

            case 5: // tipos_alojamiento
                TiposAlojamiento tipoAlojamiento = read.readTipoAlojamiento(id);
                if (tipoAlojamiento != null) {
                    nombreActual = tipoAlojamiento.getNombreTipoAlojamiento();
                    valorActual = tipoAlojamiento.getValorTipoAlojamiento();
                    view.print("Nombre actual: " + nombreActual);
                    view.print("Valor actual: " + valorActual);
                    view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreActual;

                    view.print("Ingrese nuevo valor (o presione Enter para mantener el actual): ");
                    String valorNuevoStr = view.readString();
                    int valorNuevo = valorNuevoStr.isEmpty() ? valorActual : Integer.parseInt(valorNuevoStr);

                    update.updateTipoAlojamiento(id, nombreNuevo, valorNuevo);
                }
                break;

            // Caso especial para la tabla personas
            case 11: // personas
                Personas persona = read.readPersona(id);
                if (persona != null) {
                    String nombreCompletoActual = persona.getNombreCompletoPersona();
                    int numeroDocumentoActual = persona.getNumeroDocumentoPersona();
                    int idTipoDocumentoActual = persona.getIdTipoDocumento();
                    int idTipoClienteActual = persona.getIdTipoCliente();
                    int idTipoAfiliadoActual = persona.getIdTipoAfiliado();
                    String telefonoActual = persona.getTelefonoPersona();
                    String correoElectronicoActual = persona.getCorreoElectronicoPersona();
                    String direccionActual = persona.getDireccionPersona();

                    view.print("Nombre completo actual: " + nombreCompletoActual);
                    view.print("Número de documento actual: " + numeroDocumentoActual);
                    view.print("ID tipo documento actual: " + idTipoDocumentoActual);
                    view.print("ID tipo cliente actual: " + idTipoClienteActual);
                    view.print("ID tipo afiliado actual: " + idTipoAfiliadoActual);
                    view.print("Teléfono actual: " + telefonoActual);
                    view.print("Correo electrónico actual: " + correoElectronicoActual);
                    view.print("Dirección actual: " + direccionActual);

                    view.print("Ingrese nuevo nombre completo (o presione Enter para mantener el actual): ");
                    String nombreNuevo = view.readString();
                    if (nombreNuevo.isEmpty())
                        nombreNuevo = nombreCompletoActual;

                    view.print("Ingrese nuevo número de documento (o presione Enter para mantener el actual): ");
                    String documentoNuevoStr = view.readString();
                    int documentoNuevo = documentoNuevoStr.isEmpty() ? numeroDocumentoActual
                            : Integer.parseInt(documentoNuevoStr);

                    view.print("Ingrese nuevo ID tipo documento (o presione Enter para mantener el actual): ");
                    String idTipoDocumentoNuevoStr = view.readString();
                    int idTipoDocumentoNuevo = idTipoDocumentoNuevoStr.isEmpty() ? idTipoDocumentoActual
                            : Integer.parseInt(idTipoDocumentoNuevoStr);

                    view.print("Ingrese nuevo ID tipo cliente (o presione Enter para mantener el actual): ");
                    String idTipoClienteNuevoStr = view.readString();
                    int idTipoClienteNuevo = idTipoClienteNuevoStr.isEmpty() ? idTipoClienteActual
                            : Integer.parseInt(idTipoClienteNuevoStr);

                    view.print("Ingrese nuevo ID tipo afiliado (o presione Enter para mantener el actual): ");
                    String idTipoAfiliadoNuevoStr = view.readString();
                    int idTipoAfiliadoNuevo = idTipoAfiliadoNuevoStr.isEmpty() ? idTipoAfiliadoActual
                            : Integer.parseInt(idTipoAfiliadoNuevoStr);

                    view.print("Ingrese nuevo teléfono (o presione Enter para mantener el actual): ");
                    String telefonoNuevo = view.readString();
                    if (telefonoNuevo.isEmpty())
                        telefonoNuevo = telefonoActual;

                    view.print("Ingrese nuevo correo electrónico (o presione Enter para mantener el actual): ");
                    String correoNuevo = view.readString();
                    if (correoNuevo.isEmpty())
                        correoNuevo = correoElectronicoActual;

                    view.print("Ingrese nueva dirección (o presione Enter para mantener el actual): ");
                    String direccionNueva = view.readString();
                    if (direccionNueva.isEmpty())
                        direccionNueva = direccionActual;

                    update.updatePersona(id, nombreNuevo, documentoNuevo, idTipoDocumentoNuevo, idTipoClienteNuevo,
                            idTipoAfiliadoNuevo, telefonoNuevo, correoNuevo, direccionNueva);
                }
                break;

            // Otros casos para el resto de las tablas
            case 19:
                view.print("Regresando al menú principal");
                break;
        }
    }*/
}