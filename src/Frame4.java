/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class Frame4 extends javax.swing.JFrame {
    /**
     * Creates new form Frame4
     */
    public Frame4() {
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

        Hasil = new javax.swing.JTextField();
        Bil1 = new javax.swing.JTextField();
        Bagi = new javax.swing.JButton();
        Kali = new javax.swing.JButton();
        Kurang = new javax.swing.JButton();
        Tambah = new javax.swing.JButton();
        Bil2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Hasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Hasil.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Hasil.setEnabled(false);
        getContentPane().add(Hasil);
        Hasil.setBounds(80, 230, 140, 60);
        getContentPane().add(Bil1);
        Bil1.setBounds(120, 40, 130, 30);

        Bagi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bagi.setText(":");
        Bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagiActionPerformed(evt);
            }
        });
        getContentPane().add(Bagi);
        Bagi.setBounds(80, 130, 60, 50);

        Kali.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kali.setText("X");
        Kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kali);
        Kali.setBounds(10, 130, 60, 50);

        Kurang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Kurang.setText("-");
        Kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KurangActionPerformed(evt);
            }
        });
        getContentPane().add(Kurang);
        Kurang.setBounds(220, 130, 60, 50);

        Tambah.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tambah.setText("+");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        getContentPane().add(Tambah);
        Tambah.setBounds(150, 130, 60, 50);
        getContentPane().add(Bil2);
        Bil2.setBounds(120, 80, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 0, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Hasil :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 190, 70, 30);

        jLabel3.setText("Bilangan 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 40, 70, 30);

        jLabel4.setText("Bilangan 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 80, 70, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 300);

        setBounds(0, 0, 312, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void BagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagiActionPerformed
        // TODO add your handling code here:
         double bilangan1 = Double.parseDouble(Bil1.getText());
         double bilangan2 = Double.parseDouble(Bil2.getText());
         double hasilbagi = bilangan1 / bilangan2;
         Hasil.setText(String.valueOf(hasilbagi));
    }//GEN-LAST:event_BagiActionPerformed

    private void KaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KaliActionPerformed
        // TODO add your handling code here:
        int bilangan1 = Integer.parseInt(Bil1.getText());
         int bilangan2 = Integer.parseInt(Bil2.getText());
         int hasilkali = bilangan1 * bilangan2;
         Hasil.setText(String.valueOf(hasilkali));
    }//GEN-LAST:event_KaliActionPerformed

    private void KurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KurangActionPerformed
        // TODO add your handling code here:
        int bilangan1 = Integer.parseInt(Bil1.getText());
         int bilangan2 = Integer.parseInt(Bil2.getText());
         int hasilkurang = bilangan1 - bilangan2;
         Hasil.setText(String.valueOf(hasilkurang));
    }//GEN-LAST:event_KurangActionPerformed

    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        // TODO add your handling code here:
        int bilangan1 = Integer.parseInt(Bil1.getText());
         int bilangan2 = Integer.parseInt(Bil2.getText());
         int hasiltambah = bilangan1 + bilangan2;
         Hasil.setText(String.valueOf(hasiltambah));
    }//GEN-LAST:event_TambahActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagi;
    private javax.swing.JTextField Bil1;
    private javax.swing.JTextField Bil2;
    private javax.swing.JTextField Hasil;
    private javax.swing.JButton Kali;
    private javax.swing.JButton Kurang;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
