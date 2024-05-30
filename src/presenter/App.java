package presenter;

import db.*;

import db.net.ConnectionDB;
import model.*;
import view.*;

// .jar de Oracle
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDateTime;

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
            int id = 0;

            if(option != 19) {
                view.print("Ingrese el id a consultar de la tabla seleccionada: ");
                id = view.readInt();
            } 

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
            int id = 0;

            if(option != 19) {
                view.print("Ingrese el id a eliminar de la tabla seleccionada: ");
                id = view.readInt();
            } 
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
            int id = 0;

            if(option != 19) {
                view.print("Ingrese el id a actualizar de la tabla seleccionada: ");
                id = view.readInt();
            } 
    
            switch (option) {
                case 1: // tipos_adicional
                    TiposAdicional tipoAdicional = read.readTipoAdicional(id);
                    if (tipoAdicional != null) {
                        view.print("Nombre actual: " + tipoAdicional.getNombreTipoAdicional());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            tipoAdicional.setNombreTipoAdicional(nombreNuevo);
                        update.updateTipoAdicional(tipoAdicional);
                    }
                    break;
    
                case 2: // tipos_cliente
                    TiposCliente tipoCliente = read.readTipoCliente(id);
                    if (tipoCliente != null) {
                        view.print("Nombre actual: " + tipoCliente.getNombreTipoAfiliado());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            tipoCliente.setNombreTipoAfiliado(nombreNuevo);
                        update.updateTipoCliente(tipoCliente);
                    }
                    break;
    
                case 3: // tipos_afiliado
                    TiposAfiliado tipoAfiliado = read.readTipoAfiliado(id);
                    if (tipoAfiliado != null) {
                        view.print("Nombre actual: " + tipoAfiliado.getNombreTipoAfiliado());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            tipoAfiliado.setNombreTipoAfiliado(nombreNuevo);
                        update.updateTipoAfiliado(tipoAfiliado);
                    }
                    break;
    
                case 4: // tipos_documento
                    TiposDocumento tipoDocumento = read.readTipoDocumento(id);
                    if (tipoDocumento != null) {
                        view.print("Nombre actual: " + tipoDocumento.getNombreTipoDocumento());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            tipoDocumento.setNombreTipoDocumento(nombreNuevo);
                        update.updateTipoDocumento(tipoDocumento);
                    }
                    break;
    
                case 5: // tipos_alojamiento
                    TiposAlojamiento tipoAlojamiento = read.readTipoAlojamiento(id);
                    if (tipoAlojamiento != null) {
                        view.print("Nombre actual: " + tipoAlojamiento.getNombreTipoAlojamiento());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            tipoAlojamiento.setNombreTipoAlojamiento(nombreNuevo);
                        
                        view.print("Valor actual: " + tipoAlojamiento.getValorTipoAlojamiento());
                        view.print("Ingrese nuevo valor (o presione Enter para mantener el actual): ");
                        String valorNuevo = view.readString();
                        if (!valorNuevo.isEmpty())
                            tipoAlojamiento.setValorTipoAlojamiento(Float.parseFloat(valorNuevo));
                        
                        update.updateTipoAlojamiento(tipoAlojamiento);
                    }
                    break;
    
                case 6: // estados_reserva
                    EstadosReserva estadoReserva = read.readEstadoReserva(id);
                    if (estadoReserva != null) {
                        view.print("Nombre actual: " + estadoReserva.getNombreEstadoReserva());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            estadoReserva.setNombreEstadoReserva(nombreNuevo);
                        update.updateEstadoReserva(estadoReserva);
                    }
                    break;
    
                case 7: // cargos
                    Cargos cargo = read.readCargo(id);
                    if (cargo != null) {
                        view.print("Nombre actual: " + cargo.getNombreCargo());
                        view.print("Ingrese nuevo nombre (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            cargo.setNombreCargo(nombreNuevo);
                        update.updateCargo(cargo);
                    }
                    break;
    
                case 8: // temporadas
                    Temporadas temporada = read.readTemporada(id);
                    if (temporada != null) {
                        view.print("Porcentaje actual: " + temporada.getPorcentajeAplicadoPorTemporada());
                        view.print("Ingrese nuevo porcentaje (o presione Enter para mantener el actual): ");
                        String porcentajeNuevo = view.readString();
                        if (!porcentajeNuevo.isEmpty())
                            temporada.setPorcentajeAplicadoPorTemporada(Float.parseFloat(porcentajeNuevo));
                        
                        view.print("Tipo actual: " + temporada.getTipoTemporada());
                        view.print("Ingrese nuevo tipo (o presione Enter para mantener el actual): ");                        String tipoNuevo = view.readString();
                        if (!tipoNuevo.isEmpty())
                            temporada.setTipoTemporada(tipoNuevo);
                                                view.print("Fecha inicio actual: " + temporada.getFechaInicioTemporada());
                        view.print("Ingrese nueva fecha inicio (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                            view.print("Fecha fin actual: " + temporada.getFechaFinTemporada());
                        view.print("Ingrese nueva fecha fin (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaFinNueva = view.readString();
                        if (!fechaFinNueva.isEmpty())
                            temporada.setFechaFinTemporada(Date.valueOf(fechaFinNueva));
                        
                        update.updateTemporada(temporada);
                    }
                    break;
    
                case 9: // alojamientos
                    Alojamientos alojamiento = read.readAlojamiento(id);
                    if (alojamiento != null) {
                        view.print("Descripción actual: " + alojamiento.getDescripcionAlojamiento());
                        view.print("Ingrese nueva descripción (o presione Enter para mantener la actual): ");
                        String descripcionNueva = view.readString();
                        if (!descripcionNueva.isEmpty())
                            alojamiento.setDescripcionAlojamiento(descripcionNueva);
                        
                        update.updateAlojamiento(alojamiento);
                    }
                    break;
    
                case 10: // adicionales
                    Adicionales adicional = read.readAdicional(id);
                    if (adicional != null) {
                        view.print("Descripción actual: " + adicional.getDescripcionAdicional());
                        view.print("Ingrese nueva descripción (o presione Enter para mantener la actual): ");
                        String descripcionNueva = view.readString();
                        if (!descripcionNueva.isEmpty())
                            adicional.setDescripcionAdicional(descripcionNueva);
                        
                        view.print("Valor actual: " + adicional.getValorAdicional());
                        view.print("Ingrese nuevo valor (o presione Enter para mantener el actual): ");
                        String valorNuevo = view.readString();
                        if (!valorNuevo.isEmpty())
                            adicional.setValorAdicional(Float.parseFloat(valorNuevo));
                        
                        update.updateAdicional(adicional);
                    }
                    break;
    
                case 11: // personas
                    Personas persona = read.readPersona(id);
                    if (persona != null) {
                        view.print("Nombre completo actual: " + persona.getNombreCompletoPersona());
                        view.print("Ingrese nuevo nombre completo (o presione Enter para mantener el actual): ");
                        String nombreNuevo = view.readString();
                        if (!nombreNuevo.isEmpty())
                            persona.setNombreCompletoPersona(nombreNuevo);
    
                        view.print("Teléfono actual: " + persona.getTelefonoPersona());
                        view.print("Ingrese nuevo teléfono (o presione Enter para mantener el actual): ");
                        String telefonoNuevo = view.readString();
                        if (!telefonoNuevo.isEmpty())
                            persona.setTelefonoPersona(telefonoNuevo);
    
                        view.print("Correo electrónico actual: " + persona.getCorreoElectronicoPersona());
                        view.print("Ingrese nuevo correo electrónico (o presione Enter para mantener el actual): ");
                        String correoNuevo = view.readString();
                        if (!correoNuevo.isEmpty())
                            persona.setCorreoElectronicoPersona(correoNuevo);
    
                        view.print("Dirección actual: " + persona.getDireccionPersona());
                        view.print("Ingrese nueva dirección (o presione Enter para mantener la actual): ");
                        String direccionNueva = view.readString();
                        if (!direccionNueva.isEmpty())
                            persona.setDireccionPersona(direccionNueva);
                        
                        update.updatePersona(persona);
                    }
                    break;
    
                case 12: // cargos_personas
                    CargosPersonas cargoPersona = read.readCargoPersona(id);
                    if (cargoPersona != null) {
                        view.print("Fecha inicio actual: " + cargoPersona.getFechaInicioCargo());
                        view.print("Ingrese nueva fecha inicio (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaInicioNueva = view.readString();
                        if (!fechaInicioNueva.isEmpty())
                            cargoPersona.setFechaInicioCargo(Date.valueOf(fechaInicioNueva));
    
                        view.print("Fecha fin actual: " + cargoPersona.getFechaFinCargo());
                        view.print("Ingrese nueva fecha fin (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaFinNueva = view.readString();
                        if (!fechaFinNueva.isEmpty())
                            cargoPersona.setFechaFinCargo(Date.valueOf(fechaFinNueva));
                        
                        update.updateCargoPersona(cargoPersona);
                    }
                    break;
    
                case 13: // pasadias
                    Pasadias pasadia = read.readPasadia(id);
                    if (pasadia != null) {
                        view.print("Fecha hora ingreso actual: " + pasadia.getFechaHoraIngreso());
                        view.print("Ingrese nueva fecha hora ingreso (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaHoraIngresoNueva = view.readString();
                        if (!fechaHoraIngresoNueva.isEmpty())
                            pasadia.setFechaHoraIngreso(LocalDateTime.parse(fechaHoraIngresoNueva));
                        
                        view.print("Fecha hora salida actual: " + pasadia.getFechaHoraSalida());
                        view.print("Ingrese nueva fecha hora salida (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaHoraSalidaNueva = view.readString();
                        if (!fechaHoraSalidaNueva.isEmpty())
                            pasadia.setFechaHoraSalida(LocalDateTime.parse(fechaHoraSalidaNueva));
                        
                        update.updatePasadia(pasadia);
                    }
                    break;
    
                case 14: // reservas
                    Reservas reserva = read.readReserva(id);
                    if (reserva != null) {
                        view.print("Fecha reserva actual: " + reserva.getFechaReserva());
                        view.print("Ingrese nueva fecha reserva (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaReservaNueva = view.readString();
                        if (!fechaReservaNueva.isEmpty())
                            reserva.setFechaReserva(Date.valueOf(fechaReservaNueva));
    
                        view.print("Fecha ingreso actual: " + reserva.getFechaIngresoReserva());
                        view.print("Ingrese nueva fecha ingreso (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaIngresoNueva = view.readString();
                        if (!fechaIngresoNueva.isEmpty())
                            reserva.setFechaIngReserva(Date.valueOf(fechaIngresoNueva));
    
                        view.print("Fecha salida actual: " + reserva.getFechaSalidaReserva());
                        view.print("Ingrese nueva fecha salida (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaSalidaNueva = view.readString();
                        if (!fechaSalidaNueva.isEmpty())
                            reserva.setFechaFinReserva(Date.valueOf(fechaSalidaNueva));
                        
                        view.print("Valor total actual: " + reserva.getValorTotalReserva());
                        view.print("Ingrese nuevo valor total (o presione Enter para mantener el actual): ");
                        String valorTotalNuevo = view.readString();
                        if (!valorTotalNuevo.isEmpty())
                            reserva.setValorTotalReserva(Float.parseFloat(valorTotalNuevo));
                        
                        update.updateReserva(reserva);
                    }
                    break;
    
                case 15: // estados_reservacion
                    EstadosReservacion estadoReservacion = read.readEstadoReservacion(id);
                    if (estadoReservacion != null) {
                        view.print("Fecha hora inicio actual: " + estadoReservacion.getFechaHoraInicioEstadoReserva());
                        view.print("Ingrese nueva fecha hora inicio (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaHoraInicioNueva = view.readString();
                        if (!fechaHoraInicioNueva.isEmpty())
                            estadoReservacion.setFechaHIEstadoReserva(LocalDateTime.parse(fechaHoraInicioNueva));
    
                        view.print("Fecha hora fin actual: " + estadoReservacion.getFechaHoraFinEstadoReserva());
                        view.print("Ingrese nueva fecha hora fin (YYYY-MM-DD HH:MM:SS) (o presione Enter para mantener la actual): ");
                        String fechaHoraFinNueva = view.readString();
                        if (!fechaHoraFinNueva.isEmpty())
                            estadoReservacion.setFechaHFEstadoReserva(LocalDateTime.parse(fechaHoraFinNueva));
                        
                        update.updateEstadoReservacion(estadoReservacion);
                    }
                    break;
    
                case 16: // reservaciones_alojamientos
                    ReservacionesAlojamiento reservacionAlojamiento = read.readReservacionAlojamiento(id);
                    if (reservacionAlojamiento != null) {
                        view.print("Fecha ingreso actual: " + reservacionAlojamiento.getFechaIngresoReservaAlojamiento());
                        view.print("Ingrese nueva fecha ingreso (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaIngresoNueva = view.readString();
                        if (!fechaIngresoNueva.isEmpty())
                            reservacionAlojamiento.setFechaIngresoReservaAlojamiento(Date.valueOf(fechaIngresoNueva));
    
                        view.print("Fecha salida actual: " + reservacionAlojamiento.getFechaSalidaReservaAlojamiento());
                        view.print("Ingrese nueva fecha salida (YYYY-MM-DD) (o presione Enter para mantener la actual): ");
                        String fechaSalidaNueva = view.readString();
                        if (!fechaSalidaNueva.isEmpty())
                            reservacionAlojamiento.setFechaSalidaReservaAlojamiento(Date.valueOf(fechaSalidaNueva));
                        
                        view.print("Valor reserva actual: " + reservacionAlojamiento.getValorReservaAlojamiento());
                        view.print("Ingrese nuevo valor reserva (o presione Enter para mantener el actual): ");
                        String valorNuevo = view.readString();
                        if (!valorNuevo.isEmpty())
                            reservacionAlojamiento.setValorReservaAlojamiento(Float.parseFloat(valorNuevo));
                        
                        update.updateReservacionAlojamiento(reservacionAlojamiento);
                    }
                    break;
    
                case 17: // recibos
                    Recibos recibo = read.readRecibo(id);
                    if (recibo != null) {
                        view.print("Descripción actual: " + recibo.getDescripcionRecibo());
                        view.print("Ingrese nueva descripción (o presione Enter para mantener la actual): ");
                        String descripcionNueva = view.readString();
                        if (!descripcionNueva.isEmpty())
                            recibo.setDescripcionRecibo(descripcionNueva);
    
                        view.print("Valor actual: " + recibo.getValorRecibo());
                        view.print("Ingrese nuevo valor (o presione Enter para mantener el actual): ");
                        String valorNuevo = view.readString();
                        if (!valorNuevo.isEmpty())
                            recibo.setValorRecibo(Float.parseFloat(valorNuevo));
    
                        update.updateRecibo(recibo);
                    }
                    break;
    
                case 18: // adicionales_recibos
                    AdicionalesRecibos adicionalRecibo = read.readAdicionalRecibo(id);
                    if (adicionalRecibo != null) {
                        view.print("Cantidad actual: " + adicionalRecibo.getCantidadAdicional());
                        view.print("Ingrese nueva cantidad (o presione Enter para mantener la actual): ");
                        String cantidadNueva = view.readString();
                        if (!cantidadNueva.isEmpty())
                            adicionalRecibo.setCantidadAdicional(Integer.parseInt(cantidadNueva));
                        
                        update.updateAdicionalRecibo(adicionalRecibo);
                    }
                    break;
    
                case 19:
                    view.print("Regresando al menú principal");
                    break;
            }
        }
    }
}