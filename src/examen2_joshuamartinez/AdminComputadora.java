package examen2_joshuamartinez;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminComputadora {

    private ArrayList<Computadora> ListaComputadora = new ArrayList();
    private File archivo = null;


    public AdminComputadora(String path) {
        archivo = new File(path);
    }

    public ArrayList<Computadora> getListaComputadora() {
        return ListaComputadora;
    }

    public void setListaComputadora(ArrayList<Computadora> ListaComputadora) {
        this.ListaComputadora = ListaComputadora;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ListaComputadora=" + ListaComputadora;
    }

    //extra mutador
    public void setListaComputadora(Computadora c) {
        this.ListaComputadora.add(c);
    }

    public void cargarArchivo() {
        try {            
            ListaComputadora = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        ListaComputadora.add(temp);
                    }
                } catch (EOFException e) {
                    e.printStackTrace();
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : ListaComputadora) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
               ex.printStackTrace();
            }
        }
    }
}
