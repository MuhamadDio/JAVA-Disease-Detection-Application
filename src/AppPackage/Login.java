/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackage;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Login extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    
    public Login() {
        initComponents();
        username.setBackground(new Color(0,0,0,0));
        z.setBackground(new Color(0,0,0,0));
        password.setBackground(new Color(0,0,0,0));
        jLabel2.setBackground(new Color(0,0,0,0));
        jLabel3.setBackground(new Color(0,0,0,0));
        jLabel6.setBackground(new Color(0,0,0,0));
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        z = new javax.swing.JTextField();
        exitbutton = new javax.swing.JLabel();
        MouseDrag = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        twiter = new javax.swing.JLabel();
        google = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        youtube = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(640, 960));
        setResizable(false);
        getContentPane().setLayout(null);

        z.setOpaque(false);
        getContentPane().add(z);
        z.setBounds(290, 180, 0, 22);

        exitbutton.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        exitbutton.setForeground(new java.awt.Color(255, 255, 255));
        exitbutton.setText("X");
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(exitbutton);
        exitbutton.setBounds(600, 10, 30, 40);

        MouseDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouseDragMouseDragged(evt);
            }
        });
        MouseDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouseDragMousePressed(evt);
            }
        });
        getContentPane().add(MouseDrag);
        MouseDrag.setBounds(0, 0, 640, 50);

        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("Password");
        password.setBorder(null);
        password.setOpaque(false);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(160, 300, 340, 50);

        username.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("Username or Email");
        username.setBorder(null);
        username.setCaretColor(new java.awt.Color(0, 204, 204));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.setOpaque(false);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(160, 230, 340, 50);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 360, 290, 70);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel3MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 780, 290, 50);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 560, 240, 40);

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Copyright © 2018 Kelompok 6");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 870, 280, 50);

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(121, 650, 50, 70);

        twiter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twiterMouseClicked(evt);
            }
        });
        getContentPane().add(twiter);
        twiter.setBounds(180, 650, 70, 70);

        google.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        google.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                googleMouseClicked(evt);
            }
        });
        getContentPane().add(google);
        google.setBounds(270, 650, 90, 70);

        instagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagramMouseClicked(evt);
            }
        });
        getContentPane().add(instagram);
        instagram.setBounds(360, 650, 80, 70);

        youtube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        youtube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtubeMouseClicked(evt);
            }
        });
        getContentPane().add(youtube);
        youtube.setBounds(450, 650, 80, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login3.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 960);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitbuttonMouseClicked

    private void MouseDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MouseDragMouseDragged

    private void MouseDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouseDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MouseDragMousePressed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        
        if(username.getText().equals("Username or Email")){
            username.setText("");
        }
        
        username.setForeground(Color.WHITE);
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(username.getText().equals("")){
            username.setText("Username or Email");
        }
        
        username.setForeground(new Color(236, 240, 241));
    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals("Password")){
            password.setText("");
        }
         
        password.setForeground(Color.WHITE);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().equals("")){
            password.setText("Password");
        }
        
        password.setForeground(new Color(236, 240, 241));
    }//GEN-LAST:event_passwordFocusLost

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
       MenuUtama MU = new MenuUtama();
        String user = "admin";
        String pas = "admin";
       
        String ps = new String(password.getText());
        String uzer = username.getText();
        String pass = ps;
        
        if(uzer.equals(user) && pass.equals(pas)){
      
            JOptionPane.showMessageDialog(null, "Login Success");
            MU.setVisible(true);
            this.setVisible(false);
        }
        else JOptionPane.showMessageDialog(null, "Sorry, your username or password is incorrect");
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JOptionPane.showMessageDialog(null, "Username & password : admin");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        SiteOpener run = new SiteOpener();
        run.OpenWebsite("https://web.facebook.com/?_rdc=1&_rdr");
    }//GEN-LAST:event_jLabel6MouseClicked

    private void twiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twiterMouseClicked
        SiteOpener run = new SiteOpener();
        run.OpenWebsite("https://twitter.com/login?lang=id");
    }//GEN-LAST:event_twiterMouseClicked

    private void googleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_googleMouseClicked
        SiteOpener run = new SiteOpener();
        run.OpenWebsite("https://myaccount.google.com/");
        
    }//GEN-LAST:event_googleMouseClicked

    private void instagramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagramMouseClicked
        SiteOpener run = new SiteOpener();
        run.OpenWebsite("https://www.instagram.com/accounts/login/?hl=id");
    }//GEN-LAST:event_instagramMouseClicked

    private void youtubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeMouseClicked
        SiteOpener run = new SiteOpener();
        run.OpenWebsite("https://www.youtube.com/");
    }//GEN-LAST:event_youtubeMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MouseDrag;
    private javax.swing.JLabel exitbutton;
    private javax.swing.JLabel google;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel twiter;
    private javax.swing.JTextField username;
    private javax.swing.JLabel youtube;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables

}
