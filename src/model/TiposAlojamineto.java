package model;
public class TiposAlojamineto {
    private int idTipoAlojamiento;
    private String nombreTipoAlojamiento;
    private float valorTipoAlojamiento;

    public TiposAlojamineto() {

    }

	public int getIdTipoAlojamiento() {
		return idTipoAlojamiento;
	}

	public void setIdTipoAlojamiento(int idTipoAlojamiento) {
		this.idTipoAlojamiento = idTipoAlojamiento;
	}

	public String getNombreTipoAlojamiento() {
		return nombreTipoAlojamiento;
	}

	public void setNombreTipoAlojamiento(String nombreTipoAlojamiento) {
		this.nombreTipoAlojamiento = nombreTipoAlojamiento;
	}

	public float getValorTipoAlojamiento() {
		return valorTipoAlojamiento;
	}

	public void setValorTipoAlojamiento(float valorTipoAlojamiento) {
		this.valorTipoAlojamiento = valorTipoAlojamiento;
	}

	public TiposAlojamineto(int idTipoAlojamiento, String nombreTipoAlojamiento, float valorTipoAlojamiento) {
		super();
		this.idTipoAlojamiento = idTipoAlojamiento;
		this.nombreTipoAlojamiento = nombreTipoAlojamiento;
		this.valorTipoAlojamiento = valorTipoAlojamiento;
	}

  
}
