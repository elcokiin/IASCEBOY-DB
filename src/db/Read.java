package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    private Connection connection;

    // Constructor
    public Read(Connection connection) {
        this.connection = connection;
    }

    // Read for tipos_adicional
    public void readTipoAdicional(int id) {
        String sql = "SELECT * FROM tipos_adicional WHERE id_tipo_adicional = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_tipo_adicional: " + rs.getInt("id_tipo_adicional"));
                System.out.println("nombre_tipo_adicional: " + rs.getString("nombre_tipo_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for tipos_cliente
    public void readTipoCliente(int id) {
        String sql = "SELECT * FROM tipos_cliente WHERE id_tipo_cliente = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_tipo_cliente: " + rs.getInt("id_tipo_cliente"));
                System.out.println("nombre_tipo_cliente: " + rs.getString("nombre_tipo_cliente"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for tipos_afiliado
    public void readTipoAfiliado(int id) {
        String sql = "SELECT * FROM tipos_afiliado WHERE id_tipo_afiliado = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_tipo_afiliado: " + rs.getInt("id_tipo_afiliado"));
                System.out.println("nombre_tipo_afiliado: " + rs.getString("nombre_tipo_afiliado"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for tipos_documento
    public void readTipoDocumento(int id) {
        String sql = "SELECT * FROM tipos_documento WHERE id_tipo_documento = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_tipo_documento: " + rs.getInt("id_tipo_documento"));
                System.out.println("nombre_tipo_documento: " + rs.getString("nombre_tipo_documento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for tipos_alojamiento
    public void readTipoAlojamiento(int id) {
        String sql = "SELECT * FROM tipos_alojamiento WHERE id_tipo_alojamiento = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_tipo_alojamiento: " + rs.getInt("id_tipo_alojamiento"));
                System.out.println("nombre_tipo_alojamiento: " + rs.getString("nombre_tipo_alojamiento"));
                System.out.println("valor_tipo_alojamiento: " + rs.getFloat("valor_tipo_alojamiento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for estados_reserva
    public void readEstadoReserva(int id) {
        String sql = "SELECT * FROM estados_reserva WHERE id_estado_reserva = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_estado_reserva: " + rs.getInt("id_estado_reserva"));
                System.out.println("nombre_estado_reserva: " + rs.getString("nombre_estado_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for cargos
    public void readCargo(int id) {
        String sql = "SELECT * FROM cargos WHERE id_cargo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_cargo: " + rs.getInt("id_cargo"));
                System.out.println("nombre_cargo: " + rs.getString("nombre_cargo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for temporadas
    public void readTemporada(int id) {
        String sql = "SELECT * FROM temporadas WHERE id_temporada = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_temporada: " + rs.getInt("id_temporada"));
                System.out.println(
                        "porcentaje_aplicado_por_temporada: " + rs.getFloat("porcentaje_aplicado_por_temporada"));
                System.out.println("tipo_temporada: " + rs.getString("tipo_temporada"));
                System.out.println("fecha_inicio_temporada: " + rs.getDate("fecha_inicio_temporada"));
                System.out.println("fecha_fin_temporada: " + rs.getDate("fecha_fin_temporada"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for alojamientos
    public void readAlojamiento(int id) {
        String sql = "SELECT * FROM alojamientos WHERE id_alojamiento = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_alojamiento: " + rs.getInt("id_alojamiento"));
                System.out.println("id_tipo_alojamiento: " + rs.getInt("id_tipo_alojamiento"));
                System.out.println("descripcion_alojamiento: " + rs.getString("descripcion_alojamiento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for adicionales
    public void readAdicional(int id) {
        String sql = "SELECT * FROM adicionales WHERE id_adicional = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_adicional: " + rs.getInt("id_adicional"));
                System.out.println("id_tipo_adicional: " + rs.getInt("id_tipo_adicional"));
                System.out.println("descripcion_adicional: " + rs.getString("descripcion_adicional"));
                System.out.println("valor_adicional: " + rs.getFloat("valor_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for personas
    public void readPersona(int id) {
        String sql = "SELECT * FROM personas WHERE id_persona = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_persona: " + rs.getInt("id_persona"));
                System.out.println("numero_documento_persona: " + rs.getInt("numero_documento_persona"));
                System.out.println("id_tipo_documento: " + rs.getInt("id_tipo_documento"));
                System.out.println("id_tipo_cliente: " + rs.getInt("id_tipo_cliente"));
                System.out.println("id_tipo_afiliado: " + rs.getInt("id_tipo_afiliado"));
                System.out.println("nombre_completo_persona: " + rs.getString("nombre_completo_persona"));
                System.out.println("telefono_persona: " + rs.getString("telefono_persona"));
                System.out.println("correo_electronico_persona: " + rs.getString("correo_electronico_persona"));
                System.out.println("direccion_persona: " + rs.getString("direccion_persona"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for cargos_personas
    public void readCargoPersona(int idCargo) {
        String sql = "SELECT * FROM cargos_personas WHERE id_cargo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCargo);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_cargo: " + rs.getInt("id_cargo"));
                System.out.println("id_empleado: " + rs.getInt("id_empleado"));
                System.out.println("fecha_inicio_cargo: " + rs.getDate("fecha_inicio_cargo"));
                System.out.println("fecha_fin_cargo: " + rs.getDate("fecha_fin_cargo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for pasadias
    public void readPasadia(int id) {
        String sql = "SELECT * FROM pasadias WHERE id_pasadia = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_pasadia: " + rs.getInt("id_pasadia"));
                System.out.println("id_cliente: " + rs.getInt("id_cliente"));
                System.out.println("id_empleado: " + rs.getInt("id_empleado"));
                System.out.println("fecha_hora_ingreso: " + rs.getTimestamp("fecha_hora_ingreso"));
                System.out.println("fecha_hora_salida: " + rs.getTimestamp("fecha_hora_salida"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for reservas
    public void readReserva(int id) {
        String sql = "SELECT * FROM reservas WHERE id_reserva = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_reserva: " + rs.getInt("id_reserva"));
                System.out.println("id_cliente: " + rs.getInt("id_cliente"));
                System.out.println("id_empleado: " + rs.getInt("id_empleado"));
                System.out.println("fecha_reserva: " + rs.getDate("fecha_reserva"));
                System.out.println("valor_total_reserva: " + rs.getFloat("valor_total_reserva"));
                System.out.println("fecha_ingreso_reserva: " + rs.getTimestamp("fecha_ingreso_reserva"));
                System.out.println("fecha_salida_reserva: " + rs.getTimestamp("fecha_salida_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for estados_reservacion
    public void readEstadoReservacion(int idEstadoReserva) {
        String sql = "SELECT * FROM estados_reservacion WHERE id_estado_reserva = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idEstadoReserva);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_estado_reserva: " + rs.getInt("id_estado_reserva"));
                System.out.println("id_reserva: " + rs.getInt("id_reserva"));
                System.out.println(
                        "fecha_hora_inicio_estado_reserva: " + rs.getTimestamp("fecha_hora_inicio_estado_reserva"));
                System.out
                        .println("fecha_hora_fin_estado_reserva: " + rs.getTimestamp("fecha_hora_fin_estado_reserva"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for reservaciones_alojamientos
    public void readReservacionAlojamiento(int idReserva) {
        String sql = "SELECT * FROM reservaciones_alojamientos WHERE id_reserva = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idReserva);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_reserva: " + rs.getInt("id_reserva"));
                System.out.println("id_alojamiento: " + rs.getInt("id_alojamiento"));
                System.out.println("id_temporada: " + rs.getInt("id_temporada"));
                System.out.println(
                        "fecha_ingreso_reserva_alojamiento: " + rs.getDate("fecha_ingreso_reserva_alojamiento"));
                System.out
                        .println("fecha_salida_reserva_alojamiento: " + rs.getDate("fecha_salida_reserva_alojamiento"));
                System.out.println("valor_reserva_alojamiento: " + rs.getFloat("valor_reserva_alojamiento"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for recibos
    public void readRecibo(int id) {
        String sql = "SELECT * FROM recibos WHERE id_recibo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_recibo: " + rs.getInt("id_recibo"));
                System.out.println("id_empleado: " + rs.getInt("id_empleado"));
                System.out.println("id_pasadia: " + rs.getInt("id_pasadia"));
                System.out.println("id_cliente: " + rs.getInt("id_cliente"));
                System.out.println("id_reserva: " + rs.getInt("id_reserva"));
                System.out.println("descuento_acompaniantes: " + rs.getInt("descuento_acompaniantes"));
                System.out.println("descuento_tipo_cliente: " + rs.getInt("descuento_tipo_cliente"));
                System.out.println("valor_recibo: " + rs.getFloat("valor_recibo"));
                System.out.println("descripcion_recibo: " + rs.getString("descripcion_recibo"));
                System.out.println("fecha_hora_recibo: " + rs.getTimestamp("fecha_hora_recibo"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }

    // Read for adicionales_recibos
    public void readAdicionalRecibo(int idAdicional) {
        String sql = "SELECT * FROM adicionales_recibos WHERE id_adicional = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idAdicional);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("id_adicional: " + rs.getInt("id_adicional"));
                System.out.println("id_recibo: " + rs.getInt("id_recibo"));
                System.out.println("cantidad_adicional: " + rs.getInt("cantidad_adicional"));
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        }
    }
}
