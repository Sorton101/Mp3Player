
package mp3player;

import java.io.File;
import java.io.FileFilter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Niels
 */
public class Mp3PlayerGUI extends javax.swing.JFrame {

    MainClass MC = new MainClass();
    public Mp3PlayerGUI() {
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

        jLabelStop = new javax.swing.JLabel();
        jLabelPlay = new javax.swing.JLabel();
        jLabelPause = new javax.swing.JLabel();
        jLabelLoop = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextFieldDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(10000, 10000));
        setMinimumSize(new java.awt.Dimension(450, 240));
        setPreferredSize(new java.awt.Dimension(400, 183));
        getContentPane().setLayout(null);

        jLabelStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Stop Icon.png"))); // NOI18N
        jLabelStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelStopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelStopMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelStop);
        jLabelStop.setBounds(30, 40, 110, 110);

        jLabelPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Play Icon.png"))); // NOI18N
        jLabelPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPlayMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelPlay);
        jLabelPlay.setBounds(140, 40, 110, 110);

        jLabelPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Pause Icon.png"))); // NOI18N
        jLabelPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPauseMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelPause);
        jLabelPause.setBounds(250, 40, 110, 110);
        getContentPane().add(jLabelLoop);
        jLabelLoop.setBounds(10, 140, 50, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3player/Menu.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 160, 50, 25);

        jTextFieldDisplay.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextFieldDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDisplay);
        jTextFieldDisplay.setBounds(70, 0, 270, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelStopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStopMousePressed

    }//GEN-LAST:event_jLabelStopMousePressed

    private void jLabelPlayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPlayMouseReleased

    MC.Resume();
    }//GEN-LAST:event_jLabelPlayMouseReleased

    private void jLabelStopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStopMouseReleased
    MC.Stop();
    }//GEN-LAST:event_jLabelStopMouseReleased

    private void jLabelPauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPauseMouseReleased
    MC.Pause();
    }//GEN-LAST:event_jLabelPauseMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
    FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 Files", "mp3", "mpeg3");
    
    JFileChooser chooser = new JFileChooser("C:\\Users\\Niels\\Documents\\NetBeansProjects\\mp3Player\\Music");
    chooser.addChoosableFileFilter(filter);
    
    int returnVal = chooser.showOpenDialog(null);
    
    if (returnVal == JFileChooser.APPROVE_OPTION)
    {
        File myFile = chooser.getSelectedFile();
        String song = myFile + "";
        
        String name = chooser.getSelectedFile().getName();
        jTextFieldDisplay.setText(name);
        
        MC.Play(song);
    }
    }//GEN-LAST:event_jButton1MouseReleased

    private void jTextFieldDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(Mp3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mp3PlayerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mp3PlayerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelLoop;
    private javax.swing.JLabel jLabelPause;
    private javax.swing.JLabel jLabelPlay;
    private javax.swing.JLabel jLabelStop;
    private javax.swing.JTextField jTextFieldDisplay;
    // End of variables declaration//GEN-END:variables
}
