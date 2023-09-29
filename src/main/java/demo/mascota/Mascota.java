package demo.mascota;
public class Mascota {
    //Atributos
    private String nombre;
    private String raza;
    private int edad;
    private TipoMascota tipoMascota;
    private boolean disponible;
    private String historial;

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
    //Constructor
    public Mascota(String nombre, String raza, int edad, TipoMascota tipoMascota){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.disponible = true;
    }
    //Metodos
    public String obtenerDatosMascota(){
        String datos_mascota = "Nombre: "+nombre+", Raza: "+raza+ ", Edad: "+edad+", tipo mascota: "+ tipoMascota.name() + ", disponible: " + disponible;
        return datos_mascota;
    }    

    public void ActualizarMascota(Mascota mascotaActualizar , String nombre, String raza, int edad, TipoMascota tipoMascota){
        mascotaActualizar.nombre = nombre;
        mascotaActualizar.raza = raza;
        mascotaActualizar.edad = edad;
        mascotaActualizar.tipoMascota = tipoMascota;
        System.out.println("Datos actualizados");
    }

    public void eliminarMascota(Mascota mascotaEliminar){
        mascotaEliminar = null;
        System.out.println("Dato eliminado x");
    }

    public void mostrarHistorial(){
        
    }
}
