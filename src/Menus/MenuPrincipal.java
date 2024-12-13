package Menus;

import Usuarios.Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    private ArrayList<Clientes> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Cliente");
            System.out.println("2. Administrador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    MenuClientes menuClientes = new MenuClientes(clientes);
                    menuClientes.mostrarMenu();
                    break;
                case 2:
                    MenuAdministrador menuAdministrador = new MenuAdministrador(clientes);
                    menuAdministrador.mostrarMenu();
                    break;
                case 3:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }
}