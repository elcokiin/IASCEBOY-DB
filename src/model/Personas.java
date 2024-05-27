package model;

public class Personas {
    private int idPersona;
    private int numeroDocumentoPersona;
    TiposDocumento idTipoDocumento;
    TiposCliente idTipoCliente;
    TiposAfiliado idTipoAfiliado;
    private String nombreCompletoPersona;
    private String telefonoPersona;
    private String correoElectronicoPersona;
    private String direccionPersona;

    public Personas() {

    }

    public Personas(int idPersona, int numeroDocumentoPersona, TiposDocumento idTipoDocumento,
            TiposCliente idTipoCliente, TiposAfiliado idTipoAfiliado, String nombreCompletoPersona,
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

    public TiposDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TiposDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public TiposCliente getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(TiposCliente idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public TiposAfiliado getIdTipoAfiliado() {
        return idTipoAfiliado;
    }

    public void setIdTipoAfiliado(TiposAfiliado idTipoAfiliado) {
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
