package Menus;

import Prestamos.PrestamoEmpresarial;
import Usuarios.Clientes;
import java.util.Scanner;

public class MenuPrestamoEmpresarial {
    private Clientes cliente;
    private Scanner scanner = new Scanner(System.in);

    public MenuPrestamoEmpresarial(Clientes cliente) {
        this.cliente = cliente;
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("Menú de Préstamo Empresarial:");
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
        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = scanner.nextLine();
        System.out.println("Ingrese el sector económico:");
        String sectorEcnonomico = scanner.nextLine();
        System.out.println("Ingrese el plan de negocio:");
        String planNegocio = scanner.nextLine();
        System.out.println("Ingrese la evaluación de riesgo:");
        double evaluacionRiesgo = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese el destino de los fondos:");
        String destinoFondos = scanner.nextLine();

        PrestamoEmpresarial prestamo = new PrestamoEmpresarial(0, monto, "", tasaInteres, plazo, nombreEmpresa, sectorEcnonomico, planNegocio, evaluacionRiesgo, destinoFondos);
        cliente.addPrestamo(prestamo);
        System.out.println("Préstamo empresarial adquirido con éxito.");
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

        PrestamoEmpresarial prestamo = new PrestamoEmpresarial(0, monto, "", tasaInteres, plazo, "", "", "", 0, "");
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

        PrestamoEmpresarial prestamo = new PrestamoEmpresarial(0, monto, "", tasaInteres, plazo, "", "", "", 0, "");
        double interesTotal = prestamo.calcularInteresTotal();
        System.out.println("El interés total es: " + interesTotal);
    }
}