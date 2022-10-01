package cl.duoc.pgy2121.proyectomusica.Exceptions;

public class FueraDelLimiteException extends Exception {
    private String Accion;

    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }
    
    
}
