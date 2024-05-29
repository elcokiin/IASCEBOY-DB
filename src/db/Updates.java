package db;

// .jar de Oracle
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.*;

public class Updates {

    private Connection connection;

    public Updates(Connection connection) {
        this.connection = connection;
    }

    // Actualiza tipos_adicional
    public void updateTipoAdicional(TiposAdicional tipoAdicional) throws SQLException {
        String sql = "UPDATE tipos_adicional SET nombre_tipo_adicional = ? WHERE id_tipo_adicional = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoAdicional.getNombreTipoAdicional());
            statement.setInt(2, tipoAdicional.getTipoAdicional());
            statement.executeUpdate();
        }
    }

    // Actualiza tipos_cliente
    public void updateTipoCliente(TiposCliente tipoCliente) throws SQLException {
        String sql = "UPDATE tipos_cliente SET nombre_tipo_cliente = ? WHERE id_tipo_cliente = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoCliente.getNombreTipoAfiliado());
            statement.setInt(2, tipoCliente.getTipoAfiliado());
            statement.executeUpdate();
        }
    }

    // Actualiza tipos_afiliado
    public void updateTipoAfiliado(TiposAfiliado tipoAfiliado) throws SQLException {
        String sql = "UPDATE tipos_afiliado SET nombre_tipo_afiliado = ? WHERE id_tipo_afiliado = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoAfiliado.getNombreTipoAfiliado());
            statement.setInt(2, tipoAfiliado.getTipoAfiliado());
            statement.executeUpdate();
        }
    }

    // Actualiza tipos_documento
    public void updateTipoDocumento(TiposDocumento tipoDocumento) throws SQLException {
        String sql = "UPDATE tipos_documento SET nombre_tipo_documento = ? WHERE id_tipo_documento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoDocumento.getNombreTipoDocumento());
            statement.setInt(2, tipoDocumento.getTipoDocumento());
            statement.executeUpdate();
        }
    }

    // Actualiza tipos_alojamiento
    public void updateTipoAlojamiento(TiposAlojamiento tipoAlojamiento)
            throws SQLException {
        String sql = "UPDATE tipos_alojamiento SET nombre_tipo_alojamiento = ?, valor_tipo_alojamiento = ? WHERE id_tipo_alojamiento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, tipoAlojamiento.getNombreTipoAlojamiento());
            statement.setFloat(2, tipoAlojamiento.getValorTipoAlojamiento());
            statement.setInt(3, tipoAlojamiento.getTipoAlojamiento());
            statement.executeUpdate();
        }
    }

    // Actualiza estados_reserva
    public void updateEstadoReserva(EstadosReserva estadoReserva) throws SQLException {
        String sql = "UPDATE estados_reserva SET nombre_estado_reserva = ? WHERE id_estado_reserva = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, estadoReserva.getNombreEstadoReserva());
            statement.setInt(2, estadoReserva.getEstadoReserva());
            statement.executeUpdate();
        }
    }

    // Actualiza cargos
    public void updateCargo(Cargos cargo) throws SQLException {
        String sql = "UPDATE cargos SET nombre_cargo = ? WHERE id_cargo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cargo.getNombreCargo());
            statement.setInt(2, cargo.getCargo());
            statement.executeUpdate();
        }
    }

    // Actualiza temporadas
    public void updateTemporada(Temporadas temporada) throws SQLException {
        String sql = "UPDATE temporadas SET porcentaje_aplicado_por_temporada = ?, tipo_temporada = ?, fecha_inicio_temporada = ?, fecha_fin_temporada = ? WHERE id_temporada = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setFloat(1, temporada.getPorcentajeAplicadoPorTemporada());
            statement.setString(2, String.valueOf(temporada.getTipoTemporada()));
            statement.setDate(3, temporada.getFechaInicioTemporada());
            statement.setDate(4, temporada.getFechaFinTemporada());
            statement.setInt(5, temporada.getIdTemporada());
            statement.executeUpdate();
        }
    }

    // Actualiza alojamientos
    public void updateAlojamiento(Alojamientos alojamiento) throws SQLException {
        String sql = "UPDATE alojamientos SET id_tipo_alojamiento = ?, descripcion_alojamiento = ? WHERE id_alojamiento = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, alojamiento.getIdTipoAlojamiento());
            statement.setString(2, alojamiento.getDescripcionAlojamiento());
            statement.setInt(3, alojamiento.getIdAlojamiento());
            statement.executeUpdate();
        }
    }

    // Actualiza adicionales
    public void updateAdicional(Adicionales adicional) throws SQLException {
        String sql = "UPDATE adicionales SET id_tipo_adicional = ?, descripcion_adicional = ?, valor_adicional = ? WHERE id_adicional = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, adicional.getIdTipoAdicional());
            statement.setString(2, adicional.getDescripcionAdicional());
            statement.setFloat(3, adicional.getValorAdicional());
            statement.setInt(4, adicional.getIdAdicional());
            statement.executeUpdate();
        }
    }

    // Actualiza personas
    public void updatePersona(Personas person) throws SQLException {
        String sql = "UPDATE personas SET nombre_completo_persona = ?, numero_documento_persona = ?, id_tipo_documento = ?, "
                +
                "id_tipo_cliente = ?, id_tipo_afiliado = ?, telefono_persona = ?, correo_electronico_persona = ?, direccion_persona = ? "
                +
                "WHERE id_persona = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, person.getNombreCompletoPersona());
            statement.setInt(2, person.getNumeroDocumentoPersona());
            statement.setInt(3, person.getIdTipoDocumento());
            statement.setInt(4, person.getIdTipoCliente());
            statement.setInt(5, person.getIdTipoAfiliado());
            statement.setString(6, person.getTelefonoPersona());
            statement.setString(7, person.getCorreoElectronicoPersona());
            statement.setString(8, person.getDireccionPersona());
            statement.setInt(9, person.getIdPersona());
            statement.executeUpdate();
        }
    }

    // Actualiza cargos_personas
    public void updateCargoPersona(CargosPersonas cargoPersona) throws SQLException {
        String sql = "UPDATE cargos_personas SET fecha_inicio_cargo = ?, fecha_fin_cargo = ? WHERE id_cargo = ? AND id_empleado = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setDate(1, cargoPersona.getFechaInicioCargo());
            statement.setDate(2, cargoPersona.getFechaFinCargo());
            statement.setInt(3, cargoPersona.getIdCargo());
            statement.setInt(4, cargoPersona.getIdEmpleado());
            statement.executeUpdate();
        }
    }

    // Actualiza pasadias
    public void updatePasadia(Pasadias pasadia) throws SQLException {
        String sql = "UPDATE pasadias SET id_cliente = ?, id_empleado = ?, fecha_hora_ingreso = ?, fecha_hora_salida = ? WHERE id_pasadia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, pasadia.getIdPersona());
            statement.setInt(2, pasadia.getIdEmpleado());
            statement.setTimestamp(3, pasadia.getFechaHoraIngresoAsTimestamp());
            statement.setTimestamp(4, pasadia.getFechaHoraSalidaAsTimestamp());
            statement.setInt(5, pasadia.getIdPasadia());
            statement.executeUpdate();
        }
    }

    // Actualiza reservas
    public void updateReserva(Reservas reserva) throws SQLException {
        String sql = "UPDATE reservas SET id_cliente = ?, id_empleado = ?, fecha_reserva = ?, valor_total_reserva = ?, fecha_ingreso_reserva = ?, fecha_salida_reserva = ? WHERE id_reserva = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reserva.getIdCliente());
            statement.setInt(2, reserva.getIdEmpleado());
            statement.setDate(3, reserva.getFechaReserva());
            statement.setFloat(4, reserva.getValorTotalReserva());
            statement.setTimestamp(5, reserva.getFechaIngresoReserva());
            statement.setTimestamp(6, reserva.getFechaSalidaReserva());
            statement.setInt(7, reserva.getIdReserva());
            statement.executeUpdate();
        }
    }

    // Actualiza estados_reservacion
    public void updateEstadoReservacion(EstadosReservacion estadoReservacion)
            throws SQLException {
        String sql = "UPDATE estados_reservacion SET fecha_hora_inicio_estado_reserva = ?, fecha_hora_fin_estado_reserva = ? WHERE id_estado_reserva = ? AND id_reserva = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setTimestamp(1, estadoReservacion.getFechaHoraInicioEstadoReserva());
            statement.setTimestamp(2, estadoReservacion.getFechaHoraFinEstadoReserva());
            statement.setInt(3, estadoReservacion.getIdEstadoReserva());
            statement.setInt(4, estadoReservacion.getIdReserva());
            statement.executeUpdate();
        }
    }

    // Actualiza reservaciones_alojamientos
    public void updateReservacionAlojamiento(ReservacionesAlojamiento reservacionAlojamiento) throws SQLException {
        String sql = "UPDATE reservaciones_alojamientos SET id_alojamiento = ?, id_temporada = ?, fecha_ingreso_reserva_alojamiento = ?, fecha_salida_reserva_alojamiento = ?, valor_reserva_alojamiento = ? WHERE id_reserva = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, reservacionAlojamiento.getIdAlojamiento());
            statement.setInt(2, reservacionAlojamiento.getIdTemporada());
            statement.setDate(3, reservacionAlojamiento.getFechaIngresoReservaAlojamiento());
            statement.setDate(4, reservacionAlojamiento.getFechaSalidaReservaAlojamiento());
            statement.setFloat(5, reservacionAlojamiento.getValorReservaAlojamiento());
            statement.setInt(6, reservacionAlojamiento.getIdReserva());
            statement.executeUpdate();
        }
    }

    // Actualiza recibos
    public void updateRecibo(Recibos recibo) throws SQLException {
        String sql = "UPDATE recibos SET id_empleado = ?, id_pasadia = ?, id_cliente = ?, id_reserva = ?, descuento_acompaniantes = ?, descuento_tipo_cliente = ?, valor_recibo = ?, descripcion_recibo = ?, fecha_hora_recibo = ? WHERE id_recibo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, recibo.getIdEmpleado());
            statement.setInt(2, recibo.getIdPasadia());
            statement.setInt(3, recibo.getIdCliente());
            statement.setInt(4, recibo.getIdReserva());
            statement.setInt(5, recibo.getDescuentoAcompaniantes());
            statement.setInt(6, recibo.getDescuentoTipoCliente());
            statement.setFloat(7, recibo.getValorRecibo());
            statement.setString(8, recibo.getDescripcionRecibo());
            statement.setTimestamp(9, recibo.getFechaHoraRecibo());
            statement.setInt(10, recibo.getIdRecibo());
            statement.executeUpdate();
        }
    }

    // Actualiza adicionales_recibos
    public void updateAdicionalRecibo(AdicionalesRecibos adicionalRecibo)
            throws SQLException {
        String sql = "UPDATE adicionales_recibos SET cantidad_adicional = ? WHERE id_adicional = ? AND id_recibo = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, adicionalRecibo.getCantidadAdicional());
            statement.setInt(2, adicionalRecibo.getIdAdicional());
            statement.setInt(3, adicionalRecibo.getIdRecibo());
            statement.executeUpdate();
        }
    }

}
