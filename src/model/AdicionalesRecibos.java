package model;

public class AdicionalesRecibos {
    Adicionales idAdicional;
    Recibos idRecibo;
    private int cantidadAdicional;

    public AdicionalesRecibos() {

    }

    public AdicionalesRecibos(Adicionales idAdicional, Recibos idRecibo, int cantidadAdicional) {
        this.idAdicional = idAdicional;
        this.idRecibo = idRecibo;
        this.cantidadAdicional = cantidadAdicional;
    }

    public Adicionales getIdAdicional() {
        return idAdicional;
    }

    public void setIdAdicional(Adicionales idAdicional) {
        this.idAdicional = idAdicional;
    }

    public Recibos getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Recibos idRecibo) {
        this.idRecibo = idRecibo;
    }

    public int getCantidadAdicional() {
        return cantidadAdicional;
    }

    public void setCantidadAdicional(int cantidadAdicional) {
        this.cantidadAdicional = cantidadAdicional;
    }
}
