/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade05.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author a1591
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public View() {
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza a janela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSliderInicio = new javax.swing.JSlider();
        jSliderFim = new javax.swing.JSlider();
        jSliderPassos = new javax.swing.JSlider();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblPasso = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        lblContInicio = new javax.swing.JLabel();
        lblContFinal = new javax.swing.JLabel();
        lblContPasso = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListExibirNumeros = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSliderInicio.setMaximum(5);
        jSliderInicio.setValue(0);
        jSliderInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderInicioStateChanged(evt);
            }
        });

        jSliderFim.setMaximum(20);
        jSliderFim.setMinimum(6);
        jSliderFim.setValue(6);
        jSliderFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderFimStateChanged(evt);
            }
        });

        jSliderPassos.setMaximum(4);
        jSliderPassos.setMinimum(1);
        jSliderPassos.setMinorTickSpacing(4);
        jSliderPassos.setValue(1);
        jSliderPassos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderPassosStateChanged(evt);
            }
        });

        lblInicio.setText("Inicio");

        lblFim.setText("Fim");

        lblPasso.setText("Passo");

        btnContar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        lblContInicio.setText("0");

        lblContFinal.setText("0");

        lblContPasso.setText("0");

        jListExibirNumeros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListExibirNumeros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblInicio)
                    .addComponent(lblFim)
                    .addComponent(lblPasso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSliderInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContInicio))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSliderPassos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContPasso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSliderFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContFinal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSliderInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInicio)
                            .addComponent(lblContInicio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSliderFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFim)
                            .addComponent(lblContFinal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSliderPassos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPasso)
                            .addComponent(lblContPasso))
                        .addGap(66, 66, 66)
                        .addComponent(btnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        // TODO add your handling code here:
        
        try {
            // Obtém os valores dos sliders, passa par o contador
            Integer inicio = jSliderInicio.getValue();
            Integer fim = jSliderFim.getValue();
            Integer passos = jSliderPassos.getValue();

            // Cria um modelo de lista que armazenará os números gerados
            DefaultListModel lista = new DefaultListModel();

            // Loop que gera os números conforme o intervalo e o passo informados
            for(int i = inicio; i <= fim; i += passos){
                lista.addElement(i);// Adiciona o número conforme o intecalo e o passo informado
            }

            // Define o modelo gerado na lisra gráfica
            jListExibirNumeros.setModel(lista);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnContarActionPerformed

    private void jSliderInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderInicioStateChanged
        // TODO add your handling code here:
        Integer inicio =  jSliderInicio.getValue(); // Pega o valor do Slider e armazena;
        
        lblContInicio.setText(String.valueOf(inicio)); // Exibe o valor que foi pego no lbl;
    }//GEN-LAST:event_jSliderInicioStateChanged

    private void jSliderFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderFimStateChanged
        // TODO add your handling code here:
        
        Integer fim = jSliderFim.getValue(); // Pega o valor do Slider e armazena;
        
        lblContFinal.setText(String.valueOf(fim)); // Exibe o valor que foi pego no lbl;
    }//GEN-LAST:event_jSliderFimStateChanged

    private void jSliderPassosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderPassosStateChanged
        // TODO add your handling code here:
        
        Integer passo = jSliderPassos.getValue(); // Pega o valor do Slider e armazena;
        
        lblContPasso.setText(String.valueOf(passo)); // Exibe o valor que foi pego no lbl;
    }//GEN-LAST:event_jSliderPassosStateChanged

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JList<String> jListExibirNumeros;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSliderFim;
    private javax.swing.JSlider jSliderInicio;
    private javax.swing.JSlider jSliderPassos;
    private javax.swing.JLabel lblContFinal;
    private javax.swing.JLabel lblContInicio;
    private javax.swing.JLabel lblContPasso;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPasso;
    // End of variables declaration//GEN-END:variables
}
