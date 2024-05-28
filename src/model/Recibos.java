package model;

import java.sql.Timestamp;

public class Recibos {
    private int idRecibo;
    private int idEmpleado;
    private int idPasadia;
    private int idCliente;
    private int idReserva;
    private int descuentoAcompaniantes;
    private int descuentoTipoCliente;
    private float valorRecibo;
    private String descripcionRecibo;
    private Timestamp fechaHoraRecibo;

    public Recibos() {

    }


    public Recibos(int idRecibo, int idEmpleado, int idPasadia, int idCliente, int idReserva,
            int descuentoAcompaniantes, int descuentoTipoCliente, float valorRecibo, String descripcionRecibo,
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
        this.fechaHoraRecibo = fechaHoraRecibo;
    }


    public int getIdRecibo() {
        return idRecibo;
    }


    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }


    public int getIdEmpleado() {
        return idEmpleado;
    }


    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    public int getIdPasadia() {
        return idPasadia;
    }


    public void setIdPasadia(int idPasadia) {
        this.idPasadia = idPasadia;
    }


    public int getIdCliente() {
        return idCliente;
    }


    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }


    public int getIdReserva() {
        return idReserva;
    }


    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }


    public int getDescuentoAcompaniantes() {
        return descuentoAcompaniantes;
    }


    public void setDescuentoAcompaniantes(int descuentoAcompaniantes) {
        this.descuentoAcompaniantes = descuentoAcompaniantes;
    }


    public int getDescuentoTipoCliente() {
        return descuentoTipoCliente;
    }


    public void setDescuentoTipoCliente(int descuentoTipoCliente) {
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


    public Timestamp getFechaHoraRecibo() {
        return fechaHoraRecibo;
    }


    public void setFechaHoraRecibo(Timestamp fechaHoraRecibo) {
        this.fechaHoraRecibo = fechaHoraRecibo;
    }
}