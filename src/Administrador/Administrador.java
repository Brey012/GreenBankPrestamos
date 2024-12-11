package Administrador;

public class Administrador {

    //atributos admi
    String nivelAcceso, departamento;
    int fechaInicio;

    //constructor
    public Administrador(String departamento, int fechaInicio) {
        this.departamento = departamento;
        this.fechaInicio = fechaInicio;
    }

    //metodo
    public void crearUsuario(){
        System.out.println("el adminitrador puede crear un nuevo usuario en el sistema");
    }

    public void modificarUsuario(){
        System.out.println("el administrador puede modifica la informacion de un usuario existente");
    }

    public void eliminarUsuario(){
        System.out.println("el administrador puede eliminar un usuario del sistema");
    }

    public void asignarPermiso(){
        System.out.println("el administrador puede asignar permisos especificos a un usuario o grupo de usuario");
    }





}
