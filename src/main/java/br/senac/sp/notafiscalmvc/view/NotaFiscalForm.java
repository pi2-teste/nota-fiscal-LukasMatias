package br.senac.sp.notafiscalmvc.view;

import br.senac.sp.notafiscalmvc.controller.NotaFiscalController;
import br.senac.sp.notafiscalmvc.controller.NotaFiscalTable;

public class NotaFiscalForm extends javax.swing.JFrame {

    NotaFiscalController controller = new NotaFiscalController();

    public NotaFiscalForm() {
        initComponents();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneCaixaNotas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelCampoNumNota = new javax.swing.JLabel();
        jLabelValorNota = new javax.swing.JLabel();
        jTextFieldCampoNumNota = new javax.swing.JTextField();
        jTextFieldCampoValor = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jLabelNomeProduto = new javax.swing.JLabel();
        jTextFieldCampoProduto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCampoNumNota.setText("Num Nota: ");

        jLabelValorNota.setText("Valor:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabelNomeProduto.setText("Nome do Produto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(169, 169, 169))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValorNota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCampoNumNota, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCampoNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCampoNumNota)
                            .addComponent(jTextFieldCampoNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValorNota)
                            .addComponent(jTextFieldCampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCampoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNomeProduto)))
                .addGap(38, 38, 38)
                .addComponent(jButtonSalvar)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        jTabbedPaneCaixaNotas.addTab("Registrar Nota", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NumNota", "ValorNota", "Nome do Produto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jTabbedPaneCaixaNotas.addTab("Lista de Notas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jTabbedPaneCaixaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTabbedPaneCaixaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        System.out.println(jTextFieldCampoNumNota.getText());

        double valNota;
        int numNota;
        String NomeProduto;
        valNota = Double.parseDouble(jTextFieldCampoNumNota.getText());
        numNota = Integer.parseInt(jTextFieldCampoValor.getText());
        NomeProduto = jTextFieldCampoProduto.getText();

        controller.salvar(numNota, valNota, NomeProduto);
        
        refreshTable();
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    public void refreshTable() {
        new NotaFiscalTable();
        jTable1.invalidate();
        jTable1.repaint();
    }

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaFiscalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCampoNumNota;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelValorNota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPaneCaixaNotas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCampoNumNota;
    private javax.swing.JTextField jTextFieldCampoProduto;
    private javax.swing.JTextField jTextFieldCampoValor;
    // End of variables declaration//GEN-END:variables
}
