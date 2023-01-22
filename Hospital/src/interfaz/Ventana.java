
package interfaz;

import hospital.*;

public class Ventana extends javax.swing.JFrame {
    
    private boolean[] puestosPorCerrar = new boolean[10];
    
    public Ventana() {
        initComponents();
        this.setVisible(true);
        HiloPintor hp = new HiloPintor(this);
        hp.start();
    }
    public Ventana(Gestor gestor) {
        initComponents();
        this.setVisible(true);
        this.jButtonCerrar1.setEnabled(false);
        this.jButtonCerrar2.setEnabled(false);
        this.jButtonCerrar3.setEnabled(false);
        this.jButtonCerrar4.setEnabled(false);
        this.jButtonCerrar5.setEnabled(false);
        this.jButtonCerrar6.setEnabled(false);
        this.jButtonCerrar7.setEnabled(false);
        this.jButtonCerrar8.setEnabled(false);
        this.jButtonCerrar9.setEnabled(false);
        this.jButtonCerrar10.setEnabled(false);
        
        
        HiloPintor hp = new HiloPintor(gestor, this);
        hp.start();
    }

    public boolean[] getPuestosPorCerrar() {
        return puestosPorCerrar;
    }
    public void setPuestosCerrados() {
        for (int i=0; i < puestosPorCerrar.length; i++) {
            puestosPorCerrar[i] = false;
        }
    }
    public void mostrarRecepcion(String colaRecepcion, String paciente, String auxiliarR) {
        this.jTextAreaRecepcion.setText(colaRecepcion);
        this.jTextPacienteR.setText(paciente);
        this.jTextAuxiliarR.setText(auxiliarR);
    }
    public void mostrarVacunas(int numVacunas, String auxiliar) {
        this.jTextVacunas.setText(""+ numVacunas);
        this.jTextAuxiliarV.setText(auxiliar);
    }
    
    public void mostrarPV1(String sanitario, String paciente) {
        this.jTextPV1.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV2(String sanitario, String paciente) {
        this.jTextPV2.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV3(String sanitario, String paciente) {
        this.jTextPV3.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV4(String sanitario, String paciente) {
        this.jTextPV4.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV5(String sanitario, String paciente) {
        this.jTextPV5.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV6(String sanitario, String paciente) {
        this.jTextPV6.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV7(String sanitario, String paciente) {
        this.jTextPV7.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV8(String sanitario, String paciente) {
        this.jTextPV8.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV9(String sanitario, String paciente) {
        this.jTextPV9.setText(sanitario + ", " + paciente);
    }
    public void mostrarPV10(String sanitario, String paciente) {
        this.jTextPV10.setText(sanitario + ", " + paciente);
    }
    
    public void mostrarPO1(String paciente) {
        this.jTextPO1.setText(paciente);
    }
    public void mostrarPO2(String paciente) {
        this.jTextPO2.setText(paciente);
    }
    public void mostrarPO3(String paciente) {
        this.jTextPO3.setText(paciente);
    }
    public void mostrarPO4(String paciente) {
        this.jTextPO4.setText(paciente);
    }
    public void mostrarPO5(String paciente) {
        this.jTextPO5.setText(paciente);
    }
    public void mostrarPO6(String paciente) {
        this.jTextPO6.setText(paciente);
    }
    public void mostrarPO7(String paciente) {
        this.jTextPO7.setText(paciente);
    }
    public void mostrarPO8(String paciente) {
        this.jTextPO8.setText(paciente);
    }
    public void mostrarPO9(String paciente) {
        this.jTextPO9.setText(paciente);
    }
    public void mostrarPO10(String paciente) {
        this.jTextPO10.setText(paciente);
    }
    public void mostrarPO11(String paciente) {
        this.jTextPO11.setText(paciente);
    }
    public void mostrarPO12(String paciente) {
        this.jTextPO12.setText(paciente);
    }
    public void mostrarPO13(String paciente) {
        this.jTextPO13.setText(paciente);
    }
    public void mostrarPO14(String paciente) {
        this.jTextPO14.setText(paciente);
    }
    public void mostrarPO15(String paciente) {
        this.jTextPO15.setText(paciente);
    }
    public void mostrarPO16(String paciente) {
        this.jTextPO16.setText(paciente);
    }
    public void mostrarPO17(String paciente) {
        this.jTextPO17.setText(paciente);
    }
    public void mostrarPO18(String paciente) {
        this.jTextPO18.setText(paciente);
    }
    public void mostrarPO19(String paciente) {
        this.jTextPO19.setText(paciente);
    }
    public void mostrarPO20(String paciente) {
        this.jTextPO20.setText(paciente);
    }
     
    public void mostrarDescanso(String colaDescanso) {
        this.jTextAreaDescanso.setText(colaDescanso);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRecepcion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaRecepcion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextPacienteR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextAuxiliarR = new javax.swing.JTextField();
        jPanelSDescanso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescanso = new javax.swing.JTextArea();
        jPanelSVacunacion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextPV1 = new javax.swing.JTextField();
        jTextPV2 = new javax.swing.JTextField();
        jTextPV3 = new javax.swing.JTextField();
        jTextPV6 = new javax.swing.JTextField();
        jTextPV4 = new javax.swing.JTextField();
        jTextPV5 = new javax.swing.JTextField();
        jTextPV8 = new javax.swing.JTextField();
        jTextPV7 = new javax.swing.JTextField();
        jTextPV9 = new javax.swing.JTextField();
        jTextPV10 = new javax.swing.JTextField();
        jButtonCerrar5 = new javax.swing.JButton();
        jButtonCerrar1 = new javax.swing.JButton();
        jButtonCerrar9 = new javax.swing.JButton();
        jButtonCerrar4 = new javax.swing.JButton();
        jButtonCerrar8 = new javax.swing.JButton();
        jButtonCerrar3 = new javax.swing.JButton();
        jButtonCerrar2 = new javax.swing.JButton();
        jButtonCerrar7 = new javax.swing.JButton();
        jButtonCerrar6 = new javax.swing.JButton();
        jButtonCerrar10 = new javax.swing.JButton();
        jTextAuxiliarV = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextVacunas = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanelSObservacion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextPO1 = new javax.swing.JTextField();
        jTextPO5 = new javax.swing.JTextField();
        jTextPO14 = new javax.swing.JTextField();
        jTextPO12 = new javax.swing.JTextField();
        jTextPO11 = new javax.swing.JTextField();
        jTextPO4 = new javax.swing.JTextField();
        jTextPO2 = new javax.swing.JTextField();
        jTextPO3 = new javax.swing.JTextField();
        jTextPO13 = new javax.swing.JTextField();
        jTextPO15 = new javax.swing.JTextField();
        jTextPO16 = new javax.swing.JTextField();
        jTextPO18 = new javax.swing.JTextField();
        jTextPO6 = new javax.swing.JTextField();
        jTextPO8 = new javax.swing.JTextField();
        jTextPO17 = new javax.swing.JTextField();
        jTextPO7 = new javax.swing.JTextField();
        jTextPO20 = new javax.swing.JTextField();
        jTextPO10 = new javax.swing.JTextField();
        jTextPO19 = new javax.swing.JTextField();
        jTextPO9 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRecepcion.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("RECEPCIÓN");

        jTextAreaRecepcion.setColumns(20);
        jTextAreaRecepcion.setLineWrap(true);
        jTextAreaRecepcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaRecepcion);

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Cola de espera");

        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Paciente");

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Auxiliar");

        javax.swing.GroupLayout jPanelRecepcionLayout = new javax.swing.GroupLayout(jPanelRecepcion);
        jPanelRecepcion.setLayout(jPanelRecepcionLayout);
        jPanelRecepcionLayout.setHorizontalGroup(
            jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecepcionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRecepcionLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelRecepcionLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextPacienteR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextAuxiliarR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(jPanelRecepcionLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(104, 104, 104))))
        );
        jPanelRecepcionLayout.setVerticalGroup(
            jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecepcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecepcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRecepcionLayout.createSequentialGroup()
                        .addComponent(jTextPacienteR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jTextAuxiliarR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelRecepcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, -1));

        jPanelSDescanso.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("SALA DE DESCANSO");

        jTextAreaDescanso.setColumns(20);
        jTextAreaDescanso.setLineWrap(true);
        jTextAreaDescanso.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescanso);

        javax.swing.GroupLayout jPanelSDescansoLayout = new javax.swing.GroupLayout(jPanelSDescanso);
        jPanelSDescanso.setLayout(jPanelSDescansoLayout);
        jPanelSDescansoLayout.setHorizontalGroup(
            jPanelSDescansoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSDescansoLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSDescansoLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        jPanelSDescansoLayout.setVerticalGroup(
            jPanelSDescansoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSDescansoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelSDescansoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelSDescanso, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 0, 540, 207));

        jPanelSVacunacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("SALA DE VACUNACIÓN");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Puesto 2");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Puesto 1");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Puesto 3");

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Puesto 5");

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Puesto 4");

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Puesto 10");

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Puesto 9");

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Puesto 8");

        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Puesto 7");

        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Puesto 6");

        jTextPV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV1ActionPerformed(evt);
            }
        });
        jTextPV1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextPV1PropertyChange(evt);
            }
        });

        jTextPV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV2ActionPerformed(evt);
            }
        });

        jTextPV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV3ActionPerformed(evt);
            }
        });

        jTextPV6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV6ActionPerformed(evt);
            }
        });

        jTextPV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV4ActionPerformed(evt);
            }
        });

        jTextPV5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV5ActionPerformed(evt);
            }
        });

        jTextPV8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV8ActionPerformed(evt);
            }
        });

        jTextPV7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV7ActionPerformed(evt);
            }
        });

        jTextPV9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV9ActionPerformed(evt);
            }
        });

        jTextPV10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPV10ActionPerformed(evt);
            }
        });

        jButtonCerrar5.setText("Cerrar");
        jButtonCerrar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar5ActionPerformed(evt);
            }
        });

        jButtonCerrar1.setText("Cerrar");
        jButtonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar1ActionPerformed(evt);
            }
        });

        jButtonCerrar9.setText("Cerrar");
        jButtonCerrar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar9ActionPerformed(evt);
            }
        });

        jButtonCerrar4.setText("Cerrar");
        jButtonCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar4ActionPerformed(evt);
            }
        });

        jButtonCerrar8.setText("Cerrar");
        jButtonCerrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar8ActionPerformed(evt);
            }
        });

        jButtonCerrar3.setText("Cerrar");
        jButtonCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar3ActionPerformed(evt);
            }
        });

        jButtonCerrar2.setText("Cerrar");
        jButtonCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar2ActionPerformed(evt);
            }
        });

        jButtonCerrar7.setText("Cerrar");
        jButtonCerrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar7ActionPerformed(evt);
            }
        });

        jButtonCerrar6.setText("Cerrar");
        jButtonCerrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar6ActionPerformed(evt);
            }
        });

        jButtonCerrar10.setText("Cerrar");
        jButtonCerrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar10ActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Vacunas Disponibles");

        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Auxiliar");

        javax.swing.GroupLayout jPanelSVacunacionLayout = new javax.swing.GroupLayout(jPanelSVacunacion);
        jPanelSVacunacion.setLayout(jPanelSVacunacionLayout);
        jPanelSVacunacionLayout.setHorizontalGroup(
            jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSVacunacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(540, 540, 540))
            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextPV6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextPV1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(60, 60, 60)
                                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPV2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButtonCerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(219, 219, 219)
                        .addComponent(jTextPV9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jTextPV10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel13)
                                            .addComponent(jButtonCerrar8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPV8)))))
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCerrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPV7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPV3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCerrar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCerrar9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPV4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPV5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCerrar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonCerrar10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel10)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel9))
                            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel12)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel11)))))
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSVacunacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextVacunas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAuxiliarV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(226, 226, 226))
                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSVacunacionLayout.createSequentialGroup()
                    .addContainerGap(925, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(232, 232, 232)))
        );
        jPanelSVacunacionLayout.setVerticalGroup(
            jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(19, 19, 19)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextPV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCerrar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonCerrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jTextAuxiliarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPV6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPV7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPV8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPV9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPV10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrar8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrar9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCerrar10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(jPanelSVacunacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelSVacunacionLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel20)
                    .addContainerGap(214, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanelSVacunacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 219, 1205, -1));

        jPanelSObservacion.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("SALA DE OBSERVACIÓN");

        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Puesto 1");

        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Puesto 2");

        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Puesto 3");

        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Puesto 4");

        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Puesto 5");

        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Puesto 6");

        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Puesto 7");

        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Puesto 8");

        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Puesto 9");

        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Puesto 10");

        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Puesto 17");

        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Puesto 16");

        jLabel33.setForeground(new java.awt.Color(51, 51, 51));
        jLabel33.setText("Puesto 15");

        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("Puesto 14");

        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("Puesto 13");

        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("Puesto 11");

        jLabel37.setForeground(new java.awt.Color(51, 51, 51));
        jLabel37.setText("Puesto 12");

        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Puesto 18");

        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Puesto 19");

        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Puesto 20");

        jTextPO4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPO4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSObservacionLayout = new javax.swing.GroupLayout(jPanelSObservacion);
        jPanelSObservacion.setLayout(jPanelSObservacionLayout);
        jPanelSObservacionLayout.setHorizontalGroup(
            jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSObservacionLayout.createSequentialGroup()
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14))
                    .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jTextPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPO11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel36)
                                        .addComponent(jLabel21)))))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22)
                            .addComponent(jTextPO2)
                            .addComponent(jTextPO12)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextPO4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSObservacionLayout.createSequentialGroup()
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextPO13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(jTextPO3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)))
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel34))))
                            .addComponent(jTextPO14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSObservacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextPO15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel25))
                                    .addComponent(jTextPO5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel32))
                            .addComponent(jTextPO16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextPO6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPO7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel31))
                            .addComponent(jTextPO17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextPO18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                            .addComponent(jTextPO8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSObservacionLayout.createSequentialGroup()
                                            .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextPO19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextPO9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(36, 36, 36)))
                                    .addComponent(jTextPO10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel38))
                                    .addGap(66, 66, 66)
                                    .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                                .addComponent(jLabel29)
                                                .addGap(56, 56, 56)
                                                .addComponent(jLabel30))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSObservacionLayout.createSequentialGroup()
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel40)))
                                        .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                                            .addGap(106, 106, 106)
                                            .addComponent(jTextPO20, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(70, 70, 70))
        );
        jPanelSObservacionLayout.setVerticalGroup(
            jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSObservacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addGap(31, 31, 31)
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40))
                .addGap(28, 28, 28)
                .addGroup(jPanelSObservacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPO11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPO20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        getContentPane().add(jPanelSObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 522, 1217, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV1ActionPerformed

    private void jTextPV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV2ActionPerformed

    private void jTextPV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV3ActionPerformed

    private void jTextPV6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV6ActionPerformed

    private void jTextPV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV4ActionPerformed

    private void jTextPV5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV5ActionPerformed

    private void jTextPV8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV8ActionPerformed

    private void jTextPV7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV7ActionPerformed

    private void jTextPV9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV9ActionPerformed

    private void jTextPV10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPV10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV10ActionPerformed

    private void jTextPO4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPO4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPO4ActionPerformed

    private void jTextPV1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextPV1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPV1PropertyChange

    private void jButtonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar1ActionPerformed
        puestosPorCerrar[0] = true;
    }//GEN-LAST:event_jButtonCerrar1ActionPerformed

    private void jButtonCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar2ActionPerformed
        puestosPorCerrar[1] = true;
    }//GEN-LAST:event_jButtonCerrar2ActionPerformed

    private void jButtonCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar3ActionPerformed
        puestosPorCerrar[2] = true;
    }//GEN-LAST:event_jButtonCerrar3ActionPerformed

    private void jButtonCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar4ActionPerformed
        puestosPorCerrar[3] = true;
    }//GEN-LAST:event_jButtonCerrar4ActionPerformed

    private void jButtonCerrar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar5ActionPerformed
        puestosPorCerrar[4] = true;
    }//GEN-LAST:event_jButtonCerrar5ActionPerformed

    private void jButtonCerrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar6ActionPerformed
        puestosPorCerrar[5] = true;
    }//GEN-LAST:event_jButtonCerrar6ActionPerformed

    private void jButtonCerrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar7ActionPerformed
        puestosPorCerrar[6] = true;
    }//GEN-LAST:event_jButtonCerrar7ActionPerformed

    private void jButtonCerrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar8ActionPerformed
        puestosPorCerrar[7] = true;
    }//GEN-LAST:event_jButtonCerrar8ActionPerformed

    private void jButtonCerrar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar9ActionPerformed
        puestosPorCerrar[8] = true;
    }//GEN-LAST:event_jButtonCerrar9ActionPerformed

    private void jButtonCerrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar10ActionPerformed
        puestosPorCerrar[9] = true;
    }//GEN-LAST:event_jButtonCerrar10ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar1;
    private javax.swing.JButton jButtonCerrar10;
    private javax.swing.JButton jButtonCerrar2;
    private javax.swing.JButton jButtonCerrar3;
    private javax.swing.JButton jButtonCerrar4;
    private javax.swing.JButton jButtonCerrar5;
    private javax.swing.JButton jButtonCerrar6;
    private javax.swing.JButton jButtonCerrar7;
    private javax.swing.JButton jButtonCerrar8;
    private javax.swing.JButton jButtonCerrar9;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelRecepcion;
    private javax.swing.JPanel jPanelSDescanso;
    private javax.swing.JPanel jPanelSObservacion;
    private javax.swing.JPanel jPanelSVacunacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescanso;
    private javax.swing.JTextArea jTextAreaRecepcion;
    private javax.swing.JTextField jTextAuxiliarR;
    private javax.swing.JTextField jTextAuxiliarV;
    private javax.swing.JTextField jTextPO1;
    private javax.swing.JTextField jTextPO10;
    private javax.swing.JTextField jTextPO11;
    private javax.swing.JTextField jTextPO12;
    private javax.swing.JTextField jTextPO13;
    private javax.swing.JTextField jTextPO14;
    private javax.swing.JTextField jTextPO15;
    private javax.swing.JTextField jTextPO16;
    private javax.swing.JTextField jTextPO17;
    private javax.swing.JTextField jTextPO18;
    private javax.swing.JTextField jTextPO19;
    private javax.swing.JTextField jTextPO2;
    private javax.swing.JTextField jTextPO20;
    private javax.swing.JTextField jTextPO3;
    private javax.swing.JTextField jTextPO4;
    private javax.swing.JTextField jTextPO5;
    private javax.swing.JTextField jTextPO6;
    private javax.swing.JTextField jTextPO7;
    private javax.swing.JTextField jTextPO8;
    private javax.swing.JTextField jTextPO9;
    private javax.swing.JTextField jTextPV1;
    private javax.swing.JTextField jTextPV10;
    private javax.swing.JTextField jTextPV2;
    private javax.swing.JTextField jTextPV3;
    private javax.swing.JTextField jTextPV4;
    private javax.swing.JTextField jTextPV5;
    private javax.swing.JTextField jTextPV6;
    private javax.swing.JTextField jTextPV7;
    private javax.swing.JTextField jTextPV8;
    private javax.swing.JTextField jTextPV9;
    private javax.swing.JTextField jTextPacienteR;
    private javax.swing.JTextField jTextVacunas;
    // End of variables declaration//GEN-END:variables
}
