package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class EstadosReservacion {
    int idEstadoReserva;
    int idReserva;
    private Timestamp fechaHoraInicioEstadoReserva;
    private Timestamp fechaHoraFinEstadoReserva;


    public EstadosReservacion() {

    }

    public EstadosReservacion(int idEstadoReserva, int idReserva, Timestamp fechaHoraInicioEstadoReserva,
            Timestamp fechaHoraFinEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
        this.idReserva = idReserva;
        this.fechaHoraInicioEstadoReserva = fechaHoraInicioEstadoReserva;
        this.fechaHoraFinEstadoReserva = fechaHoraFinEstadoReserva;
    }

    public int getIdEstadoReserva() {
        return idEstadoReserva;
    }

    public void setIdEstadoReserva(int idEstadoReserva) {
        this.idEstadoReserva = idEstadoReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Timestamp getFechaHoraInicioEstadoReserva() {
        return fechaHoraInicioEstadoReserva;
    }

    public void setFechaHoraInicioEstadoReserva(Timestamp fechaHoraInicioEstadoReserva) {
        this.fechaHoraInicioEstadoReserva = fechaHoraInicioEstadoReserva;
    }

    public void setFechaHIEstadoReserva(LocalDateTime fechaHoraInicioEstadoReserva) {
        this.fechaHoraInicioEstadoReserva = Timestamp.valueOf(fechaHoraInicioEstadoReserva);
    }


    public Timestamp getFechaHoraFinEstadoReserva() {
        return fechaHoraFinEstadoReserva;
    }

    public void setFechaHoraFinEstadoReserva(Timestamp fechaHoraFinEstadoReserva) {
        this.fechaHoraFinEstadoReserva = fechaHoraFinEstadoReserva;
    }

    public void setFechaHFEstadoReserva(LocalDateTime fechaHoraFinEstadoReserva) {
        this.fechaHoraFinEstadoReserva = Timestamp.valueOf(fechaHoraFinEstadoReserva);
    }

    // Métodos para convertir Timestamp a Timestamp y vicevers
    public java.sql.Timestamp getFechaHoraInicioEstadoReservaTimeStamp() {
        return fechaHoraInicioEstadoReserva;
    }
    
    public void showInfo() {
        System.out.println("idEstadoReserva: " + idEstadoReserva);
        System.out.println("idReserva: " + idReserva);
        System.out.println("fechaHoraInicioEstadoReserva: " + fechaHoraInicioEstadoReserva);
        System.out.println("fechaHoraFinEstadoReserva: " + fechaHoraFinEstadoReserva);
    }
}
