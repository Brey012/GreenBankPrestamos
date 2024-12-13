package Menus;

import Prestamos.PrestamoPersonal;
import Usuarios.Clientes;
import java.util.Scanner;

public class MenuPrestamoPersonal {
    private Clientes cliente;
    private Scanner scanner = new Scanner(System.in);

    public MenuPrestamoPersonal(Clientes cliente) {
        this.cliente = cliente;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Préstamo Personal:");
            System.out.println("1. Comprar Préstamo");
            System.out.println("2. Calcular Cuota Mensual");
            System.out.println("3. Calcular Interés Total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    comprarPrestamo();
                    break;
                case 2:
                    calcularCuotaMensual();
                    break;
                case 3:
                    calcularInteresTotal();
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    private void comprarPrestamo() {
        System.out.println("Ingrese el monto del préstamo:");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la tasa de interés:");
        double tasaInteres = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el plazo en meses:");
        int plazo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la finalidad del préstamo:");
        String finalidad = scanner.nextLine();
        System.out.println("¿El préstamo tiene garantía? (true/false):");
        boolean garantia = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el plazo máximo:");
        int plazoMaximo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la tasa de interés máxima:");
        double tasaInteresMaxima = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la comisión de apertura:");
        double comisionApertura = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la comisión por mora:");
        double comisionMora = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("¿El préstamo incluye seguro de vida? (true/false):");
        boolean seguroVida = scanner.nextBoolean();
        scanner.nextLine(); // Consumir el salto de línea

        PrestamoPersonal prestamo = new PrestamoPersonal(0, monto, "", tasaInteres, plazo, finalidad, garantia, plazoMaximo, tasaInteresMaxima, comisionApertura, comisionMora, seguroVida);
        cliente.addPrestamo(prestamo);
        System.out.println("Préstamo personal adquirido con éxito.");
    }

    private void calcularCuotaMensual() {
        System.out.println("Ingrese el monto del préstamo:");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la tasa de interés:");
        double tasaInteres = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el plazo en meses:");
        int plazo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        PrestamoPersonal prestamo = new PrestamoPersonal(0, monto, "", tasaInteres, plazo, "", false, 0, 0, 0, 0, false);
        double cuotaMensual = prestamo.calcularCuotaMensual();
        System.out.println("La cuota mensual es: " + cuotaMensual);
    }

    private void calcularInteresTotal() {
        System.out.println("Ingrese el monto del préstamo:");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la tasa de interés:");
        double tasaInteres = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el plazo en meses:");
        int plazo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        PrestamoPersonal prestamo = new PrestamoPersonal(0, monto, "", tasaInteres, plazo, "", false, 0, 0, 0, 0, false);
        double interesTotal = prestamo.calcularInteresTotal();
        System.out.println("El interés total es: " + interesTotal);
    }
}