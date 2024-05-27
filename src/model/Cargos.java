package model;

public class Cargos {

    private int cargo;
    private String nombreCargo;

    public Cargos(){

    }
    public Cargos(int cargo, String nombreCargo){
        this.cargo = cargo;
        this.nombreCargo = nombreCargo;
    }

    public int getCargo() {
        return cargo;
    }
    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
    public String getNombreCargo() {
        return nombreCargo;
    }
    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }
}