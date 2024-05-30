
package model;
import java.sql.Date;

public class ReservacionesAlojamiento {
    int idReserva;
    int idAlojamiento;
    int idTemporada;
    private Date fechaIngresoReservaAlojamiento;
    private Date fechaSalidaReservaAlojamiento;
    private float valorReservaAlojamiento;

    public ReservacionesAlojamiento() {

    }

    public ReservacionesAlojamiento(int idReserva, int idAlojamiento, int idTemporada,
            Date fechaIngresoReservaAlojamiento, Date fechaSalidaReservaAlojamiento, float valorReservaAlojamiento) {
        this.idReserva = idReserva;
        this.idAlojamiento = idAlojamiento;
        this.idTemporada = idTemporada;
        this.fechaIngresoReservaAlojamiento = fechaIngresoReservaAlojamiento;
        this.fechaSalidaReservaAlojamiento = fechaSalidaReservaAlojamiento;
        this.valorReservaAlojamiento = valorReservaAlojamiento;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Date getFechaIngresoReservaAlojamiento() {
        return fechaIngresoReservaAlojamiento;
    }

    public void setFechaIngresoReservaAlojamiento(Date fechaIngresoReservaAlojamiento) {
        this.fechaIngresoReservaAlojamiento = fechaIngresoReservaAlojamiento;
    }

    public Date getFechaSalidaReservaAlojamiento() {
        return fechaSalidaReservaAlojamiento;
    }

    public void setFechaSalidaReservaAlojamiento(Date fechaSalidaReservaAlojamiento) {
        this.fechaSalidaReservaAlojamiento = fechaSalidaReservaAlojamiento;
    }

    public float getValorReservaAlojamiento() {
        return valorReservaAlojamiento;
    }

    public void setValorReservaAlojamiento(float valorReservaAlojamiento) {
        this.valorReservaAlojamiento = valorReservaAlojamiento;
    }

    public void showInfo() {
        System.out.println("Id Reserva: " + idReserva);
        System.out.println("Id Alojamiento: " + idAlojamiento);
        System.out.println("Id Temporada: " + idTemporada);
        System.out.println("Fecha Ingreso Reserva Alojamiento: " + fechaIngresoReservaAlojamiento);
        System.out.println("Fecha Salida Reserva Alojamiento: " + fechaSalidaReservaAlojamiento);
        System.out.println("Valor Reserva Alojamiento: " + valorReservaAlojamiento);
    }
}
