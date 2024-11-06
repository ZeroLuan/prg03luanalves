/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade002.view;
import java.util.Random;
/**
 *
 * @author a1591
 */
public class Genio extends javax.swing.JFrame {

    /**
     * Creates new form Genio
     */
    public Genio() {
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

        pensarValor = new javax.swing.JLabel();
        snipperAdicionarNmr = new javax.swing.JSpinner();
        nomeValor = new javax.swing.JLabel();
        buttonPalpite = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pensarValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pensarValor.setText("Vou penasar em um valor entre 1 e 5");
        getContentPane().add(pensarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 29, -1, -1));
        getContentPane().add(snipperAdicionarNmr, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 124, 74, 32));

        nomeValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeValor.setText("Valor");
        getContentPane().add(nomeValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 125, -1, -1));

        buttonPalpite.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonPalpite.setText("Palpite");
        buttonPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 196, 111, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\a1591\\Documents\\NetBeansProjects\\prg03luanalves\\src\\main\\java\\br\\com\\ifba\\atividade002\\images\\genio.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 72, 306, 262));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tente Adivinhar !!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 29, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPalpiteActionPerformed
        // TODO add your handling code here:
        
        int min = 1;
        int max = 5;
        // gerando inteiros aleatórios de 1 a 5
        int numeroAleatorio = (int)(Math.random() * (max - min + 1) + min);
        // recebendo o numero selecioado
        int numeroSelecionado = Integer.parseInt(snipperAdicionarNmr.getValue().toString());
        // condicional que verifica se o numero digitado é == ao numero gerado aleatoriamente
        if(numeroSelecionado == (numeroAleatorio)){
            pensarValor.setText("<html> Acertou !");
        } else {
            pensarValor.setText("<html> Errou !, Eu pensei no numero = " + numeroAleatorio);
        }
    }//GEN-LAST:event_buttonPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Genio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Genio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomeValor;
    private javax.swing.JLabel pensarValor;
    private javax.swing.JSpinner snipperAdicionarNmr;
    // End of variables declaration//GEN-END:variables
}
