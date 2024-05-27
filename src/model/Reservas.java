package model;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reservas {
    private int idReserva;
    int idCliente;
    int idEmpleado;
    private LocalDate fechaReserva;
    private float valorTotalReserva;
    private LocalDateTime fechaIngresoReserva;
    private LocalDateTime fechaSalidaReserva;

    public Reservas() {

    }

    public Reservas(int idReserva, int idCliente, int idEmpleado, LocalDate fechaReserva,
            float valorTotalReserva, Timestamp fechaIngresoReserva, Timestamp fechaSalidaReserva) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaReserva = fechaReserva;
        this.valorTotalReserva = valorTotalReserva;
        this.fechaIngresoReserva = fechaIngresoReserva.toLocalDateTime();
        this.fechaSalidaReserva = fechaSalidaReserva.toLocalDateTime();
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public float getValorTotalReserva() {
        return valorTotalReserva;
    }

    public void setValorTotalReserva(float valorTotalReserva) {
        this.valorTotalReserva = valorTotalReserva;
    }

    public LocalDateTime getFechaIngresoReserva() {
        return fechaIngresoReserva;
    }

    public void setFechaIngresoReserva(LocalDateTime fechaIngresoReserva) {
        this.fechaIngresoReserva = fechaIngresoReserva;
    }

    public LocalDateTime getFechaSalidaReserva() {
        return fechaSalidaReserva;
    }

    public void setFechaSalidaReserva(LocalDateTime fechaSalidaReserva) {
        this.fechaSalidaReserva = fechaSalidaReserva;
    }

    // Método para convertir de LocalDate a Date
    public java.sql.Date getFechaReservaAsDate() {
        return java.sql.Date.valueOf(this.fechaReserva);
    }

    // Métodos para convertir LocalDateTime a Timestamp y viceversa
    public Timestamp getFechaIngresoReservaAsTimestamp() {
        return Timestamp.valueOf(this.fechaIngresoReserva);
    }

    public void setFechaIngresoReservaFromTimestamp(Timestamp fechaIngresoReserva) {
        this.fechaIngresoReserva = fechaIngresoReserva.toLocalDateTime();
    }

    public Timestamp getFechaSalidaReservaAsTimestamp() {
        return Timestamp.valueOf(this.fechaSalidaReserva);
    }

    public void setFechaSalidaReservaFromTimestamp(Timestamp fechaSalidaReserva) {
        this.fechaSalidaReserva = fechaSalidaReserva.toLocalDateTime();
    }

}
