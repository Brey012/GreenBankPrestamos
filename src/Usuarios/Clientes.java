package Usuarios;

import Prestamos.Prestamos;
import java.util.ArrayList;
import java.util.Scanner;

public class Clientes extends Usuarios {
    private int idCliente;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    private String segmento;

    private ArrayList<Prestamos> prestamos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public Clientes(int idUsuario, String nombre, String apellido,
                    String email, String contrasena, String fechaRegistro,
                    String ultimoAcceso, int idCliente, String direccion,
                    String telefono, String fechaNacimiento, String segmento) {
        super(idUsuario, nombre, apellido, email, contrasena, fechaRegistro, ultimoAcceso);
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.segmento = segmento;
    }


    ArrayList<Clientes> clientes = new ArrayList<>();

    public void registrarCliente(Clientes cliente) {
        System.out.println("Ingrese el nombre del cliente: ");
        cliente.setNombre(scanner.nextLine());
        System.out.println("Ingrese el apellido del cliente: ");
        cliente.setApellido(scanner.nextLine());
        System.out.println("Ingrese el email del cliente: ");
        cliente.setEmail(scanner.nextLine());
        System.out.println("Ingrese la contraseña del cliente: ");
        cliente.setContrasena(scanner.nextLine());
        System.out.println("Ingrese la dirección del cliente: ");
        cliente.setDireccion(scanner.nextLine());
        System.out.println("Ingrese el teléfono del cliente: ");
        cliente.setTelefono(scanner.nextLine());
        System.out.println("Ingrese la fecha de nacimiento del cliente: ");
        cliente.setFechaNacimiento(scanner.nextLine());
        System.out.println("Ingrese el segmento del cliente: ");
        cliente.setSegmento(scanner.nextLine());

        clientes.add(cliente);
    }

    public boolean iniciarSesion() {
        System.out.println("Ingrese el email: ");
        String email = scanner.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        for (Clientes cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getContrasena().equals(contrasena)) {
                System.out.println("Bienvenido " + cliente.getNombre() + " " + cliente.getApellido());
                return true;
            }
        }
        System.out.println("Email o contraseña incorrectos.");
        return false;
    }

    public boolean cambiarContrasena() {
        System.out.println("Ingrese el email: ");
        String email = scanner.nextLine();
        System.out.println("Ingrese la contraseña actual: ");
        String contrasena = scanner.nextLine();

        for (Clientes cliente : clientes) {
            if (cliente.getEmail().equals(email) && cliente.getContrasena().equals(contrasena)) {
                System.out.println("Ingrese la nueva contraseña: ");
                String nuevaContrasena = scanner.nextLine();
                cliente.setContrasena(nuevaContrasena);
                System.out.println("Contraseña cambiada con éxito");
                return true;
            }
        }
        System.out.println("Email o contraseña incorrectos.");
        return false;
    }

    public void addPrestamo(Prestamos prestamo) {
        prestamos.add(prestamo);
    }


    // Getters and Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }
}



