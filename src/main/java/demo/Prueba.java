package demo;


import java.util.ArrayList;

import demo.mascota.Mascota;
import demo.usuario.Usuario;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Mascota> listaMascotas = Menu.crearMascota();
        ArrayList<Usuario> listaUsuarios = Menu.crearUsuario();
        Menu.menuMascota(listaMascotas.get(0));
        
        // TipoMascota perro = TipoMascota.PERRO;
        // Mascota juanchis = new Mascota("juancho", "chandoso", 2, perro);
        // String mensaje = juanchis.obtenerDatosMascota();
        // System.out.println(mensaje);
        // String juanchis2 = juanchis.crearMascota("nombre","chandoso", 18, "perro"); 
    }
}
