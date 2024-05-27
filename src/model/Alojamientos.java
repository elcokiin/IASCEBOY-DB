package model;

public class Alojamientos {
    private int idAlojamiento;
    TiposAlojamineto idTipoAlojamiento;
    private String descripcionAlojamiento;

    public Alojamientos(){

    }

    public Alojamientos(int idAlojamiento, TiposAlojamineto idTipoAlojamiento, String descripcionAlojamiento){
        this.idAlojamiento = idAlojamiento;
        this.idTipoAlojamiento = idTipoAlojamiento;
        this.descripcionAlojamiento = descripcionAlojamiento;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public TiposAlojamineto getIdTipoAlojamiento() {
        return idTipoAlojamiento;
    }

    public void setIdTipoAlojamiento(TiposAlojamineto idTipoAlojamiento) {
        this.idTipoAlojamiento = idTipoAlojamiento;
    }

    public String getDescripcionAlojamiento() {
        return descripcionAlojamiento;
    }

    public void setDescripcionAlojamiento(String descripcionAlojamiento) {
        this.descripcionAlojamiento = descripcionAlojamiento;
    }

    
    
}
