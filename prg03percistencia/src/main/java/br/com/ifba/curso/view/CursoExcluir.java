/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.controller.CursoController;
import br.com.ifba.curso.controller.CursoIController;
import br.com.ifba.curso.entity.Curso;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author a1591
 */
public class CursoExcluir extends javax.swing.JFrame {

    private final CursoIController cursoController = new CursoController();
    
    /**
     * Creates new form CursoExcluir
     */
    public CursoExcluir() {
        initComponents();
    }
    
    private CursoListar listarFrame; // Referência para o frame de listagem
    
    public CursoExcluir(CursoListar listarFrame) {
        initComponents(); // Inicializa os componentes da interface gráfica
        this.setLocationRelativeTo(null); // Centraliza a janela
        
        this.listarFrame = listarFrame; // Recebe o frame responsável pela listagem
        
        // Adiciona um listener para detectar o fechamento da janela
        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                if (listarFrame != null) {
                    listarFrame.readJTable(); // Atualiza a tabela no frame de listagem
                }
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fecha esta janela sem encerrar o programa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iDAlunoExcluir = new javax.swing.JLabel();
        textFildFindIDExcluir = new javax.swing.JTextField();
        buttonExcluirCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iDAlunoExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        iDAlunoExcluir.setText("Digite o ID :");

        textFildFindIDExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonExcluirCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonExcluirCurso.setText("Excluir");
        buttonExcluirCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iDAlunoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFildFindIDExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(buttonExcluirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(iDAlunoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFildFindIDExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonExcluirCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirCursoActionPerformed
        // TODO add your handling code here:
        
        if(textFildFindIDExcluir.getText().isEmpty()){
            JOptionPane.showMessageDialog(
                    null, 
                    "PREENCHA TODOS OS CAMPOS\n", 
                    "ERRO", 
                    JOptionPane.ERROR_MESSAGE
            );
        }
        
        // Procura o curso pelo ID
        Curso cursoExcluir = cursoController.findById(Long.parseLong(textFildFindIDExcluir.getText()));

        // Remove o curso
        cursoController.delete(cursoExcluir); 
        
    }//GEN-LAST:event_buttonExcluirCursoActionPerformed

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
            java.util.logging.Logger.getLogger(CursoExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoExcluir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CursoListar listarFrame = new CursoListar();
                new CursoExcluir(listarFrame).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExcluirCurso;
    private javax.swing.JLabel iDAlunoExcluir;
    private javax.swing.JTextField textFildFindIDExcluir;
    // End of variables declaration//GEN-END:variables
}
