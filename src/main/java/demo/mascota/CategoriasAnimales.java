package demo.mascota;

import java.util.ArrayList;
import java.util.HashMap;

public class CategoriasAnimales {
    //Atributos
    HashMap<String, ArrayList<Mascota>> mascotasPorCategoria = new HashMap<>();
    //Metodos
    public void agregarMascota(String categoria, Mascota mascota) {
        if (!this.mascotasPorCategoria.containsKey(categoria)) {
            this.mascotasPorCategoria.put(categoria, new ArrayList<Mascota>());
        }
        this.mascotasPorCategoria.get(categoria).add(mascota);
    }
    public void mostrarNombresMascotas(String categoria) {
        ArrayList<Mascota> mascotas = this.mascotasPorCategoria.get(categoria);
        if (mascotas != null) {
            for (Mascota mascota : mascotas) {
                System.out.println("Nombre de la mascota: " + mascota.getNombre());
            }
        } else {
            System.out.println("No hay mascotas en la categoría " + categoria);
        }
    }
}
