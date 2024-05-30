package model;

public class AdicionalesRecibos {
    private int idAdicional;
    private int idRecibo;
    private int cantidadAdicional;

    public AdicionalesRecibos() {

    }

    public AdicionalesRecibos(int idAdicional, int idRecibo, int cantidadAdicional) {
        this.idAdicional = idAdicional;
        this.idRecibo = idRecibo;
        this.cantidadAdicional = cantidadAdicional;
    }

    public int getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(int idAdicional) {
        this.idAdicional = idAdicional;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public int getCantidadAdicional() {
        return cantidadAdicional;
    }

    public void setCantidadAdicional(int cantidadAdicional) {
        this.cantidadAdicional = cantidadAdicional;
    }

    public void showInfo() {
        System.out.println("idAdicional: " + idAdicional);
        System.out.println("idRecibo: " + idRecibo);
        System.out.println("cantidadAdicional: " + cantidadAdicional);
    }
}
