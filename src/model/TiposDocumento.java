package model;
public class TiposDocumento{
	private int tipoDocumento;
	private String nombreTipoDocumento;

    public TiposDocumento(){

    }
    public TiposDocumento(int tipoDocumento, String nombreTipoDocumento){
        this.tipoDocumento = tipoDocumento;
        this.nombreTipoDocumento = nombreTipoDocumento;
    }

    public int getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(int tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    public String getNombreTipoDocumento() {
        return nombreTipoDocumento;
    }


    public void setNombreTipoDocumento(String nombreTipoDocumento) {
        this.nombreTipoDocumento = nombreTipoDocumento;
    }


}