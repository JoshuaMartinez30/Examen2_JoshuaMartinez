package examen2_joshuamartinez;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Random;

public class Ensamblaje extends Thread {

    private OEnsamblaje o;
    private ArrayList<Parte> lista = new ArrayList();
    private JTable instalacion;
    private boolean flag;
    private JProgressBar progreso;
    Random r = new Random();

    public Ensamblaje(OEnsamblaje o, JTable instalacion, JProgressBar progreso) {
        this.o = o;
        this.instalacion = instalacion;
        this.progreso = progreso;
        flag = true;
        for (Parte p : o.getComputadora().getPartes()) {
            this.lista.add(p);
        }
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void run() {

        while (flag) {
            int aux = 0;
            int error = 0;
            DefaultTableModel modelo = (DefaultTableModel) this.instalacion.getModel();
            for (int i = 0; i < lista.size(); i++) {
                progreso.setValue(0);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ensamblaje.class.getName()).log(Level.SEVERE, null, ex);
                }
                progreso.setMaximum(lista.get(i).getTiempo());
                for (int j = 0; j < lista.get(i).getTiempo(); j++) {
                    progreso.setValue(progreso.getValue() + 1);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
                Object[] row = {lista.get(i).toString(), lista.get(i).getTiempo()};
                modelo.addRow(row);

                int cant = o.getTecnico().getCantidad();
                int fallo = 1 + r.nextInt(100);
                if (cant < 0 || cant >= 5) {
                    if (fallo < 30) {
                        error++;
                    }
                } else if (cant < 6 || cant >= 15) {;
                    if (fallo < 22) {
                        error++;
                    }
                } else if (cant < 16 || cant >= 30) {
                    if (fallo < 13) {;
                        error++;
                    }
                } else if (cant < 30) {
                    if (fallo < 7) {
                        error++;
                    }
                }

                aux++;
                if (aux == 6) {
                    flag = false;
                    JOptionPane.showMessageDialog(null, "Finalizo el Ensamblaje");
                    if (error != 0) {
                        JOptionPane.showMessageDialog(null, "Fallo un Ensamblaje");
                        try {
                            AdminReporte AR = new AdminReporte("./Bitacora.txt");
                            AR.getEnsamblaje().add(o);
                            AR.escribirArchivo();
                        } catch (IOException ex) {
                            Logger.getLogger(Ensamblaje.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        o.getTecnico().setCantidad(o.getTecnico().getCantidad()+ 1);
                    }
                }
                this.instalacion.setModel(modelo);
            }
        }
    }

}
