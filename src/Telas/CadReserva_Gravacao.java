/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadReserva_Gravacao.java
 *
 * Created on 15/11/2015, 21:59:45
 */
package Telas;
import Conectividades.ConexaoReserva_Gravacao;
import javax.swing.JOptionPane;
import Estudio.Reserva_Gravacao;


/**
 *
 * @author Rafa
 */
public class CadReserva_Gravacao extends javax.swing.JFrame {

    /** Creates new form CadReserva_Gravacao */
    public CadReserva_Gravacao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextValor_Reserva_Gra = new javax.swing.JTextField();
        jTextData_Reserva_Gra = new javax.swing.JTextField();
        jTextHora_Entrada_Reserva_Gra = new javax.swing.JTextField();
        jTextHora_Saida_Reserva_Gra = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Reserva Gravação");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Cadastro Reserva Gravação");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/headphones12 (0).png"))); // NOI18N
        jLabel2.setText("Valor");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/headphones12 (0).png"))); // NOI18N
        jLabel3.setText("Data");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/headphones12 (0).png"))); // NOI18N
        jLabel4.setText("Hora entrada");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/headphones12 (0).png"))); // NOI18N
        jLabel5.setText("Hora saida");

        jTextValor_Reserva_Gra.setBackground(new java.awt.Color(204, 255, 255));

        jTextData_Reserva_Gra.setBackground(new java.awt.Color(204, 255, 255));

        jTextHora_Entrada_Reserva_Gra.setBackground(new java.awt.Color(204, 255, 255));

        jTextHora_Saida_Reserva_Gra.setBackground(new java.awt.Color(204, 255, 255));
        jTextHora_Saida_Reserva_Gra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHora_Saida_Reserva_GraActionPerformed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/Cadastra/notebook17 (0).png"))); // NOI18N
        jButtonCadastrar.setText("Cadastra");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/Limpar/sound13 (0).png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonFechar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Gravação/Fechar/male97 (0).png"))); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/01_estudio_telas_menu.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextData_Reserva_Gra)
                            .addComponent(jTextValor_Reserva_Gra, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextHora_Saida_Reserva_Gra)
                            .addComponent(jTextHora_Entrada_Reserva_Gra, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextValor_Reserva_Gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextData_Reserva_Gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextHora_Entrada_Reserva_Gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextHora_Saida_Reserva_Gra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButtonCadastrar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonLimpar)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonFechar)))
                .addGap(77, 77, 77))
        );

        setBounds(350, 12, 619, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextHora_Saida_Reserva_GraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHora_Saida_Reserva_GraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHora_Saida_Reserva_GraActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
    
        this.dispose();
        new menu ().setVisible(true);      
        
        
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        
        int id_reserva_gra = 0;
String valor_reserva_gra = jTextValor_Reserva_Gra.getText();
String data_reserva_gra = jTextData_Reserva_Gra.getText();
String hora_entrada_reserva_gra = jTextHora_Entrada_Reserva_Gra.getText();
String hora_saida_reserva_gra = jTextHora_Saida_Reserva_Gra.getText();

try{
Reserva_Gravacao reserva_gravacao = new Reserva_Gravacao (id_reserva_gra, valor_reserva_gra, data_reserva_gra, hora_entrada_reserva_gra, hora_saida_reserva_gra);
ConexaoReserva_Gravacao conecta_reserva_gravacao = new ConexaoReserva_Gravacao();
conecta_reserva_gravacao.cadastrarReserva_Gravacao(reserva_gravacao);

jTextValor_Reserva_Gra.setText("");
jTextData_Reserva_Gra.setText("");
jTextHora_Entrada_Reserva_Gra.setText("");
jTextHora_Saida_Reserva_Gra.setText("");
jTextValor_Reserva_Gra.requestFocus();


JOptionPane.showMessageDialog(null,"Dados gragados com sucesso!","Aviso",JOptionPane.
INFORMATION_MESSAGE);
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, "Erro no banco de dados!"+ex.getMessage(),"Aviso",
JOptionPane.ERROR_MESSAGE);
ex.printStackTrace();
}
        
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        
jTextValor_Reserva_Gra.setText("");
jTextData_Reserva_Gra.setText("");
jTextHora_Entrada_Reserva_Gra.setText("");
jTextHora_Saida_Reserva_Gra.setText("");
jTextValor_Reserva_Gra.requestFocus();
        
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CadReserva_Gravacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadReserva_Gravacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadReserva_Gravacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadReserva_Gravacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadReserva_Gravacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextData_Reserva_Gra;
    private javax.swing.JTextField jTextHora_Entrada_Reserva_Gra;
    private javax.swing.JTextField jTextHora_Saida_Reserva_Gra;
    private javax.swing.JTextField jTextValor_Reserva_Gra;
    // End of variables declaration//GEN-END:variables
}