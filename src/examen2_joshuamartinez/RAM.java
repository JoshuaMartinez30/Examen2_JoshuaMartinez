package examen2_joshuamartinez;

import java.io.Serializable;

public class RAM extends Parte implements Serializable {

    private int Tamaño;
    private String Marca;

    private static final long SerialVersionUID = 777L;

    public RAM() {
    }

    public RAM(int Tamaño, String Marca, int Tiempo) {
        super(Tiempo);
        this.Tamaño = Tamaño;
        this.Marca = Marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public String toString() {
        return "RAM{" + "Tamaño=" + Tamaño + ", Marca=" + Marca + '}';
    }
}
