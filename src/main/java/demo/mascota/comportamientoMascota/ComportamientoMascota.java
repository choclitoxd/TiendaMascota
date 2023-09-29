package demo.mascota.comportamientoMascota;

import demo.mascota.Mascota;

public class ComportamientoMascota {
    //Atributos 
    private Mascota mascota;
    
    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    //Constructo
    public ComportamientoMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    //Metodos
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico...");
    }
}
