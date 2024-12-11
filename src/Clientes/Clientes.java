package Clientes;

public class Clientes {
    private String idCliente;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;
    private String segmento;
    private List<String> historialCompras;

    // Constructor
    public Cliente(String idCliente, String direccion, String telefono, String fechaNacimiento, String segmento, List<String> historialCompras) {
        this.idCliente = idCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.segmento = segmento;
        this.historialCompras = historialCompras;
    }

    // Métodos getter y setter
    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
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

    public List<String> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<String> historialCompras) {
        this.historialCompras = historialCompras;
    }
        // Método para realizar un nuevo pedido
        public void realizarPedido(String pedido) {
            historialCompras.add(pedido);
            System.out.println("Pedido realizado: " + pedido);
        }

        // Método para cancelar un pedido
        public void cancelarPedido(String pedido) {
            if (historialCompras.contains(pedido)) {
                historialCompras.remove(pedido);
                System.out.println("Pedido cancelado: " + pedido);
            } else {
                System.out.println("El pedido no existe en el historial.");
            }
        }

        // Método para ver el historial de pedidos
        public void verHistorialPedidos() {
            if (historialCompras.isEmpty()) {
                System.out.println("El historial de pedidos está vacío.");
            } else {
                System.out.println("Historial de pedidos:");
                for (String pedido : historialCompras) {
                    System.out.println(pedido);
                }
            }
        }

        // Método para actualizar la información personal del cliente
        public void actualizarInformacionPersonal(String nuevaDireccion, String nuevoTelefono) {
            this.direccion = nuevaDireccion;
            this.telefono = nuevoTelefono;
            System.out.println("Información personal actualizada:");
            System.out.println("Nueva dirección: " + nuevaDireccion);
            System.out.println("Nuevo teléfono: " + nuevoTelefono);
        }
    }
}







