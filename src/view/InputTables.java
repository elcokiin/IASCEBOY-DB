package view;

import model.*;

import java.sql.Timestamp;
import java.sql.Date;

public class InputTables {

    private View view;
    
    public InputTables(View view) {
        this.view = view;
    }

    public TiposAdicional tiposAdicional() {
        // pide por consula (input) el id y el nombre del tipo de adicional
        System.out.println("Ingrese el id del tipo de adicional: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del tipo de adicional: ");
        String nombre = view.readString();
        return new TiposAdicional(id, nombre);
    }

    public TiposCliente tiposCliente() {
        // pide por consula (input) el id y el nombre del tipo de cliente
        System.out.println("Ingrese el id del tipo de cliente: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del tipo de cliente: ");
        String nombre = view.readString();
        return new TiposCliente(id, nombre);
    }

    public TiposAfiliado tiposAfiliado() {
        // pide por consula (input) el id y el nombre del tipo de afiliado
        System.out.println("Ingrese el id del tipo de afiliado: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del tipo de afiliado: ");
        String nombre = view.readString();
        return new TiposAfiliado(id, nombre);
    }

    public TiposDocumento tiposDocumento() {
        // pide por consula (input) el id y el nombre del tipo de documento
        System.out.println("Ingrese el id del tipo de documento: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del tipo de documento: ");
        String nombre = view.readString();
        return new TiposDocumento(id, nombre);
    }

    public TiposAlojamiento tiposAlojamiento() {
        System.out.println("Ingrese el id del tipo de alojamiento: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del tipo de alojamiento: ");
        String nombre = view.readString();
        System.out.println("Ingrese el valor del tipo de alojamiento: ");
        float valor = view.readFloat();
        return new TiposAlojamiento(id, nombre, valor);
    }
    
    public EstadosReserva estadosReserva() {
        System.out.println("Ingrese el id del estado de reserva: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del estado de reserva: ");
        String nombre = view.readString();
        return new EstadosReserva(id, nombre);
    }
    
    public Cargos cargos() {
        System.out.println("Ingrese el id del cargo: ");
        int id = view.readInt();
        System.out.println("Ingrese el nombre del cargo: ");
        String nombre = view.readString();
        return new Cargos(id, nombre);
    }
    
    public Temporadas temporadas() {
        System.out.println("Ingrese el id de la temporada: ");
        int id = view.readInt();
        System.out.println("Ingrese el porcentaje aplicado por temporada: ");
        float porcentaje = view.readFloat();
        System.out.println("Ingrese el tipo de temporada BAJ(baja) o ALT(alta): ");
        String tipo = view.readString();
        System.out.println("Ingrese la fecha de inicio de la temporada (AAAA-MM-DD): ");
        Date fechaInicio = view.readDate();
        System.out.println("Ingrese la fecha de fin de la temporada (AAAA-MM-DD): ");
        Date fechaFin = view.readDate();
        return new Temporadas(id, porcentaje, tipo, fechaInicio, fechaFin);
    }

    public Alojamientos alojamientos() {
        System.out.println("Ingrese el id del alojamiento: ");
        int id = view.readInt();
        System.out.println("Ingrese el id del tipo de alojamiento: ");
        int idTipo = view.readInt();
        System.out.println("Ingrese la descripción del alojamiento: ");
        String descripcion = view.readString();
        return new Alojamientos(id, idTipo, descripcion);
    }
    
    public Adicionales adicionales() {
        System.out.println("Ingrese el id del adicional: ");
        int id = view.readInt();
        System.out.println("Ingrese el id del tipo de adicional: ");
        int idTipo = view.readInt();
        System.out.println("Ingrese la descripción del adicional: ");
        String descripcion = view.readString();
        System.out.println("Ingrese el valor del adicional: ");
        float valor = view.readFloat();
        return new Adicionales(id, idTipo, descripcion, valor);
    }
    
    public Personas personas() {
        System.out.println("Ingrese el id de la persona: ");
        int id = view.readInt();
        System.out.println("Ingrese el número de documento de la persona: ");
        int numeroDocumento = view.readInt();
        System.out.println("Ingrese el id del tipo de documento: ");
        int idTipoDocumento = view.readInt();
        System.out.println("Ingrese el id del tipo de cliente: ");
        int idTipoCliente = view.readInt();
        System.out.println("Ingrese el id del tipo de afiliado: ");
        int idTipoAfiliado = view.readInt();
        System.out.println("Ingrese el nombre completo de la persona: ");
        String nombreCompleto = view.readString();
        System.out.println("Ingrese el teléfono de la persona: ");
        String telefono = view.readString();
        System.out.println("Ingrese el correo electrónico de la persona: ");
        String correoElectronico = view.readString();
        System.out.println("Ingrese la dirección de la persona: ");
        String direccion = view.readString();
        return new Personas(id, numeroDocumento, idTipoDocumento, idTipoCliente, idTipoAfiliado, nombreCompleto, telefono, correoElectronico, direccion);
    }
    
    public CargosPersonas cargosPersonas() {
        System.out.println("Ingrese el id del cargo: ");
        int idCargo = view.readInt();
        System.out.println("Ingrese el id del empleado: ");
        int idEmpleado = view.readInt();
        System.out.println("Ingrese la fecha de inicio del cargo: ");
        Date fechaInicio = view.readDate();
        System.out.println("Ingrese la fecha de fin del cargo: ");
        Date fechaFin = view.readDate();
        return new CargosPersonas(idCargo, idEmpleado, fechaInicio, fechaFin);
    }

    public Pasadias pasadias() {
        System.out.println("Ingrese el id del pasadía: ");
        int id = view.readInt();
        System.out.println("Ingrese el id del cliente: ");
        int idCliente = view.readInt();
        System.out.println("Ingrese el id del empleado: ");
        int idEmpleado = view.readInt();

        Timestamp fechaHoraIngreso = null;
        Timestamp fechaHoraSalida = null;

        while (fechaHoraIngreso == null) {
            System.out.println("Ingrese la fecha y hora de ingreso (yyyy-mm-dd hh:mm:ss): ");
            String fechaHoraIngresoStr = view.readString();
            try {
                fechaHoraIngreso = Timestamp.valueOf(fechaHoraIngresoStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Formato de fecha y hora inválido. Intente nuevamente.");
            }
        }

        while (fechaHoraSalida == null) {
            System.out.println("Ingrese la fecha y hora de salida (yyyy-mm-dd hh:mm:ss): ");
            String fechaHoraSalidaStr = view.readString();
            try {
                fechaHoraSalida = Timestamp.valueOf(fechaHoraSalidaStr);
            } catch (IllegalArgumentException e) {
                System.out.println("Formato de fecha y hora inválido. Intente nuevamente.");
            }
        }

        return new Pasadias(id, idCliente, idEmpleado, fechaHoraIngreso, fechaHoraSalida);
    }

    public Reservas reservas() {
        System.out.println("Ingrese el id de la reserva: ");
        int id = view.readInt();
        System.out.println("Ingrese el id del cliente: ");
        int idCliente = view.readInt();
        System.out.println("Ingrese el id del empleado: ");
        int idEmpleado = view.readInt();
        System.out.println("Ingrese la fecha de la reserva: ");
        Date fechaReserva = view.readDate();
        System.out.println("Ingrese el valor total de la reserva: ");
        float valorTotal = view.readFloat();
        System.out.println("Ingrese la fecha y hora de ingreso de la reserva: ");
        Timestamp fechaIngreso = view.readTimestamp();
        System.out.println("Ingrese la fecha y hora de salida de la reserva: ");
        Timestamp fechaSalida = view.readTimestamp();
        return new Reservas(id, idCliente, idEmpleado, fechaReserva, valorTotal, fechaIngreso, fechaSalida);
    }
    
    public EstadosReservacion estadosReservacion() {
        System.out.println("Ingrese el id del estado de reserva: ");
        int idEstado = view.readInt();
        System.out.println("Ingrese el id de la reserva: ");
        int idReserva = view.readInt();
        System.out.println("Ingrese la fecha y hora de inicio del estado de reserva: ");
        Timestamp fechaHoraInicio = view.readTimestamp();
        System.out.println("Ingrese la fecha y hora de fin del estado de reserva: ");
        Timestamp fechaHoraFin = view.readTimestamp();
        return new EstadosReservacion(idEstado, idReserva, fechaHoraInicio, fechaHoraFin);
    }
    
    public ReservacionesAlojamiento reservacionesAlojamiento() {
        System.out.println("Ingrese el id de la reserva: ");
        int idReserva = view.readInt();
        System.out.println("Ingrese el id del alojamiento: ");
        int idAlojamiento = view.readInt();
        System.out.println("Ingrese el id de la temporada: ");
        int idTemporada = view.readInt();
        System.out.println("Ingrese la fecha de ingreso de la reserva del alojamiento: ");
        Date fechaIngreso = view.readDate();
        System.out.println("Ingrese la fecha de salida de la reserva del alojamiento: ");
        Date fechaSalida = view.readDate();
        System.out.println("Ingrese el valor de la reserva del alojamiento: ");
        float valorReserva = view.readFloat();
        return new ReservacionesAlojamiento(idReserva, idAlojamiento, idTemporada, fechaIngreso, fechaSalida, valorReserva);
    }
    
    public Recibos recibos() {
        System.out.println("Ingrese el id del recibo: ");
        int id = view.readInt();
        System.out.println("Ingrese el id del empleado: ");
        int idEmpleado = view.readInt();
        System.out.println("Ingrese el id del pasadía: ");
        int idPasadia = view.readInt();
        System.out.println("Ingrese el id del cliente: ");
        int idCliente = view.readInt();
        System.out.println("Ingrese el id de la reserva: ");
        int idReserva = view.readInt();
        System.out.println("Ingrese el descuento de acompañantes: ");
        int descuentoAcompaniantes = view.readInt();
        System.out.println("Ingrese el descuento del tipo de cliente: ");
        int descuentoTipoCliente = view.readInt();
        System.out.println("Ingrese el valor del recibo: ");
        float valor = view.readFloat();
        System.out.println("Ingrese la descripción del recibo: ");
        String descripcion = view.readString();
        System.out.println("Ingrese la fecha y hora del recibo: ");
        Timestamp fechaHora = view.readTimestamp();
        return new Recibos(id, idEmpleado, idPasadia, idCliente, idReserva, descuentoAcompaniantes, descuentoTipoCliente, valor, descripcion, fechaHora);
    }
    
    public AdicionalesRecibos adicionalesRecibos() {
        System.out.println("Ingrese el id del adicional: ");
        int idAdicional = view.readInt();
        System.out.println("Ingrese el id del recibo: ");
        int idRecibo = view.readInt();
        System.out.println("Ingrese la cantidad del adicional: ");
        int cantidad = view.readInt();
        return new AdicionalesRecibos(idAdicional, idRecibo, cantidad);
    }

}
