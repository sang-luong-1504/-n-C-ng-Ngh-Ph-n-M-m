/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.Admin;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import quanlyktx.model.PhatSinh;

/**
 *
 * @author luong
 */
public class SuaPhatSinh extends javax.swing.JDialog {

    /**
     * Creates new form SuaPhatSinh
     */
    ThuPhiView home;

    public SuaPhatSinh(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        home = (ThuPhiView) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_MaPS = new javax.swing.JLabel();
        lb_MaPS1 = new javax.swing.JLabel();
        lb_MaPS2 = new javax.swing.JLabel();
        lb_MaPS3 = new javax.swing.JLabel();
        txt_ma_ps = new javax.swing.JTextField();
        txt_tenps = new javax.swing.JTextField();
        txt_dv_tinh = new javax.swing.JTextField();
        txt_gia = new javax.swing.JTextField();
        btn_save = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_MaPS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_MaPS.setText("Mã phát sinh:");
        getContentPane().add(lb_MaPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lb_MaPS1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_MaPS1.setText("Tên phát sinh:");
        getContentPane().add(lb_MaPS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lb_MaPS2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_MaPS2.setText("Giá phát sinh:");
        getContentPane().add(lb_MaPS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        lb_MaPS3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_MaPS3.setText("Đơn vị tính:");
        getContentPane().add(lb_MaPS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        txt_ma_ps.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_ma_ps.setOpaque(false);
        txt_ma_ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ma_psActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ma_ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 290, -1));

        txt_tenps.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_tenps.setOpaque(false);
        getContentPane().add(txt_tenps, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 290, -1));

        txt_dv_tinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_dv_tinh.setOpaque(false);
        getContentPane().add(txt_dv_tinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 290, -1));

        txt_gia.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txt_gia.setOpaque(false);
        getContentPane().add(txt_gia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 290, -1));

        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 82, 35));

        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 542, 75, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/Sua_thong_tin_PS.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(500, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ma_psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ma_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ma_psActionPerformed

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked

        if (    checkEmpty(txt_tenps.getText().trim(), "Tên phát sinh?")
                && checkEmpty(txt_dv_tinh.getText().trim(), "Tên phát sinh?")
                && checkEmpty(txt_gia.getText().trim(), "Tên phát sinh?")
                ) {
            String gia = txt_gia.getText().trim();
            gia = gia.replace(",", "");
            gia = gia.replace("vnđ", "");
            gia = gia.replace("đ", "");
            gia = gia.replace(".", "");
            PhatSinh ps = new PhatSinh();

            ps.setMaPS(txt_ma_ps.getText().trim());
            ps.setTenPS(txt_tenps.getText().trim());
            ps.setDonViTinh(txt_dv_tinh.getText().trim());
            ps.setGiaTienPS(Integer.parseInt(gia));

            home.updatePhatSinh(ps);
            this.dispose();
        }
    }//GEN-LAST:event_btn_saveMouseClicked

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
            java.util.logging.Logger.getLogger(SuaPhatSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaPhatSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaPhatSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaPhatSinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaPhatSinh dialog = new SuaPhatSinh(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private javax.swing.JLabel btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_MaPS;
    private javax.swing.JLabel lb_MaPS1;
    private javax.swing.JLabel lb_MaPS2;
    private javax.swing.JLabel lb_MaPS3;
    private javax.swing.JTextField txt_dv_tinh;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_ma_ps;
    private javax.swing.JTextField txt_tenps;
    // End of variables declaration//GEN-END:variables

    public boolean checkEmpty(String key, String notify) {
        if (key.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, notify);
            return false;
        }
        return true;
    }
    
    void setEditData(PhatSinh ps) {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        txt_ma_ps.setText(ps.getMaPS().trim());
        txt_ma_ps.setEnabled(false);
        txt_tenps.setText(ps.getTenPS().trim());
        txt_dv_tinh.setText(ps.getDonViTinh().trim());
        txt_gia.setText(formatter.format(ps.getGiaTienPS()) + " vnđ");
    }
}
