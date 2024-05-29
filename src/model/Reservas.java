package model;
import java.sql.Timestamp;
import java.sql.Date;

public class Reservas {
    private int idReserva;
    int idCliente;
    int idEmpleado;
    private Date fechaReserva;
    private float valorTotalReserva;
    private Timestamp fechaIngresoReserva;
    private Timestamp fechaSalidaReserva;

    public Reservas() {

    }

    public Reservas(int idReserva, int idCliente, int idEmpleado, Date fechaReserva,
            float valorTotalReserva, Timestamp fechaIngresoReserva, Timestamp fechaSalidaReserva) {
        this.idReserva = idReserva;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.fechaReserva = fechaReserva;
        this.valorTotalReserva = valorTotalReserva;
        this.fechaIngresoReserva = fechaIngresoReserva;
        this.fechaSalidaReserva = fechaSalidaReserva;
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

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public float getValorTotalReserva() {
        return valorTotalReserva;
    }

    public void setValorTotalReserva(float valorTotalReserva) {
        this.valorTotalReserva = valorTotalReserva;
    }

    public Timestamp getFechaIngresoReserva() {
        return fechaIngresoReserva;
    }

    public void setFechaIngresoReserva(Timestamp fechaIngresoReserva) {
        this.fechaIngresoReserva = fechaIngresoReserva;
    }

    public Timestamp getFechaSalidaReserva() {
        return fechaSalidaReserva;
    }

    public void setFechaSalidaReserva(Timestamp fechaSalidaReserva) {
        this.fechaSalidaReserva = fechaSalidaReserva;
    }

    // create method setFechaIngReserva resive Date and convert Timestamp
    public void setFechaIngReserva(Date fechaIngresoReserva) {
        this.fechaIngresoReserva = new Timestamp(fechaIngresoReserva.getTime());
    }
    // setFechaFinReserva
    public void setFechaFinReserva(Date fechaSalidaReserva) {
        this.fechaSalidaReserva = new Timestamp(fechaSalidaReserva.getTime());
    }


    // Métodos para convertir Timestamp a Timestamp y viceversa
    //  public Timestamp getFechaIngresoReservaAsTimestamp() {
    //      return Timestamp.valueOf(this.fechaIngresoReserva);
    //  }

    // public void setFechaIngresoReservaFromTimestamp(Timestamp fechaIngresoReserva) {
    //     this.fechaIngresoReserva = fechaIngresoReserva.toTimestamp();
    // }

    // public Timestamp getFechaSalidaReservaAsTimestamp() {
    //     return Timestamp.valueOf(this.fechaSalidaReserva);
    // }

    // public void setFechaSalidaReservaFromTimestamp(Timestamp fechaSalidaReserva) {
    //     this.fechaSalidaReserva = fechaSalidaReserva.toTimestamp();
    // }

    public void showInfo() {
        System.out.println("ID Reserva: " + idReserva);
        System.out.println("ID Cliente: " + idCliente);
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Fecha Reserva: " + fechaReserva);
        System.out.println("Valor Total Reserva: " + valorTotalReserva);
        System.out.println("Fecha Ingreso Reserva: " + fechaIngresoReserva);
        System.out.println("Fecha Salida Reserva: " + fechaSalidaReserva);
    }
}
