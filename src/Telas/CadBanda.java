/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CadBanda.java
 *
 * Created on 15/11/2015, 16:57:17
 */
package Telas;
import Conectividades.ConexaoBanda;
import javax.swing.JOptionPane;
import Estudio.Banda;

/**
 *
 * @author Rafa
 */
public class CadBanda extends javax.swing.JFrame {

    /** Creates new form CadBanda */
    public CadBanda() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextNome_Ban = new javax.swing.JTextField();
        jTextFone_Ban = new javax.swing.JTextField();
        jTextemail_Ban = new javax.swing.JTextField();
        jTextGenero_Ban = new javax.swing.JTextField();
        jTextResponsavel_Ban = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextRua_Ban = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextNumero_Ban = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Banda");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel2.setText("Fone");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel4.setText("Genero");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel5.setText("Responsavel");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel1.setText("Nome");

        jTextNome_Ban.setBackground(new java.awt.Color(204, 255, 255));

        jTextFone_Ban.setBackground(new java.awt.Color(204, 255, 255));

        jTextemail_Ban.setBackground(new java.awt.Color(204, 255, 255));

        jTextGenero_Ban.setBackground(new java.awt.Color(204, 255, 255));

        jTextResponsavel_Ban.setBackground(new java.awt.Color(204, 255, 255));
        jTextResponsavel_Ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextResponsavel_BanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel6.setText("Cadastrar Banda");

        jButtonCadastrar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/Cadastra/leader (0).png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonLimpar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/Limpar/volume32 (0).png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonFechar.setBackground(new java.awt.Color(204, 255, 255));
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/Fechar/artist2 (0).png"))); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/01_estudio_telas_menu.png"))); // NOI18N

        jTextRua_Ban.setBackground(new java.awt.Color(204, 255, 255));
        jTextRua_Ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRua_BanActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel7.setText("Rua");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Inco/Banda/group2 (0).png"))); // NOI18N
        jLabel9.setText("Numero");

        jTextNumero_Ban.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextemail_Ban, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jTextGenero_Ban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jTextFone_Ban, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jTextNome_Ban, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jTextResponsavel_Ban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                            .addComponent(jTextRua_Ban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextNumero_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextNome_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextFone_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextemail_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextGenero_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextResponsavel_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jTextRua_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTextNumero_Ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel7)))
                .addGap(38, 38, 38))
        );

        setBounds(350, 1, 619, 653);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // Açao limpar dados
jTextNome_Ban.setText("");
jTextFone_Ban.setText("");
jTextemail_Ban.setText("");
jTextGenero_Ban.setText("");
jTextResponsavel_Ban.setText("");
jTextRua_Ban.setText("");
jTextNumero_Ban.setText("");

jTextNome_Ban.requestFocus();

    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new menu ().setVisible(true);      
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // Açao para cadastra
        int id_ban = 0;
String nome_ban = jTextNome_Ban.getText();
String fone_ban = jTextFone_Ban.getText();
String email_ban = jTextemail_Ban.getText();
String genero_ban = jTextGenero_Ban.getText();
String responsavel_ban = jTextResponsavel_Ban.getText();
String rua_ban = jTextRua_Ban.getText();
String numero_ban = jTextNumero_Ban.getText();
try{
Banda banda = new Banda(id_ban, nome_ban, fone_ban, email_ban, genero_ban, responsavel_ban, rua_ban, numero_ban);
ConexaoBanda conecta_banda = new ConexaoBanda();
conecta_banda.cadastrarBanda(banda);

       
jTextNome_Ban.setText("");
jTextFone_Ban.setText("");
jTextemail_Ban.setText("");
jTextGenero_Ban.setText("");
jTextResponsavel_Ban.setText("");
jTextRua_Ban.setText("");
jTextNumero_Ban.setText("");

jTextNome_Ban.requestFocus();


JOptionPane.showMessageDialog(null,"Dados gravados com sucesso!","Aviso",JOptionPane.
INFORMATION_MESSAGE);
}
catch(Exception ex){
JOptionPane.showMessageDialog(null, "Erro no banco de dados!"+ex.getMessage(),"Aviso",
JOptionPane.ERROR_MESSAGE);
ex.printStackTrace();
}
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextRua_BanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRua_BanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRua_BanActionPerformed

    private void jTextResponsavel_BanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextResponsavel_BanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextResponsavel_BanActionPerformed

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
            java.util.logging.Logger.getLogger(CadBanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadBanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadBanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadBanda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new CadBanda().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFone_Ban;
    private javax.swing.JTextField jTextGenero_Ban;
    private javax.swing.JTextField jTextNome_Ban;
    private javax.swing.JTextField jTextNumero_Ban;
    private javax.swing.JTextField jTextResponsavel_Ban;
    private javax.swing.JTextField jTextRua_Ban;
    private javax.swing.JTextField jTextemail_Ban;
    // End of variables declaration//GEN-END:variables
}
