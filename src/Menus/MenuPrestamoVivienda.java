package Menus;

import Prestamos.PrestamoVivienda;
import Usuarios.Clientes;
import java.util.Scanner;

public class MenuPrestamoVivienda {
    private Clientes cliente;
    private Scanner scanner = new Scanner(System.in);

    public MenuPrestamoVivienda(Clientes cliente) {
        this.cliente = cliente;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Préstamo de Vivienda:");
            System.out.println("1. Comprar Préstamo");
            System.out.println("2. Calcular Cuota Mensual");
            System.out.println("3. Calcular Interés Total");
            System.out.println("4. Calcular Cuota Inicial");
            System.out.println("5. Salir");
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
                    calcularCuotaInicial();
                    break;
                case 5:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
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
        System.out.println("Ingrese el tipo de vivienda:");
        String tipoVivienda = scanner.nextLine();
        System.out.println("Ingrese la ciudad:");
        String ciudad = scanner.nextLine();
        System.out.println("Ingrese el valor de la vivienda:");
        double valorVivienda = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el porcentaje financiado:");
        double porcentajeFinanciado = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        PrestamoVivienda prestamo = new PrestamoVivienda(0, monto, "", tasaInteres, plazo, tipoVivienda, ciudad, valorVivienda, porcentajeFinanciado);
        cliente.addPrestamo(prestamo);
        System.out.println("Préstamo de vivienda adquirido con éxito.");
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

        PrestamoVivienda prestamo = new PrestamoVivienda(0, monto, "", tasaInteres, plazo, "", "", 0, 0);
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

        PrestamoVivienda prestamo = new PrestamoVivienda(0, monto, "", tasaInteres, plazo, "", "", 0, 0);
        double interesTotal = prestamo.calcularInteresTotal();
        System.out.println("El interés total es: " + interesTotal);
    }

    private void calcularCuotaInicial() {
        System.out.println("Ingrese el valor de la vivienda:");
        double valorVivienda = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el porcentaje financiado:");
        double porcentajeFinanciado = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        PrestamoVivienda prestamo = new PrestamoVivienda(0, 0, "", 0, 0, "", "", valorVivienda, porcentajeFinanciado);
        double cuotaInicial = prestamo.calcularCuotaIncial();
        System.out.println("La cuota inicial es: " + cuotaInicial);
    }
}