package examen2_joshuamartinez;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class AdminReporte {

    private ArrayList<OEnsamblaje> Ensamblaje = new ArrayList();
    private File archivo = null;

    public AdminReporte() {
    }

    public AdminReporte(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<OEnsamblaje> getEnsamblaje() {
        return Ensamblaje;
    }

    public void setTecnicos(ArrayList<OEnsamblaje> Ensamblaje) {
        this.Ensamblaje = Ensamblaje;
    }

    @Override
    public String toString() {
        return "Orden ensamblaje fallidas=" + Ensamblaje;
    }

    public void setOEnsamblaje(OEnsamblaje e) {
        this.Ensamblaje.add(e);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (OEnsamblaje en : Ensamblaje) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                bw.write("Fallo a las: " + new Date() + "\n");
                bw.write("fallo: "+en.getTecnico().getNombre() +"\n");
                bw.write("Computadora con numero de serie: " + en.getComputadora().getSerie());
                bw.write("\n------------------------------------------------------------------------");
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }

}
