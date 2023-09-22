package demo.usuario;

public class Usuario {
    //Atributos
    private String nombre;
    private String apellido;
    private String numeroContacto;
    private String direccion;
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
    public String getNumeroContacto() {
        return numeroContacto;
    }
    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Constructor
    public Usuario(String nombre, String apellido, String numeroContacto, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroContacto = numeroContacto;
        this.direccion = direccion;
    }
    //Metodo
    public void updateUser(Usuario updUser,String nombre, String apellido, String numeroContacto, String direccion){
        updUser.nombre = nombre;
        updUser.apellido = apellido;
        updUser.numeroContacto = numeroContacto;
        updUser.direccion = direccion;
        System.out.println("Modificado ._.");
    }
    public void deleteUser(Usuario delUsuario){
        delUsuario = null;
        System.out.println("Eliminado x");
    }

}
