package demo;

import demo.mascota.Mascota;
import demo.mascota.TipoMascota;    

public class Prueba {
    public static void main(String[] args) {
        TipoMascota perro = TipoMascota.PERRO;
        Mascota juanchis = new Mascota("juancho", "chandoso", 2, perro);
        String mensaje = juanchis.obtenerDatosMascota();
        System.out.println(mensaje);
        // String juanchis2 = juanchis.crearMascota("nombre","chandoso", 18, "perro"); 
    }
}
