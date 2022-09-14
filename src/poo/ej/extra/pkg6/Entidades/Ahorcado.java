
package poo.ej.extra.pkg6.Entidades;



public class Ahorcado {
    
    private String[] palabra;
    private int cantLetras;
    private int jugadasMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetras, int jugadasMax) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.jugadasMax = jugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantLetras=" + cantLetras + ", jugadasMax=" + jugadasMax + '}';
    }

    
    
    
    
    
    
    
}
