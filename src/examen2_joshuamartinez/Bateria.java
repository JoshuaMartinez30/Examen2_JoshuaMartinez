package examen2_joshuamartinez;
public class Bateria extends Parte{
    
    private int Capacidad;
    private String material;

    public Bateria() {
    }

    public Bateria(int Capacidad, String material, int Tiempo) {
        super(Tiempo);
        this.Capacidad = Capacidad;
        this.material = material;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria{" + "Capacidad=" + Capacidad + ", material=" + material + '}';
    }
       
}
