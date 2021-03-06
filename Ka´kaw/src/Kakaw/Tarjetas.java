/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kakaw;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josec
 */
public class Tarjetas extends javax.swing.JFrame {

    /**
     * Creates new form Tarjetas
     */
    public Tarjetas() {
        initComponents();
        modelo = new DefaultTableModel();
        Tabla_Tarjetas.setModel(modelo);
        modelo.addColumn("Tarjeta");
        modelo.addColumn("Banco");
        modelo.addColumn("Compañia");
        modelo.addColumn("Credito/Debito");
        mapa = new HashMap<Integer,Tarjeta>();
        llenarMapa();
        llenarTabla();
    }
public   void llenarMapa(){
        try{
            mapa.clear();
            procedimiento=Conexion.getInstancia().getConexion().prepareCall("CALL sp_Consoltar_Tarjeta(?)");
            procedimiento.setString(1,correo);
            resultado= procedimiento.executeQuery();
            i=0;
            while(resultado.next()){
               
                mapa.put(i,new Tarjeta(resultado.getString("Numero_de_Tarjeta"),
                resultado.getString("Compañia"),resultado.getString("Banco"),
                resultado.getString("Tipo_de_Tarjeta")));
                i++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

private static void borrarTabla(){
        for(int i=modelo.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
    }
    public static void llenarTabla(){
        borrarTabla();
        i=0;
        while(i<mapa.size()){
            fila= new String[4];
            fila[0] = mapa.get(i).getTarjeta();
            fila[1] = mapa.get(i).getBanco();
            fila[2] = mapa.get(i).getCompañia();
            fila[3] = mapa.get(i).getTipo();

            modelo.addRow(fila);
         
            i++;
        }       
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Tarjetas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nueva_tarjeta = new javax.swing.JButton();
        eliminar_tarjeta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 28, 76));
        jPanel1.setMaximumSize(new java.awt.Dimension(472, 400));

        Tabla_Tarjetas.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Tabla_Tarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tarjeta", "Banco", "Compañia", "Credito/Debito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Tarjetas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla_Tarjetas);
        if (Tabla_Tarjetas.getColumnModel().getColumnCount() > 0) {
            Tabla_Tarjetas.getColumnModel().getColumn(0).setResizable(false);
            Tabla_Tarjetas.getColumnModel().getColumn(1).setResizable(false);
            Tabla_Tarjetas.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Tarjetas.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kakaw/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        nueva_tarjeta.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        nueva_tarjeta.setText("Nueva Tarjeta");
        nueva_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueva_tarjetaActionPerformed(evt);
            }
        });

        eliminar_tarjeta.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        eliminar_tarjeta.setText("Eliminar Tarjeta");
        eliminar_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_tarjetaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nueva_tarjeta)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar_tarjeta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nueva_tarjeta)
                    .addComponent(eliminar_tarjeta))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nueva_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueva_tarjetaActionPerformed
            dispose();
            Crear_Tarjeta s=new Crear_Tarjeta();
                s.setLocationRelativeTo(null);
                s.setDefaultCloseOperation(EXIT_ON_CLOSE);
                s.setResizable(false);
                s.setVisible(true);
    }//GEN-LAST:event_nueva_tarjetaActionPerformed

    private void eliminar_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_tarjetaActionPerformed
       dispose();
    }//GEN-LAST:event_eliminar_tarjetaActionPerformed

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
            java.util.logging.Logger.getLogger(Tarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarjetas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarjetas().setVisible(true);
            }
        });
    }
static int indiceRegistro,i=0;
    String idCiclista,nombre,apellido;
    private static String fila[];
    private static DefaultTableModel modelo;
    private static ResultSet resultado;
    private static HashMap<Integer,Tarjeta> mapa;
    private CallableStatement procedimiento;
    private String correo= Ingreso.correo.getText();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Tarjetas;
    private javax.swing.JButton eliminar_tarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nueva_tarjeta;
    // End of variables declaration//GEN-END:variables
}
