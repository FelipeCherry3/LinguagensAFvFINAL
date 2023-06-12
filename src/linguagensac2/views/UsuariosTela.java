/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package linguagensac2.views;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import linguagensac2.connection.MySQL;
import linguagensac2.controladores.FuncionarioDAO;
import linguagensac2.controladores.UsuarioDAO;
import linguagensac2.modelos.Funcionario;
import linguagensac2.modelos.Usuario;
import resources.DateUtils;
/**
 *
 * @author aluno
 */
public class UsuariosTela extends javax.swing.JFrame {

    /**
     * Creates new form tela2
     */
    public UsuariosTela() {
        initComponents();
        jPanel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUsuarioSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxUserSexo = new javax.swing.JComboBox<>();
        textUserCpf = new javax.swing.JFormattedTextField();
        btnLimpar1 = new javax.swing.JButton();
        btnCadastrar2 = new javax.swing.JButton();
        lblCelularNovo = new javax.swing.JLabel();
        txtUserCelular1 = new javax.swing.JFormattedTextField();
        lblCelularNovo1 = new javax.swing.JLabel();
        txtEmailUser1 = new javax.swing.JTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textBuscaNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textBuscaCpf = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        cbxBuscaSexo = new javax.swing.JComboBox<>();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        textBuscaCelular = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUsuarioSenha1 = new javax.swing.JTextField();
        lblCelularNovo2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscarUser = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(920, 630));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CADASTRAR USUÁRIO"));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);
        jPanel1.add(txtUsuarioSenha);
        txtUsuarioSenha.setBounds(190, 240, 190, 22);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 70, 16);

        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 160, 37, 16);

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(160, 100, 40, 16);

        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 40, 16);

        cbxUserSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel1.add(cbxUserSexo);
        cbxUserSexo.setBounds(20, 130, 110, 22);

        try {
            textUserCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textUserCpf.setToolTipText("");
        textUserCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserCpfActionPerformed(evt);
            }
        });
        jPanel1.add(textUserCpf);
        textUserCpf.setBounds(160, 130, 160, 22);

        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/apagar.png"))); // NOI18N
        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar1);
        btnLimpar1.setBounds(120, 490, 140, 30);

        btnCadastrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addusuario.png"))); // NOI18N
        btnCadastrar2.setText("Cadastrar");
        btnCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrar2);
        btnCadastrar2.setBounds(270, 490, 140, 30);

        lblCelularNovo.setText("Senha :");
        jPanel1.add(lblCelularNovo);
        lblCelularNovo.setBounds(190, 220, 80, 16);

        try {
            txtUserCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtUserCelular1);
        txtUserCelular1.setBounds(20, 240, 150, 22);

        lblCelularNovo1.setText("Celular:");
        jPanel1.add(lblCelularNovo1);
        lblCelularNovo1.setBounds(20, 220, 80, 16);
        jPanel1.add(txtEmailUser1);
        txtEmailUser1.setBounds(20, 180, 380, 22);
        jPanel1.add(txtNomeUsuario);
        txtNomeUsuario.setBounds(20, 60, 380, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 420, 550);
        jPanel1.getAccessibleContext().setAccessibleName("CADASTRAR USUARIO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BUSCAR USUÁRIO"));
        jPanel2.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "Usuário"));
        jPanel3.setLayout(null);

        jLabel5.setText("Nome:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 30, 37, 16);
        jPanel3.add(textBuscaNome);
        textBuscaNome.setBounds(10, 50, 400, 22);

        jLabel14.setText("CPF:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(10, 130, 40, 16);

        try {
            textBuscaCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textBuscaCpf.setToolTipText("");
        textBuscaCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscaCpfActionPerformed(evt);
            }
        });
        jPanel3.add(textBuscaCpf);
        textBuscaCpf.setBounds(10, 150, 130, 22);

        jLabel16.setText("Sexo:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(170, 130, 40, 16);

        cbxBuscaSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel3.add(cbxBuscaSexo);
        cbxBuscaSexo.setBounds(170, 150, 100, 22);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpar);
        btnLimpar.setBounds(300, 240, 122, 23);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtualizar);
        btnAtualizar.setBounds(160, 240, 122, 23);

        btnExcluir.setText("Excluir ");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btnExcluir);
        btnExcluir.setBounds(10, 240, 134, 23);

        try {
            textBuscaCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(textBuscaCelular);
        textBuscaCelular.setBounds(10, 200, 150, 22);

        jLabel23.setText("Celular:");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(10, 180, 60, 16);
        jPanel3.add(txtBuscarEmail);
        txtBuscarEmail.setBounds(10, 100, 290, 22);

        jLabel15.setText("Email:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(10, 80, 37, 16);
        jPanel3.add(txtUsuarioSenha1);
        txtUsuarioSenha1.setBounds(180, 200, 190, 22);

        lblCelularNovo2.setText("Senha :");
        jPanel3.add(lblCelularNovo2);
        lblCelularNovo2.setBounds(180, 180, 80, 16);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 70, 450, 280);

        jLabel13.setText("Email:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 20, 37, 16);

        txtBuscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtBuscarUser);
        txtBuscarUser.setBounds(30, 40, 290, 22);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar);
        btnBuscar.setBounds(340, 40, 110, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(440, 30, 470, 550);

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Menus");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addusuario.png"))); // NOI18N
        jMenuItem1.setText("Funcionários");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addusuario.png"))); // NOI18N
        jMenuItem2.setText("Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addusuario.png"))); // NOI18N
        jMenuItem3.setText("Compras");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addusuario.png"))); // NOI18N
        jMenuItem4.setText("Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(929, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textUserCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserCpfActionPerformed

    private void btnCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar2ActionPerformed
        Usuario usuario = new Usuario();
        MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
        mysql.conectaBanco();
        
        UsuarioDAO uDAO = new UsuarioDAO(mysql);
        
        try {
            usuario.setNome(txtNomeUsuario.getText());
            usuario.setEmail(txtEmailUser1.getText());
            usuario.setCelular(txtUserCelular1.getText());
            usuario.setCpf(textUserCpf.getText());
            usuario.setSenha(String.valueOf(cbxUserSexo.getSelectedItem()));
            usuario.setSenha(txtUsuarioSenha.getText());
            uDAO.cadastraUsuario(usuario);
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosTela.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.fechaBanco();
            JOptionPane.showMessageDialog(this,"Usuario " + usuario.getNome() + " Cadastrado com Sucesso");
        }
        
    }//GEN-LAST:event_btnCadastrar2ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
        txtNomeUsuario.setText("");
        cbxUserSexo.setSelectedItem(null);
        textUserCpf.setText("");
        txtEmailUser1.setText("");
        txtUsuarioSenha.setText("");
        txtUserCelular1.setText("");
        
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
        mysql.conectaBanco();
        UsuarioDAO uDAo = new UsuarioDAO(mysql);
        try {
            Usuario usuario = uDAo.buscarUsuarioPorEmail(txtBuscarUser.getText());
            textBuscaNome.setText(usuario.getNome());
            txtBuscarEmail.setText(usuario.getEmail());
            textBuscaCpf.setText(usuario.getCpf());
            cbxBuscaSexo.setSelectedItem(usuario.getSexo());
            textBuscaCelular.setText(usuario.getCelular());
            txtUsuarioSenha1.setText(usuario.getSenha());
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosTela.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        
        MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
        mysql.conectaBanco();
        UsuarioDAO uDAO = new UsuarioDAO(mysql);
        
        try {
            Usuario u = uDAO.buscarUsuarioPorEmail(txtBuscarUser.getText());
            uDAO.excluiUsuario(u.getId());
            JOptionPane.showMessageDialog(null, "Usuario Excluido com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosTela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Funcionário!");
        } finally {
            mysql.fechaBanco();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        
        MySQL mysql = new MySQL("localhost:3306", "controletech3", "root", "Bico1346@");
        mysql.conectaBanco();
        UsuarioDAO uDAO  = new UsuarioDAO(mysql);
        
        try {
            Usuario novoUser = new Usuario();
            novoUser.setNome(textBuscaNome.getText());
            novoUser.setEmail(txtBuscarEmail.getText());
            novoUser.setCelular(textBuscaCelular.getText());
            novoUser.setCpf(textBuscaCpf.getText());
            novoUser.setSenha(String.valueOf(cbxBuscaSexo.getSelectedItem()));
            novoUser.setSenha(txtUsuarioSenha1.getText());
            uDAO.atualizaUsuario(novoUser, txtBuscarUser.getText());
            JOptionPane.showMessageDialog(this, "Usuario "  + novoUser.getNome() + " Atualizado com Sucesso");
        } catch (SQLException ex) {
            Logger.getLogger(UsuariosTela.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            mysql.fechaBanco();
        }


    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        textBuscaNome.setText("");
        txtBuscarEmail.setText("");
        textBuscaCpf.setText("");
        textBuscaCelular.setText("");
        txtUsuarioSenha1.setText("");
        cbxBuscaSexo.setSelectedItem(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void textBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscaCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscaCpfActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        UsuariosTela ft = new UsuariosTela();
        ft.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ProdutosTelaAF tf = new ProdutosTelaAF();
        tf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Tela_de_compra tc = new Tela_de_compra();
        tc.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtBuscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarUserActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        UsuariosTela ut = new UsuariosTela();
        ut.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(UsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar2;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JComboBox<String> cbxBuscaSexo;
    private javax.swing.JComboBox<String> cbxUserSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCelularNovo;
    private javax.swing.JLabel lblCelularNovo1;
    private javax.swing.JLabel lblCelularNovo2;
    private javax.swing.JFormattedTextField textBuscaCelular;
    private javax.swing.JFormattedTextField textBuscaCpf;
    private javax.swing.JTextField textBuscaNome;
    private javax.swing.JFormattedTextField textUserCpf;
    private javax.swing.JTextField txtBuscarEmail;
    private javax.swing.JTextField txtBuscarUser;
    private javax.swing.JTextField txtEmailUser1;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JFormattedTextField txtUserCelular1;
    private javax.swing.JTextField txtUsuarioSenha;
    private javax.swing.JTextField txtUsuarioSenha1;
    // End of variables declaration//GEN-END:variables
}