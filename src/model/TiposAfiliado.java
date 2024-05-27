package model;
public class TiposAfiliado{
	private int idTipoAfiliado;
	private String nombreTipoAfiliado;

    public TiposAfiliado(){

    }

	public int getIdTipoAfiliado() {
		return idTipoAfiliado;
	}

	public void setIdTipoAfiliado(int idTipoAfiliado) {
		this.idTipoAfiliado = idTipoAfiliado;
	}

	public String getNombreTipoAfiliado() {
		return nombreTipoAfiliado;
	}

	public void setNombreTipoAfiliado(String nombreTipoAfiliado) {
		this.nombreTipoAfiliado = nombreTipoAfiliado;
	}

	public TiposAfiliado(int idTipoAfiliado, String nombreTipoAfiliado) {
		super();
		this.idTipoAfiliado = idTipoAfiliado;
		this.nombreTipoAfiliado = nombreTipoAfiliado;
	}
}
