package examen2_joshuamartinez;
public class Tecnico {
    private String Nombre;
    private int Edad;
    private String Genero;
    private int cantidad;

    public Tecnico(String Nombre, int Edad, String Genero, int cantidad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
