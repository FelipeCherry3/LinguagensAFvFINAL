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
import linguagensac2.modelos.Funcionario;
import resources.DateUtils;
/**
 *
 * @author aluno
 */
public class FuncionariosTela extends javax.swing.JFrame {

    /**
     * Creates new form tela2
     */
    public FuncionariosTela() {
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
        textCadNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textCadCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textCadEndereco = new javax.swing.JTextArea();
        cbxCadSexo = new javax.swing.JComboBox<>();
        cbxCadEstado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        textCadSalario = new javax.swing.JTextField();
        textCadCpf = new javax.swing.JFormattedTextField();
        textDataNasc = new javax.swing.JFormattedTextField();
        textCadDataIngresso = new javax.swing.JFormattedTextField();
        btnLimpar1 = new javax.swing.JButton();
        btnCadastrar2 = new javax.swing.JButton();
        lblCelularNovo = new javax.swing.JLabel();
        textCadCelular = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        textBuscaNome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textBuscaCpf = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        textBuscaDataNasc = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        cbxBuscaSexo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        textBuscaCidade = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbxBuscaEstado = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textBuscaEndereco = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        textBuscaDataIngresso = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        textBuscaSalario = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        textBuscaCelular = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtBuscarFunc = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(920, 630));
        setMinimumSize(new java.awt.Dimension(920, 630));
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CADASTRAR FUNCIONARIO"));
        jPanel1.setLayout(null);
        jPanel1.add(textCadNome);
        textCadNome.setBounds(20, 60, 380, 22);

        jLabel1.setText("Nome:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 70, 16);
        jPanel1.add(textEmail);
        textEmail.setBounds(20, 180, 380, 22);

        jLabel2.setText("Email:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 160, 37, 16);

        jLabel3.setText("CPF:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 220, 40, 16);

        jLabel4.setText("Sexo:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 100, 40, 16);
        jPanel1.add(textCadCidade);
        textCadCidade.setBounds(20, 300, 240, 20);

        jLabel6.setText("Cidade:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 280, 70, 20);

        jLabel7.setText("Endereço:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 330, 70, 16);

        jLabel8.setText("Data de Nascimento:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 100, 110, 16);

        jLabel10.setText("Data de ingresso:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 420, 100, 16);

        jLabel11.setText("Estado:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(300, 280, 90, 20);

        textCadEndereco.setColumns(20);
        textCadEndereco.setRows(5);
        jScrollPane1.setViewportView(textCadEndereco);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 350, 380, 50);

        cbxCadSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel1.add(cbxCadSexo);
        cbxCadSexo.setBounds(250, 120, 110, 22);

        cbxCadEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jPanel1.add(cbxCadEstado);
        cbxCadEstado.setBounds(300, 300, 90, 20);

        jLabel12.setText("Salário (R$):");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 420, 120, 16);
        jPanel1.add(textCadSalario);
        textCadSalario.setBounds(20, 440, 200, 22);

        try {
            textCadCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCadCpf.setToolTipText("");
        textCadCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadCpfActionPerformed(evt);
            }
        });
        jPanel1.add(textCadCpf);
        textCadCpf.setBounds(20, 240, 160, 22);

        try {
            textDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textDataNasc.setToolTipText("Ano/ Mês / Dia");
        textDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDataNascActionPerformed(evt);
            }
        });
        jPanel1.add(textDataNasc);
        textDataNasc.setBounds(20, 120, 160, 22);

        try {
            textCadDataIngresso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textCadDataIngresso.setToolTipText("Ano/ Mês / Dia");
        textCadDataIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCadDataIngressoActionPerformed(evt);
            }
        });
        jPanel1.add(textCadDataIngresso);
        textCadDataIngresso.setBounds(270, 440, 110, 22);

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

        lblCelularNovo.setText("Celular:");
        jPanel1.add(lblCelularNovo);
        lblCelularNovo.setBounds(230, 220, 80, 16);

        try {
            textCadCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(textCadCelular);
        textCadCelular.setBounds(230, 240, 150, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 30, 420, 550);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BUSCAR FUNCIONÁRIO"));
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
        jLabel14.setBounds(230, 160, 40, 16);

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
        textBuscaCpf.setBounds(230, 180, 130, 22);

        jLabel15.setText("Data de Nascimento:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 90, 110, 16);

        try {
            textBuscaDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textBuscaDataNasc.setToolTipText("Ano/ Mês / Dia");
        textBuscaDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscaDataNascActionPerformed(evt);
            }
        });
        jPanel3.add(textBuscaDataNasc);
        textBuscaDataNasc.setBounds(20, 110, 150, 22);

        jLabel16.setText("Sexo:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(230, 90, 40, 16);

        cbxBuscaSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outros" }));
        jPanel3.add(cbxBuscaSexo);
        cbxBuscaSexo.setBounds(230, 110, 100, 22);

        jLabel17.setText("Cidade:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(20, 220, 70, 16);
        jPanel3.add(textBuscaCidade);
        textBuscaCidade.setBounds(20, 240, 270, 22);

        jLabel18.setText("Estado:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(310, 220, 90, 20);

        cbxBuscaEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jPanel3.add(cbxBuscaEstado);
        cbxBuscaEstado.setBounds(310, 240, 90, 20);

        jLabel19.setText("Endereço:");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(20, 270, 60, 16);

        textBuscaEndereco.setColumns(20);
        textBuscaEndereco.setRows(5);
        jScrollPane2.setViewportView(textBuscaEndereco);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 290, 400, 50);

        jLabel22.setText("Data de ingresso:");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(270, 360, 100, 16);

        try {
            textBuscaDataIngresso.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textBuscaDataIngresso.setToolTipText("Ano/ Mês / Dia");
        textBuscaDataIngresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBuscaDataIngressoActionPerformed(evt);
            }
        });
        jPanel3.add(textBuscaDataIngresso);
        textBuscaDataIngresso.setBounds(270, 380, 130, 22);

        jLabel21.setText("Salário (R$):");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(20, 360, 120, 16);
        jPanel3.add(textBuscaSalario);
        textBuscaSalario.setBounds(20, 380, 200, 22);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpar);
        btnLimpar.setBounds(310, 430, 122, 23);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAtualizar);
        btnAtualizar.setBounds(170, 430, 122, 23);

        btnExcluir.setText("Excluir ");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btnExcluir);
        btnExcluir.setBounds(20, 430, 134, 23);

        try {
            textBuscaCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel3.add(textBuscaCelular);
        textBuscaCelular.setBounds(20, 180, 150, 22);

        jLabel23.setText("Celular:");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(20, 160, 60, 16);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 70, 450, 470);

        jLabel13.setText("Email:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(30, 20, 37, 16);
        jPanel2.add(txtBuscarFunc);
        txtBuscarFunc.setBounds(30, 40, 290, 22);

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

        setSize(new java.awt.Dimension(929, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textCadCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadCpfActionPerformed

    private void textDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDataNascActionPerformed

    private void textCadDataIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCadDataIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCadDataIngressoActionPerformed

    private void btnCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrar2ActionPerformed
        Funcionario novoFuncionario = new Funcionario();
        MySQL mysql = new MySQL("localhost:3306", "controltech2", "root", "Bico1346@");
        mysql.conectaBanco();;
        
        FuncionarioDAO funcDAO = new FuncionarioDAO(mysql);
        novoFuncionario.setNome(textCadNome.getText());
        novoFuncionario.setEmail(textEmail.getText());
        novoFuncionario.setCpf(textCadCpf.getText());
        novoFuncionario.setSexo(String.valueOf(cbxCadSexo.getSelectedItem()));
        novoFuncionario.setEstado(String.valueOf(cbxCadEstado.getSelectedItem()));
        novoFuncionario.setCidade(textCadCidade.getText());
        novoFuncionario.setEndereco(textCadEndereco.getText());
        novoFuncionario.setCelular(textCadCelular.getText());
        novoFuncionario.setSalario(Double.parseDouble(textCadSalario.getText()));
        
        try {
            novoFuncionario.setData_nasc(DateUtils.stringToDate(textDataNasc.getText()));
            novoFuncionario.setData_ingresso(DateUtils.stringToDate(textCadDataIngresso.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (funcDAO.buscarFuncionarioPorEmail(novoFuncionario.getEmail()) == null) {
                funcDAO.cadastrarFuncionario(novoFuncionario);
                JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!");
                
            } else {
                JOptionPane.showMessageDialog(null,"O Funcionário de Email : " + novoFuncionario.getEmail() + "Já esta cadastrado no Sistema");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar o Funcionário");
        } finally {
            mysql.fechaBanco();
        }
        
    }//GEN-LAST:event_btnCadastrar2ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
        textCadNome.setText("");
        textEmail.setText("");
        textCadCpf.setText("");
        textDataNasc.setText("");
        textCadCidade.setText("");
        textCadEndereco.setText("");
        textCadCelular.setText("");
        textCadDataIngresso.setText("");
        textCadSalario.setText("");
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Funcionario f2 = new Funcionario();
        MySQL mysql = new MySQL("localhost:3306", "controltech2", "root", "Bico1346@");
        mysql.conectaBanco();
        FuncionarioDAO funcDAO = new FuncionarioDAO(mysql);
        try {
            f2 = funcDAO.buscarFuncionarioPorEmail(txtBuscarFunc.getText());
            jPanel3.setVisible(true);
            if(f2 == null) {
                JOptionPane.showMessageDialog(null,"Usuário não encontrado!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);

        }
        textBuscaNome.setText(f2.getNome());
        textBuscaCpf.setText(f2.getCpf());
        textBuscaDataNasc.setText(DateUtils.dateToString(f2.getData_nasc()));
        textBuscaDataIngresso.setText(DateUtils.dateToString(f2.getData_ingresso()));
        cbxBuscaSexo.setSelectedItem(f2.getSexo());
        cbxBuscaEstado.setSelectedItem(f2.getEstado());
        textBuscaCidade.setText(f2.getCidade());
        textBuscaEndereco.setText(f2.getEndereco());
        textBuscaCelular.setText(f2.getCelular());
        textBuscaSalario.setText(String.valueOf(f2.getSalario()));

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        Funcionario novoFuncionario = new Funcionario();
        MySQL mysql = new MySQL("localhost:3306", "controltech2", "root", "Bico1346@");
        mysql.conectaBanco();
        FuncionarioDAO funcDAO = new FuncionarioDAO(mysql);

        novoFuncionario.setEmail(txtBuscarFunc.getText());
        try {
            funcDAO.excluirFuncionario(novoFuncionario.getEmail());
            JOptionPane.showMessageDialog(null, "Funcionário Excluido com Sucesso!");
            textBuscaNome.setText("");
            textBuscaCpf.setText("");
            textBuscaDataNasc.setText("");
            textBuscaDataIngresso.setText("");
            cbxBuscaSexo.setSelectedItem("");
            cbxBuscaEstado.setSelectedItem("");
            textBuscaCidade.setText("");
            textBuscaEndereco.setText("");
            textBuscaCelular.setText("");
            textBuscaSalario.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao Excluir Funcionário!");
        } finally {
            mysql.fechaBanco();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        Funcionario novoFuncionario = new Funcionario();
        MySQL mysql = new MySQL("localhost:3306", "controltech2", "root", "Bico1346@");
        mysql.conectaBanco();;

        FuncionarioDAO funcDAO = new FuncionarioDAO(mysql);

        novoFuncionario.setNome(textBuscaNome.getText());
        novoFuncionario.setCpf(textBuscaCpf.getText());
        novoFuncionario.setEmail(txtBuscarFunc.getText());
        novoFuncionario.setSexo(String.valueOf(cbxBuscaSexo.getSelectedItem()));
        novoFuncionario.setEstado(String.valueOf(cbxBuscaEstado.getSelectedItem()));
        novoFuncionario.setCidade(textBuscaCidade.getText());
        novoFuncionario.setEndereco(textBuscaEndereco.getText());
        novoFuncionario.setCelular(textBuscaCelular.getText());
        novoFuncionario.setSalario(Double.parseDouble(textBuscaSalario.getText()));

        try {
            novoFuncionario.setData_nasc(DateUtils.stringToDate(textBuscaDataNasc.getText()));
            novoFuncionario.setData_ingresso(DateUtils.stringToDate(textBuscaDataIngresso.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            funcDAO.atualizarFuncionario(novoFuncionario);
            JOptionPane.showMessageDialog(null,"Funcionário " + novoFuncionario.getNome() + " Atualizado com Sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosTela.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Atualizar Usuario");
        } finally {
            mysql.fechaBanco();
        }

    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        textBuscaNome.setText("");
        textBuscaCpf.setText("");
        textBuscaDataNasc.setText("");
        textBuscaDataIngresso.setText("");
        cbxBuscaSexo.setSelectedItem("");
        cbxBuscaEstado.setSelectedItem("");
        textBuscaCidade.setText("");
        textBuscaEndereco.setText("");
        textBuscaCelular.setText("");
        textBuscaSalario.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void textBuscaDataIngressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscaDataIngressoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscaDataIngressoActionPerformed

    private void textBuscaDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscaDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscaDataNascActionPerformed

    private void textBuscaCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBuscaCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBuscaCpfActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosTela().setVisible(true);
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
    private javax.swing.JComboBox<String> cbxBuscaEstado;
    private javax.swing.JComboBox<String> cbxBuscaSexo;
    private javax.swing.JComboBox<String> cbxCadEstado;
    private javax.swing.JComboBox<String> cbxCadSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCelularNovo;
    private javax.swing.JFormattedTextField textBuscaCelular;
    private javax.swing.JTextField textBuscaCidade;
    private javax.swing.JFormattedTextField textBuscaCpf;
    private javax.swing.JFormattedTextField textBuscaDataIngresso;
    private javax.swing.JFormattedTextField textBuscaDataNasc;
    private javax.swing.JTextArea textBuscaEndereco;
    private javax.swing.JTextField textBuscaNome;
    private javax.swing.JTextField textBuscaSalario;
    private javax.swing.JFormattedTextField textCadCelular;
    private javax.swing.JTextField textCadCidade;
    private javax.swing.JFormattedTextField textCadCpf;
    private javax.swing.JFormattedTextField textCadDataIngresso;
    private javax.swing.JTextArea textCadEndereco;
    private javax.swing.JTextField textCadNome;
    private javax.swing.JTextField textCadSalario;
    private javax.swing.JFormattedTextField textDataNasc;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField txtBuscarFunc;
    // End of variables declaration//GEN-END:variables
}
