package model;

public class EstadosReserva {
    private int estadoReserva;
    private String nombreEstadoReserva;

    public EstadosReserva(){

    }
    public EstadosReserva(int estadoReserva, String nombreEstadoReserva){
        this.estadoReserva = estadoReserva;
        this.nombreEstadoReserva = nombreEstadoReserva;
    }

    public int getEstadoReserva() {
        return estadoReserva;
    }
    public void setEstadoReserva(int estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    public String getNombreEstadoReserva() {
        return nombreEstadoReserva;
    }
    public void setNombreEstadoReserva(String nombreEstadoReserva) {
        this.nombreEstadoReserva = nombreEstadoReserva;
    }
    
    
}
