package examen2_joshuamartinez;
public class DiscoDuro extends Parte{
    
    private int Tamaño;
    private String marca;

    public DiscoDuro() {
    }

    public DiscoDuro(int Tamaño, String marca, int Tiempo) {
        super(Tiempo);
        this.Tamaño = Tamaño;
        this.marca = marca;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" + "Tamaño=" + Tamaño + ", marca=" + marca + '}';
    }
}
