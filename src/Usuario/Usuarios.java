package Usuario;

class Usuario {

    private int idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasena;
    private String fechaRegistro;
    private String ultimoAcceso;

    // Constructor
    public Usuario(int idUsuario, String nombre, String apellido, String email, String contrasena, String fechaRegistro, String ultimoAcceso) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contrasena = contrasena;
        this.fechaRegistro = fechaRegistro;
        this.ultimoAcceso = ultimoAcceso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUltimoAcceso() {
        return ultimoAcceso;
    }

    public void setUltimoAcceso(String ultimoAcceso) {
        this.ultimoAcceso = ultimoAcceso;
    }
    
    public boolean iniciarSesion(String email, String contrasena) {
        return this.email.equals(email) && this.contrasena.equals(contrasena);
    }

    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }

    public void recuperarContrasena(String email) {
        if (this.email.equals(email)) {
            System.out.println("Instrucciones enviadas a: " + email);
        }
    }

    public void actualizarPerfil(String nuevoNombre, String nuevoApellido, String nuevoEmail) {
        this.nombre = nuevoNombre;
        this.apellido = nuevoApellido;
        this.email = nuevoEmail;
    }

    public void eliminarCuenta() {
        System.out.println("Cuenta eliminada para el usuario: " + this.nombre + " " + this.apellido);
    }


}