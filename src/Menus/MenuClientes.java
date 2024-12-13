package Menus;

import Usuarios.Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuClientes {
    private ArrayList<Clientes> clientes;
    private Scanner scanner = new Scanner(System.in);

    public MenuClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Clientes:");
            System.out.println("1. Registrar Cliente");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Cambiar Contraseña");
            System.out.println("4. Comprar Préstamo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    if (!iniciarSesion()) {
                        System.out.println("No se pudo iniciar sesión. Intente de nuevo.");
                    }
                    break;
                case 3:
                    if (!cambiarContrasena()) {
                        System.out.println("No se pudo cambiar la contraseña. Intente de nuevo.");
                    }
                    break;
                case 4:
                    comprarPrestamo();
                    break;
                case 5:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private void registrarCliente() {
        Clientes nuevoCliente = new Clientes(0, "", "", "", "", "", "", 0, "", "", "", "");
        nuevoCliente.registrarCliente(nuevoCliente);
        clientes.add(nuevoCliente);
    }

    private boolean iniciarSesion() {
        Clientes cliente = new Clientes(0, "", "", "", "", "", "", 0, "", "", "", "");
        return cliente.iniciarSesion();
    }

    private boolean cambiarContrasena() {
        Clientes cliente = new Clientes(0, "", "", "", "", "", "", 0, "", "", "", "");
        return cliente.cambiarContrasena();
    }

    private void comprarPrestamo() {
        System.out.println("Ingrese el email del cliente: ");
        String email = scanner.nextLine();
        Clientes cliente = null;
        for (Clientes c : clientes) {
            if (c.getEmail().equals(email)) {
                cliente = c;
                break;
            }
        }
        if (cliente != null) {
            new MenuPrestamos(cliente).mostrarMenu();
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}