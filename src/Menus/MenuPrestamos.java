package Menus;

import Usuarios.Clientes;
import java.util.Scanner;

public class MenuPrestamos {
    private Clientes cliente;
    private Scanner scanner = new Scanner(System.in);

    public MenuPrestamos(Clientes cliente) {
        this.cliente = cliente;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Préstamos:");
            System.out.println("1. Comprar Préstamo de Vivienda");
            System.out.println("2. Comprar Préstamo Personal");
            System.out.println("3. Comprar Préstamo Empresarial");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    new MenuPrestamoVivienda(cliente).mostrarMenu();
                    break;
                case 2:
                    new MenuPrestamoPersonal(cliente).mostrarMenu();
                    break;
                case 3:
                    new MenuPrestamoEmpresarial(cliente).mostrarMenu();
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}