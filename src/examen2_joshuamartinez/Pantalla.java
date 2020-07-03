package examen2_joshuamartinez;
public class Pantalla extends Parte{
    private String Tactil, Tipo;

    public Pantalla() {
    }

    public Pantalla(String Tactil, String Tipo, int Tiempo) {
        super(Tiempo);
        this.Tactil = Tactil;
        this.Tipo = Tipo;
    }

    public String getTactil() {
        return Tactil;
    }

    public void setTactil(String Tactil) {
        this.Tactil = Tactil;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "Tactil=" + Tactil + ", Tipo=" + Tipo + '}';
    }
    
    
}
