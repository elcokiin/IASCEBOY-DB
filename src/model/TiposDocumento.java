package model;
public class TiposDocumento{
	private int idTipoDocumento;
	private String nombreTipoDocumento;

    public TiposDocumento(){

    }

	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNombreTipoDocumento() {
		return nombreTipoDocumento;
	}

	public void setNombreTipoDocumento(String nombreTipoDocumento) {
		this.nombreTipoDocumento = nombreTipoDocumento;
	}

	public TiposDocumento(int idTipoDocumento, String nombreTipoDocumento) {
		super();
		this.idTipoDocumento = idTipoDocumento;
		this.nombreTipoDocumento = nombreTipoDocumento;
	}
}
