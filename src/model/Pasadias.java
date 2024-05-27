package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Pasadias {
    private int idPasadia;
    Personas idPersona;
    Personas idEmpleado;
    private LocalDateTime fechaHoraIngreso;
    private LocalDateTime fechaHoraSalida;

    public Pasadias() {

    }

    public Pasadias(int idPasadia, Personas idPersona, Personas idEmpleado, Timestamp fechaHoraIngreso,
            Timestamp fechaHoraSalida) {
        this.idPasadia = idPasadia;
        this.idPersona = idPersona;
        this.idEmpleado = idEmpleado;
        this.fechaHoraIngreso = fechaHoraIngreso.toLocalDateTime();
        this.fechaHoraSalida = fechaHoraSalida != null ? fechaHoraSalida.toLocalDateTime() : null;
    }

    // Getters and Setters
    public int getIdPasadia() {
        return idPasadia;
    }

    public void setIdPasadia(int idPasadia) {
        this.idPasadia = idPasadia;
    }

    public Personas getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Personas idPersona) {
        this.idPersona = idPersona;
    }

    public Personas getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Personas idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDateTime getFechaHoraIngreso() {
        return fechaHoraIngreso;
    }

    public void setFechaHoraIngreso(LocalDateTime fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    // Métodos para convertir LocalDateTime a Timestamp y viceversa
    public Timestamp getFechaHoraIngresoAsTimestamp() {
        return Timestamp.valueOf(this.fechaHoraIngreso);
    }

    public void setFechaHoraIngresoFromTimestamp(Timestamp fechaHoraIngreso) {
        this.fechaHoraIngreso = fechaHoraIngreso.toLocalDateTime();
    }

    public Timestamp getFechaHoraSalidaAsTimestamp() {
        return this.fechaHoraSalida != null ? Timestamp.valueOf(this.fechaHoraSalida) : null;
    }

    public void setFechaHoraSalidaFromTimestamp(Timestamp fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida != null ? fechaHoraSalida.toLocalDateTime() : null;
    }
}
