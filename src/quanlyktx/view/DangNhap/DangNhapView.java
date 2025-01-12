/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.DangNhap;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import quanlyktx.DAO.DAO;
import quanlyktx.model.TaiKhoan;
import quanlyktx.view.Admin.AdminView;
import quanlyktx.view.DangKy.DangKyView;
import quanlyktx.view.User.SinhVienView;

/**
 *
 * @author luong
 */
public class DangNhapView extends javax.swing.JFrame {

    /**
     * Creates new form DangNhapView
     */
    List<TaiKhoan> accounts = new ArrayList<>();
    DAO controller = new DAO();

    public DangNhapView() {
        setIcon();
        initComponents();
        ImageIcon A = new ImageIcon(getClass().getResource("hide.png"));
        show_hide_pass.setIcon(A);

        accounts = controller.getListAccountStudent();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        show_hide_pass = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        btn_close = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        btn_dang_ky = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_hide_pass.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        show_hide_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/view/DangNhap/hide.png"))); // NOI18N
        show_hide_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_hide_passMouseClicked(evt);
            }
        });
        getContentPane().add(show_hide_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 20, 20));

        txtTaiKhoan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTaiKhoan.setBorder(null);
        txtTaiKhoan.setOpaque(false);
        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyPressed(evt);
            }
        });
        getContentPane().add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 310, 30));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setBorder(null);
        password.setOpaque(false);
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 353, 290, 30));

        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/close.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 20, -1));

        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 417, 70, 70));

        btn_dang_ky.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dang_ky.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dang_kyMouseClicked(evt);
            }
        });
        getContentPane().add(btn_dang_ky, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 515, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/DangNhap_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private boolean flag = true;
    private void show_hide_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_hide_passMouseClicked
        if (flag) {
            ImageIcon A = new ImageIcon(getClass().getResource("show.png"));
            show_hide_pass.setIcon(A);
            password.setEchoChar((char) 0);
            flag = false;
        } else {
            ImageIcon A = new ImageIcon(getClass().getResource("hide.png"));
            show_hide_pass.setIcon(A);
            password.setEchoChar((char) 8226);
            flag = true;
        }
    }//GEN-LAST:event_show_hide_passMouseClicked

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        login();
    }//GEN-LAST:event_btn_loginMouseClicked

    private void btn_dang_kyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dang_kyMouseClicked
        System.out.println("Đăng ký");
        new DangKyView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_dang_kyMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1; i += 0.5) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void txtTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            password.requestFocus();
        }
    }//GEN-LAST:event_txtTaiKhoanKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_dang_ky;
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel show_hide_pass;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
    public void login() {
        String taiKhoan = txtTaiKhoan.getText().toLowerCase();
        String matKhau = password.getText();
        if (!taiKhoan.isEmpty() && !matKhau.isEmpty()) {
            for (TaiKhoan tk : accounts) {
                if (taiKhoan.trim().equals(tk.getTenTK().trim()) && matKhau.trim().equals(tk.getMatKhau().trim()) && tk.getID_role() == 0) {
                    new AdminView(tk.getTenTK().trim()).setVisible(true);
                    this.dispose();
                    return;
                } else if (taiKhoan.trim().equals(tk.getTenTK().trim()) && matKhau.trim().equals(tk.getMatKhau().trim()) && tk.getID_role() == 1) {
                    new SinhVienView(taiKhoan.trim()).setVisible(true);
                    this.dispose();
                    return;
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Tài khoản hoặc mật khẩu không chính xác!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập thông tin!");
        }
    }
}
