package model;
import java.sql.Date;

public class CargosPersonas {

    Cargos idCargo;
    Personas idEmpleado;
    private Date fechaInicioCargo;
    private Date fechaFinCargo;

    public CargosPersonas() {

    }

    public CargosPersonas(Cargos idCargo, Personas idEmpleado, Date fechaInicioCargo, Date fechaFinCargo) {
        this.idCargo = idCargo;
        this.idEmpleado = idEmpleado;
        this.fechaInicioCargo = fechaInicioCargo;
        this.fechaFinCargo = fechaFinCargo;
    }

    public Cargos getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargos idCargo) {
        this.idCargo = idCargo;
    }

    public Personas getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Personas idEmpleado) {
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

}