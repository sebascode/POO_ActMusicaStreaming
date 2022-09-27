/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.pgy2121.proyectomusica.DTO;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 *
 * @author scode
 */

/*
 * En una primera etapa, almacenamos la información de las canciones que tiene 
 * una lista. La canción tiene un título, un artista, tiempo de duración, 
 * si es favorita o no y si se encuentra descargada o no en el dispositivo.
 */
public class Cancion {
    private String titulo;
    private String artista;
    private Duration duracion;
    private boolean favorita;
    private boolean descargada;
    
    private int tiempoActual;
    
    public Cancion()
    {
        this.titulo = "";
        this.artista = "";
        this.duracion = Duration.ZERO;
        this.favorita = false;
        this.descargada = false;
        this.tiempoActual = 0;
    }

    public Cancion(String titulo, String artista, Duration duracion, boolean favorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.favorita = favorita;
        this.descargada = descargada;
        this.tiempoActual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Duration getDuracion() {
        return duracion;
    }
    
    public long getDuracionMinutes(){
        return duracion.toMinutes();
    }
    
    public String getDuracionString(){
        return duracion.toString()
                .replace("PT", "")
                .replace("M", ":")
                .replace("S", "");
    }

    public void setDuracion(long duracion) {
        this.duracion = this.duracion.plus(duracion, ChronoUnit.SECONDS);
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
    // Que permita adelantar la canción en una cantidad variable de segundos
    public void Adelanter(int donde){
        this.tiempoActual = donde;
    }
    
    // Que imprima el título, artista y tiempo de duración de una canción en minutos y segundos, ejemplo: 3:45
    public void Imprimir(){
        String strDuracion = this.getDuracionString();
        
        System.out.println(this.artista + " - " + this.titulo + " ("+ strDuracion + ") " );
    }
    
    /* Que retorne si la canción es larga o normal. Una canción larga es aquella
     * que su duración es de 5 minutos o más
     */
    public boolean esLarga(){
        int minutosTope = 5 * 60;
        return this.getDuracionMinutes() > minutosTope;
    }
    
    
}
