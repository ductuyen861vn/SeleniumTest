/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay3;

import javax.swing.ImageIcon;

/**
 *
 * @author hv
 */
public class Bai3_2 extends javax.swing.JFrame {

    /**
     * Creates new form Bai3_2
     */
    
    String link = "src/hinh_nhaccu/";
    public Bai3_2() {
        initComponents();
        lblXuatHinh.setIcon(new ImageIcon(link+"tonghop.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSoDay = new javax.swing.JLabel();
        lblSuDung = new javax.swing.JLabel();
        btnChoiNhac = new javax.swing.JButton();
        txtTen = new javax.swing.JTextField();
        txtHinh = new javax.swing.JTextField();
        txtSuDung = new javax.swing.JTextField();
        txtSoDay = new javax.swing.JTextField();
        cbbLoai = new javax.swing.JComboBox();
        lblXuatHinh = new javax.swing.JLabel();
        lblDeChoi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaXuat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ten Nhac Cu");

        jLabel2.setText("Ten Hinh");

        jLabel3.setText("Loai Nhac Cu");

        lblSoDay.setText("So Day");

        lblSuDung.setText("Su Dung");

        btnChoiNhac.setText("Choi Nhac");
        btnChoiNhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiNhacActionPerformed(evt);
            }
        });

        cbbLoai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----Chon-----", "Co Day", "Khong Day", " " }));
        cbbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiActionPerformed(evt);
            }
        });

        lblDeChoi.setText("De Choi");

        txtaXuat.setColumns(20);
        txtaXuat.setRows(5);
        jScrollPane1.setViewportView(txtaXuat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSuDung)
                    .addComponent(lblSoDay)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChoiNhac)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtTen)
                            .addComponent(txtSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(txtSoDay, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(cbbLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblXuatHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblDeChoi)
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDay)
                            .addComponent(txtSoDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblXuatHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSuDung)
                            .addComponent(txtSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeChoi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnChoiNhac)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiActionPerformed
        // TODO add your handling code here:
        if(cbbLoai.getSelectedIndex()==1){
        lblSoDay.setVisible(true);
        txtSoDay.setVisible(true);
        lblSuDung.setVisible(false);
        txtSuDung.setVisible(false);
        lblDeChoi.setVisible(false);
        }if(cbbLoai.getSelectedIndex()==2){
        lblSoDay.setVisible(false);
        txtSoDay.setVisible(false);
        lblSuDung.setVisible(true);
        txtSuDung.setVisible(true);
        lblDeChoi.setVisible(true);
        }
        
    }//GEN-LAST:event_cbbLoaiActionPerformed

    private void btnChoiNhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoiNhacActionPerformed
        // TODO add your handling code here:
        String ten = txtTen.getText();
        String hinh = txtHinh.getText();
        
        
        if(cbbLoai.getSelectedIndex()==1){
            int soDay = Integer.parseInt(txtSoDay.getText());
        NhacCuCoDay coDay = new NhacCuCoDay(soDay, ten, hinh);
        txtaXuat.setText(coDay.choiNhac());
        }else if (cbbLoai.getSelectedIndex()==2){
            String suDung = txtSuDung.getText();
        NhacCuKhongDay khongDay = new NhacCuKhongDay(suDung, ten, hinh);
        txtaXuat.setText(khongDay.choiNhac());
        }
        lblXuatHinh.setIcon(new ImageIcon(link+txtHinh.getText()));
        
    }//GEN-LAST:event_btnChoiNhacActionPerformed

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
            java.util.logging.Logger.getLogger(Bai3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai3_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai3_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoiNhac;
    private javax.swing.JComboBox cbbLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeChoi;
    private javax.swing.JLabel lblSoDay;
    private javax.swing.JLabel lblSuDung;
    private javax.swing.JLabel lblXuatHinh;
    private javax.swing.JTextField txtHinh;
    private javax.swing.JTextField txtSoDay;
    private javax.swing.JTextField txtSuDung;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextArea txtaXuat;
    // End of variables declaration//GEN-END:variables
}