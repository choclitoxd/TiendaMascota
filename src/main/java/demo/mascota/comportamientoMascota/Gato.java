package demo.mascota.comportamientoMascota;

import demo.mascota.Mascota;

public class Gato extends ComportamientoMascota{
    public Gato(Mascota mascota) {
        super(mascota);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau!");
    }

    public void arañarMuebles() {
        System.out.println("Arañando los muebles...");
    }
}
