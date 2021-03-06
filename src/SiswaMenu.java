/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectsmkn8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author AdiRahmad
 */
public class SiswaMenu extends javax.swing.JFrame {
java.util.Date tglsekarang = new java.util.Date();
private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
private String tanggal = smpdtfmt.format(tglsekarang);

     final void setJam(){
     ActionListener taskPerformer = new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            String nol_jam = "", nol_menit = "",nol_detik = "";
                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();

                if(nilai_jam <= 9) nol_jam= "0";
                if(nilai_menit <= 9) nol_menit= "0";
                if(nilai_detik <= 9) nol_detik= "0";

                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

                lbljam1.setText(jam+":"+menit+":"+detik+"");
                }
            };
        new Timer(1000, taskPerformer).start();
    }
    /**
     * Creates new form SiswaMenu
     */
    public SiswaMenu() {
        initComponents();
        lbltgl.setText(tanggal);
        setJam();
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
        jLabel5 = new javax.swing.JLabel();
        txtBrowse = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        chkPass = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        lbltgl = new javax.swing.JLabel();
        lbljam1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsmkn8/Image/Banner Decrypt.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsmkn8/Image/Siswa.png"))); // NOI18N

        jLabel3.setText("Choose File :");

        jLabel5.setText("Password :");

        txtBrowse.setEditable(false);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsmkn8/Image/arrow-upload-icon (1).png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsmkn8/Image/red-unlock-icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        chkPass.setText("Show Password");
        chkPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPassActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectsmkn8/Image/power-icon (1).png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbltgl.setText("tanggal");

        lbljam1.setText("jam");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPass, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbljam1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbltgl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addGap(8, 8, 8)
                        .addComponent(chkPass)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                            .addComponent(lbltgl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbljam1)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );

        setSize(new java.awt.Dimension(626, 361));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPassActionPerformed
 if(chkPass.isSelected()){
        txtPass.setEchoChar((char)0);
        }else{
        txtPass.setEchoChar('*');        // TODO add your handling code here:
    }//GEN-LAST:event_chkPassActionPerformed
    }
    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JFileChooser Filter = new JFileChooser();
        Filter.setCurrentDirectory(new File(System.getProperty("user.home")));
        Filter.setFileSelectionMode(JFileChooser.FILES_ONLY);
        Filter.setAcceptAllFileFilterUsed(true);
        Filter.addChoosableFileFilter(new FileNameExtensionFilter("PDF file", "pdf"));
        Filter.addChoosableFileFilter(new FileNameExtensionFilter("Office Dokumen", "docx", "xlsx", "pptx", "doc", "ppt", "xls"));
        Filter.addChoosableFileFilter(new FileNameExtensionFilter("Gambar", "jpg", "png", "gif", "bmp"));
        
        int Hasil = Filter.showOpenDialog(this);
        if (Hasil == JFileChooser.APPROVE_OPTION) {
            File Sourcenya = Filter.getSelectedFile();
            txtBrowse.setText(Sourcenya.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
    void Bersih (){
    txtBrowse.setText("");
    txtPass.setText("");
   }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String keydefault = "1";
        String PassKosongA = null;
        File file = new File(txtBrowse.getText());
        String pass = txtPass.getText();
         int i;
        if (pass.length()<=32){
            PassKosongA = pass;
            for (i = 0 ; i <= 32 - pass.length() ;i++ ){
               PassKosongA = PassKosongA + keydefault;
            }
            Arrays.toString(PassKosongA.getBytes());
        }
         if (txtBrowse.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Silahkan Pilih file anda terlebih dahulu","Perhatian",JOptionPane.WARNING_MESSAGE);}
         if (txtPass.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Silahkan Masukkan Password anda","Perhatian",JOptionPane.WARNING_MESSAGE);
         }else{
              
        try {
            byte[] myByte = new byte[(int) file.length()];
            try (FileInputStream bos = new FileInputStream(file.getAbsolutePath())) {
                bos.read(myByte, 0, (int) file.length());
            }   
            AES aes = new AES();
            aes.setKey(PassKosongA);
            String encryptedString;
            encryptedString = aes.Decrypt(AES.static_byteArrayToString(myByte));
            byte[] encryptedByte;
            encryptedByte = AES.static_stringToByteArray(encryptedString);
           String filePathWithoutExt = file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("."));
            try (FileOutputStream encryptedFile = new FileOutputStream(filePathWithoutExt + "-Terdekripsi" + file.getAbsolutePath().substring(file.getAbsolutePath().lastIndexOf("."), file.getAbsolutePath().length()))) {
                encryptedFile.write(encryptedByte);
            }
           JOptionPane.showMessageDialog(null, " Berhasil didekripsi");
    Bersih();
        
            
         
        } catch (IOException e) {
}
    }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int Pilih = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar ?","Peringatan",JOptionPane.OK_CANCEL_OPTION);
    if (Pilih == JOptionPane.OK_OPTION){
    dispose();
    new LoginSiswa().show();
        }else if(Pilih == JOptionPane.CANCEL_OPTION){
            Bersih();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SiswaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SiswaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SiswaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SiswaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SiswaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkPass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbljam1;
    private javax.swing.JLabel lbltgl;
    private javax.swing.JTextField txtBrowse;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
