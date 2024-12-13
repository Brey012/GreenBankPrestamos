package Menus;

import Usuarios.Administrador;
import Usuarios.Clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrador {
    private ArrayList<Clientes> clientes;
    private Scanner scanner = new Scanner(System.in);
    private Administrador administrador;

    public MenuAdministrador(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
        this.administrador = new Administrador(0, "Admin", "Admin", "admin@example.com", "admin123", "", "", 1, "Administrador", "");
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Administrador:");
            System.out.println("1. Eliminar Cliente");
            System.out.println("2. Modificar Datos de Cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    eliminarCliente();
                    break;
                case 2:
                    cambiarDatosCliente();
                    break;
                case 3:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private void eliminarCliente() {
        System.out.println("Ingrese el email del cliente a eliminar: ");
        String email = scanner.nextLine();
        Clientes clienteAEliminar = null;

        for (Clientes cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                clienteAEliminar = cliente;
                break;
            }
        }

        if (clienteAEliminar != null) {
            clientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado con éxito.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private void cambiarDatosCliente() {
        System.out.println("Ingrese el email del cliente a modificar: ");
        String email = scanner.nextLine();
        Clientes clienteAModificar = null;

        for (Clientes cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                clienteAModificar = cliente;
                break;
            }
        }

        if (clienteAModificar != null) {
            System.out.println("Ingrese el nuevo nombre del cliente: ");
            clienteAModificar.setNombre(scanner.nextLine());
            System.out.println("Ingrese el nuevo apellido del cliente: ");
            clienteAModificar.setApellido(scanner.nextLine());
            System.out.println("Ingrese el nuevo email del cliente: ");
            clienteAModificar.setEmail(scanner.nextLine());
            System.out.println("Ingrese la nueva contraseña del cliente: ");
            clienteAModificar.setContrasena(scanner.nextLine());
            System.out.println("Ingrese la nueva dirección del cliente: ");
            clienteAModificar.setDireccion(scanner.nextLine());
            System.out.println("Ingrese el nuevo teléfono del cliente: ");
            clienteAModificar.setTelefono(scanner.nextLine());
            System.out.println("Ingrese la nueva fecha de nacimiento del cliente: ");
            clienteAModificar.setFechaNacimiento(scanner.nextLine());
            System.out.println("Ingrese el nuevo segmento del cliente: ");
            clienteAModificar.setSegmento(scanner.nextLine());

            System.out.println("Datos del cliente modificados con éxito.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}