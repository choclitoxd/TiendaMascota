package demo.mascota.comportamientoMascota;

import demo.mascota.Mascota;

public class Perro extends ComportamientoMascota {

    public Perro(Mascota mascota) {
        super(mascota);
        //TODO Auto-generated constructor stub
    }
    public void hacerSonido() {
        System.out.println("Guau guau!");
    }

    public void perseguirPelota() {
        System.out.println("Persiguiendo la pelota...");
    }
    
}
