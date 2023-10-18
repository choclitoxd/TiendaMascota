package demo.mascota;
public class Mascota {
    //Atributos
    private String nombre;
    private String raza;
    private int edad;
    private TipoMascota tipoMascota;
    private boolean disponible;
    private static String historial;
    public String getHistorial() {
        return historial;
    }
    public void setHistorial(String historial) {
        this.historial = historial;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }
    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    //Constructor
    public Mascota(String nombre, String raza, int edad, TipoMascota tipoMascota){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.disponible = true;
    }
    //Metodos
    public void actualizarMascota(Mascota mascotaActualizar , String nombre, String raza, int edad, TipoMascota tipoMascota){
        mascotaActualizar.setNombre(nombre);
        mascotaActualizar.setRaza(raza);
        mascotaActualizar.setEdad(edad);
        mascotaActualizar.setTipoMascota(tipoMascota);
        System.out.println("Datos actualizados");
    }

    public void eliminarMascota(Mascota mascotaEliminar){
        mascotaEliminar = null;
        System.out.println("Dato eliminado x");
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tipoMascota=" + tipoMascota +
                ", disponible=" + disponible +
                '}';
    }

    public void mostrarHistorial(){

    }
}
