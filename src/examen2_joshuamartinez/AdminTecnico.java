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

public class AdminTecnico {
    
    private ArrayList<Tecnico> ListaTecnico = new ArrayList();
    private File archivo = null;
    
    public AdminTecnico() {
    }
    
    public AdminTecnico(String path) {
        archivo = new File(path);
    }
    
    public File getArchivo() {
        return archivo;
    }
    
    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public ArrayList<Tecnico> getListaTecnico() {
        return ListaTecnico;
    }
    
    public void setListaTecnico(ArrayList<Tecnico> ListaTecnico) {
        this.ListaTecnico = ListaTecnico;
    }
    
    @Override
    public String toString() {
        return "ListaTecnico=" + ListaTecnico;
    }

    //extra mutador
    public void setListaTecnico(Tecnico t) {
        this.ListaTecnico.add(t);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        String aux = "";
        for (Tecnico dat : ListaTecnico) {
            try {
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                aux += dat.getNombre() + ";" + dat.getEdad() + ";" + dat.getGenero() + ";" + dat.getCantidad() + "\n";
                bw.write(aux);
                bw.flush();
            } catch (Exception e) {
            }
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() {
        try {
            FileReader fr = null;
            BufferedReader br = null;
            ListaTecnico = new ArrayList();
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            if (archivo.exists()) {
                String linea = "";
                try {
                    while ((linea = br.readLine()) != null) {
                        try {
                            String datos[] = linea.split(";");
                            Tecnico p = new Tecnico(datos[0], Integer.parseInt(datos[1]), datos[2], Integer.parseInt(datos[3]));
                            ListaTecnico.add(p);
                        } catch (Exception ex) {
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(AdminTecnico.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //FIN IF

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminTecnico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
