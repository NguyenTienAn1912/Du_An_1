/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package HeThong;

/**
 *
 * @author SherLock
 */
public class View_HeThong extends javax.swing.JFrame {

    /**
     * Creates new form View_HeThong
     */
    public View_HeThong() {
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

        jButton1 = new javax.swing.JButton();
        txt_taiKhoan = new javax.swing.JTextField();
        pass_MK = new javax.swing.JPasswordField();
        btn_DangNhap = new javax.swing.JButton();
        GiaoDienLOGIN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DangNhap");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Quên mật khẩu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 100, -1));

        txt_taiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        txt_taiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taiKhoanActionPerformed(evt);
            }
        });
        getContentPane().add(txt_taiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 180, -1));

        pass_MK.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pass_MK, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 180, -1));

        btn_DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btn_DangNhap.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        btn_DangNhap.setForeground(new java.awt.Color(0, 0, 0));
        btn_DangNhap.setText("ĐĂNG NHẬP");
        btn_DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangNhapActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, -1));

        GiaoDienLOGIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconAndImage/OSAKE1.png"))); // NOI18N
        getContentPane().add(GiaoDienLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_taiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taiKhoanActionPerformed

    private void btn_DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(View_HeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_HeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_HeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_HeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_HeThong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GiaoDienLOGIN;
    private javax.swing.JButton btn_DangNhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField pass_MK;
    private javax.swing.JTextField txt_taiKhoan;
    // End of variables declaration//GEN-END:variables
}
