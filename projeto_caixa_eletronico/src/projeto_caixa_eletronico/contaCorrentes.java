package projeto_caixa_eletronico;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class contaCorrentes extends javax.swing.JFrame {

    public contaCorrentes() {
        initComponents();      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCorrente = new javax.swing.JTable();
        btnD = new javax.swing.JButton();
        btnR = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        textSaldo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tableCorrente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SALDO", "STATUS DA CONTA"
            }
        ));
        jScrollPane1.setViewportView(tableCorrente);

        btnD.setText("DEPOSITAR");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnR.setText("RETIRAR");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });

        btnE.setText("ENCERRAR");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        jLabel1.setText("INFORME ALGUM VALOR");

        jLabel2.setText("SELECIONE UMA CONTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tableCorrente.getModel();
        int linha = tableCorrente.getSelectedRow();
        if(tableCorrente.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textSaldo.getText());
        double saldo = num + num1;
        tableCorrente.setValueAt(saldo, linha, 1);
        }
        //banco bancos = new banco();
        //Object[] vetor = {textSaldo.getText(),235,true};
//        banco b = new banco();        
//        contaCorrente correntes = new contaCorrente();
//        correntes.contaCorrente("ivo", 25, true);      
//        b.vetor[0] = correntes.getId();
//        b.vetor[1] = correntes.getSaldo();
//        b.vetor[2] = correntes.getIdentificador();/        
//       contasBanco.addRow(b.vetor); 
    }//GEN-LAST:event_btnDActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tableCorrente.getModel();
        int linha = tableCorrente.getSelectedRow();
        if(tableCorrente.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textSaldo.getText());
        double saldo = num - num1;
        tableCorrente.setValueAt(saldo, linha, 1);
        }      
    }//GEN-LAST:event_btnRActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel contasBanco = (DefaultTableModel)tableCorrente.getModel();
        banco b = new banco();
        contaPoupanca p = new contaPoupanca();
        contaCorrente correntes = new contaCorrente();
        correntes.contaCorrente("ivo", 25, true);
        p.setId("igor henrique");
        p.setSaldo(5);
        p.setIdentificador(true);
        b.vetor[0] = correntes.getId();
        b.vetor[1] = correntes.getSaldo();
        b.vetor[2] = correntes.getIdentificador(); 
//        b.vetor[0] = p.getId();
//        b.vetor[1] = p.getSaldo();
//        b.vetor[2] = p.getIdentificador();
////        b.vetor[7] = p.getId();
////        b.vetor[8] = p.getId();
////        b.vetor[9] = p.getId();
////        b.vetor[10] = p.getId();
////        b.vetor[11] = p.getId();
////        b.vetor[12] = p.getId();
////        b.vetor[13] = p.getId();
////        b.vetor[14] = p.getId();
////        b.vetor[15] = p.getId();
////        b.vetor[16] = p.getId();
////        b.vetor[17] = p.getId();
////        b.vetor[18] = p.getId();
////        b.vetor[19] = p.getId();
////        b.vetor[20] = p.getId();
        int i=0;
        for (Object item:b.vetor){            
            contasBanco.addRow(b.vetor);
            i++;
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tableCorrente.getModel();
        int linha = tableCorrente.getSelectedRow();       
        boolean identificador = false;
        tableCorrente.setValueAt(identificador, linha, 2);
    }//GEN-LAST:event_btnEActionPerformed
   
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
            java.util.logging.Logger.getLogger(contaCorrentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contaCorrentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contaCorrentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contaCorrentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contaCorrentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCorrente;
    private javax.swing.JTextField textSaldo;
    // End of variables declaration//GEN-END:variables
}
