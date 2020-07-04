package examen2_joshuamartinez;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    ArrayList<Tecnico> lista = new ArrayList();
    ArrayList<Computadora> lista2 = new ArrayList();
    AdminTecnico t = new AdminTecnico("./Tecnicos.txt");
    AdminComputadora ac = new AdminComputadora("./Computadoras.cbm");

    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        t.cargarArchivo();
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbotecnicos.getModel();
        model.addElement("");
        for (int i = 0; i < t.getListaTecnico().size(); i++) {
            lista.add(t.getListaTecnico().get(i));
            model.addElement(t.getListaTecnico().get(i));
            cbotecnicos.getModel();
        }
        ac.cargarArchivo();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbocomputadoras.getModel();
        modelo.addElement("");
        for (int i = 0; i < ac.getListaComputadora().size(); i++) {
            lista2.add(ac.getListaComputadora().get(i));
            modelo.addElement(ac.getListaComputadora().get(i));
            cbocomputadoras.setModel(modelo);
        }
        mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JD_CrearT = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        tf_Tecnico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_Edad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        btnAgregarT = new javax.swing.JButton();
        JD_CrearC = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        tf_Serie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_Año = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_MaterialC = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_TamañoRam = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_MarcaRam = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_TamañoDiscoDuro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tf_MarcaDiscoDuro = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tf_MaterialBateria = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        rg_Tactil = new javax.swing.JRadioButton();
        rg_NoTactil = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        tf_TipoPantalla = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jsp_Capacidad = new javax.swing.JSpinner();
        tf_TecladoMaterial = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jsp_Nucleos = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        tf_Velocidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        tf_ColorC = new javax.swing.JTextField();
        tf_ColorTeclado = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jsp_RamTiempo = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jsp_DiscoDuroTiempo = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jsp_BateriaTiempo = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jsp_TecladoTiempo = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        jsp_PantallaTiempo = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jsp_ProcesadorTiempo = new javax.swing.JSpinner();
        JD_AdminT = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ModificarT = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        tf_NombreM = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tf_EdadM = new javax.swing.JTextField();
        cboGeneroM = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        JD_AdminC = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        grupoC = new javax.swing.ButtonGroup();
        jTextField13 = new javax.swing.JTextField();
        grupoTeclado = new javax.swing.ButtonGroup();
        GrupoPantalla = new javax.swing.ButtonGroup();
        JD_Ensamblaje = new javax.swing.JDialog();
        cbocomputadoras = new javax.swing.JComboBox<>();
        cbotecnicos = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jb_Ensamblar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Ensamblar = new javax.swing.JTable();
        instalacion = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_CrearT = new javax.swing.JMenuItem();
        jmi_CrearC = new javax.swing.JMenuItem();
        jmi_AdminT = new javax.swing.JMenuItem();
        jmi_AdminC = new javax.swing.JMenuItem();
        jmi_Ensamblaje = new javax.swing.JMenuItem();

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Genero");

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        btnAgregarT.setText("Agregar");
        btnAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_CrearTLayout = new javax.swing.GroupLayout(JD_CrearT.getContentPane());
        JD_CrearT.getContentPane().setLayout(JD_CrearTLayout);
        JD_CrearTLayout.setHorizontalGroup(
            JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearTLayout.createSequentialGroup()
                .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearTLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Tecnico)
                            .addComponent(tf_Edad)
                            .addComponent(cboGenero, 0, 196, Short.MAX_VALUE)))
                    .addGroup(JD_CrearTLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        JD_CrearTLayout.setVerticalGroup(
            JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearTLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Tecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(JD_CrearTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        jLabel4.setText("Numero Serie");

        jLabel5.setText("Año");

        jLabel6.setText("Color");

        jLabel7.setText("Material");

        jLabel8.setText("RAM");

        jLabel9.setText("Tamaño");

        jLabel10.setText("Marca");

        jLabel11.setText("Computadora");

        jLabel12.setText("Disco Duro");

        jLabel13.setText("Tamaño");

        jLabel14.setText("Marca");

        jLabel15.setText("Bateria");

        jLabel16.setText("Capacidad de Horas");

        jLabel17.setText("Material");

        jLabel18.setText("Pantalla");

        grupoTeclado.add(rg_Tactil);
        rg_Tactil.setText("Tactil");

        grupoTeclado.add(rg_NoTactil);
        rg_NoTactil.setText("No Tactil");

        jLabel19.setText("Tipo");

        jLabel20.setText("Teclado");

        jLabel21.setText("Material");

        jLabel22.setText("Color");

        jLabel23.setText("Procesador");

        jLabel24.setText("Numero de nucleos");

        jLabel25.setText("Velocidad");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel29.setText("Tiempo");

        jLabel30.setText("Tiempo");

        jLabel31.setText("Tiempo");

        jLabel34.setText("Tiempo");

        jLabel35.setText("Tiempo");

        jLabel36.setText("Tiempo");

        javax.swing.GroupLayout JD_CrearCLayout = new javax.swing.GroupLayout(JD_CrearC.getContentPane());
        JD_CrearC.getContentPane().setLayout(JD_CrearCLayout);
        JD_CrearCLayout.setHorizontalGroup(
            JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addGroup(JD_CrearCLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_Serie, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(tf_MaterialC))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Año, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_ColorC)))
                .addGap(28, 28, 28))
            .addGroup(JD_CrearCLayout.createSequentialGroup()
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_CrearCLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(tf_TamañoRam, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(tf_MarcaRam, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_CrearCLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(tf_TamañoDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)
                                .addComponent(tf_MarcaDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12)))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel17)
                        .addGap(27, 27, 27)
                        .addComponent(tf_MaterialBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel15))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(JD_CrearCLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)
                                .addComponent(tf_TecladoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(tf_ColorTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CrearCLayout.createSequentialGroup()
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jsp_RamTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CrearCLayout.createSequentialGroup()
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jsp_DiscoDuroTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CrearCLayout.createSequentialGroup()
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jsp_BateriaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_CrearCLayout.createSequentialGroup()
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jsp_TecladoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
            .addGroup(JD_CrearCLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(rg_Tactil)
                        .addGap(18, 18, 18)
                        .addComponent(rg_NoTactil)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(tf_TipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jsp_PantallaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
            .addGroup(JD_CrearCLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_Nucleos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jsp_ProcesadorTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        JD_CrearCLayout.setVerticalGroup(
            JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_CrearCLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_ColorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_MaterialC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_TamañoRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(tf_MarcaRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsp_RamTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_TamañoDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(tf_MarcaDiscoDuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_DiscoDuroTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(tf_MaterialBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsp_Capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_BateriaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JD_CrearCLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(tf_ColorTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(JD_CrearCLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(tf_TecladoMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_TecladoTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rg_Tactil)
                            .addComponent(rg_NoTactil)
                            .addComponent(jLabel19)
                            .addComponent(tf_TipoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_PantallaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addGroup(JD_CrearCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jsp_Nucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(tf_Velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_CrearCLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jsp_ProcesadorTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jt_ModificarT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Genero"
            }
        ));
        jt_ModificarT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_ModificarTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_ModificarT);

        jLabel26.setText("Nombre");

        jLabel27.setText("Edad");

        cboGeneroM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel28.setText("Genero");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JD_AdminTLayout = new javax.swing.GroupLayout(JD_AdminT.getContentPane());
        JD_AdminT.getContentPane().setLayout(JD_AdminTLayout);
        JD_AdminTLayout.setHorizontalGroup(
            JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AdminTLayout.createSequentialGroup()
                .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JD_AdminTLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addGap(18, 18, 18)
                        .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_NombreM)
                            .addComponent(tf_EdadM)
                            .addComponent(cboGeneroM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JD_AdminTLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JD_AdminTLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        JD_AdminTLayout.setVerticalGroup(
            JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_AdminTLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_NombreM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_EdadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboGeneroM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JD_AdminTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout JD_AdminCLayout = new javax.swing.GroupLayout(JD_AdminC.getContentPane());
        JD_AdminC.getContentPane().setLayout(JD_AdminCLayout);
        JD_AdminCLayout.setHorizontalGroup(
            JD_AdminCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_AdminCLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        JD_AdminCLayout.setVerticalGroup(
            JD_AdminCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_AdminCLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTextField13.setText("jTextField13");

        jLabel32.setText("Computadoras");

        jLabel33.setText("Tecnicos ");

        jb_Ensamblar.setText("Ensamblar");
        jb_Ensamblar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_EnsamblarMouseClicked(evt);
            }
        });

        jt_Ensamblar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Piezas", "Tiempo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_Ensamblar);

        javax.swing.GroupLayout JD_EnsamblajeLayout = new javax.swing.GroupLayout(JD_Ensamblaje.getContentPane());
        JD_Ensamblaje.getContentPane().setLayout(JD_EnsamblajeLayout);
        JD_EnsamblajeLayout.setHorizontalGroup(
            JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JD_EnsamblajeLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbotecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(JD_EnsamblajeLayout.createSequentialGroup()
                            .addGroup(JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel32)
                                .addComponent(cbocomputadoras, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_Ensamblar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(116, 116, 116))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        JD_EnsamblajeLayout.setVerticalGroup(
            JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JD_EnsamblajeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(instalacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbotecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(JD_EnsamblajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Ensamblar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JD_EnsamblajeLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(cbocomputadoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Inicio");

        jmi_CrearT.setText("Crear Tecnico");
        jmi_CrearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearTActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_CrearT);

        jmi_CrearC.setText("Crear Computadora");
        jmi_CrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearCActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_CrearC);

        jmi_AdminT.setText("Administrar Tecnico");
        jmi_AdminT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AdminTActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_AdminT);

        jmi_AdminC.setText("Administrar Computadora");
        jmi_AdminC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_AdminCActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_AdminC);

        jmi_Ensamblaje.setText("Ensamblaje");
        jmi_Ensamblaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EnsamblajeActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_Ensamblaje);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_CrearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearTActionPerformed
        JD_CrearT.setModal(true);
        JD_CrearT.pack();
        JD_CrearT.setLocationRelativeTo(null);
        JD_CrearT.setVisible(true);
    }//GEN-LAST:event_jmi_CrearTActionPerformed

    private void jmi_CrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearCActionPerformed
        JD_CrearC.setModal(true);
        JD_CrearC.pack();
        JD_CrearC.setLocationRelativeTo(null);
        JD_CrearC.setVisible(true);
    }//GEN-LAST:event_jmi_CrearCActionPerformed

    private void jmi_AdminTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AdminTActionPerformed
        JD_AdminT.setModal(true);
        JD_AdminT.pack();
        JD_AdminT.setLocationRelativeTo(null);
        JD_AdminT.setVisible(true);
    }//GEN-LAST:event_jmi_AdminTActionPerformed

    private void jmi_AdminCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_AdminCActionPerformed
        JD_AdminC.setModal(true);
        JD_AdminC.pack();
        JD_AdminC.setLocationRelativeTo(null);
        JD_AdminC.setVisible(true);
    }//GEN-LAST:event_jmi_AdminCActionPerformed

    private void btnAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTActionPerformed
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbotecnicos.getModel();
            Tecnico T = new Tecnico(tf_Tecnico.getText(), Integer.parseInt(tf_Edad.getText()), cboGenero.getSelectedItem().toString(), 0);
            t.getListaTecnico().add(T);
            lista.add(T);
            t.escribirArchivo();
            model.addElement(T);
            cbotecnicos.setModel(model);
            tf_Tecnico.setText("");
            tf_Edad.setText("");
            cboGenero.setSelectedIndex(0);
            JOptionPane.showMessageDialog(JD_CrearT, "Se creo Correctamente");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(JD_CrearT, "Error, No se creo Tecnico");
        }
        mostrar();
    }//GEN-LAST:event_btnAgregarTActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String tactil;
        try {
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cbocomputadoras.getModel();
            RAM r = new RAM(Integer.parseInt(tf_TamañoRam.getText()), tf_MarcaRam.getText(), Integer.parseInt(jsp_RamTiempo.getValue().toString()));
            DiscoDuro disco = new DiscoDuro(Integer.parseInt(tf_TamañoDiscoDuro.getText()), tf_MarcaDiscoDuro.getText(), Integer.parseInt(jsp_DiscoDuroTiempo.getValue().toString()));
            Bateria b = new Bateria(Integer.parseInt(jsp_Capacidad.getValue().toString()), tf_MaterialBateria.getText(), Integer.parseInt(jsp_BateriaTiempo.getValue().toString()));
            Teclado tt = new Teclado(tf_TecladoMaterial.getText(), tf_ColorTeclado.getText(), Integer.parseInt(jsp_TecladoTiempo.getValue().toString()));
            if (rg_Tactil.isSelected()) {
                tactil = "Tactil";
            } else {
                tactil = "No Tactil";
            }
            Pantalla pa = new Pantalla(tactil, tf_TipoPantalla.getText(), Integer.parseInt(jsp_PantallaTiempo.getValue().toString()));
            Procesador pro = new Procesador(Integer.parseInt(jsp_Nucleos.getValue().toString()), Double.valueOf(tf_Velocidad.getText()), Integer.parseInt(jsp_ProcesadorTiempo.getValue().toString()));
            Computadora C = new Computadora(Integer.parseInt(tf_Serie.getText()), Integer.parseInt(tf_Año.getText()), tf_ColorC.getText(), tf_MaterialC.getText(), r, disco, b, tt, pa, pro);
            C.getPartes().add(r);
            C.getPartes().add(disco);
            C.getPartes().add(b);
            C.getPartes().add(tt);
            C.getPartes().add(pa);
            C.getPartes().add(pro);
            lista2.add(C);
            ac.setListaComputadora(C);
            modelo.addElement(C);
            cbocomputadoras.setModel(modelo);
            ac.escribirArchivo();
            JOptionPane.showMessageDialog(JD_CrearT, "Se creo Correctamente");
            tf_Serie.setText("");
            tf_Año.setText("");
            tf_MaterialC.setText("");
            tf_TamañoRam.setText("");
            tf_MarcaRam.setText("");
            tf_TamañoDiscoDuro.setText("");
            tf_MarcaDiscoDuro.setText("");
            jsp_Capacidad.setValue(0);
            tf_MaterialBateria.setText("");
            tf_TecladoMaterial.setText("");
            rg_Tactil.setSelected(true);
            rg_NoTactil.setSelected(false);
            tf_TipoPantalla.setText("");
            jsp_Nucleos.setValue(0);
            tf_Velocidad.setText("");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(JD_CrearT, "Error, No se creo Tecnico");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jt_ModificarTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_ModificarTMouseClicked
        int seleccion = jt_ModificarT.getSelectedRow();
        tf_NombreM.setText(jt_ModificarT.getValueAt(seleccion, 0).toString());
        tf_EdadM.setText(jt_ModificarT.getValueAt(seleccion, 1).toString());
        cboGeneroM.setSelectedItem(jt_ModificarT.getValueAt(seleccion, 2).toString());
    }//GEN-LAST:event_jt_ModificarTMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int i = jt_ModificarT.getSelectedRow();
        if (tf_NombreM.getText().isEmpty() || tf_EdadM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(JD_AdminT, "Por favor, llene los campos vacios");
        } else {
            t.cargarArchivo();
            t.getListaTecnico().get(i).setNombre(tf_NombreM.getText());
            t.getListaTecnico().get(i).setEdad(Integer.parseInt(tf_EdadM.getText()));
            t.getListaTecnico().get(i).setGenero(cboGeneroM.getSelectedItem().toString());
            lista.get(i).setNombre(tf_NombreM.getText());
            lista.get(i).setEdad(Integer.parseInt(tf_EdadM.getText()));
            lista.get(i).setGenero(cboGeneroM.getSelectedItem().toString());
            try {
                t.escribirArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        mostrar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jmi_EnsamblajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EnsamblajeActionPerformed
        jt_Ensamblar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tiempo"
            }
        ));
        JD_Ensamblaje.setModal(true);
        JD_Ensamblaje.pack();
        JD_Ensamblaje.setLocationRelativeTo(null);
        JD_Ensamblaje.setVisible(true);
    }//GEN-LAST:event_jmi_EnsamblajeActionPerformed

    private void jb_EnsamblarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_EnsamblarMouseClicked
        OEnsamblaje o = new OEnsamblaje((Computadora) cbocomputadoras.getSelectedItem(), (Tecnico) cbotecnicos.getSelectedItem());
        Ensamblaje e = new Ensamblaje(o, jt_Ensamblar, instalacion);
        Thread proceso = new Thread(e);
        proceso.start();
    }//GEN-LAST:event_jb_EnsamblarMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        t.cargarArchivo();
        int i = jt_ModificarT.getSelectedRow();
        t.getListaTecnico().remove(i);
        lista.remove(i);
        try {
            t.escribirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(JD_AdminT, "Eliminado correctamente");
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrar() {
        String Matriz[][] = new String[lista.size()][5];
        for (int i = 0; i < lista.size(); i++) {
            Matriz[i][0] = lista.get(i).getNombre();
            Matriz[i][1] = Integer.toString(lista.get(i).getEdad());
            Matriz[i][2] = lista.get(i).getGenero();

        }

        jt_ModificarT.setModel(new javax.swing.table.DefaultTableModel(
                Matriz,
                new String[]{
                    "Nombre", "Edad", "Genero"
                }
        ));
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoPantalla;
    private javax.swing.JDialog JD_AdminC;
    private javax.swing.JDialog JD_AdminT;
    private javax.swing.JDialog JD_CrearC;
    private javax.swing.JDialog JD_CrearT;
    private javax.swing.JDialog JD_Ensamblaje;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregarT;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JComboBox<String> cboGeneroM;
    private javax.swing.JComboBox<String> cbocomputadoras;
    private javax.swing.JComboBox<String> cbotecnicos;
    private javax.swing.ButtonGroup grupoC;
    private javax.swing.ButtonGroup grupoTeclado;
    private javax.swing.JProgressBar instalacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JButton jb_Ensamblar;
    private javax.swing.JMenuItem jmi_AdminC;
    private javax.swing.JMenuItem jmi_AdminT;
    private javax.swing.JMenuItem jmi_CrearC;
    private javax.swing.JMenuItem jmi_CrearT;
    private javax.swing.JMenuItem jmi_Ensamblaje;
    private javax.swing.JSpinner jsp_BateriaTiempo;
    private javax.swing.JSpinner jsp_Capacidad;
    private javax.swing.JSpinner jsp_DiscoDuroTiempo;
    private javax.swing.JSpinner jsp_Nucleos;
    private javax.swing.JSpinner jsp_PantallaTiempo;
    private javax.swing.JSpinner jsp_ProcesadorTiempo;
    private javax.swing.JSpinner jsp_RamTiempo;
    private javax.swing.JSpinner jsp_TecladoTiempo;
    private javax.swing.JTable jt_Ensamblar;
    private javax.swing.JTable jt_ModificarT;
    private javax.swing.JRadioButton rg_NoTactil;
    private javax.swing.JRadioButton rg_Tactil;
    private javax.swing.JTextField tf_Año;
    private javax.swing.JTextField tf_ColorC;
    private javax.swing.JTextField tf_ColorTeclado;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_EdadM;
    private javax.swing.JTextField tf_MarcaDiscoDuro;
    private javax.swing.JTextField tf_MarcaRam;
    private javax.swing.JTextField tf_MaterialBateria;
    private javax.swing.JTextField tf_MaterialC;
    private javax.swing.JTextField tf_NombreM;
    private javax.swing.JTextField tf_Serie;
    private javax.swing.JTextField tf_TamañoDiscoDuro;
    private javax.swing.JTextField tf_TamañoRam;
    private javax.swing.JTextField tf_TecladoMaterial;
    private javax.swing.JTextField tf_Tecnico;
    private javax.swing.JTextField tf_TipoPantalla;
    private javax.swing.JTextField tf_Velocidad;
    // End of variables declaration//GEN-END:variables
}
