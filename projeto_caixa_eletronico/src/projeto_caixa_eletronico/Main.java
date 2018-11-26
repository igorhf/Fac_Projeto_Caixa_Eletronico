package projeto_caixa_eletronico;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCCC = new javax.swing.JButton();
        btnMostrarC = new javax.swing.JButton();
        btnCPP = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaContas = new javax.swing.JTable();
        btnDC = new javax.swing.JButton();
        btnRC = new javax.swing.JButton();
        btnEC = new javax.swing.JButton();
        btnJP = new javax.swing.JButton();
        btnEP = new javax.swing.JButton();
        btnRP = new javax.swing.JButton();
        btnDP = new javax.swing.JButton();
        textValor = new javax.swing.JTextField();
        lbValor = new javax.swing.JLabel();
        lbValor2 = new javax.swing.JLabel();
        textValor2 = new javax.swing.JTextField();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Conta Corrente");

        btnCCC.setText("Criar Conta Corrente");
        btnCCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCCActionPerformed(evt);
            }
        });

        btnMostrarC.setText("Mostrar Conta");
        btnMostrarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCActionPerformed(evt);
            }
        });

        btnCPP.setText("Criar Conta Poupança");
        btnCPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPPActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar Conta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Conta Poupança");

        tabelaContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SALDO", "STATUS", "TIPO DE CONTA"
            }
        ));
        jScrollPane1.setViewportView(tabelaContas);

        btnDC.setText("Depositar");
        btnDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDCActionPerformed(evt);
            }
        });

        btnRC.setText("Retirar");
        btnRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCActionPerformed(evt);
            }
        });

        btnEC.setText("Encerrar");
        btnEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnECActionPerformed(evt);
            }
        });

        btnJP.setText("Render Juros");
        btnJP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJPActionPerformed(evt);
            }
        });

        btnEP.setText("Encerrar");
        btnEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEPActionPerformed(evt);
            }
        });

        btnRP.setText("Retirar");
        btnRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRPActionPerformed(evt);
            }
        });

        btnDP.setText("Depositar");
        btnDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDPActionPerformed(evt);
            }
        });

        lbValor.setText("Informer algum valor");

        lbValor2.setText("Informer algum valor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCCC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCPP))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMostrarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbValor2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEC))
                            .addComponent(textValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(btnDP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textValor2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnJP)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCCC)
                    .addComponent(btnCPP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarC)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValor)
                    .addComponent(lbValor2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDC)
                    .addComponent(btnRC)
                    .addComponent(btnEC)
                    .addComponent(btnJP)
                    .addComponent(btnEP)
                    .addComponent(btnRP)
                    .addComponent(btnDP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPPActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        String id = null;
        String saldo = null;
        id = JOptionPane.showInputDialog("Informer o ID");
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE DEIXA O ID VAZIO");
        }else{
        saldo = JOptionPane.showInputDialog("Informer o seu SALDO");
        double num1 = Double.parseDouble(saldo);
        banco b = new banco();        
        contaPoupanca poupanca = new contaPoupanca();
        poupanca.contaPoupanca(id, num1, true);      
        b.vetor[0] = poupanca.getId();
        b.vetor[1] = poupanca.getSaldo();
        b.vetor[2] = poupanca.getIdentificador(); 
        b.vetor[3] = "Poupança";      
        contasBanco.addRow(b.vetor);
        }
    }//GEN-LAST:event_btnCPPActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        btnRC.setVisible(false);
        btnDC.setVisible(false);
        btnEC.setVisible(false);
        btnRP.setVisible(false);
        btnDP.setVisible(false);
        btnEP.setVisible(false);
        btnJP.setVisible(false);
        textValor.setVisible(false);
        lbValor.setVisible(false);
        textValor2.setVisible(false);
        lbValor2.setVisible(false);
        //tabelaContas.setVisible(false);
        //jTable1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btnCCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCCActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        String id = null;
        String saldo = null;
        id = JOptionPane.showInputDialog("Informer o ID");
        if(id.isEmpty()){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE DEIXA O ID VAZIO");
        }else{
        saldo = JOptionPane.showInputDialog("Informer o seu SALDO");
        double num1 = Double.parseDouble(saldo);
        banco b = new banco();        
        contaCorrente correntes = new contaCorrente();
        correntes.contaCorrente(id, num1, true);      
        b.vetor[0] = correntes.getId();
        b.vetor[1] = correntes.getSaldo();
        b.vetor[2] = correntes.getIdentificador(); 
        b.vetor[3] = "Corrente";      
        contasBanco.addRow(b.vetor);
        }
    }//GEN-LAST:event_btnCCCActionPerformed

    private void btnMostrarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCActionPerformed
        btnRC.setVisible(true);
        btnDC.setVisible(true);
        btnEC.setVisible(true);
        btnRP.setVisible(false);
        btnDP.setVisible(false);
        btnEP.setVisible(false);
        btnJP.setVisible(false);
        textValor.setVisible(true);
        lbValor.setVisible(true);
        textValor2.setVisible(false);
        lbValor2.setVisible(false);
        //tabelaContas.setVisible(true);
        //jTable1.setVisible(false);
    }//GEN-LAST:event_btnMostrarCActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        btnRC.setVisible(false);
        btnDC.setVisible(false);
        btnEC.setVisible(false);
        btnRP.setVisible(true);
        btnDP.setVisible(true);
        btnEP.setVisible(true);
        btnJP.setVisible(true);
        textValor.setVisible(false);
        lbValor.setVisible(false);
        textValor2.setVisible(true);
        lbValor2.setVisible(true);
        //tabelaContas.setVisible(false);
        //jTable1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDCActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        int linha = tabelaContas.getSelectedRow();
        if(contasBanco.getValueAt(linha, 3).toString() == "Poupança"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA POUPANÇA");
        }else{
        if(contasBanco.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textValor.getText());
        double saldo = num + num1;
        contasBanco.setValueAt(saldo, linha, 1);
        }
        }
    }//GEN-LAST:event_btnDCActionPerformed

    private void btnRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        int linha = tabelaContas.getSelectedRow();
        if(contasBanco.getValueAt(linha, 3).toString() == "Poupança"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA POUPANÇA");
        }else{
        if(contasBanco.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textValor.getText());
        double saldo = num - num1;
        contasBanco.setValueAt(saldo, linha, 1);
        }
        }
    }//GEN-LAST:event_btnRCActionPerformed

    private void btnECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnECActionPerformed
        int linha = tabelaContas.getSelectedRow();
        if(tabelaContas.getValueAt(linha, 3).toString() == "Poupança"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA POUPANÇA");
        }else{
        boolean identificador = false;
        tabelaContas.setValueAt(identificador, linha, 2);
        }
    }//GEN-LAST:event_btnECActionPerformed

    private void btnDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDPActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        int linha = tabelaContas.getSelectedRow();
        if(tabelaContas.getValueAt(linha, 3).toString() == "Corrente"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA CORRENTE");
        }else{
        if(contasBanco.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textValor2.getText());
        double saldo = num + num1;
        contasBanco.setValueAt(saldo, linha, 1);
        }
        }
    }//GEN-LAST:event_btnDPActionPerformed

    private void btnRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRPActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        int linha = tabelaContas.getSelectedRow();
        if(tabelaContas.getValueAt(linha, 3).toString() == "Corrente"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA CORRENTE");
        }else{
        if(contasBanco.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textValor2.getText());
        double saldo = num - num1;
        contasBanco.setValueAt(saldo, linha, 1);
        }
        }
    }//GEN-LAST:event_btnRPActionPerformed

    private void btnEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEPActionPerformed
        int linha = tabelaContas.getSelectedRow(); 
        if(tabelaContas.getValueAt(linha, 3).toString() == "Corrente"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA CORRENTE");
        }else{
        boolean identificador = false;
        tabelaContas.setValueAt(identificador, linha, 2);
        }
    }//GEN-LAST:event_btnEPActionPerformed

    private void btnJPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJPActionPerformed
        DefaultTableModel contasBanco = (DefaultTableModel)tabelaContas.getModel();
        int linha = tabelaContas.getSelectedRow();
        if(tabelaContas.getValueAt(linha, 3).toString() == "Corrente"){
            JOptionPane.showMessageDialog(null,"VOCÊ NÃO PODE ALTERAR CONTA CORRENTE");
        }else{
        if(contasBanco.getValueAt(linha, 2).toString() == "false"){
            JOptionPane.showMessageDialog(null,"ESSA CONTA FOI DESATIVADA");
        }else{
        double num = Double.parseDouble(contasBanco.getValueAt(linha, 1).toString());        
        double num1 = Double.parseDouble(textValor2.getText());
        double saldo = num * num1;
        contasBanco.setValueAt(saldo, linha, 1);
        }
        }
    }//GEN-LAST:event_btnJPActionPerformed
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCCC;
    private javax.swing.JButton btnCPP;
    private javax.swing.JButton btnDC;
    private javax.swing.JButton btnDP;
    private javax.swing.JButton btnEC;
    private javax.swing.JButton btnEP;
    private javax.swing.JButton btnJP;
    private javax.swing.JButton btnMostrarC;
    private javax.swing.JButton btnRC;
    private javax.swing.JButton btnRP;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbValor;
    private javax.swing.JLabel lbValor2;
    private javax.swing.JTable tabelaContas;
    private javax.swing.JTextField textValor;
    private javax.swing.JTextField textValor2;
    // End of variables declaration//GEN-END:variables
}
