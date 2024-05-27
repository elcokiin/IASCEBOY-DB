package model;
public class TiposCliente{
	private int idTipoCliente;
	private String nombreTipoCliente;

    public TiposCliente(){

    }

	public int getIdTipoCliente() {
		return idTipoCliente;
	}

	public TiposCliente(int idTipoCliente, String nombreTipoCliente) {
		super();
		this.idTipoCliente = idTipoCliente;
		this.nombreTipoCliente = nombreTipoCliente;
	}

	public void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getNombreTipoCliente() {
		return nombreTipoCliente;
	}

	public void setNombreTipoCliente(String nombreTipoCliente) {
		this.nombreTipoCliente = nombreTipoCliente;
	}


}
