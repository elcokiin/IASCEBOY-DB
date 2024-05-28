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
}
