package examen2_joshuamartinez;

import java.io.Serializable;

public class Pantalla extends Parte implements Serializable {

    private String Tactil, Tipo;

    private static final long SerialVersionUID = 777L;

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
