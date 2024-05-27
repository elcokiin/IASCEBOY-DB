package model;

public class Cargos {

    private int idCargo;
    private String nombreCargo;

    public Cargos(){

    }

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getNombreCargo() {
		return nombreCargo;
	}

	public void setNombreCargo(String nombreCargo) {
		this.nombreCargo = nombreCargo;
	}

	public Cargos(int idCargo, String nombreCargo) {
		super();
		this.idCargo = idCargo;
		this.nombreCargo = nombreCargo;
	}
}