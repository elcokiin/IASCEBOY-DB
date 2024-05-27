package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class EstadosReservacion {
    EstadosReserva idEstadoReserva;
    Reservas idReserva;
    private LocalDateTime fechaHoraInicioEstadoReserva;
    private LocalDateTime fechaHoraFinEstadoReserva;


    public EstadosReservacion() {

    }

    public EstadosReservacion(EstadosReserva idEstadoReserva, Reservas idReserva, LocalDateTime fechaHoraInicioEstadoReserva,
            LocalDateTime fechaHoraFinEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
        this.idReserva = idReserva;
        this.fechaHoraInicioEstadoReserva = fechaHoraInicioEstadoReserva;
        this.fechaHoraFinEstadoReserva = fechaHoraFinEstadoReserva;
    }

    public EstadosReserva getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(EstadosReserva idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public Reservas getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reservas idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDateTime getFechaHoraInicioEstadoReserva() {
        return fechaHoraInicioEstadoReserva;
    }

    public void setFechaHoraInicioEstadoReserva(LocalDateTime fechaHoraInicioEstadoReserva) {
        this.fechaHoraInicioEstadoReserva = fechaHoraInicioEstadoReserva;
    }

    public LocalDateTime getFechaHoraFinEstadoReserva() {
        return fechaHoraFinEstadoReserva;
    }

    public void setFechaHoraFinEstadoReserva(LocalDateTime fechaHoraFinEstadoReserva) {
        this.fechaHoraFinEstadoReserva = fechaHoraFinEstadoReserva;
    }

    // Métodos para convertir LocalDateTime a Timestamp y viceversa
    public Timestamp getFechaHoraInicioEstadoReservaAsTimestamp() {
        return Timestamp.valueOf(this.fechaHoraInicioEstadoReserva);
    }

    public void setFechaHoraInicioEstadoReservaFromTimestamp(Timestamp fechaHoraInicioEstadoReserva) {
        this.fechaHoraInicioEstadoReserva = fechaHoraInicioEstadoReserva.toLocalDateTime();
    }

    public Timestamp getFechaHoraFinEstadoReservaAsTimestamp() {
        return Timestamp.valueOf(this.fechaHoraFinEstadoReserva);
    }

    public void setFechaHoraFinEstadoReservaFromTimestamp(Timestamp fechaHoraFinEstadoReserva) {
        this.fechaHoraFinEstadoReserva = fechaHoraFinEstadoReserva.toLocalDateTime();
    }
}
