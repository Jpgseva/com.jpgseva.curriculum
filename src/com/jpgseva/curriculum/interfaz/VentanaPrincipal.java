/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum.interfaz;



import com.jpgseva.curriculum.categorias.Aptitud;
import com.jpgseva.curriculum.categorias.Estudio;
import com.jpgseva.curriculum.categorias.Trabajo;
import com.jpgseva.curriculum.datos.Datos;
import static com.jpgseva.curriculum.datos.Datos.misAptitudes;
import java.awt.Desktop;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *Aplicación Curriculum Virtual
 * @author Jorge
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Esta es la clase de la ventana principal de la aplicación
     */
    public VentanaPrincipal() {
        
        //Cargar icono de aplicacion
        URL iconURL = getClass().getResource("/com/jpgseva/curriculum/media/cvIcon.png");
        ImageIcon icon = new ImageIcon(iconURL);
        super.setIconImage(icon.getImage());
        
        //Iniciar componentes
        initComponents();
        cargarDatos();
        crearTablaResultados();
    }
    //Declarar e iniciar datos
    List<Estudio> estudios = Datos.misEstudios();
    List<Trabajo> trabajos = Datos.misEmpleos();
    Aptitud[] aptitudes = misAptitudes();
    
    //Método de carga de datos
    private void cargarDatos() {
        for (Estudio estudio: estudios) {
            listaEstudios.add(estudio.getNombre());
        }
        for (Trabajo trabajo: trabajos) {
            choiceTrabajo.add(trabajo.getPuesto());
        }
        for(int i=0;i<aptitudes.length;i++) {
            listaAptitudes.add(aptitudes[i].toString());
        }
        
    }
    //Método para crear tabla de resultados de aptitudes
    private DefaultTableModel crearTablaResultados() {
        DefaultTableModel model = new DefaultTableModel() {

            @Override
            public Class getColumnClass(int column) {
                if (column == 2) {
                    return Boolean.class;
                }
                return Object.class;
            }
        };
        JTable tabla = new JTable(model);
        model.setColumnIdentifiers(new Object[]{"Estudios o Experiencia", "año"});
        jTableResultAptit.setModel(tabla.getModel());
        jTableResultAptit.getColumn("Estudios o Experiencia").setMinWidth(200);
        jTableResultAptit.getColumn("año").setMaxWidth(100);
        return model;
    }
    
    public static void abrirWeb(String url) {
    try {
        Desktop.getDesktop().browse(new URL(url).toURI());
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    /**
     * Código generado por Netbeans
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTabulado = new javax.swing.JTabbedPane();
        jPanelInicio = new javax.swing.JPanel();
        jLabelImagenPersonal = new javax.swing.JLabel();
        jLabelInstrucciones = new javax.swing.JLabel();
        jTextAreaIntro = new javax.swing.JTextArea();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelDatosPersonales = new javax.swing.JLabel();
        jLabelTelf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelResulNom = new javax.swing.JLabel();
        jLabelResultTel = new javax.swing.JLabel();
        jLabelResulEmail = new javax.swing.JLabel();
        jPanelEducacion = new javax.swing.JPanel();
        listaEstudios = new java.awt.List();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelEstudio = new javax.swing.JLabel();
        jLabelAnho = new javax.swing.JLabel();
        jLabelCentro = new javax.swing.JLabel();
        jLabelDescrip = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripText = new javax.swing.JTextArea();
        jLabelCentroText = new javax.swing.JLabel();
        jLabelAnhoText = new javax.swing.JLabel();
        jLabelImgCentro = new javax.swing.JLabel();
        jPanelExperiencia = new javax.swing.JPanel();
        choiceTrabajo = new java.awt.Choice();
        jLabelImgEmpresa = new javax.swing.JLabel();
        jSliderAnho = new javax.swing.JSlider();
        jLabelDescTrab = new javax.swing.JLabel();
        jLabelEmpr = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescTrabText = new javax.swing.JTextArea();
        jLabelAnhoTextTrab = new javax.swing.JLabel();
        jLableAnhoTrab = new javax.swing.JLabel();
        jLabelEmprText = new javax.swing.JLabel();
        jLabelDurac = new javax.swing.JLabel();
        jLabelDuracText = new javax.swing.JLabel();
        jPanelAptitudes = new javax.swing.JPanel();
        listaAptitudes = new java.awt.List();
        jLabelListAptitud = new javax.swing.JLabel();
        jLabelImgAptitud = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableResultAptit = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescripAptit = new javax.swing.JTextArea();
        jLabelImgStar = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelGracias = new javax.swing.JLabel();
        jLabelJava = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelIDE = new javax.swing.JLabel();
        jLabelAutor1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanelCabecera = new javax.swing.JPanel();
        jLabelCabImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Curriculum Virtual: Jorge Pérez González");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanelTabulado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTabulado.setForeground(new java.awt.Color(102, 0, 102));
        jPanelTabulado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanelTabulado.setOpaque(true);
        jPanelTabulado.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanelTabulado.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jPanelTabuladoStateChanged(evt);
            }
        });
        jPanelTabulado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTabuladoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelTabuladoMouseEntered(evt);
            }
        });

        jPanelInicio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabelImagenPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/jpgHiden.jpg"))); // NOI18N
        jLabelImagenPersonal.setToolTipText("");
        jLabelImagenPersonal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jLabelImagenPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImagenPersonalMouseEntered(evt);
            }
        });

        jLabelInstrucciones.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelInstrucciones.setForeground(new java.awt.Color(102, 0, 102));
        jLabelInstrucciones.setText("[Arrastra el ratón sobre mi]");

        jTextAreaIntro.setEditable(false);
        jTextAreaIntro.setBackground(new java.awt.Color(102, 0, 102));
        jTextAreaIntro.setColumns(20);
        jTextAreaIntro.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        jTextAreaIntro.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaIntro.setRows(5);
        jTextAreaIntro.setText("       \n    Bienvendio/a a mi aplicación Curriculum Virtual,\n    una aplicación diseñada en Java para mostrar mis aptitudes.");
        jTextAreaIntro.setAlignmentX(2.0F);
        jTextAreaIntro.setAlignmentY(2.0F);
        jTextAreaIntro.setAutoscrolls(false);

        jLabelUbicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUbicacion.setForeground(new java.awt.Color(51, 51, 51));

        jLabelDatosPersonales.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDatosPersonales.setForeground(new java.awt.Color(102, 0, 102));
        jLabelDatosPersonales.setToolTipText("");

        jLabelTelf.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTelf.setForeground(new java.awt.Color(51, 51, 51));

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(51, 51, 51));

        jLabelResulNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelResulNom.setForeground(new java.awt.Color(51, 51, 51));

        jLabelResultTel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelResultTel.setForeground(new java.awt.Color(51, 51, 51));

        jLabelResulEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelResulEmail.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAreaIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabelImagenPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelUbicacion)
                                    .addComponent(jLabelDatosPersonales)
                                    .addComponent(jLabelTelf)
                                    .addComponent(jLabelEmail))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelResulNom)
                                    .addComponent(jLabelResultTel)
                                    .addComponent(jLabelResulEmail)))
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelInstrucciones)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextAreaIntro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addComponent(jLabelInstrucciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDatosPersonales)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUbicacion)
                            .addComponent(jLabelResulNom))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelf)
                            .addComponent(jLabelResultTel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelResulEmail)))
                    .addComponent(jLabelImagenPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        jTextAreaIntro.getAccessibleContext().setAccessibleDescription("");

        jPanelTabulado.addTab("Inicio  ", new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/start.png")), jPanelInicio); // NOI18N

        jPanelEducacion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEducacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelEducacionMouseClicked(evt);
            }
        });

        listaEstudios.setBackground(new java.awt.Color(102, 0, 102));
        listaEstudios.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        listaEstudios.setForeground(new java.awt.Color(255, 255, 255));
        listaEstudios.setName(""); // NOI18N
        listaEstudios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaEstudiosItemStateChanged(evt);
            }
        });
        listaEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEstudiosActionPerformed(evt);
            }
        });

        jLabelEstudio.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabelEstudio.setForeground(new java.awt.Color(102, 0, 102));
        jLabelEstudio.setText("Máster en Java y Administración de Bases de Datos Oficial de Oracle. MJO");

        jLabelAnho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAnho.setText("Año:");

        jLabelCentro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCentro.setText("Centro:");

        jLabelDescrip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescrip.setText("Descripción:");

        jTextAreaDescripText.setColumns(20);
        jTextAreaDescripText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescripText.setRows(5);
        jTextAreaDescripText.setText("El Máster está diseñado para proporcionar una sólida base en el desarrollo de aplicaciones y procesos que funcionen\nen multitud de dispositivos con Java, mediante la programación con Java y bases de datos Oracle,\nun lenguaje de última generación basado en la programación orientada a objetos.");
        jScrollPane1.setViewportView(jTextAreaDescripText);

        jLabelCentroText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCentroText.setText("Cice");

        jLabelAnhoText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAnhoText.setText("2020");

        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgCice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelEducacionLayout = new javax.swing.GroupLayout(jPanelEducacion);
        jPanelEducacion.setLayout(jPanelEducacionLayout);
        jPanelEducacionLayout.setHorizontalGroup(
            jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEducacionLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEducacionLayout.createSequentialGroup()
                        .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCentro)
                            .addComponent(jLabelAnho))
                        .addGap(44, 44, 44)
                        .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAnhoText)
                            .addComponent(jLabelCentroText)))
                    .addGroup(jPanelEducacionLayout.createSequentialGroup()
                        .addComponent(jLabelDescrip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEducacionLayout.createSequentialGroup()
                        .addComponent(listaEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImgCentro)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelEducacionLayout.setVerticalGroup(
            jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEducacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaEstudios, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(jLabelImgCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEstudio)
                .addGap(18, 18, 18)
                .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCentro)
                    .addComponent(jLabelCentroText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAnhoText)
                    .addComponent(jLabelAnho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescrip)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanelTabulado.addTab(" Educación  ", new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/eduIcon.png")), jPanelEducacion); // NOI18N

        jPanelExperiencia.setBackground(new java.awt.Color(255, 255, 255));

        choiceTrabajo.setBackground(new java.awt.Color(102, 0, 102));
        choiceTrabajo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        choiceTrabajo.setForeground(new java.awt.Color(255, 255, 255));
        choiceTrabajo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceTrabajoItemStateChanged(evt);
            }
        });

        jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIndu.jpg"))); // NOI18N

        jSliderAnho.setBackground(new java.awt.Color(255, 255, 255));
        jSliderAnho.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jSliderAnho.setForeground(new java.awt.Color(102, 0, 102));
        jSliderAnho.setMajorTickSpacing(1);
        jSliderAnho.setMaximum(2019);
        jSliderAnho.setMinimum(2013);
        jSliderAnho.setPaintLabels(true);
        jSliderAnho.setPaintTicks(true);
        jSliderAnho.setSnapToTicks(true);
        jSliderAnho.setToolTipText("");
        jSliderAnho.setValue(2015);
        jSliderAnho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderAnhoStateChanged(evt);
            }
        });

        jLabelDescTrab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDescTrab.setText("Descripción:");

        jLabelEmpr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmpr.setText("Empresa:");

        jTextAreaDescTrabText.setColumns(20);
        jTextAreaDescTrabText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextAreaDescTrabText.setRows(5);
        jTextAreaDescTrabText.setText("Valoración, diseño y programación de mecanizados de carpintería de PVC y aluminio.\nUsuario avanzado en software de integral de carpintería\n (Expernet - Hetmo Informática, Progest, Cortizo Software).");
        jScrollPane2.setViewportView(jTextAreaDescTrabText);

        jLabelAnhoTextTrab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelAnhoTextTrab.setText("2015");

        jLableAnhoTrab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLableAnhoTrab.setText("Año de inicio:");

        jLabelEmprText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEmprText.setText("Induplan");

        jLabelDurac.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDurac.setText("Duración:");

        jLabelDuracText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelDuracText.setText("5 años");

        javax.swing.GroupLayout jPanelExperienciaLayout = new javax.swing.GroupLayout(jPanelExperiencia);
        jPanelExperiencia.setLayout(jPanelExperienciaLayout);
        jPanelExperienciaLayout.setHorizontalGroup(
            jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                        .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                                .addComponent(jLableAnhoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabelAnhoTextTrab)
                                .addGap(67, 67, 67)
                                .addComponent(jLabelDurac)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDuracText))
                            .addComponent(choiceTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImgEmpresa))
                    .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                        .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescTrab)
                            .addComponent(jLabelEmpr))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEmprText)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSliderAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanelExperienciaLayout.setVerticalGroup(
            jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExperienciaLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(choiceTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLableAnhoTrab)
                            .addComponent(jLabelAnhoTextTrab)
                            .addComponent(jLabelDurac)
                            .addComponent(jLabelDuracText))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExperienciaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelImgEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmprText)
                    .addComponent(jLabelEmpr))
                .addGap(19, 19, 19)
                .addGroup(jPanelExperienciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescTrab)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSliderAnho, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jPanelTabulado.addTab(" Experiencia  ", new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/jobIcon.png")), jPanelExperiencia); // NOI18N

        jPanelAptitudes.setBackground(new java.awt.Color(255, 255, 255));

        listaAptitudes.setBackground(new java.awt.Color(102, 0, 102));
        listaAptitudes.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        listaAptitudes.setForeground(new java.awt.Color(255, 255, 255));
        listaAptitudes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAptitudesMouseClicked(evt);
            }
        });
        listaAptitudes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaAptitudesItemStateChanged(evt);
            }
        });
        listaAptitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAptitudesActionPerformed(evt);
            }
        });

        jLabelListAptitud.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelListAptitud.setForeground(new java.awt.Color(102, 0, 102));
        jLabelListAptitud.setText("Lista de aptitudes:");

        jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgJava.png"))); // NOI18N

        jTableResultAptit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableResultAptit);

        jTextAreaDescripAptit.setColumns(20);
        jTextAreaDescripAptit.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jTextAreaDescripAptit.setForeground(new java.awt.Color(51, 51, 51));
        jTextAreaDescripAptit.setRows(4);
        jScrollPane4.setViewportView(jTextAreaDescripAptit);

        jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelAptitudesLayout = new javax.swing.GroupLayout(jPanelAptitudes);
        jPanelAptitudes.setLayout(jPanelAptitudesLayout);
        jPanelAptitudesLayout.setHorizontalGroup(
            jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAptitudesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaAptitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelListAptitud))
                .addGap(40, 40, 40)
                .addGroup(jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelAptitudesLayout.createSequentialGroup()
                        .addComponent(jLabelImgAptitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelImgStar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanelAptitudesLayout.setVerticalGroup(
            jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAptitudesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelListAptitud)
                .addGap(15, 15, 15)
                .addGroup(jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAptitudesLayout.createSequentialGroup()
                        .addGroup(jPanelAptitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelImgAptitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelImgStar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listaAptitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jPanelTabulado.addTab(" Aptitudes  ", new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/starIcon.png")), jPanelAptitudes); // NOI18N

        jPanelInfo.setBackground(new java.awt.Color(255, 255, 255));

        jLabelGracias.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelGracias.setForeground(new java.awt.Color(102, 0, 102));
        jLabelGracias.setText("Gracias por su tiempo!");

        jLabelJava.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelJava.setText("Aplicación desarrollada en Java ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgJava_1.png"))); // NOI18N

        jLabelAutor.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelAutor.setText("Autor: Jorge Pérez González");

        jLabelIDE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelIDE.setText("IDE usado: NetBeans 12");

        jLabelAutor1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelAutor1.setForeground(new java.awt.Color(0, 51, 153));
        jLabelAutor1.setText("Más en mi perfil de LinkedIn");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/iconLinked.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelGracias))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJava)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelIDE))
                            .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelAutor1))
                                .addGroup(jPanelInfoLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabelAutor))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addComponent(jLabelGracias)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelJava)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIDE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelAutor)
                        .addGap(35, 35, 35)
                        .addComponent(jLabelAutor1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(48, Short.MAX_VALUE))))
        );

        jPanelTabulado.addTab(" Más!   ", new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/infoIcon.png")), jPanelInfo); // NOI18N

        jPanelCabecera.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(800, 154));

        jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabIni.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelCabeceraLayout = new javax.swing.GroupLayout(jPanelCabecera);
        jPanelCabecera.setLayout(jPanelCabeceraLayout);
        jPanelCabeceraLayout.setHorizontalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCabImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCabeceraLayout.setVerticalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCabImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelTabulado.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento hacer click sobre mi foto
    private void jLabelImagenPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenPersonalMouseEntered
        jLabelImagenPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/jpgVisto.jpg")));
        jTextAreaIntro.setFont(new java.awt.Font("Segoe UI", 1, 28)); 
        jTextAreaIntro.setText("       \n                           Jorge Pérez González");
        jLabelInstrucciones.setText("[Muy bien!]");
        jLabelDatosPersonales.setText("Datos personales:");
        jLabelUbicacion.setText("Ubicación:");
        jLabelTelf.setText("Teléfono:");
        jLabelEmail.setText("Email:");
        jLabelResulNom.setText("A Coruña");
        jLabelResultTel.setText("677 36 49 17");
        jLabelResulEmail.setText("jpgseva@hotmail.com");
         
    }//GEN-LAST:event_jLabelImagenPersonalMouseEntered

    private void jPanelTabuladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTabuladoMouseClicked
        
    }//GEN-LAST:event_jPanelTabuladoMouseClicked

    private void jPanelEducacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelEducacionMouseClicked
        
    }//GEN-LAST:event_jPanelEducacionMouseClicked
    //Evento cambiar imagen por tabulador
    private void jPanelTabuladoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jPanelTabuladoStateChanged
        
        switch(jPanelTabulado.getSelectedIndex()) {
            case 0:
                jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabIni.jpg"))); 
                break;
            case 1:
                jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabEstud.jpg"))); 
                break;

            case 2:
                jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabTrab.jpg")));
                break;
            case 3:
                jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabAptit.jpg"))); 
                break;
            case 4:
                jLabelCabImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/cabInfo.jpg"))); 
                break;
        }
        
    }//GEN-LAST:event_jPanelTabuladoStateChanged

    private void listaEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEstudiosActionPerformed
        
    }//GEN-LAST:event_listaEstudiosActionPerformed
    //Evento hacer click sobre lista de estudios
    private void listaEstudiosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaEstudiosItemStateChanged
        jLabelEstudio.setText(listaEstudios.getSelectedItem());
        for ( Estudio estudio: estudios) {
            if(listaEstudios.getSelectedItem().equals(estudio.getNombre())) {
                jLabelCentroText.setText(estudio.getCentro());
                switch(estudio.getCentro()){
                    case "Cice":
                        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgCice.jpg"))); 
                        break;
                    case "Plataforma Trailhead":
                        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgSales.png")));
                        break;
                    case "Team and Time":
                        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgTAT.png")));
                        break;
                    case "Instituto Galego de Formación":
                        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIGF.jpg")));
                        break;
                    case "UPA Murcia":
                        jLabelImgCentro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgUPA.png")));
                        break;    
                }

                jLabelAnhoText.setText(String.valueOf(estudio.getAnhoInicio()));
                jTextAreaDescripText.setText(estudio.getDescripcion());
            }
        }
    }//GEN-LAST:event_listaEstudiosItemStateChanged
    //Evento elegir empleo
    private void choiceTrabajoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceTrabajoItemStateChanged
        for (Trabajo trabajo: trabajos) {
            if (choiceTrabajo.getSelectedItem().equals(trabajo.getPuesto())){
                jLabelEmprText.setText(trabajo.getEmpresa());
                jLabelAnhoTextTrab.setText(String.valueOf(trabajo.getAnhoInicio()));
                jSliderAnho.setValue(trabajo.getAnhoInicio());
                switch(trabajo.getEmpresa()){
                    case "Induplan":
                        jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIndu.jpg"))); 
                        break;
                    case "Maderas Hermanos García Rocha":
                        jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgHGR.png")));
                        break;
                    case "Team and Time":
                        jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgTAT.png")));
                        break;   
                }
                if (trabajo.getDuracion()== 1) {
                     jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" año");
                } else {
                    jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" años");
                }
                jTextAreaDescTrabText.setText(trabajo.getDescripcion());
               
            }
        }
    }//GEN-LAST:event_choiceTrabajoItemStateChanged
    //Evento elegir año de empleo
    private void jSliderAnhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderAnhoStateChanged
        switch(jSliderAnho.getValue()) {
            case 2013:
                for(Trabajo trabajo: trabajos) {
                    if(trabajo.getAnhoInicio()==2013){
                        choiceTrabajo.select("Asesor en implantación de LEAN, 5S, JIT, etc");
                        jLabelEmprText.setText(trabajo.getEmpresa());
                        jLabelAnhoTextTrab.setText(String.valueOf(trabajo.getAnhoInicio()));
                         switch(trabajo.getEmpresa()){
                            case "Induplan":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIndu.jpg"))); 
                                break;
                            case "Maderas Hermanos García Rocha":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgHGR.png")));
                                break;
                            case "Team and Time":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgTAT.png")));
                                break;   
                        }
                        if (trabajo.getDuracion()== 1) {
                             jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" año");
                        } else {
                            jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" años");
                        }
                        jTextAreaDescTrabText.setText(trabajo.getDescripcion());
                    }
                }
                break;
            case 2014:
                for(Trabajo trabajo: trabajos) {
                    if(trabajo.getAnhoInicio()==2014){
                        choiceTrabajo.select("Estudio de costes y mejora de la producción");
                        jLabelEmprText.setText(trabajo.getEmpresa());
                        jLabelAnhoTextTrab.setText(String.valueOf(trabajo.getAnhoInicio()));
                         switch(trabajo.getEmpresa()){
                            case "Induplan":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIndu.jpg"))); 
                                break;
                            case "Maderas Hermanos García Rocha":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgHGR.png")));
                                break;
                            case "Team and Time":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgTAT.png")));
                                break;   
                        }
                        if (trabajo.getDuracion()== 1) {
                             jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" año");
                        } else {
                            jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" años");
                        }
                        jTextAreaDescTrabText.setText(trabajo.getDescripcion());
                    }
                }
                break;
            case 2015: case 2016: case 2017: case 2018: case 2019:
                for(Trabajo trabajo: trabajos) {
                    choiceTrabajo.select("Técnico");
                    if(trabajo.getAnhoInicio()==2015 || trabajo.getAnhoInicio()==2016 
                            || trabajo.getAnhoInicio()==2017 || trabajo.getAnhoInicio()==2018 
                            || trabajo.getAnhoInicio()==2019){
                        jLabelEmprText.setText(trabajo.getEmpresa());
                        jLabelAnhoTextTrab.setText(String.valueOf(trabajo.getAnhoInicio()));
                         switch(trabajo.getEmpresa()){
                            case "Induplan":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgIndu.jpg"))); 
                                break;
                            case "Maderas Hermanos García Rocha":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgHGR.png")));
                                break;
                            case "Team and Time":
                                jLabelImgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgTAT.png")));
                                break;   
                        }
                        if (trabajo.getDuracion()== 1) {
                             jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" año");
                        } else {
                            jLabelDuracText.setText(String.valueOf(trabajo.getDuracion())+" años");
                        }
                        jTextAreaDescTrabText.setText(trabajo.getDescripcion());
                    }
                }   
                break;
        
    }
    }//GEN-LAST:event_jSliderAnhoStateChanged

    private void listaAptitudesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaAptitudesItemStateChanged
        
    }//GEN-LAST:event_listaAptitudesItemStateChanged

    private void listaAptitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAptitudesActionPerformed
       
    }//GEN-LAST:event_listaAptitudesActionPerformed
    //Evento elegir aptitud
    private void listaAptitudesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAptitudesMouseClicked
        switch(listaAptitudes.getSelectedItem()) {
            case "Java":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgJava.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg"))); 
                break;
            case "Base de datos Oracle":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgOracle.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg"))); 
                break; 
            case "Scrum Master":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgScrum.jpg")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar1.jpg"))); 
                break; 
            case "Phython":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgPython.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar1.jpg"))); 
                break;
            case "Salesforce":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgSalesforce.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar1.jpg")));
                break; 
            case "Hibernate":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgHiber.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break;  
            case "Maven":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgMaven.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break;    
            case "SolidWorks":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgSolid.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar3.jpg")));
                break;
            case "CAD":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgCAD.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar3.jpg")));
                break; 
            case "SIG":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgSIG.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar3.jpg")));
                break;
            case "SQL":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgSQL.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break;
            case "Lean Manufacturing":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgLean.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break; 
            case "5S":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/img5S.png")));
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break; 
            case "JIT":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgJIT.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break;
            case "Software de carpintería":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgMec.jpg"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar3.jpg")));
                break;  
            case "Programación de mecanizados":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgCarp.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar3.jpg")));
                break;  
            case "Angular":
                jLabelImgAptitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgAngular.png"))); 
                jLabelImgStar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jpgseva/curriculum/media/imgStar2.jpg")));
                break;     
        }   
        DefaultTableModel model = crearTablaResultados();
        for (Estudio estudio: estudios) {
            List<Aptitud> aptEstud = estudio.getAptitudes();
            for(Aptitud a: aptEstud) {
                if(a.toString().equals(listaAptitudes.getSelectedItem())){
                    model.addRow(new Object[]{"Curso: " + estudio.getNombre(), String.valueOf(estudio.getAnhoInicio())});
                    jTextAreaDescripAptit.setText(estudio.getDescripcion());
                }
            }
        }
        for (Trabajo trabajo: trabajos) {
            List<Aptitud> aptTrab = trabajo.getAptitudes();
            for(Aptitud a: aptTrab) {
                if(a.toString().equals(listaAptitudes.getSelectedItem())){
                    model.addRow(new Object[]{"Empleo: " + trabajo.getPuesto(), String.valueOf(trabajo.getAnhoInicio())});
                    jTextAreaDescripAptit.setText(trabajo.getDescripcion());
                }
            }
        }
    }//GEN-LAST:event_listaAptitudesMouseClicked

    private void jPanelTabuladoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTabuladoMouseEntered
        
    }//GEN-LAST:event_jPanelTabuladoMouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        abrirWeb("https://www.linkedin.com/in/✔-jorge-pérez-gonzález-949a2244");
    }//GEN-LAST:event_jButton1MouseClicked
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        /* Crear y mostrar ventana*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal vp = new VentanaPrincipal(); 
                vp.setVisible(true);
                SwingUtilities.updateComponentTreeUI(vp);    
                vp.pack();
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice choiceTrabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAnho;
    private javax.swing.JLabel jLabelAnhoText;
    private javax.swing.JLabel jLabelAnhoTextTrab;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelAutor1;
    private javax.swing.JLabel jLabelCabImagen;
    private javax.swing.JLabel jLabelCentro;
    private javax.swing.JLabel jLabelCentroText;
    private javax.swing.JLabel jLabelDatosPersonales;
    private javax.swing.JLabel jLabelDescTrab;
    private javax.swing.JLabel jLabelDescrip;
    private javax.swing.JLabel jLabelDurac;
    private javax.swing.JLabel jLabelDuracText;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmpr;
    private javax.swing.JLabel jLabelEmprText;
    private javax.swing.JLabel jLabelEstudio;
    private javax.swing.JLabel jLabelGracias;
    private javax.swing.JLabel jLabelIDE;
    private javax.swing.JLabel jLabelImagenPersonal;
    private javax.swing.JLabel jLabelImgAptitud;
    private javax.swing.JLabel jLabelImgCentro;
    private javax.swing.JLabel jLabelImgEmpresa;
    private javax.swing.JLabel jLabelImgStar;
    private javax.swing.JLabel jLabelInstrucciones;
    private javax.swing.JLabel jLabelJava;
    private javax.swing.JLabel jLabelListAptitud;
    private javax.swing.JLabel jLabelResulEmail;
    private javax.swing.JLabel jLabelResulNom;
    private javax.swing.JLabel jLabelResultTel;
    private javax.swing.JLabel jLabelTelf;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JLabel jLableAnhoTrab;
    private javax.swing.JPanel jPanelAptitudes;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelEducacion;
    private javax.swing.JPanel jPanelExperiencia;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JTabbedPane jPanelTabulado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSliderAnho;
    private javax.swing.JTable jTableResultAptit;
    private javax.swing.JTextArea jTextAreaDescTrabText;
    private javax.swing.JTextArea jTextAreaDescripAptit;
    private javax.swing.JTextArea jTextAreaDescripText;
    private javax.swing.JTextArea jTextAreaIntro;
    private java.awt.List listaAptitudes;
    private java.awt.List listaEstudios;
    // End of variables declaration//GEN-END:variables
}
