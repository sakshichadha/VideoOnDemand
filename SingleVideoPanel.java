
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sakshi
 */
public class SingleVideoPanel extends javax.swing.JPanel {

    /**
     * Creates new form SingleVideoPanel
     */
    public SingleVideoPanel() {
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

        jb_play = new javax.swing.JButton();
        lb_photo = new javax.swing.JLabel();
        lb_lecture = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        lb_duration = new javax.swing.JLabel();
        jb_download = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jb_play.setIcon(new javax.swing.ImageIcon("/Users/sakshi/Desktop/playicon.png")); // NOI18N

        setBackground(new java.awt.Color(255, 255, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(null);

        lb_photo.setText("photo");
        lb_photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(lb_photo);
        lb_photo.setBounds(10, 0, 220, 120);

        lb_lecture.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 14)); // NOI18N
        lb_lecture.setText("Lecture:");
        add(lb_lecture);
        lb_lecture.setBounds(40, 130, 130, 30);

        lb_title.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 14)); // NOI18N
        lb_title.setText("Title:");
        add(lb_title);
        lb_title.setBounds(40, 170, 120, 30);

        lb_duration.setFont(new java.awt.Font("Abadi MT Condensed Extra Bold", 0, 14)); // NOI18N
        lb_duration.setText("Duration:");
        add(lb_duration);
        lb_duration.setBounds(30, 200, 90, 30);

        jb_download.setIcon(new javax.swing.ImageIcon("/Users/sakshi/Desktop/download40*40.png")); // NOI18N
        jb_download.setEnabled(false);
        jb_download.setRequestFocusEnabled(false);
        jb_download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_downloadActionPerformed(evt);
            }
        });
        add(jb_download);
        jb_download.setBounds(190, 200, 40, 40);

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/sakshi/Desktop/play40*40.gif")); // NOI18N
        jButton1.setEnabled(false);
        add(jButton1);
        jButton1.setBounds(140, 200, 40, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_downloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_downloadActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jb_download;
    public javax.swing.JButton jb_play;
    public javax.swing.JLabel lb_duration;
    public javax.swing.JLabel lb_lecture;
    public javax.swing.JLabel lb_photo;
    public javax.swing.JLabel lb_title;
    // End of variables declaration//GEN-END:variables



}