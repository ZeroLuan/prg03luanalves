/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.controller.CursoIController;
import br.com.ifba.curso.entity.Curso;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author a1591
 */
@Component
public class CursoProcurar extends javax.swing.JFrame {
    
    @Autowired
    private CursoIController cursoController;
    
    /**
     * Creates new form CursoProcurar
     */
    public CursoProcurar() {
        initComponents();       
        this.setLocationRelativeTo(null); // Centraliza a janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar esta janela sem afetar as outras
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iDAlunoFind = new javax.swing.JLabel();
        textFildFindID = new javax.swing.JTextField();
        buttonProcurarCurso = new javax.swing.JButton();
        jLableStatusExibir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iDAlunoFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iDAlunoFind.setText("Digite o ID :");

        textFildFindID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonProcurarCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonProcurarCurso.setText("Procurar");
        buttonProcurarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcurarCursoActionPerformed(evt);
            }
        });

        jLableStatusExibir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLableStatusExibir.setText("Status do Curso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iDAlunoFind)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFildFindID, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLableStatusExibir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(buttonProcurarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iDAlunoFind, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFildFindID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonProcurarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLableStatusExibir)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonProcurarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcurarCursoActionPerformed
        // TODO add your handling code here:
        
        if(textFildFindID.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    null, 
                    "PREENCHA TODOS OS CAMPOS\n", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
        // Recebe o curso encontrado
        Curso cursoEncontrado = new Curso();
        
        // Recebe o curso pelo ID
        cursoEncontrado = cursoController.findById(Long.valueOf(textFildFindID.getText()));
        
        // Exibe as informaçãoes do Curso
        jLableStatusExibir.setText(cursoEncontrado.toString());
    }//GEN-LAST:event_buttonProcurarCursoActionPerformed

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
            java.util.logging.Logger.getLogger(CursoProcurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoProcurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoProcurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoProcurar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CursoProcurar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonProcurarCurso;
    private javax.swing.JLabel iDAlunoFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLableStatusExibir;
    private javax.swing.JTextField textFildFindID;
    // End of variables declaration//GEN-END:variables
}
