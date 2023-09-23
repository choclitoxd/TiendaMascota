package demo.mascota.comportamientoMascota;

import demo.mascota.Mascota;

public class Pajaro extends ComportamientoMascota {
    
    public Pajaro(Mascota mascota) {
        super(mascota);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío!");
    }

    public void volar() {
        System.out.println("Volando por el aire...");
    }
}
