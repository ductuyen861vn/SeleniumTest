/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP4;

/**
 *
 * @author hv
 */
public class BAITAP_NGOAI_3 extends javax.swing.JFrame {

    /**
     * Creates new form BAITAP_NGOAI_3
     */
    public BAITAP_NGOAI_3() {
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

        lblTinhNamAmLich = new javax.swing.JLabel();
        lblNamDuong = new javax.swing.JLabel();
        lblNamAm = new javax.swing.JLabel();
        txtNamDuong = new javax.swing.JTextField();
        txtNamAm = new javax.swing.JTextField();
        btnTinh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTinhNamAmLich.setText("Tinh nam Am lich tu Duong lich");

        lblNamDuong.setText("Nam Duong");

        lblNamAm.setText("Nam AM");

        txtNamDuong.setText("jTextField1");

        txtNamAm.setText("jTextField2");

        btnTinh.setText("Tinh");
        btnTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNamAm)
                            .addComponent(lblNamDuong))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamDuong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamAm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblTinhNamAmLich))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnTinh)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTinhNamAmLich)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamDuong)
                    .addComponent(txtNamDuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamAm)
                    .addComponent(txtNamAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnTinh)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhActionPerformed
        // TODO add your handling code here:
        int nam = Integer.parseInt(txtNamDuong.getText());
        int can = nam%10;
        int chi = nam%12;
        String txtCan="0";
        String txtChi="0";
        
        switch(can){
            case 0: txtCan="Canh";break;
            case 1: txtCan="Tan";break;
            case 2: txtCan="Nham";break;
            case 3: txtCan="Quy";break;
            case 4: txtCan="Giap";break;
            case 5: txtCan="At";break;
            case 6: txtCan="Binh";break;
            case 7: txtCan="Dinh";break;
            case 8: txtCan="Mau";break;
            case 9: txtCan="Ky";break;
        
        }
        switch(chi){
            case 0: txtChi="Than"; break;
            case 1: txtChi="Dau"; break;
            case 2: txtChi="Tuat"; break;
            case 3: txtChi="Hoi"; break;
            case 4: txtChi="Ty"; break;
            case 5: txtChi="Suu"; break;
            case 6: txtChi="Dan"; break;
            case 7: txtChi="mao"; break;
            case 8: txtChi="Thin"; break;
            case 9: txtChi="Ty"; break;
            case 10: txtChi="Ngo"; break;
            case 11: txtChi="Mui"; break;
        }
        
        txtNamAm.setText(txtCan+txtChi);
    }//GEN-LAST:event_btnTinhActionPerformed

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
            java.util.logging.Logger.getLogger(BAITAP_NGOAI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAITAP_NGOAI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAITAP_NGOAI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAITAP_NGOAI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAITAP_NGOAI_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinh;
    private javax.swing.JLabel lblNamAm;
    private javax.swing.JLabel lblNamDuong;
    private javax.swing.JLabel lblTinhNamAmLich;
    private javax.swing.JTextField txtNamAm;
    private javax.swing.JTextField txtNamDuong;
    // End of variables declaration//GEN-END:variables
}
