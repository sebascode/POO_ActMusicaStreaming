/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cl.duoc.pgy2121.proyectomusica;

import cl.duoc.pgy2121.proyectomusica.DTO.Cancion;

/**
 *
 * @author scode
 */
public class ProyectoMusica {

    public static void main(String[] args) {
        Cancion mansoTema = new Cancion();
        mansoTema.setArtista("Slipknot");
        mansoTema.setTitulo("Before I Forget");
        mansoTema.setDuracion(278);
        mansoTema.setDescargada(true);
        mansoTema.setFavorita(true);
        
        mansoTema.Imprimir();
        System.out.println("¿Diría usted que es un tema largo? "+ (mansoTema.esLarga() ? "Sip" : "Nope"));
    }
}