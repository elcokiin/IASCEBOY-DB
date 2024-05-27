package model;
public class TiposAdicional {
    private int idTipoAdicional;
    private String nombreTipoAdicional;

    public TiposAdicional(){

    }

    public TiposAdicional(int idTipoAdicional, String nombreTipoAdicional){
        this.idTipoAdicional = idTipoAdicional;
        this.nombreTipoAdicional = nombreTipoAdicional;
    }

    public int getTipoAdicional() {
        return idTipoAdicional;
    }

    public void setTipoAdicional(int tipoAdicional) {
        this.idTipoAdicional = tipoAdicional;
    }

    public String getNombreTipoAdicional() {
        return nombreTipoAdicional;
    }

    public void setNombreTipoAdicional(String nombreTipoAdicional) {
        this.nombreTipoAdicional = nombreTipoAdicional;
    }
}
