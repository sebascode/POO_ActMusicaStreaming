package cl.duoc.pgy2121.proyectomusica.DTO;

import java.util.ArrayList;
import cl.duoc.pgy2121.proyectomusica.Exceptions.FueraDelLimiteException;

public class Playlist {
    private ArrayList<Cancion> lista;
    private String nombre;
    
    public Playlist(){
        lista = new ArrayList();
        nombre = "";
    }
    public Playlist(ArrayList<Cancion> lista, String nombre){
        this.lista = lista;
        this.nombre = nombre;
    }
    
    public ArrayList<Cancion> getLista(){
        return this.lista;
    }
    public void setLista(ArrayList<Cancion> lista){
        this.lista = lista;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void AgregarCancion(Cancion cancion){
        this.lista.add(cancion);
    }
    
    public Cancion getCancion(int posicion){
        //return this.lista.get(posicion);
        try{
            if(posicion > 6){
                FueraDelLimiteException ex = new FueraDelLimiteException();
                ex.setAccion("Taba ingresando "+ posicion + " de largo.");
                throw ex;
            }
            return this.lista.get(posicion);
        }catch(FueraDelLimiteException ex){
            System.out.println("te saliste po compadre.");
            System.out.println(ex.getAccion());
        }catch(IndexOutOfBoundsException ex){
            System.out.println("Se salio del largo :(");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("Se cayo bien rara la cosa.");
        }
        
        return null;
    }
    
    public void Imprimir(){
        System.out.println("=======================");
        System.out.println("Playlist "+ this.nombre);
        for(Cancion cancion : this.lista){
            //cancion.Imprimir();
            System.out.println(cancion);
        }
        System.out.println("=======================");
    }
}
