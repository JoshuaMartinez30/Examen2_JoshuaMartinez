package examen2_joshuamartinez;

import java.io.Serializable;

public class Bateria extends Parte implements Serializable {

    private int Capacidad;
    private String material;

    private static final long SerialVersionUID = 777;

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
