/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_PHUONGTHUC;

import javax.swing.JOptionPane;

/**
 *
 * @author hv
 */
public class BAITAP_7_PHUONGTHUC extends javax.swing.JFrame {

    /**
     * Creates new form BAITAP_2_PHUONGTHUC
     */
    
    
    
    
    public double tinhGio (float gio){
        final float donGiaGio=50000F;
        if (gio<=24)
            return donGiaGio*gio;
        else 
            return donGiaGio*24;
    }
    
    public double tinhNgay(float ngay){
        final float donGiaNgay=200000F;
        float mucGiam = 0.2F;
        if (ngay<7)
            return ngay*donGiaNgay;
        else 
            return (7*donGiaNgay) + ((ngay-7)*donGiaNgay*(1-mucGiam));
    }
    
    
    public BAITAP_7_PHUONGTHUC() {
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

        rbtGroup = new javax.swing.ButtonGroup();
        lblTenKhach = new javax.swing.JLabel();
        txtTenKhach = new javax.swing.JTextField();
        rbtGio = new javax.swing.JRadioButton();
        rbtNgay = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtGio = new javax.swing.JTextField();
        txtNgay = new javax.swing.JTextField();
        lblThanhTien = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        lblDonGiaNgay = new javax.swing.JLabel();
        lblDonGiaGio = new javax.swing.JLabel();
        txtDonGiaGio = new javax.swing.JTextField();
        txtDonGiaNgay = new javax.swing.JTextField();
        btnTinhTien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTenKhach.setText("Ten khach");

        rbtGroup.add(rbtGio);
        rbtGio.setSelected(true);
        rbtGio.setText("GIo");

        rbtGroup.add(rbtNgay);
        rbtNgay.setText("Ngay");

        jLabel1.setText("SO GIO THUE");

        jLabel2.setText("SO NGAY THUE");

        lblThanhTien.setText("THANH TIEN");

        lblDonGiaNgay.setText("Don gia ngay");

        lblDonGiaGio.setText("Don gia gio");

        txtDonGiaGio.setText("50000");

        txtDonGiaNgay.setText("200000");

        btnTinhTien.setText("TinhTien");
        btnTinhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTinhTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenKhach)
                    .addComponent(rbtGio)
                    .addComponent(rbtNgay)
                    .addComponent(lblThanhTien))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGio, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(txtNgay)))
                    .addComponent(txtTenKhach)
                    .addComponent(txtThanhTien))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDonGiaNgay)
                    .addComponent(lblDonGiaGio))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonGiaGio)
                    .addComponent(txtDonGiaNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTinhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenKhach)
                            .addComponent(txtTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(rbtGio))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDonGiaGio)
                        .addComponent(txtDonGiaGio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNgay)
                    .addComponent(jLabel2)
                    .addComponent(txtNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDonGiaNgay)
                    .addComponent(txtDonGiaNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblThanhTien)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btnTinhTien)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTinhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTinhTienActionPerformed
        // TODO add your handling code here:
   
        if (rbtGio.isSelected()){
            float gio=Float.parseFloat(txtGio.getText());
            if(gio <30 && gio >0)
                txtThanhTien.setText(String.format("%.1f", tinhGio(gio)));
            else
            {JOptionPane.showMessageDialog(rootPane, "Nhap sai gio");
                txtGio.setText(null);
                txtGio.requestFocus();}
                
        }
        else{
            float ngay=Float.parseFloat(txtNgay.getText());
            if (ngay>0)
                txtThanhTien.setText(String.format("%.1f", tinhNgay(ngay)));
            else
            {JOptionPane.showMessageDialog(rootPane, "Nhap sai ngay");
                txtNgay.setText(null);
                txtNgay.requestFocus();}
        }
    }//GEN-LAST:event_btnTinhTienActionPerformed

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
            java.util.logging.Logger.getLogger(BAITAP_7_PHUONGTHUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BAITAP_7_PHUONGTHUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BAITAP_7_PHUONGTHUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BAITAP_7_PHUONGTHUC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BAITAP_7_PHUONGTHUC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinhTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDonGiaGio;
    private javax.swing.JLabel lblDonGiaNgay;
    private javax.swing.JLabel lblTenKhach;
    private javax.swing.JLabel lblThanhTien;
    private javax.swing.JRadioButton rbtGio;
    private javax.swing.ButtonGroup rbtGroup;
    private javax.swing.JRadioButton rbtNgay;
    private javax.swing.JTextField txtDonGiaGio;
    private javax.swing.JTextField txtDonGiaNgay;
    private javax.swing.JTextField txtGio;
    private javax.swing.JTextField txtNgay;
    private javax.swing.JTextField txtTenKhach;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}