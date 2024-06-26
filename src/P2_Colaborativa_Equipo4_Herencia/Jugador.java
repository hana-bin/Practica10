package P2_Colaborativa_Equipo4_Herencia;

import java.util.List;

public class Jugador extends Miembro{
    private int dorsal;
    private String posicion;
    private int tantos;
    private int sanciones;
    private int valor;
    private String deporte;

    public Jugador(String nombre, String cargo, String equipo, int dorsal, String posicion, int tantos, int sanciones, String deporte) {
        super(nombre, cargo, equipo);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.tantos = tantos;
        this.sanciones = sanciones;
        this.valor = calcularValor(tantos, sanciones);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }
    public int getDorsal() {
        return dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getTantos() {
        return tantos;
    }

    public void setTantos(int tantos) {
        this.tantos = tantos;
    }

    public int getSanciones() {
        return sanciones;
    }

    public void setSanciones(int sanciones) {
        this.sanciones = sanciones;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo para calcular el valor del jugador
     * @param tantos
     * @param sanciones
     * @return valor
     */
    public static int calcularValor(int tantos, int sanciones) {
        return (tantos * 1000) - (sanciones * 500);
    }

    /**
     * Metyodo para buscar un jugador
     * @param nombre
     * @param miembros
     * @return jugador
     */
    public static Jugador buscarJugador(String nombre, List<Miembro> miembros) {
        for(Miembro m : miembros) {
            if(m.getNombre().equalsIgnoreCase(nombre) && m instanceof Jugador) {
                return (Jugador) m;
            }
        }
        return null;
    }

    @Override
    public String imprimirDatos() {
        return "+"+this.getNombre()+" "+this.getValor();
    }
}
