package demo.classes;
public class Mascota {
    private String nombre;
    
    private String raza;
    
    private int edad;
    
    private String tipoMascota;

    public Mascota(String nombre, String raza, int edad, String tipoMascota){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
    }

    String obtenerDatosMascota(){
        String datos_mascota = "Nombre: "+nombre+" Raza: "+raza+ " Edad: "+edad+" tipo mascota: "+ tipoMascota;
        return datos_mascota;
    }
    

    public void ActualizarMascota(Mascota mascotaActualizar, String nombre, String raza, int edad, String tipoMascota){
        mascotaActualizar.nombre = nombre;
        mascotaActualizar.raza = raza;
        mascotaActualizar.edad = edad;
        mascotaActualizar.tipoMascota = tipoMascota;
        System.out.println("Datos actualizados");
    }

    public void EliminarMascota(Mascota mascotaEliminar){
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
}
