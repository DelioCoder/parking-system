/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.parkingsystem.view.conductor;

import com.parkingsystem.controller.ConductorController;
import com.parkingsystem.model.Conductor;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.WindowConstants;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


/**
 *
 * @author Christian BR
 */
public class TablaC extends javax.swing.JFrame { 

    private ConductorController conductorController;

    /**
     * Creates new form TablaC
     */
    /**
     * Creates new form TablaC
     */
    public TablaC() {
        this.setResizable(false);
        initComponents();
        estilizarBotones();
        inicializarControlador();
        ArrayList<String> keyList = new ArrayList<>();
        conductorController.rellenarTabla("", keyList);

        // Configura la cabecera de la tabla
        JTableHeader tableHeader = jTableConductor.getTableHeader();
        tableHeader.setBackground(Color.WHITE);
        tableHeader.setForeground(Color.BLACK);

        // Establece la fuente y la altura del encabezado
        Font headerFont = new Font("Century Gothic", Font.PLAIN, 12);
        tableHeader.setFont(headerFont);
        tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));

        // Configura la tabla
        jTableConductor.setBackground(Color.WHITE);
        jTableConductor.setShowGrid(false); // Desactiva la cuadrícula de la tabla
        jTableConductor.setRowHeight(30); // Altura de las filas

        // Aplicar borde a todas las celdas del encabezado
        tableHeader.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setBackground(Color.WHITE); // Fondo blanco para el encabezado
                setForeground(Color.BLACK); // Texto negro
                setFont(new Font("Century Gothic", Font.PLAIN, 12));
                setHorizontalAlignment(LEFT); // Alineación del texto a la izquierda

                // Aplica un borde visible a la celda del encabezado
                setBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, new Color(240, 240, 240)));

                return component;
            }
        });

        // Configura el renderizador para las celdas de la tabla
        jTableConductor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setBackground(Color.WHITE); // Fondo blanco para las celdas
                setForeground(Color.BLACK); // Texto negro
                setFont(new Font("Century Gothic", Font.PLAIN, 12));
                setHorizontalAlignment(LEFT); // Alineación del texto a la izquierda

                // Aplica un borde visible a las celdas de la tabla
                setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, new Color(240, 240, 240)));

                return component;
            }
        });
    }
    
    
    public void estilizarBotones() {
        estilizarBoton(btnVolver);
        estilizarBoton(btnRegistrar);
    }
    
    public void estilizarBoton(JButton boton) {
        boton.setBackground(Color.WHITE); // Fondo verde
        boton.setForeground(Color.BLACK); // Texto negro (si hay texto)
        boton.setFocusPainted(false); // Elimina el borde de foco predeterminado
        boton.setRolloverEnabled(false); // No cambia el color al pasar el mouse
        boton.setBorderPainted(false); // Elimina el borde del botón
        boton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Opcionalmente, si la imagen tiene un fondo transparente y quieres que se vea bien:
        boton.setOpaque(false);
    }
    
    private void inicializarControlador()
    {
        conductorController = new ConductorController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreConductor = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConductor = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Conductores");

        txtNombreConductor.setToolTipText("Ingrese el nombre");
        txtNombreConductor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreConductorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreConductorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreConductorKeyTyped(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit.png"))); // NOI18N
        btnRegistrar.setText("Registrar Conductor");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jTableConductor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTableConductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "DNI", "Telefono", "Acciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableConductor.setGridColor(new java.awt.Color(255, 255, 255));
        jTableConductor.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableConductor);

        btnVolver.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/anterior.png"))); // NOI18N
        btnVolver.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 973, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        txtNombreConductor.getAccessibleContext().setAccessibleName("Ingrese Nombre");
        txtNombreConductor.getAccessibleContext().setAccessibleDescription("Ingrese Nombre");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
            Conductor conductor = new Conductor();
            ModalConductor form = new ModalConductor(this, conductor, true);
            form.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE); // Evita que la ventana principal se cierre
            
            form.setVisible(true);
            form.toFront();  // Asegura que el formulario aparezca en el frente

    
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtNombreConductorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConductorKeyTyped
    }//GEN-LAST:event_txtNombreConductorKeyTyped

    private void txtNombreConductorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConductorKeyReleased
        String conductorText = txtNombreConductor.getText();
        ArrayList<String> keyList = new ArrayList<>();
        keyList.add(0, conductorText);
        conductorController.rellenarTabla("nombre", keyList);
    }//GEN-LAST:event_txtNombreConductorKeyReleased

    private void txtNombreConductorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreConductorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreConductorKeyPressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TablaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableConductor;
    public javax.swing.JTextField txtNombreConductor;
    // End of variables declaration//GEN-END:variables
}
