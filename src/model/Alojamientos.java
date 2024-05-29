package model;

public class Alojamientos {
    private int idAlojamiento;
    private int idTipoAlojamiento;
    private String descripcionAlojamiento;

    public Alojamientos(){

    }

    public Alojamientos(int idAlojamiento, int idTipoAlojamiento, String descripcionAlojamiento){
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

    public int getIdTipoAlojamiento() {
        return idTipoAlojamiento;
    }

    public void setIdTipoAlojamiento(int idTipoAlojamiento) {
        this.idTipoAlojamiento = idTipoAlojamiento;
    }

    public String getDescripcionAlojamiento() {
        return descripcionAlojamiento;
    }

    public void setDescripcionAlojamiento(String descripcionAlojamiento) {
        this.descripcionAlojamiento = descripcionAlojamiento;
    }

    public void showInfo() {
        System.out.println("idAlojamiento: " + idAlojamiento);
        System.out.println("idTipoAlojamiento: " + idTipoAlojamiento);
        System.out.println("descripcionAlojamiento: " + descripcionAlojamiento);
    }
}
