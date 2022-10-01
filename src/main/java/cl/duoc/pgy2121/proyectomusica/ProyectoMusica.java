package cl.duoc.pgy2121.proyectomusica;

import cl.duoc.pgy2121.proyectomusica.DTO.Cancion;
import cl.duoc.pgy2121.proyectomusica.DTO.Playlist;
import java.util.ArrayList;

public class ProyectoMusica {

    public static void main(String[] args) {
        Cancion mansoTema = new Cancion();
        mansoTema.setArtista("Slipknot");
        mansoTema.setTitulo("Before I Forget");
        mansoTema.setDuracion(4, 61);
        mansoTema.setDescargada(true);
        mansoTema.setFavorita(true);
        
        Cancion cancion2 = new Cancion();
        cancion2.setArtista("Kel Calderon");
        cancion2.setTitulo("Me creo punky");
        cancion2.setDuracion(3, 6);
        cancion2.setDescargada(true);
        cancion2.setFavorita(true);
        
        Playlist miPlaylist = new Playlist();
        miPlaylist.setNombre("de pana");
        miPlaylist.AgregarCancion(mansoTema);
        miPlaylist.AgregarCancion(cancion2);
        
        miPlaylist.Imprimir();
        
        miPlaylist.getCancion(0).setDuracion(10,5);
        System.out.println("POSICION 0: "+miPlaylist.getCancion(0));
        System.out.println("POSICION 1: "+miPlaylist.getCancion(1));
        System.out.println("POSICION 2: "+miPlaylist.getCancion(10));
    }
}