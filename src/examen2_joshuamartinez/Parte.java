package examen2_joshuamartinez;
public class Parte {
    private int Tiempo;

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
