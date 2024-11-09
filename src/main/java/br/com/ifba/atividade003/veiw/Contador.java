/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade003.veiw;

import javax.swing.DefaultListModel;

/**
 *
 * @author a1591
 * 
 */
public class Contador extends javax.swing.JFrame {

    /**
     * Creates new form Contador
     */
    public Contador() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        finalLable = new javax.swing.JLabel();
        passoLable = new javax.swing.JLabel();
        InicialLable = new javax.swing.JLabel();
        sliderInicio = new javax.swing.JSlider();
        sliderFim = new javax.swing.JSlider();
        sliderPasso = new javax.swing.JSlider();
        buttonContar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        exibirNumeros = new javax.swing.JList<>();
        valorExibirPasso = new javax.swing.JLabel();
        valorExibirInicio = new javax.swing.JLabel();
        valorExibirFim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finalLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalLable.setText("Fim");
        getContentPane().add(finalLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 124, -1, -1));

        passoLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passoLable.setText("Passo");
        getContentPane().add(passoLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 199, -1, -1));

        InicialLable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InicialLable.setText("Inicio");
        getContentPane().add(InicialLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 49, -1, -1));

        sliderInicio.setMaximum(10);
        sliderInicio.setValue(0);
        sliderInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderInicioStateChanged(evt);
            }
        });
        getContentPane().add(sliderInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 55, -1, -1));

        sliderFim.setMaximum(20);
        sliderFim.setMinimum(11);
        sliderFim.setValue(0);
        sliderFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderFimStateChanged(evt);
            }
        });
        getContentPane().add(sliderFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 130, -1, -1));

        sliderPasso.setMaximum(4);
        sliderPasso.setMinimum(1);
        sliderPasso.setValue(1);
        sliderPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPassoStateChanged(evt);
            }
        });
        getContentPane().add(sliderPasso, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 205, -1, -1));

        buttonContar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonContar.setText("Contar");
        buttonContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonContar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 137, 41));

        jScrollPane1.setViewportView(exibirNumeros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 49, 184, 297));

        valorExibirPasso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorExibirPasso.setText("1");
        getContentPane().add(valorExibirPasso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        valorExibirInicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorExibirInicio.setText("0");
        getContentPane().add(valorExibirInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        valorExibirFim.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valorExibirFim.setText("11");
        getContentPane().add(valorExibirFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContarActionPerformed
        // TODO add your handling code here: 
        
        // Criando as variaveis que recebem os valores dos Sliders
        int guardarValorInicio = sliderInicio.getValue();
        int guardarValorFim = sliderFim.getValue();
        int guardarValorPassos = sliderPasso.getValue();
        
        // Instanciando o objeto lista, que usa a biblioteca javax.swing.DefaultListModel;
        DefaultListModel lista = new DefaultListModel();
        
        // Estrutura que adiciona no objeto o contador
        for(int cont = guardarValorInicio; cont <= guardarValorFim; cont += guardarValorPassos){
            lista.addElement(cont);
        }
        
        // Ele seta os valores, serve para exibir os numeros no Jlist
        exibirNumeros.setModel(lista);
        
    }//GEN-LAST:event_buttonContarActionPerformed

    
    // Esse metodo assim como o sliderFimStateChanged e sliderPassoStateChanged, Tem como funcionalidade
    // exibir os valores dos slider no label ao lado direito.
    private void sliderInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderInicioStateChanged
        // TODO add your handling code here:
        int guardarValorInicio = sliderInicio.getValue();
        valorExibirInicio.setText(Integer.toString(guardarValorInicio));
    }//GEN-LAST:event_sliderInicioStateChanged

    private void sliderFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderFimStateChanged
        // TODO add your handling code here:
        int guardarValorFim = sliderFim.getValue();
        valorExibirFim.setText(Integer.toString(guardarValorFim));
    }//GEN-LAST:event_sliderFimStateChanged

    private void sliderPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPassoStateChanged
        // TODO add your handling code here:
        int guardarValorPassos = sliderPasso.getValue();
        valorExibirPasso.setText(Integer.toString(guardarValorPassos));
    }//GEN-LAST:event_sliderPassoStateChanged

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
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InicialLable;
    private javax.swing.JButton buttonContar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JList<String> exibirNumeros;
    private javax.swing.JLabel finalLable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel passoLable;
    private javax.swing.JSlider sliderFim;
    private javax.swing.JSlider sliderInicio;
    private javax.swing.JSlider sliderPasso;
    private javax.swing.JLabel valorExibirFim;
    private javax.swing.JLabel valorExibirInicio;
    private javax.swing.JLabel valorExibirPasso;
    // End of variables declaration//GEN-END:variables
}
