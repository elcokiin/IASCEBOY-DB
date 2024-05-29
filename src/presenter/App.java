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
                    updateMenu();
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
        int option = 0;

        while (option != 19) {
            menu.read();
            view.print("Ingrese el número de la tabla a consultar: ");
            option = menu.getOption(1, 19);

            view.print("Ingrese el id a consultar de la tabla seleccionada: ");
            int id = view.readInt();

            switch (option) {
                case 1:
                    read.readTipoAdicional(id).showInfo();
                    break;
                case 2:
                    read.readTipoCliente(id).showInfo();
                    break;
                case 3:
                    read.readTipoAfiliado(id).showInfo();
                    break;
                case 4:
                    read.readTipoDocumento(id).showInfo();
                    break;
                case 5:
                    read.readTipoAlojamiento(id).showInfo();
                    break;
                case 6:
                    read.readEstadoReserva(id).showInfo();
                    break;
                case 7:
                    read.readCargo(id).showInfo();
                    break;
                case 8:
                    read.readTemporada(id).showInfo();
                    break;
                case 9:
                    read.readAlojamiento(id).showInfo();
                    break;
                case 10:
                    read.readAdicional(id).showInfo();
                    break;
                case 11:
                    read.readPersona(id).showInfo();
                    break;
                case 12:
                    read.readCargoPersona(id).showInfo();
                    break;
                case 13:
                    read.readPasadia(id).showInfo();
                    break;
                case 14:
                    read.readReserva(id).showInfo();
                    break;
                case 15:
                    read.readEstadoReservacion(id).showInfo();
                    break;
                case 16:
                    read.readReservacionAlojamiento(id).showInfo();
                    break;
                case 17:
                    read.readRecibo(id).showInfo();
                    break;
                case 18:
                    read.readAdicionalRecibo(id).showInfo();
                    break;
                case 19:
                    view.print("Regresando al menú principal");
                    break;
            }
        }
    }

    private void insertMenu() {
        // Esta clase contiene los inputs para cada una de las insersiones
        InputTables it = new InputTables(view);

        int option = 0;

        while (option != 19) {
            menu.insert();
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
        int option = 0;
        while (option != 19) {
            menu.delete();
            option = menu.getOption(1, 19);
            view.print("Ingrese el id a eliminar de la tabla seleccionada: ");
            int id = view.readInt();
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
    }

    private void updateMenu() {
        int option = 0;
        while (option != 19) {
            menu.update();
            option = menu.getOption(1, 19);
            view.print("Ingrese el id a actualizar de la tabla seleccionada: ");
            int id = view.readInt();

            // Pide por consola el id a actualizar y realiza una consulta para obtener
            // valores actuales
            switch (option) {
                case 1: // tipos_adicional
                    TiposAdicional tipoAdicional = read.readTipoAdicional(id);

                    if (tipoAdicional != null) {
                        view.print("Nombre actual: " + tipoAdicional.getNombreTipoAdicional());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (nombreNuevo.isEmpty())
                            nombreNuevo = tipoAdicional.getNombreTipoAdicional();
                        else 
                            tipoAdicional.setNombreTipoAdicional(nombreNuevo);
                        update.updateTipoAdicional(tipoAdicional);
                    }
                break;

                case 19: 
                    view.print("Regresando al menú principal");
                    break;
            }
        }
    }
}