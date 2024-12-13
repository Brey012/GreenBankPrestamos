package Usuarios;

public class Administrador extends Usuarios{
    private int idAdministrador;
    private String cargo;
    private String fechaContratacion;

    public Administrador(int idUsuario, String nombre, String apellido, String email, String contrasena, String fechaRegistro, String ultimoAcceso, int idAdministrador, String cargo, String fechaContratacion) {
        super(idUsuario, nombre, apellido, email, contrasena, fechaRegistro, ultimoAcceso);
        this.idAdministrador = idAdministrador;
        this.cargo = cargo;
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
