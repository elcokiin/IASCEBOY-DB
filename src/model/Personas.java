package model;

public class Personas {
    private int idPersona;
    private int numeroDocumentoPersona;
    int idTipoDocumento;
    int idTipoCliente;
    int idTipoAfiliado;
    private String nombreCompletoPersona;
    private String telefonoPersona;
    private String correoElectronicoPersona;
    private String direccionPersona;

    public Personas() {

    }

    public Personas(int idPersona, int numeroDocumentoPersona, int idTipoDocumento,
            int idTipoCliente, int idTipoAfiliado, String nombreCompletoPersona,
            String telefonoPersona, String correoElectronicoPersona, String direccionPersona) {
        this.idPersona = idPersona;
        this.numeroDocumentoPersona = numeroDocumentoPersona;
        this.idTipoDocumento = idTipoDocumento;
        this.idTipoCliente = idTipoCliente;
        this.idTipoAfiliado = idTipoAfiliado;
        this.nombreCompletoPersona = nombreCompletoPersona;
        this.telefonoPersona = telefonoPersona;
        this.correoElectronicoPersona = correoElectronicoPersona;
        this.direccionPersona = direccionPersona;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getNumeroDocumentoPersona() {
        return numeroDocumentoPersona;
    }

    public void setNumeroDocumentoPersona(int numeroDocumentoPersona) {
        this.numeroDocumentoPersona = numeroDocumentoPersona;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public int getIdTipoAfiliado() {
        return idTipoAfiliado;
    }

    public void setIdTipoAfiliado(int idTipoAfiliado) {
        this.idTipoAfiliado = idTipoAfiliado;
    }

    public String getNombreCompletoPersona() {
        return nombreCompletoPersona;
    }

    public void setNombreCompletoPersona(String nombreCompletoPersona) {
        this.nombreCompletoPersona = nombreCompletoPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getCorreoElectronicoPersona() {
        return correoElectronicoPersona;
    }

    public void setCorreoElectronicoPersona(String correoElectronicoPersona) {
        this.correoElectronicoPersona = correoElectronicoPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    
}
