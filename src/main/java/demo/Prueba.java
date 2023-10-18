package demo;


import java.util.ArrayList;

import demo.mascota.Mascota;
import demo.usuario.Usuario;

public class Prueba {
    public static void main(String[] args) {
        ArrayList<Mascota> listaMascotas = Menu.crearMascota();
        ArrayList<Usuario> listaUsuarios = Menu.crearUsuario();
        Menu.gestionar(listaMascotas,listaUsuarios);
    }
}
