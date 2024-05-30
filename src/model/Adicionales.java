package model;
public class Adicionales {
    private int idAdicional;
    private int idTipoAdicional;
    private String descripcionAdicional;
    private float valorAdicional;

    public Adicionales(){

    }

    public Adicionales(int idAdicional, int idTipoAdicional, String descripcionAdicional, float valorAdicional){
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

    public int getIdTipoAdicional() {
        return idTipoAdicional;
    }

    public void setIdTipoAdicional(int idTipoAdicional) {
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

    public void showInfo() {
        System.out.println("idAdicional: " + idAdicional);
        System.out.println("idTipoAdicional: " + idTipoAdicional);
        System.out.println("descripcionAdicional: " + descripcionAdicional);
        System.out.println("valorAdicional: " + valorAdicional);
    }
}
