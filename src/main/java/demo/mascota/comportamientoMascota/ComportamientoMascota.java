package demo.mascota.comportamientoMascota;

import demo.mascota.Mascota;

public class ComportamientoMascota {
    //Atributos 
    private Mascota mascota;
    
    //Constructo
    public ComportamientoMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    //Metodos
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico...");
    }
}
