package examen2_joshuamartinez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminComputadora  {

    private ArrayList<Computadora> ListaComputadoras = new ArrayList();
    private File archivo = null;


    public AdminComputadora(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Computadora> getListaComputadoras() {
        return ListaComputadoras;
    }

    public void setListaComputadoras(ArrayList<Computadora> ListaComputadoras) {
        this.ListaComputadoras = ListaComputadoras;
    }

    @Override
    public String toString() {
        return "ListaComputadoras=" + ListaComputadoras;
    }

    //extra mutador
    public void setListaComputadoras(Computadora c) {
        this.ListaComputadoras.add(c);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Computadora t : ListaComputadoras) {
                bw.writeObject(t);
            }
            bw.flush();
            bw.close();
            fw.close();
        } catch (Exception ex) {
        } finally {

        }
    }

    public void cargarArchivo() {
        try {
            ListaComputadoras = new ArrayList();
            Computadora temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Computadora) objeto.readObject()) != null) {
                        ListaComputadoras.add(temp);
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    // Logger.getLogger(adminPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminComputadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdminComputadora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
