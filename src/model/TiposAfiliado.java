package model;
public class TiposAfiliado{
	private int tipoAfiliado;
	private String nombreTipoAfiliado;

    public TiposAfiliado(){

    }
    public TiposAfiliado(int tipoAfiliado, String nombreTipoAfiliado){
        this.tipoAfiliado = tipoAfiliado;
        this.nombreTipoAfiliado = nombreTipoAfiliado;
    }

    public int getTipoAfiliado() {
        return tipoAfiliado;
    }


    public void setTipoAfiliado(int tipoAfiliado) {
        this.tipoAfiliado = tipoAfiliado;
    }


    public String getNombreTipoAfiliado() {
        return nombreTipoAfiliado;
    }


    public void setNombreTipoAfiliado(String nombreTipoAfiliado) {
        this.nombreTipoAfiliado = nombreTipoAfiliado;
    }


}
