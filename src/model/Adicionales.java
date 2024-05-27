package model;

public class Adicionales {
    private int idAdicional;
    private TiposAdicional idTipoAdicional;
    private String descripcionAdicional;
    private float valorAdicional;

    public Adicionales() {

    }

    public Adicionales(int idAdicional, TiposAdicional idTipoAdicional, String descripcionAdicional,
            float valorAdicional) {
        this.idAdicional = idAdicional;
        this.idTipoAdicional = idTipoAdicional;
        this.descripcionAdicional = descripcionAdicional;
        this.valorAdicional = valorAdicional;
    }

    public int getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(int idAdicional) {
        this.idAdicional = idAdicional;
    }

    public TiposAdicional getIdTipoAdicional() {
        return idTipoAdicional;
    }

    public void setIdTipoAdicional(TiposAdicional idTipoAdicional) {
        this.idTipoAdicional = idTipoAdicional;
    }

    public String getDescripcionAdicional() {
        return descripcionAdicional;
    }

    public void setDescripcionAdicional(String descripcionAdicional) {
        this.descripcionAdicional = descripcionAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
