package demo.mascota;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoriasAnimales {
    //Atributos
    HashMap<String, ArrayList<Mascota>> mascotasPorCategoria = new HashMap<>();
    //Metodos
    public static void agregarMascota(HashMap<String, ArrayList<Mascota>> map, String categoria, Mascota mascota) {
        if (!map.containsKey(categoria)) {
            map.put(categoria, new ArrayList<Mascota>());
        }
        map.get(categoria).add(mascota);
    }
    public static void mostrarNombresMascotas(HashMap<String, ArrayList<Mascota>> map, String categoria) {
        ArrayList<Mascota> mascotas = map.get(categoria);
        if (mascotas != null) {
            for (Mascota mascota : mascotas) {
                System.out.println("Nombre de la mascota: " + mascota.getNombre());
            }
        } else {
            System.out.println("No hay mascotas en la categoría " + categoria);
        }
    }
}
