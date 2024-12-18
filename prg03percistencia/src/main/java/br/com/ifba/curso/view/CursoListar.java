/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

/**
 *
 * @author a1591
 */
public class CursoListar extends javax.swing.JFrame {

    /**
     * Creates new form CursoListar
     */
    public CursoListar() {
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

        cadastrarNovoCurso = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        exibirInformacao = new javax.swing.JTextField();
        procurar = new javax.swing.JTextField();
        nome = new javax.swing.JLabel();
        quantidade = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        fornecedor = new javax.swing.JLabel();
        remover = new javax.swing.JLabel();
        Editar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarNovoCurso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastrarNovoCurso.setText("+");
        cadastrarNovoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovoCursoActionPerformed(evt);
            }
        });

        imprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        imprimir.setText("Homescreen");

        exibirInformacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exibirInformacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        exibirInformacao.setText("Informação");

        procurar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        procurar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        procurar.setText("Procurar...");

        nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nome.setText("Nome");

        quantidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        quantidade.setText("Quantidade");

        descricao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descricao.setText("Descrição");

        fornecedor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fornecedor.setText("Fornecedor");

        remover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        remover.setText("Remover");

        Editar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Editar.setText("Editar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exibirInformacao)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(procurar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(cadastrarNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(nome)
                .addGap(65, 65, 65)
                .addComponent(quantidade)
                .addGap(60, 60, 60)
                .addComponent(descricao)
                .addGap(66, 66, 66)
                .addComponent(fornecedor)
                .addGap(56, 56, 56)
                .addComponent(remover)
                .addGap(72, 72, 72)
                .addComponent(Editar)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procurar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(quantidade)
                    .addComponent(descricao)
                    .addComponent(fornecedor)
                    .addComponent(remover)
                    .addComponent(Editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exibirInformacao, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarNovoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovoCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarNovoCursoActionPerformed

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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Editar;
    private javax.swing.JButton cadastrarNovoCurso;
    private javax.swing.JLabel descricao;
    private javax.swing.JTextField exibirInformacao;
    private javax.swing.JLabel fornecedor;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel nome;
    private javax.swing.JTextField procurar;
    private javax.swing.JLabel quantidade;
    private javax.swing.JLabel remover;
    // End of variables declaration//GEN-END:variables
}
