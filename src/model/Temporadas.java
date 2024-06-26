package model;
import java.sql.Date;

public class Temporadas {
    private int idTemporada;
    private float porcentajeAplicadoPorTemporada;
    private String tipoTemporada;
    private Date fechaInicioTemporada;
    private Date fechaFinTemporada;

    public Temporadas() {

    }

    public Temporadas(int idTemporada, float porcentajeAplicadoPorTemporada, String tipoTemporada,
            Date fechaInicioTemporada, Date fechaFinTemporada) {
        this.idTemporada = idTemporada;
        this.porcentajeAplicadoPorTemporada = porcentajeAplicadoPorTemporada;
        this.tipoTemporada = tipoTemporada;
        this.fechaInicioTemporada = fechaInicioTemporada;
        this.fechaFinTemporada = fechaFinTemporada;
    }

    public int getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(int idTemporada) {
        this.idTemporada = idTemporada;
    }

    public float getPorcentajeAplicadoPorTemporada() {
        return porcentajeAplicadoPorTemporada;
    }

    public void setPorcentajeAplicadoPorTemporada(float porcentajeAplicadoPorTemporada) {
        this.porcentajeAplicadoPorTemporada = porcentajeAplicadoPorTemporada;
    }

    public String getTipoTemporada() {
        return tipoTemporada;
    }

    public void setTipoTemporada(String tipoTemporada) {
        this.tipoTemporada = tipoTemporada;
    }

    public Date getFechaInicioTemporada() {
        return fechaInicioTemporada;
    }

    public void setFechaInicioTemporada(Date fechaInicioTemporada) {
        this.fechaInicioTemporada = fechaInicioTemporada;
    }

    public Date getFechaFinTemporada() {
        return fechaFinTemporada;
    }

    public void setFechaFinTemporada(Date fechaFinTemporada) {
        this.fechaFinTemporada = fechaFinTemporada;
    }

    public void showInfo() {
        System.out.println("ID Temporada: " + idTemporada);
        System.out.println("Porcentaje aplicado por temporada: " + porcentajeAplicadoPorTemporada);
        System.out.println("Tipo de temporada: " + tipoTemporada);
        System.out.println("Fecha de inicio de temporada: " + fechaInicioTemporada);
        System.out.println("Fecha de fin de temporada: " + fechaFinTemporada);
    }
}
