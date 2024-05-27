
package model;
import java.sql.Date;

public class ReservacionesAlojamiento {
    Reservas idReserva;
    Alojamientos idAlojamiento;
    Temporadas idTemporada;
    private Date fechaIngresoReservaAlojamiento;
    private Date fechaSalidaReservaAlojamiento;
    private float valorReservaAlojamiento;

    public ReservacionesAlojamiento() {

    }

    public ReservacionesAlojamiento(Reservas idReserva, Alojamientos idAlojamiento, Temporadas idTemporada,
            Date fechaIngresoReservaAlojamiento, Date fechaSalidaReservaAlojamiento, float valorReservaAlojamiento) {
        this.idReserva = idReserva;
        this.idAlojamiento = idAlojamiento;
        this.idTemporada = idTemporada;
        this.fechaIngresoReservaAlojamiento = fechaIngresoReservaAlojamiento;
        this.fechaSalidaReservaAlojamiento = fechaSalidaReservaAlojamiento;
        this.valorReservaAlojamiento = valorReservaAlojamiento;
    }

    public Reservas getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reservas idReserva) {
        this.idReserva = idReserva;
    }

    public Alojamientos getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(Alojamientos idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Temporadas getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Temporadas idTemporada) {
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

    
}
