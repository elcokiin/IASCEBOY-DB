package model;
public class TiposAdicional {
    private int tipoAdicional;
    private String nombreTipoAdicional;

    public TiposAdicional(){

    }

    public TiposAdicional(int tipoAdicional, String nombreTipoAdicional){
        this.tipoAdicional = tipoAdicional;
        this.nombreTipoAdicional = nombreTipoAdicional;
    }

    public int getTipoAdicional() {
        return tipoAdicional;
    }

    public void setTipoAdicional(int tipoAdicional) {
        this.tipoAdicional = tipoAdicional;
    }

    public String getNombreTipoAdicional() {
        return nombreTipoAdicional;
    }

    public void setNombreTipoAdicional(String nombreTipoAdicional) {
        this.nombreTipoAdicional = nombreTipoAdicional;
    }

    public void showInfo() {
        System.out.println("tipoAdicional: " + tipoAdicional);
        System.out.println("nombreTipoAdicional: " + nombreTipoAdicional);
    }
}
