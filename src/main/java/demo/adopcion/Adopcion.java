package demo.adopcion;

import demo.mascota.Mascota;
import demo.usuario.Usuario;

public class Adopcion {
    //Atributo
    private Usuario user;
    private Mascota masct;
    //Constructor
    public Adopcion(Usuario user, Mascota masct) {
        if(masct.isDisponible()){
            this.user = user;
            this.masct = masct;
            masct.setDisponible(false);
            System.out.println("Adoptado");
        }else{
            System.out.println("No se puede adoptar por que,disponible: " + masct.isDisponible());
        }
    }
    //Metodos
    public void datosAdopcio(){
        String nombreCliente = user.getNombre() + " " + user.getApellido();
        String nombreMascota = masct.getNombre(); 
        System.out.println("Nombre cliente: " + nombreCliente + ", Nombre mascota: " + nombreMascota);
    }
    public void guardarHistorial(){
        String nombreCliente = user.getNombre() + " " + user.getApellido();
        String contactoCliente = user.getNumeroContacto();
        String direccion = user.getDireccion();
        String nombreMascota = masct.getNombre();
        int razaMascota = masct.getEdad();
        String tipoMascota = masct.getTipoMascota().name();
        masct.setHistorial("Datos cliente: \n" + "Nombre: " + nombreCliente + "\n" + "Contacto: " + contactoCliente) ;
        masct.setHistorial(masct.getHistorial() + "\n Direccion: " + direccion + "\n /////////");
        masct.setHistorial(masct.getHistorial() +"Datos Mascota: \n" + "Nombre mascota: " +nombreMascota+ "\n Raza mascota: " + razaMascota + "\n Tipo mascota: " + tipoMascota );
    }

}
