package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientConnectionException;

import model.*;
// Importa otras clases de modelo necesarias...

public class Insertions {

    Connection connection;

    public Insertions(Connection connection) {
        this.connection = connection;
    }

    public void personas(Personas person) {
        String sql = "INSERT INTO PERSONAS (ID_PERSONA, NOMBRE_COMPLETO_PERSONA, NUMERO_DOCUMENTO_PERSONA, ID_TIPO_DOCUMENTO, " +
                "ID_TIPO_CLIENTE, ID_TIPO_AFILIADO, TELEFONO_PERSONA, CORREO_ELECTRONICO_PERSONA, DIRECCION_PERSONA) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, person.getIdPersona());
            statement.setString(2, person.getNombreCompletoPersona());
            statement.setInt(3, person.getNumeroDocumentoPersona());
            statement.setInt(4, person.getIdTipoDocumento());
            statement.setInt(5, person.getIdTipoCliente());
            statement.setInt(6, person.getIdTipoAfiliado());
            statement.setString(7, person.getTelefonoPersona());
            statement.setString(8, person.getCorreoElectronicoPersona());
            statement.setString(9, person.getDireccionPersona());

            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void tiposAdicional(TiposAdicional tipoAdicional){
        String sql = "INSERT INTO tipos_adicional (ID_TIPO_ADICIONAL, NOMBRE_TIPO_ADICIONAL) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoAdicional.getTipoAdicional());
            statement.setString(2, tipoAdicional.getNombreTipoAdicional());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
    }

    public void tiposCliente(TiposCliente tipoCliente) {
        String sql = "INSERT INTO tipos_cliente (ID_TIPO_CLIENTE, NOMBRE_TIPO_CLIENTE) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoCliente.getTipoAfiliado());
            statement.setString(2, tipoCliente.getNombreTipoAfiliado());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    // Define métodos similares para otras tablas...

    public void tiposAfiliado(TiposAfiliado tipoAfiliado) {
        String sql = "INSERT INTO tipos_afiliado (ID_TIPO_AFILIADO, NOMBRE_TIPO_AFILIADO) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoAfiliado.getTipoAfiliado());
            statement.setString(2, tipoAfiliado.getNombreTipoAfiliado());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void tiposDocumento(TiposDocumento tipoDocumento) {
        String sql = "INSERT INTO tipos_documento (ID_TIPO_DOCUMENTO, NOMBRE_TIPO_DOCUMENTO) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoDocumento.getTipoDocumento());
            statement.setString(2, tipoDocumento.getNombreTipoDocumento());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void tiposAlojamiento(TiposAlojamiento tipoAlojamiento) {
        String sql = "INSERT INTO tipos_alojamiento (ID_TIPO_ALOJAMIENTO, NOMBRE_TIPO_ALOJAMIENTO, VALOR_TIPO_ALOJAMIENTO) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, tipoAlojamiento.getTipoAlojamiento());
            statement.setString(2, tipoAlojamiento.getNombreTipoAlojamiento());
            statement.setFloat(3, tipoAlojamiento.getValorTipoAlojamiento());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void estadosReserva(EstadosReserva estadoReserva) {
        String sql = "INSERT INTO estados_reserva (ID_ESTADO_RESERVA, NOMBRE_ESTADO_RESERVA) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, estadoReserva.getEstadoReserva());
            statement.setString(2, estadoReserva.getNombreEstadoReserva());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void cargos(Cargos cargo) {
        String sql = "INSERT INTO cargos (ID_CARGO, NOMBRE_CARGO) VALUES (?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cargo.getCargo());
            statement.setString(2, cargo.getNombreCargo());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void temporadas(Temporadas temporada) {
        String sql = "INSERT INTO temporadas (ID_TEMPORADA, PORCENTAJE_APLICADO_POR_TEMPORADA, TIPO_TEMPORADA, FECHA_INICIO_TEMPORADA, FECHA_FIN_TEMPORADA) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, temporada.getIdTemporada());
            statement.setFloat(2, temporada.getPorcentajeAplicadoPorTemporada());
            statement.setInt(3, temporada.getTipoTemporada());
            statement.setDate(4, temporada.getFechaInicioTemporada());
            statement.setDate(5, temporada.getFechaFinTemporada());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void alojamientos(Alojamientos alojamiento) {
        String sql = "INSERT INTO alojamientos (ID_ALOJAMIENTO, ID_TIPO_ALOJAMIENTO, DESCRIPCION_ALOJAMIENTO) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, alojamiento.getIdAlojamiento());
            statement.setInt(2, alojamiento.getIdTipoAlojamiento());
            statement.setString(3, alojamiento.getDescripcionAlojamiento());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void adicionales(Adicionales adicional) {
        String sql = "INSERT INTO adicionales (ID_ADICIONAL, ID_TIPO_ADICIONAL, DESCRIPCION_ADICIONAL, VALOR_ADICIONAL) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, adicional.getIdAdicional());
            statement.setInt(2, adicional.getIdTipoAdicional());
            statement.setString(3, adicional.getDescripcionAdicional());
            statement.setFloat(4, adicional.getValorAdicional());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void cargosPersonas(CargosPersonas cargoPersona) {
        String sql = "INSERT INTO cargos_personas (ID_CARGO, ID_EMPLEADO, FECHA_INICIO_CARGO, FECHA_FIN_CARGO) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, cargoPersona.getIdCargo());
            statement.setInt(2, cargoPersona.getIdEmpleado());
            statement.setDate(3, cargoPersona.getFechaInicioCargo());
            statement.setDate(4, cargoPersona.getFechaFinCargo());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void pasadias(Pasadias pasadia) {
        String sql = "INSERT INTO pasadias (ID_PASADIA, ID_CLIENTE, ID_EMPLEADO, FECHA_HORA_INGRESO, FECHA_HORA_SALIDA) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, pasadia.getIdPasadia());
            statement.setInt(2, pasadia.getIdPersona());
            statement.setInt(3, pasadia.getIdEmpleado());
            statement.setTimestamp(4, pasadia.getFechaHoraIngresoAsTimestamp());
            statement.setTimestamp(5, pasadia.getFechaHoraSalidaAsTimestamp());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void reservas(Reservas reserva) {
        String sql = "INSERT INTO reservas (ID_RESERVA, ID_CLIENTE, ID_EMPLEADO, FECHA_RESERVA, VALOR_TOTAL_RESERVA, FECHA_INGRESO_RESERVA, FECHA_SALIDA_RESERVA) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reserva.getIdReserva());
            statement.setInt(2, reserva.getIdCliente());
            statement.setInt(3, reserva.getIdEmpleado());
            statement.setDate(4, reserva.getFechaReserva());
            statement.setFloat(5, reserva.getValorTotalReserva());
            statement.setTimestamp(6, reserva.getFechaIngresoReserva());
            statement.setTimestamp(7, reserva.getFechaSalidaReserva());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void estadosReservacion(EstadosReservacion estadoReservacion) {
        String sql = "INSERT INTO estados_reservacion (ID_ESTADO_RESERVA, ID_RESERVA, FECHA_HORA_INICIO_ESTADO_RESERVA, FECHA_HORA_FIN_ESTADO_RESERVA) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, estadoReservacion.getIdEstadoReserva());
            statement.setInt(2, estadoReservacion.getIdReserva());
            statement.setTimestamp(3, estadoReservacion.getFechaHoraInicioEstadoReserva());
            statement.setTimestamp(4, estadoReservacion.getFechaHoraFinEstadoReserva());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void reservacionesAlojamientos(ReservacionesAlojamiento reservacionAlojamiento) {
        String sql = "INSERT INTO reservaciones_alojamientos (ID_RESERVA, ID_ALOJAMIENTO, ID_TEMPORADA, FECHA_INGRESO_RESERVA_ALOJAMIENTO, FECHA_SALIDA_RESERVA_ALOJAMIENTO, VALOR_RESERVA_ALOJAMIENTO) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservacionAlojamiento.getIdReserva());
            statement.setInt(2, reservacionAlojamiento.getIdAlojamiento());
            statement.setInt(3, reservacionAlojamiento.getIdTemporada());
            statement.setDate(4, reservacionAlojamiento.getFechaIngresoReservaAlojamiento());
            statement.setDate(5, reservacionAlojamiento.getFechaSalidaReservaAlojamiento());
            statement.setFloat(6, reservacionAlojamiento.getValorReservaAlojamiento());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void recibos(Recibos recibo) {
        String sql = "INSERT INTO recibos (ID_RECIBO, ID_EMPLEADO, ID_PASADIA, ID_CLIENTE, ID_RESERVA, DESCUENTO_ACOMPANIANTES, DESCUENTO_TIPO_CLIENTE, VALOR_RECIBO, DESCRIPCION_RECIBO, FECHA_HORA_RECIBO) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, recibo.getIdRecibo());
            statement.setInt(2, recibo.getIdEmpleado());
            statement.setInt(3, recibo.getIdPasadia());
            statement.setInt(4, recibo.getIdCliente());
            statement.setInt(5, recibo.getIdReserva());
            statement.setInt(6, recibo.getDescuentoAcompaniantes());
            statement.setInt(7, recibo.getDescuentoTipoCliente());
            statement.setFloat(8, recibo.getValorRecibo());
            statement.setString(9, recibo.getDescripcionRecibo());
            statement.setTimestamp(10, recibo.getFechaHoraRecibo());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }

    public void adicionalesRecibos(AdicionalesRecibos adicionalRecibo) {
        String sql = "INSERT INTO adicionales_recibos (ID_ADICIONAL, ID_RECIBO, CANTIDAD_ADICIONAL) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, adicionalRecibo.getIdAdicional());
            statement.setInt(2, adicionalRecibo.getIdRecibo());
            statement.setInt(3, adicionalRecibo.getCantidadAdicional());
            statement.executeUpdate();
        }
        catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Error de integridad de datos: " + e.getMessage());
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
        } catch (SQLTimeoutException e) {
            System.out.println("Error de tiempo de espera: " + e.getMessage());
        } catch (SQLTransientConnectionException e) {
            System.out.println("Error de conexión transitoria: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        
    }


}
