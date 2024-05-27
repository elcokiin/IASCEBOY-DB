package model;

public class EstadosReserva {
    private int idEstadoReserva;
    private String nombreEstadoReserva;

    public EstadosReserva(){

    }

	public int getIdEstadoReserva() {
		return idEstadoReserva;
	}

	public void setIdEstadoReserva(int idEstadoReserva) {
		this.idEstadoReserva = idEstadoReserva;
	}

	public String getNombreEstadoReserva() {
		return nombreEstadoReserva;
	}

	public void setNombreEstadoReserva(String nombreEstadoReserva) {
		this.nombreEstadoReserva = nombreEstadoReserva;
	}

	public EstadosReserva(int idEstadoReserva, String nombreEstadoReserva) {
		super();
		this.idEstadoReserva = idEstadoReserva;
		this.nombreEstadoReserva = nombreEstadoReserva;
	}
}
