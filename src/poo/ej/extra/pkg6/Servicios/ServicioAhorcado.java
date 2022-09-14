package poo.ej.extra.pkg6.Servicios;

import java.util.Scanner;
import poo.ej.extra.pkg6.Entidades.Ahorcado;

public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {

        Ahorcado juego = new Ahorcado();

        System.out.println("Ingrese la palabra");
        String pal = leer.next();

        int let = pal.length();

//
        System.out.println("Ingrese la cantidad de jugadas");
        int jug = leer.nextInt();

//        
        

        String[] palabra;
        palabra = new String[let];

        for (int i = 0; i < let; i++) {

            palabra[i] = pal.substring(i, i + 1);
        }

        juego.setPalabra(palabra);
        juego.setCantLetras(let);
        juego.setJugadasMax(jug);

        return juego;
    }

    public void  longitud(Ahorcado juego) {
        System.out.println(" ");
        System.out.println("La palabra tiene " +juego.getCantLetras() +" letras");
        
     
    }

    public void buscarLetra(Ahorcado juego) {

        int encon = 0;
        int faltante = juego.getCantLetras();

        do {
            boolean error = false;
            System.out.println("Presiona la tecla a buscar en la palabra");
            String buscar = leer.next();
            System.out.println(" ");

            for (int i = 0; i < juego.getCantLetras(); i++) {

                if (juego.getPalabra()[i].equalsIgnoreCase(buscar)) {

                    System.out.println("La palabra " + juego.getPalabra()[i] + " se ha encontrado");
                    encon += 1;

                    error = true;
                    juego.getPalabra()[i] = "-";
                    juego.setPalabra(juego.getPalabra());

                    faltante -= 1;
                    break;

                }

            }

            if (error == false) {
                System.out.println("La letra no se encuentra");

            }

            // public void encontradas(Ahorcado juego, int encon, boolean error) {
            if (error == true) {

                System.out.println("Letras correctas: " + encon);
                
                if (juego.getJugadasMax()>0 && faltante > 0){
                System.out.println("Faltan: " +faltante);
                
                System.out.println("Le quedan " + juego.getJugadasMax() + " intentos");
                }
                System.out.println(" ");
                

            } else {

                juego.setJugadasMax(juego.getJugadasMax() - 1);
                if (juego.getJugadasMax() > 0) {
                    System.out.println("Le quedan " + juego.getJugadasMax() + " intentos");
                    System.out.println(" ");
                }

              
            }

        } while (faltante > 0 && juego.getJugadasMax() > 0);

    }
    
    public void juego() {

       
        Ahorcado juego = crearJuego();
        longitud(juego);
        buscarLetra(juego);
        System.out.println(" ");
        if (juego.getJugadasMax() > 0) {

            System.out.println("Felicitaciones, ha completado exitosamente el juego!!");
        }
        if (juego.getJugadasMax() == 0) {
            System.out.println("Se acabaron los intentos, vuelva prontos");
        }
           
    }
   
    
}

//    public void juego(Ahorcado juego,String[] palabra, int letras, int jugadas) {
//
//        crearJuego();
//        buscarLetra(juego,palabra);
//        System.out.println(" ");

