package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Import POJO classes
import model.*;

public class Read {
    private Connection connection;

    // Constructor
    public Read(Connection connection) {
        this.connection = connection;
    }

    public TiposAdicional readTipoAdicional(int id) {
        String sql = "SELECT * FROM tipos_adicional WHERE id_tipo_adicional = ?";
        TiposAdicional tipoAdicional = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipoAdicional = new TiposAdicional();
                tipoAdicional.setTipoAdicional(rs.getInt("id_tipo_adicional"));
                tipoAdicional.setNombreTipoAdicional(rs.getString("nombre_tipo_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return tipoAdicional;
    }

    // Read for tipo_cliente
    public TiposCliente readTipoCliente(int id) {
        String sql = "SELECT * FROM tipos_cliente WHERE id_tipo_cliente = ?";
        TiposCliente tipoCliente = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipoCliente = new TiposCliente();
                tipoCliente.setTipoAfiliado(rs.getInt("id_tipo_cliente"));
                tipoCliente.setNombreTipoAfiliado(rs.getString("nombre_tipo_cliente"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return tipoCliente;
    }

    // Read for tipo_afiliado
    public TiposAfiliado readTipoAfiliado(int id) {
        String sql = "SELECT * FROM tipos_afiliado WHERE id_tipo_afiliado = ?";
        TiposAfiliado tipoAfiliado = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipoAfiliado = new TiposAfiliado();
                tipoAfiliado.setTipoAfiliado(rs.getInt("id_tipo_afiliado"));
                tipoAfiliado.setNombreTipoAfiliado(rs.getString("nombre_tipo_afiliado"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return tipoAfiliado;
    }

    // Read for tipo_documento
    public TiposDocumento readTipoDocumento(int id) {
        String sql = "SELECT * FROM tipos_documento WHERE id_tipo_documento = ?";
        TiposDocumento tipoDocumento = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipoDocumento = new TiposDocumento();
                tipoDocumento.setTipoDocumento(rs.getInt("id_tipo_documento"));
                tipoDocumento.setNombreTipoDocumento(rs.getString("nombre_tipo_documento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return tipoDocumento;
    }

    // Read for tipo_alojamiento
    public TiposAlojamiento readTipoAlojamiento(int id) {
        String sql = "SELECT * FROM tipos_alojamiento WHERE id_tipo_alojamiento = ?";
        TiposAlojamiento tipoAlojamiento = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tipoAlojamiento = new TiposAlojamiento();
                tipoAlojamiento.setTipoAlojamiento(rs.getInt("id_tipo_alojamiento"));
                tipoAlojamiento.setNombreTipoAlojamiento(rs.getString("nombre_tipo_alojamiento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return tipoAlojamiento;
    }

    // Read for temporada
    public Temporadas readTemporada(int id) {
        String sql = "SELECT * FROM temporadas WHERE id_temporada = ?";
        Temporadas temporada = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                temporada = new Temporadas();
                temporada.setIdTemporada(rs.getInt("id_temporada"));
                temporada.setPorcentajeAplicadoPorTemporada(rs.getFloat("porcentaje_aplicado_por_temporada"));
                temporada.setTipoTemporada(rs.getString("tipo_temporada"));
                temporada.setFechaInicioTemporada(rs.getDate("fecha_inicio_temporada"));
                temporada.setFechaFinTemporada(rs.getDate("fecha_fin_temporada"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return temporada;
    }

    // Read for adicional
    public Adicionales readAdicional(int id) {
        String sql = "SELECT * FROM adicionales WHERE id_adicional = ?";
        Adicionales adicional = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                adicional = new Adicionales();
                adicional.setIdAdicional(rs.getInt("id_adicional"));
                adicional.setIdTipoAdicional(rs.getInt("id_tipo_adicional"));
                adicional.setDescripcionAdicional(rs.getString("descripcion_adicional"));
                adicional.setValorAdicional(rs.getFloat("valor_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return adicional;
    }

    // Read for adicional_recibo
    public AdicionalesRecibos readAdicionalRecibo(int id) {
        String sql = "SELECT * FROM adicionales_recibos WHERE id_adicional = ?";
        AdicionalesRecibos adicionalRecibo = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                adicionalRecibo = new AdicionalesRecibos();
                adicionalRecibo.setIdAdicional(rs.getInt("id_adicional"));
                adicionalRecibo.setIdRecibo(rs.getInt("id_recibo"));
                adicionalRecibo.setCantidadAdicional(rs.getInt("cantidad_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return adicionalRecibo;
    }

    // Read for alojamiento
    public Alojamientos readAlojamiento(int id) {
        String sql = "SELECT * FROM alojamientos WHERE id_alojamiento = ?";
        Alojamientos alojamiento = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                alojamiento = new Alojamientos();
                alojamiento.setIdAlojamiento(rs.getInt("id_alojamiento"));
                alojamiento.setIdTipoAlojamiento(rs.getInt("id_tipo_alojamiento"));
                alojamiento.setDescripcionAlojamiento(rs.getString("descripcion_alojamiento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return alojamiento;
    }

    // Read for cargo
    public Cargos readCargo(int id) {
        String sql = "SELECT * FROM cargos WHERE id_cargo = ?";
        Cargos cargo = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cargo = new Cargos();
                cargo.setCargo(rs.getInt("id_cargo"));
                cargo.setNombreCargo(rs.getString("nombre_cargo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return cargo;
    }

    // Read for cargo_persona
    public CargosPersonas readCargoPersona(int id) {
        String sql = "SELECT * FROM cargos_personas WHERE id_cargo = ?";
        CargosPersonas cargoPersona = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                cargoPersona = new CargosPersonas();
                cargoPersona.setIdCargo(rs.getInt("id_cargo"));
                cargoPersona.setIdEmpleado(rs.getInt("id_empleado"));
                cargoPersona.setFechaInicioCargo(rs.getDate("fecha_inicio_cargo"));
                cargoPersona.setFechaFinCargo(rs.getDate("fecha_fin_cargo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return cargoPersona;
    }

    // Read for estado_reserva
    public EstadosReserva readEstadoReserva(int id) {
        String sql = "SELECT * FROM estados_reserva WHERE id_estado_reserva = ?";
        EstadosReserva estadoReserva = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                estadoReserva = new EstadosReserva();
                estadoReserva.setEstadoReserva(rs.getInt("id_estado_reserva"));
                estadoReserva.setNombreEstadoReserva(rs.getString("nombre_estado_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return estadoReserva;
    }

    // Read for estado_reservacion
    public EstadosReservacion readEstadoReservacion(int id) {
        String sql = "SELECT * FROM estados_reservacion WHERE id_estado_reserva = ?";
        EstadosReservacion estadoReservacion = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                estadoReservacion = new EstadosReservacion();
                estadoReservacion.setIdEstadoReserva(rs.getInt("id_estado_reserva"));
                estadoReservacion.setIdReserva(rs.getInt("id_reserva"));
                estadoReservacion.setFechaHoraInicioEstadoReserva(rs.getTimestamp("fecha_hora_inicio_estado_reserva"));
                estadoReservacion.setFechaHoraFinEstadoReserva(rs.getTimestamp("fecha_hora_fin_estado_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return estadoReservacion;
    }

    // Read for pasadia
    public Pasadias readPasadia(int id) {
        String sql = "SELECT * FROM pasadias WHERE id_pasadia = ?";
        Pasadias pasadia = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pasadia = new Pasadias();
                pasadia.setIdPasadia(rs.getInt("id_pasadia"));
                pasadia.setIdPersona(rs.getInt("id_cliente"));
                pasadia.setIdEmpleado(rs.getInt("id_empleado"));
                pasadia.setFechaHoraIngresoFromTimestamp(rs.getTimestamp("fecha_hora_ingreso"));
                pasadia.setFechaHoraSalidaFromTimestamp(rs.getTimestamp("fecha_hora_salida"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return pasadia;
    }

    // Read for persona
    public Personas readPersona(int id) {
        String sql = "SELECT * FROM personas WHERE id_persona = ?";
        Personas persona = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                persona = new Personas();
                persona.setIdPersona(rs.getInt("id_persona"));
                persona.setNumeroDocumentoPersona(rs.getInt("numero_documento_persona"));
                persona.setIdTipoDocumento(rs.getInt("id_tipo_documento"));
                persona.setIdTipoCliente(rs.getInt("id_tipo_cliente"));
                persona.setIdTipoAfiliado(rs.getInt("id_tipo_afiliado"));
                persona.setNombreCompletoPersona(rs.getString("nombre_completo_persona"));
                persona.setTelefonoPersona(rs.getString("telefono_persona"));
                persona.setCorreoElectronicoPersona(rs.getString("correo_electronico_persona"));
                persona.setDireccionPersona(rs.getString("direccion_persona"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return persona;
    }

    // Read for recibo
    public Recibos readRecibo(int id) {
        String sql = "SELECT * FROM recibos WHERE id_recibo = ?";
        Recibos recibo = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                recibo = new Recibos();
                recibo.setIdRecibo(rs.getInt("id_recibo"));
                recibo.setIdEmpleado(rs.getInt("id_empleado"));
                recibo.setIdPasadia(rs.getInt("id_pasadia"));
                recibo.setIdCliente(rs.getInt("id_cliente"));
                recibo.setIdReserva(rs.getInt("id_reserva"));
                recibo.setDescuentoAcompaniantes(rs.getInt("descuento_acompaniantes"));
                recibo.setDescuentoTipoCliente(rs.getInt("descuento_tipo_cliente"));
                recibo.setValorRecibo(rs.getFloat("valor_recibo"));
                recibo.setDescripcionRecibo(rs.getString("descripcion_recibo"));
                recibo.setFechaHoraRecibo(rs.getTimestamp("fecha_hora_recibo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return recibo;
    }

    // Read for reservacion_alojamiento
    public ReservacionesAlojamiento readReservacionAlojamiento(int id) {
        String sql = "SELECT * FROM reservaciones_alojamientos WHERE id_reservacion_alojamiento = ?";
        ReservacionesAlojamiento reservacionAlojamiento = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                reservacionAlojamiento = new ReservacionesAlojamiento();
                reservacionAlojamiento.setIdReserva(rs.getInt("id_reservacion_alojamiento"));
                reservacionAlojamiento.setIdAlojamiento(rs.getInt("id_alojamiento"));
                reservacionAlojamiento.setIdReserva(rs.getInt("id_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return reservacionAlojamiento;
    }

    // Read for reserva
    public Reservas readReserva(int id) {
        String sql = "SELECT * FROM reservas WHERE id_reserva = ?";
        Reservas reserva = null;
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                reserva = new Reservas();
                reserva.setIdReserva(rs.getInt("id_reserva"));
                reserva.setFechaIngReserva(rs.getDate("fecha_inicio_reserva"));
                reserva.setFechaFinReserva(rs.getDate("fecha_fin_reserva"));
                reserva.setIdCliente(rs.getInt("id_cliente"));
                reserva.setIdEmpleado(rs.getInt("id_empleado"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
        return reserva;
    }
}
