/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package premiereintgraphique_bras;

/**
 *
 * @author juliettebras
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        System.out.println("fenêtre crée");
        msgBienvenue.setText("Bonjour le monde");
        Resultat.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msgBienvenue = new javax.swing.JLabel();
        BouttonValider = new javax.swing.JButton();
        zoneNom = new javax.swing.JTextField();
        Resultat = new javax.swing.JLabel();
        QuestionSalaire = new javax.swing.JLabel();
        zoneSalaire = new javax.swing.JTextField();
        QuestionPrenom = new javax.swing.JLabel();
        zonePrenom = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        QuestionNom = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        msgFin = new javax.swing.JLabel();
        BouttonAugmenter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msgBienvenue.setFont(new java.awt.Font("Avenir Next", 2, 18)); // NOI18N
        msgBienvenue.setForeground(new java.awt.Color(204, 0, 153));
        msgBienvenue.setText("Hello world");
        getContentPane().add(msgBienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 23, -1, -1));

        BouttonValider.setBackground(new java.awt.Color(255, 204, 255));
        BouttonValider.setFont(new java.awt.Font("Euphemia UCAS", 2, 13)); // NOI18N
        BouttonValider.setText("BouttonValider");
        BouttonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BouttonValiderActionPerformed(evt);
            }
        });
        getContentPane().add(BouttonValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        zoneNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoneNomActionPerformed(evt);
            }
        });
        getContentPane().add(zoneNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 98, -1));

        Resultat.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        Resultat.setForeground(new java.awt.Color(153, 153, 255));
        Resultat.setText("Resultat");
        getContentPane().add(Resultat, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        QuestionSalaire.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        QuestionSalaire.setForeground(new java.awt.Color(51, 51, 255));
        QuestionSalaire.setText("Entrer votre salaire :");
        getContentPane().add(QuestionSalaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, -1, -1));

        zoneSalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoneSalaireActionPerformed(evt);
            }
        });
        getContentPane().add(zoneSalaire, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 188, 105, -1));

        QuestionPrenom.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        QuestionPrenom.setForeground(new java.awt.Color(51, 51, 255));
        QuestionPrenom.setText("Entre ton prenom :");
        getContentPane().add(QuestionPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        getContentPane().add(zonePrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 100, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        QuestionNom.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        QuestionNom.setForeground(new java.awt.Color(51, 51, 255));
        QuestionNom.setText("Entre ton nom :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(QuestionNom)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(QuestionNom))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 140, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 180, 20));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 204), 1, true));

        msgFin.setFont(new java.awt.Font("Avenir Next", 2, 18)); // NOI18N
        msgFin.setForeground(new java.awt.Color(204, 0, 204));
        msgFin.setText("Goodbye");

        BouttonAugmenter.setBackground(new java.awt.Color(255, 204, 255));
        BouttonAugmenter.setFont(new java.awt.Font("Euphemia UCAS", 2, 13)); // NOI18N
        BouttonAugmenter.setText("Augmenter le salaire");
        BouttonAugmenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BouttonAugmenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(msgFin))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(BouttonAugmenter)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(220, Short.MAX_VALUE)
                .addComponent(BouttonAugmenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msgFin)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BouttonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BouttonValiderActionPerformed
        // TODO add your handling code here:
        msgFin.setText("au revoir");
        String a =zoneNom.getText();
        String b=zonePrenom.getText();
        
        Resultat.setText("Bonjour "+ a +" " +b);
        Resultat.setVisible(true);
    }//GEN-LAST:event_BouttonValiderActionPerformed

    private void zoneNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoneNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zoneNomActionPerformed

    private void zoneSalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoneSalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zoneSalaireActionPerformed

    private void BouttonAugmenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BouttonAugmenterActionPerformed
        // TODO add your handling code here:
        String salaire = zoneSalaire.getText();
        int salaire_entier=Integer.parseInt(salaire);
        salaire_entier++;
        zoneSalaire.setText(salaire_entier+"");
    }//GEN-LAST:event_BouttonAugmenterActionPerformed

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
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BouttonAugmenter;
    private javax.swing.JButton BouttonValider;
    private javax.swing.JLabel QuestionNom;
    private javax.swing.JLabel QuestionPrenom;
    private javax.swing.JLabel QuestionSalaire;
    private javax.swing.JLabel Resultat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel msgBienvenue;
    private javax.swing.JLabel msgFin;
    private javax.swing.JTextField zoneNom;
    private javax.swing.JTextField zonePrenom;
    private javax.swing.JTextField zoneSalaire;
    // End of variables declaration//GEN-END:variables
}