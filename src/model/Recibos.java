package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Recibos {
    private int idRecibo;
    Personas idEmpleado;
    Pasadias idPasadia;
    Personas idCliente;
    Reservas idReserva;
    private Integer descuentoAcompaniantes;
    private Integer descuentoTipoCliente;
    private float valorRecibo;
    private String descripcionRecibo;
    private LocalDateTime fechaHoraRecibo;

    public Recibos() {

    }

    public Recibos(int idRecibo, Personas idEmpleado, Pasadias idPasadia, Personas idCliente, Reservas idReserva,
            Integer descuentoAcompaniantes, Integer descuentoTipoCliente, float valorRecibo, String descripcionRecibo,
            Timestamp fechaHoraRecibo) {
        this.idRecibo = idRecibo;
        this.idEmpleado = idEmpleado;
        this.idPasadia = idPasadia;
        this.idCliente = idCliente;
        this.idReserva = idReserva;
        this.descuentoAcompaniantes = descuentoAcompaniantes;
        this.descuentoTipoCliente = descuentoTipoCliente;
        this.valorRecibo = valorRecibo;
        this.descripcionRecibo = descripcionRecibo;
        this.fechaHoraRecibo = fechaHoraRecibo.toLocalDateTime();
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Personas getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Personas idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Pasadias getIdPasadia() {
        return idPasadia;
    }

    public void setIdPasadia(Pasadias idPasadia) {
        this.idPasadia = idPasadia;
    }

    public Personas getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Personas idCliente) {
        this.idCliente = idCliente;
    }

    public Reservas getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reservas idReserva) {
        this.idReserva = idReserva;
    }

    public Integer getDescuentoAcompaniantes() {
        return descuentoAcompaniantes;
    }

    public void setDescuentoAcompaniantes(Integer descuentoAcompaniantes) {
        this.descuentoAcompaniantes = descuentoAcompaniantes;
    }

    public Integer getDescuentoTipoCliente() {
        return descuentoTipoCliente;
    }

    public void setDescuentoTipoCliente(Integer descuentoTipoCliente) {
        this.descuentoTipoCliente = descuentoTipoCliente;
    }

    public float getValorRecibo() {
        return valorRecibo;
    }

    public void setValorRecibo(float valorRecibo) {
        this.valorRecibo = valorRecibo;
    }

    public String getDescripcionRecibo() {
        return descripcionRecibo;
    }

    public void setDescripcionRecibo(String descripcionRecibo) {
        this.descripcionRecibo = descripcionRecibo;
    }

    public LocalDateTime getFechaHoraRecibo() {
        return fechaHoraRecibo;
    }

    public void setFechaHoraRecibo(LocalDateTime fechaHoraRecibo) {
        this.fechaHoraRecibo = fechaHoraRecibo;
    }

    // Métodos para convertir LocalDateTime a Timestamp y viceversa
    public Timestamp getFechaHoraReciboAsTimestamp() {
        return Timestamp.valueOf(this.fechaHoraRecibo);
    }

    public void setFechaHoraReciboFromTimestamp(Timestamp fechaHoraRecibo) {
        this.fechaHoraRecibo = fechaHoraRecibo.toLocalDateTime();
    }
}