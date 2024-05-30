package view;

public class Menus {
    private View view;
    public Menus(View view) {
        this.view = view;
    }

    public int getOption(int min, int max) {
        int option = 0;
        boolean valid = false;
        while (!valid) {
            option = view.readInt();
            if (option >= min && option <= max) {
                valid = true;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
        return option;
        
    }

    public void principal() {
        System.out.println("-------- Menú principal --------");
        System.out.println("1. Insertar registros");
        System.out.println("2. Eliminar registros");
        System.out.println("3. Actualizar registros");
        System.out.println("4. Consultar registros");
        System.out.println("5. Salir");
    }

    public void insert() {
        System.out.println("-------- Menú de inserción --------");
        // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento, tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos, adicionales, personas, cargos_personas, pasadias, reservas, estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
        System.out.println("1. Insertar en tipos_adicional");
        System.out.println("2. Insertar en tipos_cliente");
        System.out.println("3. Insertar en tipos_afiliado");
        System.out.println("4. Insertar en tipos_documento");
        System.out.println("5. Insertar en tipos_alojamiento");
        System.out.println("6. Insertar en estados_reserva");
        System.out.println("7. Insertar en cargos");
        System.out.println("8. Insertar en temporadas");
        System.out.println("9. Insertar en alojamientos");
        System.out.println("10. Insertar en adicionales");
        System.out.println("11. Insertar en personas");
        System.out.println("12. Insertar en cargos_personas");
        System.out.println("13. Insertar en pasadias");
        System.out.println("14. Insertar en reservas");
        System.out.println("15. Insertar en estados_reservacion");
        System.out.println("16. Insertar en reservaciones_alojamientos");
        System.out.println("17. Insertar en recibos");
        System.out.println("18. Insertar en adicionales_resibos");
        System.out.println("19. Regresar al menú principal");
    }

    public void delete() {
        System.out.println("-------- Menú de eliminación --------");
        // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento, tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos, adicionales, personas, cargos_personas, pasadias, reservas, estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
        System.out.println("1. Eliminar en tipos_adicional");
        System.out.println("2. Eliminar en tipos_cliente");
        System.out.println("3. Eliminar en tipos_afiliado");
        System.out.println("4. Eliminar en tipos_documento");
        System.out.println("5. Eliminar en tipos_alojamiento");
        System.out.println("6. Eliminar en estados_reserva");
        System.out.println("7. Eliminar en cargos");
        System.out.println("8. Eliminar en temporadas");
        System.out.println("9. Eliminar en alojamientos");
        System.out.println("10. Eliminar en adicionales");
        System.out.println("11. Eliminar en personas");
        System.out.println("12. Eliminar en cargos_personas");
        System.out.println("13. Eliminar en pasadias");
        System.out.println("14. Eliminar en reservas");
        System.out.println("15. Eliminar en estados_reservacion");
        System.out.println("16. Eliminar en reservaciones_alojamientos");
        System.out.println("17. Eliminar en recibos");
        System.out.println("18. Eliminar en adicionales_resibos");
        System.out.println("19. Regresar al menú principal");
    }

    public void read() {
        System.out.println("-------- Menú de consulta --------");
        // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento, tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos, adicionales, personas, cargos_personas, pasadias, reservas, estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
        System.out.println("1. Consultar en tipos_adicional");
        System.out.println("2. Consultar en tipos_cliente");
        System.out.println("3. Consultar en tipos_afiliado");
        System.out.println("4. Consultar en tipos_documento");
        System.out.println("5. Consultar en tipos_alojamiento");
        System.out.println("6. Consultar en estados_reserva");
        System.out.println("7. Consultar en cargos");
        System.out.println("8. Consultar en temporadas");
        System.out.println("9. Consultar en alojamientos");
        System.out.println("10. Consultar en adicionales");
        System.out.println("11. Consultar en personas");
        System.out.println("12. Consultar en cargos_personas");
        System.out.println("13. Consultar en pasadias");
        System.out.println("14. Consultar en reservas");
        System.out.println("15. Consultar en estados_reservacion");
        System.out.println("16. Consultar en reservaciones_alojamientos");
        System.out.println("17. Consultar en recibos");
        System.out.println("18. Consultar en adicionales_resibos");
        System.out.println("19. Regresar al menú principal");
    }

    public void update() {
        System.out.println("-------- Menú de actualización --------");
        // tipos_adicional, tipos_cliente, tipos_afiliado, tipos_documento, tipos_alojamiento, estados_reserva, cargos, temporadas, alojamientos, adicionales, personas, cargos_personas, pasadias, reservas, estados_reservacion, reservaciones_alojamientos, recibos, adicionales_resibos
        System.out.println("1. Actualizar en tipos_adicional");
        System.out.println("2. Actualizar en tipos_cliente");
        System.out.println("3. Actualizar en tipos_afiliado");
        System.out.println("4. Actualizar en tipos_documento");
        System.out.println("5. Actualizar en tipos_alojamiento");
        System.out.println("6. Actualizar en estados_reserva");
        System.out.println("7. Actualizar en cargos");
        System.out.println("8. Actualizar en temporadas");
        System.out.println("9. Actualizar en alojamientos");
        System.out.println("10. Actualizar en adicionales");
        System.out.println("11. Actualizar en personas");
        System.out.println("12. Actualizar en cargos_personas");
        System.out.println("13. Actualizar en pasadias");
        System.out.println("14. Actualizar en reservas");
        System.out.println("15. Actualizar en estados_reservacion");
        System.out.println("16. Actualizar en reservaciones_alojamientos");
        System.out.println("17. Actualizar en recibos");
        System.out.println("18. Actualizar en adicionales_resibos");
        System.out.println("19. Regresar al menú principal");
    }
}
