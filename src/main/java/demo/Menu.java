package demo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import demo.mascota.Mascota;
import demo.mascota.TipoMascota;
import demo.usuario.Usuario;

public class Menu {
    public static ArrayList<Mascota> crearMascota(){
        JOptionPane.showMessageDialog(null,"Creando Mascotas");
        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        Mascota mascota1 = new Mascota("Max", "Labrador", 3, TipoMascota.PERRO);
        listaMascotas.add(mascota1);
        Mascota mascota2 = new Mascota("Whiskers", "Siamés", 2, TipoMascota.GATO);
        listaMascotas.add(mascota2);
        Mascota mascota3 = new Mascota("Tweetie", "Canario", 1, TipoMascota.PAJARO);
        listaMascotas.add(mascota3);
        return listaMascotas; 
    }
    public static ArrayList<Usuario> crearUsuario(){
        JOptionPane.showMessageDialog(null,"Creando Usuario");
        ArrayList<Usuario> listadoUsuarios = new ArrayList<Usuario>(); 
        Usuario usuario1 = new Usuario("Juan", "Pérez", "123456789", "Calle 123");
        listadoUsuarios.add(usuario1);
        Usuario usuario2 = new Usuario("María", "López", "987654321", "Avenida XYZ");
        listadoUsuarios.add(usuario2);
        Usuario usuario3 = new Usuario("Carlos", "González", "555555555", "Plaza Principal");
        listadoUsuarios.add(usuario3);
        return listadoUsuarios;
    }
    public static void menuMascota(Mascota masct){
        String[] opciones = {"Obtener datos Mascota","Update Mascota","Eliminar","Historial" };
        String seleccion = (String)JOptionPane.showInputDialog(null,"Selecciona una opción:","Lista de Opciones",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
        // Verificar si se seleccionó una opción y mostrarla
        if (seleccion != null){
            JOptionPane.showMessageDialog(null,"Seleccionaste: " + seleccion, "Opción Seleccionada",JOptionPane.INFORMATION_MESSAGE);
            //Aca hacemos casos 
            if (seleccion.equals(opciones[0])) {
                System.out.println("\n\nDatos de la Mascota: \n"+masct.obtenerDatosMascota()+"\n");
            }else if (seleccion.equals(opciones[1])) {
                pedirDatosApdateMascota(masct);
            } else if(seleccion.equals(opciones[2])){
                masct.eliminarMascota(masct);
            }else if (seleccion.equals(opciones[3])) {
                System.out.println(masct.getHistorial());
            }
        }
    }
    public static void  pedirDatosApdateMascota(Mascota masct){
        String nombre = formularioMascota("Nombre",masct.getNombre());
        String raza = formularioMascota("Raza", masct.getRaza());
        int edad = Integer.parseInt(formularioMascota("Edad", String.valueOf(masct.getEdad())));
        TipoMascota tipoMascota = formularioTipoMascota("Tipo Mascota", masct.getTipoMascota());
        masct.ActualizarMascota(masct, nombre, raza, edad, tipoMascota);
        System.out.println("\n\nDatos de la Mascota: \n"+masct.obtenerDatosMascota()+"\n");
    }
    public static String formularioMascota(String updateD, String defaultData){
        String dato = (String)JOptionPane.showInputDialog(null,"Ingrese algo:",updateD, JOptionPane.PLAIN_MESSAGE, null, null,defaultData);
        if (dato != null) {
            System.out.println("Ingresado: " + dato);
        } else {
            System.out.println("No se ingresó nada.");
        }
        return dato;
    }
    public static TipoMascota formularioTipoMascota(String updateT, TipoMascota tipoMascota){
        String[] listaTipoMascota = {TipoMascota.PERRO.toString(),TipoMascota.GATO.toString(),TipoMascota.PAJARO.toString()};
        String dato = (String)JOptionPane.showInputDialog(null,"Ingrese algo:",updateT, JOptionPane.PLAIN_MESSAGE, null, listaTipoMascota,tipoMascota.toString());
        TipoMascota datoT = tipoMascota;
        if (dato != null){
            JOptionPane.showMessageDialog(null,"Seleccionaste: " + dato, "Opción Seleccionada",JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Ingresado: " + dato);
            //Aca hacemos casos 
            switch (dato) {
                case "PERRO":
                    datoT = TipoMascota.PERRO;
                    break;
                case "GATO":
                    datoT = TipoMascota.GATO;
                    break;
                case "PAJARO":
                    datoT = TipoMascota.PAJARO;
                    break; 
                default:
                    System.out.println("Algo malo");
                    break;
            }
        }
        return datoT;
    }
    //Voy aca
    // public void menuUsuario(Usuario user){
    //     String[] opciones = {"Obtener datos Mascota","Update Mascota","Eliminar" };
    //     String seleccion = (String)JOptionPane.showInputDialog(null,"Selecciona una opción:","Lista de Opciones",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones[0]);
    //     // Verificar si se seleccionó una opción y mostrarla
    //     if (seleccion != null){
    //         JOptionPane.showMessageDialog(null,"Seleccionaste: " + seleccion, "Opción Seleccionada",JOptionPane.INFORMATION_MESSAGE);
    //         //Aca hacemos casos 
    //         if (seleccion.equals(opciones[0])) {
    //             System.out.println("\n\nDatos de la Mascota: \n"+masct.obtenerDatosMascota()+"\n");
    //         }else if (seleccion.equals(opciones[1])) {
    //             pedirDatosApdateMascota(masct);
    //         } else if(seleccion.equals(opciones[2])){
    //             masct.eliminarMascota(masct);
    //         }
    //     }
    // }   
}
