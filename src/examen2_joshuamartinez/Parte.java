package examen2_joshuamartinez;

import java.io.Serializable;

public class Parte implements Serializable {

    private int Tiempo;

    private static final long SerialVersionUID = 777L;

    public Parte() {
    }

    public Parte(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    @Override
    public String toString() {
        return "Parte{" + "Tiempo=" + Tiempo + '}';
    }

}
