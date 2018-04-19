/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;

/**
 *
 * @author Cesar Programacion
 */
public class Roles extends javax.swing.JFrame {

    /**
     * Creates new form Roles
     */
    public Roles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoles = new javax.swing.JPanel();
        sclRoles = new javax.swing.JScrollPane();
        lstRoles = new javax.swing.JList<>();
        pnlPermisos = new javax.swing.JPanel();
        ckbAlmacen = new javax.swing.JCheckBox();
        ckbInventarios = new javax.swing.JCheckBox();
        ckbEmpleados = new javax.swing.JCheckBox();
        btnGuardar = new javax.swing.JButton();
        ckbOrdenes = new javax.swing.JCheckBox();
        ckbProductos = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstRoles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Admin", "Almacenista", "Supervisor" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstRoles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRolesValueChanged(evt);
            }
        });
        sclRoles.setViewportView(lstRoles);

        javax.swing.GroupLayout pnlRolesLayout = new javax.swing.GroupLayout(pnlRoles);
        pnlRoles.setLayout(pnlRolesLayout);
        pnlRolesLayout.setHorizontalGroup(
            pnlRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRolesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sclRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRolesLayout.setVerticalGroup(
            pnlRolesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sclRoles)
        );

        ckbAlmacen.setText("Almacen");

        ckbInventarios.setText("Inventarios");

        ckbEmpleados.setText("Empleados");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        ckbOrdenes.setText("Ordenes");

        ckbProductos.setText("Productos");

        javax.swing.GroupLayout pnlPermisosLayout = new javax.swing.GroupLayout(pnlPermisos);
        pnlPermisos.setLayout(pnlPermisosLayout);
        pnlPermisosLayout.setHorizontalGroup(
            pnlPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermisosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(pnlPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbInventarios)
                    .addComponent(ckbOrdenes)
                    .addComponent(ckbEmpleados)
                    .addComponent(ckbAlmacen)
                    .addGroup(pnlPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGuardar)
                        .addComponent(ckbProductos)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        pnlPermisosLayout.setVerticalGroup(
            pnlPermisosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPermisosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(ckbAlmacen)
                .addGap(18, 18, 18)
                .addComponent(ckbEmpleados)
                .addGap(18, 18, 18)
                .addComponent(ckbOrdenes)
                .addGap(18, 18, 18)
                .addComponent(ckbInventarios)
                .addGap(18, 18, 18)
                .addComponent(ckbProductos)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPermisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlPermisos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstRolesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRolesValueChanged
        JOptionPane.showMessageDialog(null, lstRoles.getSelectedValue()+"  "+lstRoles.getSelectedIndex());
    }//GEN-LAST:event_lstRolesValueChanged

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Roles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox ckbAlmacen;
    private javax.swing.JCheckBox ckbEmpleados;
    private javax.swing.JCheckBox ckbInventarios;
    private javax.swing.JCheckBox ckbOrdenes;
    private javax.swing.JCheckBox ckbProductos;
    private javax.swing.JList<String> lstRoles;
    private javax.swing.JPanel pnlPermisos;
    private javax.swing.JPanel pnlRoles;
    private javax.swing.JScrollPane sclRoles;
    // End of variables declaration//GEN-END:variables
}
