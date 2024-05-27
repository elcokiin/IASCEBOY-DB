package model;
public class TiposAlojamineto {
    private int tipoAlojamiento;
    private String nombreTipoAlojamiento;
    private float valorTipoAlojamiento;

    public TiposAlojamineto() {

    }

    public TiposAlojamineto(int tipoAlojamiento, String nombreTipoAlojamiento, float valorTipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
        this.nombreTipoAlojamiento = nombreTipoAlojamiento;
        this.valorTipoAlojamiento = valorTipoAlojamiento;
    }

    public int getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(int tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
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
}
