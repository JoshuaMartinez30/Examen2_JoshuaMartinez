package examen2_joshuamartinez;

import java.awt.Color;

public class Computadora {
    private int serie, año;
    private String color;
    private String material;
    private RAM ram;
    private DiscoDuro disco;
    private Bateria bateria;
    private Teclado teclado;
    private Pantalla pantalla;
    private Procesador procesador;

    public Computadora() {
    }

    public Computadora(int serie, int año, String color, String material, RAM ram, DiscoDuro disco, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.serie = serie;
        this.año = año;
        this.color = color;
        this.material = material;
        this.ram = ram;
        this.disco = disco;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public DiscoDuro getDisco() {
        return disco;
    }

    public void setDisco(DiscoDuro disco) {
        this.disco = disco;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + ", a\u00f1o=" + año + ", color=" + color + ", material=" + material + ", ram=" + ram + ", disco=" + disco + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }

    
        
}
