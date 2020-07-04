package examen2_joshuamartinez;

import java.awt.Color;
import java.io.Serializable;

public class Teclado extends Parte implements Serializable {

    private String material;
    private String color;

    private static final long SerialVersionUID = 777L;

    public Teclado() {
    }

    public Teclado(String material, String color, int Tiempo) {
        super(Tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + ", color=" + color + '}';
    }

}
