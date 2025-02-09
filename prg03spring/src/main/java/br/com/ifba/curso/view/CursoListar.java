/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.controller.CursoController;
import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.controller.CursoIController;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author a1591
 */

@Component
public class CursoListar extends javax.swing.JFrame {

    @Autowired
    private ApplicationContext context;
    
    /**
     * Creates new form CursoListar
     */
    public CursoListar() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) tabelaExibir.getModel(); // Gerenciar modelo da tabela
        
        this.setLocationRelativeTo(null); // Centraliza a janela
        // Atualiza a pagina
        readJTable();
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
        buttonProcurarCurso = new javax.swing.JButton();
        scrollTabelaDeInfo = new javax.swing.JScrollPane();
        tabelaExibir = new javax.swing.JTable();
        buttonEditar = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();
        buttonAtualizarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrarNovoCurso.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cadastrarNovoCurso.setText("+");
        cadastrarNovoCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNovoCursoActionPerformed(evt);
            }
        });

        buttonProcurarCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonProcurarCurso.setText("Procurar Curso");
        buttonProcurarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProcurarCursoActionPerformed(evt);
            }
        });

        tabelaExibir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Curso", "Ativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaExibir.setToolTipText("");
        scrollTabelaDeInfo.setViewportView(tabelaExibir);

        buttonEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        buttonExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonExcluir.setText("Excluir");
        buttonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirActionPerformed(evt);
            }
        });

        buttonAtualizarLista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonAtualizarLista.setText("Atualizar Lista");
        buttonAtualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaDeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonProcurarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(cadastrarNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAtualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarNovoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonProcurarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAtualizarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaDeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(buttonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void readJTable(){// Metodo responsavel por atualizar a exibição do curso na tablea
        
        CursoIDao cdao = new CursoDao(); // Instancia o local onde sera atualizado
        List<Curso> cursos = cdao.findAll();
        
        DefaultTableModel model = (DefaultTableModel) tabelaExibir.getModel();// Exibe o modelo  
        model.setRowCount(0);// Seta nessa linha o modelo
        
        for(Curso c : cursos){// Adiciona na tabela já existente 
            
            model.addRow(new Object[]{
               c.getId(),
               c.getNome(),
               c.getCodigoCurso(),
               c.getAtivo()
            });
        }  
    }
      
    // Botão para cadastrar novo curso
    private void cadastrarNovoCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNovoCursoActionPerformed
        // TODO add your handling code here:
        
        // Abre a tela ao apertar o botão
        CursoAdicionar cursoAdicionar = context.getBean(CursoAdicionar.class);
        
        cursoAdicionar.setDefaultCloseOperation(CursoEditar.DISPOSE_ON_CLOSE);
        cursoAdicionar.setVisible(true);
    }//GEN-LAST:event_cadastrarNovoCursoActionPerformed

    private void buttonProcurarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProcurarCursoActionPerformed
        // TODO add your handling code here:
        
        // Abre a tela ao apertar o botão
        CursoProcurar cursoProcurar = context.getBean(CursoProcurar.class); 
        
        cursoProcurar.setDefaultCloseOperation(CursoEditar.DISPOSE_ON_CLOSE);
        cursoProcurar.setVisible(true);      
    }//GEN-LAST:event_buttonProcurarCursoActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        
        // Abre a tela ao apertar o botão
        CursoEditar cursoEditar = context.getBean(CursoEditar.class);
        
        cursoEditar.setDefaultCloseOperation(CursoEditar.DISPOSE_ON_CLOSE);
        cursoEditar.setVisible(true);
        
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void buttonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirActionPerformed
        // TODO add your handling code here:  
        
        // Abre a tela ao apertar o botão
        CursoExcluir cursoExcluir = context.getBean(CursoExcluir.class);
        
        cursoExcluir.setDefaultCloseOperation(CursoExcluir.DISPOSE_ON_CLOSE);
        cursoExcluir.setVisible(true);    
    }//GEN-LAST:event_buttonExcluirActionPerformed

    private void buttonAtualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarListaActionPerformed
        // TODO add your handling code here:
        
        // Atualiza a lista, exibe ela atualizada
        readJTable();
    }//GEN-LAST:event_buttonAtualizarListaActionPerformed

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
                CursoListar listarFrame = new CursoListar();
                listarFrame.setVisible(true); // Certifique-se de mostrar o frame principal
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarLista;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonProcurarCurso;
    private javax.swing.JButton cadastrarNovoCurso;
    private javax.swing.JScrollPane scrollTabelaDeInfo;
    private javax.swing.JTable tabelaExibir;
    // End of variables declaration//GEN-END:variables
}
