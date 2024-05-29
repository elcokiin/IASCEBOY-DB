package model;
import java.sql.Date;

public class CargosPersonas {

    private int idCargo;
    private int idEmpleado;
    private Date fechaInicioCargo;
    private Date fechaFinCargo;

    public CargosPersonas() {

    }

    public CargosPersonas(int idCargo, int idEmpleado, Date fechaInicioCargo, Date fechaFinCargo) {
        this.idCargo = idCargo;
        this.idEmpleado = idEmpleado;
        this.fechaInicioCargo = fechaInicioCargo;
        this.fechaFinCargo = fechaFinCargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getFechaInicioCargo() {
        return fechaInicioCargo;
    }

    public void setFechaInicioCargo(Date fechaInicioCargo) {
        this.fechaInicioCargo = fechaInicioCargo;
    }

    public Date getFechaFinCargo() {
        return fechaFinCargo;
    }

    public void setFechaFinCargo(Date fechaFinCargo) {
        this.fechaFinCargo = fechaFinCargo;
    }

    public void showInfo() {
        System.out.println("idCargo: " + idCargo);
        System.out.println("idEmpleado: " + idEmpleado);
        System.out.println("fechaInicioCargo: " + fechaInicioCargo);
        System.out.println("fechaFinCargo: " + fechaFinCargo);
    }
}