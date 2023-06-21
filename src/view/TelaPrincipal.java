package view;

import controller.ControllerGerenciarAlunos;
import controller.ControllerRegistrosAmigos;
import controller.ControllerRegistrosFuncionarios;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import view.GerenciarAlunos;
import view.Home;
import view.RegistrarAlunos;
import view.Sobre;

public class TelaPrincipal extends javax.swing.JFrame {

    private static TelaPrincipal telaPrincipalCu = new TelaPrincipal();
    private boolean darkThemeEnabled;
    private final ControllerGerenciarAlunos controller;
    private final ControllerRegistrosAmigos controller2;

    public TelaPrincipal() {
        initComponents();
        
        InserirIcone(this);
        controller = new ControllerGerenciarAlunos(this);
        controller2 = new ControllerRegistrosAmigos(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        telaPrincipal = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cadastrarPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        c_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c_curso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        c_fase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c_idade = new javax.swing.JTextField();
        c_cancelar = new javax.swing.JButton();
        c_conexao = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cadastrarFuPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        f_funcao = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        f_nomee = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        f_matricula = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        f_salario = new javax.swing.JTextField();
        f_apagar = new javax.swing.JButton();
        f_cadastrar = new javax.swing.JButton();
        gerenciarPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        g_nome = new javax.swing.JTextField();
        g_idade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        g_curso = new javax.swing.JTextField();
        g_fase = new javax.swing.JTextField();
        g_apagar = new javax.swing.JButton();
        g_alterar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        g_tabela = new javax.swing.JTable();
        sobrePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_min = new javax.swing.JLabel();
        t_close = new javax.swing.JLabel();
        Lista = new javax.swing.JPanel();
        opcaoCadastro = new javax.swing.JButton();
        t_home = new javax.swing.JButton();
        opcaoCadastroF = new javax.swing.JButton();
        t_mudarcor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        opcaoSobre = new javax.swing.JButton();
        opcaoGerenciar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        jButton2.setText("Criador");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        telaPrincipal.setBackground(new java.awt.Color(44, 62, 80));
        telaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                telaPrincipalMouseReleased(evt);
            }
        });
        telaPrincipal.setLayout(new java.awt.CardLayout());

        homePanel.setBackground(new java.awt.Color(255, 145, 77));
        homePanel.setForeground(new java.awt.Color(255, 145, 77));

        jPanel2.setBackground(new java.awt.Color(255, 145, 77));
        jPanel2.setForeground(new java.awt.Color(255, 145, 77));
        jPanel2.setPreferredSize(new java.awt.Dimension(766, 116));

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("SEJA BEM VINDO(a)!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        jPanel9.setBackground(new java.awt.Color(44, 62, 80));
        jPanel9.setForeground(new java.awt.Color(44, 62, 80));
        jPanel9.setPreferredSize(new java.awt.Dimension(635, 560));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cupp.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel14)
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                .addContainerGap())
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        telaPrincipal.add(homePanel, "card4");

        cadastrarPanel.setBackground(new java.awt.Color(255, 145, 77));
        cadastrarPanel.setForeground(new java.awt.Color(255, 145, 77));

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));
        jPanel6.setForeground(new java.awt.Color(44, 62, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(635, 560));

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("Nome:");

        c_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nomeActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(236, 240, 241));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Curso:");

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Fase:");

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Idade:");

        c_cancelar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        c_cancelar.setText("Apagar");
        c_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_cancelarActionPerformed(evt);
            }
        });

        c_conexao.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        c_conexao.setText("Cadastrar");
        c_conexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_conexaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(c_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(c_conexao)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(197, 197, 197))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(c_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(c_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c_fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(c_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_conexao)
                    .addComponent(c_cancelar))
                .addGap(84, 84, 84))
        );

        jPanel8.setBackground(new java.awt.Color(255, 145, 77));

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("CADASTRE O ALUNO(a)");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel8)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout cadastrarPanelLayout = new javax.swing.GroupLayout(cadastrarPanel);
        cadastrarPanel.setLayout(cadastrarPanelLayout);
        cadastrarPanelLayout.setHorizontalGroup(
            cadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cadastrarPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cadastrarPanelLayout.setVerticalGroup(
            cadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
            .addGroup(cadastrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cadastrarPanelLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        telaPrincipal.add(cadastrarPanel, "card7");

        cadastrarFuPanel.setBackground(new java.awt.Color(255, 145, 77));
        cadastrarFuPanel.setPreferredSize(new java.awt.Dimension(839, 701));

        jPanel11.setBackground(new java.awt.Color(255, 145, 77));

        jLabel21.setBackground(new java.awt.Color(236, 240, 241));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(236, 240, 241));
        jLabel21.setText("CADASTRE O FUNCIONÁRIO(a)");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(69, 69, 69))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(44, 62, 80));

        jLabel17.setBackground(new java.awt.Color(236, 240, 241));
        jLabel17.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(236, 240, 241));
        jLabel17.setText("Função:");

        f_funcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_funcaoActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(236, 240, 241));
        jLabel18.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(236, 240, 241));
        jLabel18.setText("Nome:");

        f_nomee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nomeeActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(236, 240, 241));
        jLabel19.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(236, 240, 241));
        jLabel19.setText("Matrícula:");

        jLabel20.setBackground(new java.awt.Color(236, 240, 241));
        jLabel20.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(236, 240, 241));
        jLabel20.setText("Salário:");

        f_apagar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        f_apagar.setText("Apagar");
        f_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_apagarActionPerformed(evt);
            }
        });

        f_cadastrar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        f_cadastrar.setText("Cadastrar");
        f_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(f_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(f_cadastrar)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(f_nomee, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(f_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(158, 158, 158))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(f_nomee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(f_funcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(f_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(f_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f_cadastrar)
                    .addComponent(f_apagar))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout cadastrarFuPanelLayout = new javax.swing.GroupLayout(cadastrarFuPanel);
        cadastrarFuPanel.setLayout(cadastrarFuPanelLayout);
        cadastrarFuPanelLayout.setHorizontalGroup(
            cadastrarFuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarFuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(cadastrarFuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cadastrarFuPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        cadastrarFuPanelLayout.setVerticalGroup(
            cadastrarFuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarFuPanelLayout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(cadastrarFuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cadastrarFuPanelLayout.createSequentialGroup()
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 585, Short.MAX_VALUE)))
        );

        telaPrincipal.add(cadastrarFuPanel, "card8");

        jPanel4.setBackground(new java.awt.Color(255, 145, 77));

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("Curso:");

        g_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_nomeActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(236, 240, 241));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(236, 240, 241));
        jLabel10.setText("Fase:");

        jLabel11.setBackground(new java.awt.Color(236, 240, 241));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(236, 240, 241));
        jLabel11.setText("Idade:");

        g_apagar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        g_apagar.setText("Apagar");
        g_apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_apagarActionPerformed(evt);
            }
        });

        g_alterar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        g_alterar.setText("Alterar");
        g_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_alterarActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(236, 240, 241));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 34)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(236, 240, 241));
        jLabel12.setText("Nome:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(g_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addComponent(g_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9))
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(g_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g_fase, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(g_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(208, 208, 208))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(g_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(g_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(g_fase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g_alterar)
                    .addComponent(g_apagar))
                .addGap(35, 35, 35))
        );

        jPanel1.setBackground(new java.awt.Color(255, 145, 77));
        jPanel1.setForeground(new java.awt.Color(255, 145, 77));

        g_tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Curso", "Fase", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        g_tabela.setAutoscrolls(false);
        g_tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_tabelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                g_tabelaMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(g_tabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout gerenciarPanelLayout = new javax.swing.GroupLayout(gerenciarPanel);
        gerenciarPanel.setLayout(gerenciarPanelLayout);
        gerenciarPanelLayout.setHorizontalGroup(
            gerenciarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gerenciarPanelLayout.setVerticalGroup(
            gerenciarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        telaPrincipal.add(gerenciarPanel, "card6");

        sobrePanel.setBackground(new java.awt.Color(255, 145, 77));
        sobrePanel.setForeground(new java.awt.Color(255, 145, 77));

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(44, 62, 80));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText(" \n  A Fallen Store, criada em 2015 por Gabriel \"FalleN\" Toledo, um dos jogadores mais importantes de Counter-Strike: \n  Global Offensive no mundo, traz o compromisso de oferecer produtos de alta qualidade, aos nossos clientes e fãs \n  do mundo dos esportes eletrônicos.\n\n  Sempre com o objetivo de contribuir para o crescimento do cenário brasileiro de esports, a Fallen Store faz parcerias \n  com grandes marcas do mercado para disponibilizar produtos profissionais e especialmente desenvolvidos para atingir \n  alta performance, dando a oportunidade de mais jogadores treinarem profissionalmente em alto nível.\n\n  Estrutura Física\n  Nosso início em 2015 foi bem simples, assim como o sonho do FalleN de ser campeão mundial. A loja começou na \n  residência do próprio Verdadeiro e foi ao lado da força de vontade que os primeiros produtos começaram a ser \n  comercializados.\n\n  Em 2017 nos mudamos para um escritório de apenas 125m², um local relativamente ainda pequeno, mas que \n  proporcionou armazenar e organizar melhor nossos produtos, que começavam a chegar em maior volume.\n\n  Agora em 2018, nos mudamos para um galpão amplo de 450m², onde temos toda equipe que trabalha no escritório \n  da Fallen Store e há espaço suficiente para o estoque de toda nossa linha de produtos.");
        jScrollPane2.setViewportView(jTextArea1);

        jPanel3.setBackground(new java.awt.Color(255, 145, 77));
        jPanel3.setForeground(new java.awt.Color(255, 145, 77));

        jLabel3.setBackground(new java.awt.Color(236, 240, 241));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setText("SOBRE NOSSO TRABALHO!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(120, 120, 120))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout sobrePanelLayout = new javax.swing.GroupLayout(sobrePanel);
        sobrePanel.setLayout(sobrePanelLayout);
        sobrePanelLayout.setHorizontalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sobrePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        sobrePanelLayout.setVerticalGroup(
            sobrePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sobrePanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
        );

        telaPrincipal.add(sobrePanel, "card5");

        t_min.setBackground(new java.awt.Color(236, 240, 241));
        t_min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t_min.setForeground(new java.awt.Color(236, 240, 241));
        t_min.setText("-");
        t_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_minMouseClicked(evt);
            }
        });
        telaPrincipal.add(t_min, "card3");

        t_close.setBackground(new java.awt.Color(236, 240, 241));
        t_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        t_close.setForeground(new java.awt.Color(236, 240, 241));
        t_close.setText("X");
        t_close.setPreferredSize(new java.awt.Dimension(6, 6));
        t_close.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        t_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_closeMouseClicked(evt);
            }
        });
        telaPrincipal.add(t_close, "card2");

        Lista.setBackground(new java.awt.Color(44, 62, 80));
        Lista.setForeground(new java.awt.Color(44, 62, 80));

        opcaoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome__4_-removebg-preview.png"))); // NOI18N
        opcaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCadastroActionPerformed(evt);
            }
        });

        t_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome__1_-removebg-preview.png"))); // NOI18N
        t_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_homeActionPerformed(evt);
            }
        });

        opcaoCadastroF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/maisprof-removebg-preview.png"))); // NOI18N
        opcaoCadastroF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoCadastroFActionPerformed(evt);
            }
        });

        t_mudarcor.setText("Mudar Tema");
        t_mudarcor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_mudarcorActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome__2_-removebg-preview.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome__3_-removebg-preview_1.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        opcaoSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dddddddddd.png"))); // NOI18N
        opcaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoSobreActionPerformed(evt);
            }
        });

        opcaoGerenciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Design_sem_nome-removebg-preview.png"))); // NOI18N
        opcaoGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcaoGerenciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ListaLayout = new javax.swing.GroupLayout(Lista);
        Lista.setLayout(ListaLayout);
        ListaLayout.setHorizontalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcaoCadastroF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_mudarcor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_home, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(opcaoCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcaoSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(opcaoGerenciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ListaLayout.setVerticalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_home)
                .addGap(18, 18, 18)
                .addComponent(opcaoCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcaoCadastroF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opcaoGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(opcaoSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_mudarcor)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
            .addComponent(Lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_minMouseClicked

        this.setState(RegistrarAlunos.ICONIFIED);

        // TODO add your handling code here:
    }//GEN-LAST:event_t_minMouseClicked

    private void t_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_closeMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_t_closeMouseClicked

    private void telaPrincipalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telaPrincipalMouseReleased

    }//GEN-LAST:event_telaPrincipalMouseReleased

    private void t_mudarcorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_mudarcorActionPerformed

        try {
            if (darkThemeEnabled) {
                // Define o Look and Feel padrão
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                UIManager.put("control", new Color(214, 217, 223));
                UIManager.put("text", new Color(0, 0, 0));
                UIManager.put("nimbusBase", new Color(214, 217, 223));
                UIManager.put("nimbusBlueGrey", new Color(193, 200, 206));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(214, 217, 223));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(0, 0, 0));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            } else {
                // Define o Look and Feel Nimbus (tema escuro)
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                UIManager.put("control", new Color(68, 68, 68));
                UIManager.put("text", new Color(214, 217, 223));
                UIManager.put("nimbusBase", new Color(18, 30, 49));
                UIManager.put("nimbusBlueGrey", new Color(48, 57, 67));
                UIManager.put("nimbusFocus", new Color(115, 164, 209));
                UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
                UIManager.put("nimbusOrange", new Color(191, 98, 4));
                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
                UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

            }

            // Atualiza a aparência de todos os componentes individualmente
            updateUIComponents(telaPrincipal);
            updateUIComponents(Lista);

            // Inverte o valor do indicador do tema escuro
            darkThemeEnabled = !darkThemeEnabled;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_t_mudarcorActionPerformed

    private void opcaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoSobreActionPerformed

        cadastrarPanel.setVisible(false);
        gerenciarPanel.setVisible(false);
        homePanel.setVisible(false);
        cadastrarFuPanel.setVisible(false);
        sobrePanel.setVisible(true);

        /*
        tela2.dispose();
        tela.dispose();
        tela4.dispose();

        tela3.setSize(766, 500); // Defina o tamanho da janela

        int x = 703; // Coordenada X desejada
        int y = 265; // Coordenada Y desejada

        tela3.setDefaultCloseOperation(Home.EXIT_ON_CLOSE);

        tela3.setLocation(x, y); // Define a posição inicial da janela

        tela3.setVisible(true);
         */

    }//GEN-LAST:event_opcaoSobreActionPerformed

    private void t_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_homeActionPerformed

        cadastrarPanel.setVisible(false);
        gerenciarPanel.setVisible(false);
        sobrePanel.setVisible(false);
        cadastrarFuPanel.setVisible(false);
        homePanel.setVisible(true);

        /*
        tela2.dispose();
        tela3.dispose();
        tela.dispose();

        tela4.setSize(766, 500); // Defina o tamanho da janela

        int x = 703; // Coordenada X desejada
        int y = 265; // Coordenada Y desejada

        tela4.setLocation(x, y); // Define a posição inicial da janela

        tela4.setVisible(true);
         */

    }//GEN-LAST:event_t_homeActionPerformed

    private void opcaoGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoGerenciarActionPerformed

        cadastrarPanel.setVisible(false);
        homePanel.setVisible(false);
        sobrePanel.setVisible(false);
        cadastrarFuPanel.setVisible(false);
        gerenciarPanel.setVisible(true);

        /*
        tela.dispose();
        tela3.dispose();
        tela4.dispose();

        tela2.setSize(766, 500); // Defina o tamanho da janela

        int x = 703; // Coordenada X desejada
        int y = 265; // Coordenada Y desejada

        tela2.setLocation(x, y); // Define a posição inicial da janela

        tela2.setVisible(true);
         */

    }//GEN-LAST:event_opcaoGerenciarActionPerformed

    private void opcaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCadastroActionPerformed

        homePanel.setVisible(false);
        sobrePanel.setVisible(false);
        gerenciarPanel.setVisible(false);
        cadastrarFuPanel.setVisible(false);
        cadastrarPanel.setVisible(true);

        /*
        tela2.dispose();
        tela3.dispose();
        tela4.dispose();

        tela.setSize(766, 500); // Defina o tamanho da janela

        int x = 703; // Coordenada X desejada
        int y = 265; // Coordenada Y desejada

        tela.setLocation(x, y); // Define a posição inicial da janela

        tela.setVisible(true);
         */

    }//GEN-LAST:event_opcaoCadastroActionPerformed

    private void g_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_nomeActionPerformed

    }//GEN-LAST:event_g_nomeActionPerformed

    private void g_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_apagarActionPerformed

        controller.apagarAluno();


    }//GEN-LAST:event_g_apagarActionPerformed

    private void g_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_alterarActionPerformed

        controller.alterarAluno();


    }//GEN-LAST:event_g_alterarActionPerformed

    private void g_tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_tabelaMouseClicked

        if (g_tabela.getSelectedRow() != -1) {

            String nome = this.g_tabela.getValueAt(this.g_tabela.getSelectedRow(), 1).toString();
            String curso = this.g_tabela.getValueAt(this.g_tabela.getSelectedRow(), 2).toString();
            String fase = this.g_tabela.getValueAt(this.g_tabela.getSelectedRow(), 3).toString();
            String idade = this.g_tabela.getValueAt(this.g_tabela.getSelectedRow(), 4).toString();

            this.g_nome.setText(nome);
            this.g_curso.setText(curso);
            this.g_fase.setText(fase);
            this.g_idade.setText(idade);

        }
    }//GEN-LAST:event_g_tabelaMouseClicked

    private void g_tabelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_tabelaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_g_tabelaMouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        controller.carregaTabela();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void f_funcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_funcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_funcaoActionPerformed

    private void f_apagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_apagarActionPerformed

        limparCampsF();

    }//GEN-LAST:event_f_apagarActionPerformed

    private void f_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_cadastrarActionPerformed

        ConfirmacaoSeguranca confirmacaoseguranca = new ConfirmacaoSeguranca();
        confirmacaoseguranca.setVisible(true);
        
    }//GEN-LAST:event_f_cadastrarActionPerformed

    private void opcaoCadastroFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcaoCadastroFActionPerformed

        homePanel.setVisible(false);
        sobrePanel.setVisible(false);
        gerenciarPanel.setVisible(false);
        cadastrarPanel.setVisible(false);
        cadastrarFuPanel.setVisible(true);

    }//GEN-LAST:event_opcaoCadastroFActionPerformed

    private void f_nomeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nomeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nomeeActionPerformed

    private void c_conexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_conexaoActionPerformed

        controller2.registrarAluno();
    }//GEN-LAST:event_c_conexaoActionPerformed

    private void c_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_cancelarActionPerformed

        limparCamps();
    }//GEN-LAST:event_c_cancelarActionPerformed

    private void c_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                telaPrincipalCu.setVisible(true);
            }
        });

    }

    public JButton getT_mudarcor() {
        return t_mudarcor;
    }

    public void setT_mudarcor(JButton t_mudarcor) {
        this.t_mudarcor = t_mudarcor;
    }

    private void updateUIComponents(Component component) {
        SwingUtilities.updateComponentTreeUI(component);

        if (component instanceof Container) {
            Component[] children = ((Container) component).getComponents();
            for (Component child : children) {
                updateUIComponents(child);
            }
        }
    }

    public JTextField getG_curso() {
        return g_curso;
    }

    public void setG_curso(JTextField g_curso) {
        this.g_curso = g_curso;
    }

    public JTextField getG_fase() {
        return g_fase;
    }

    public void setG_fase(JTextField g_fase) {
        this.g_fase = g_fase;
    }

    public JTextField getG_idade() {
        return g_idade;
    }

    public void setG_idade(JTextField g_idade) {
        this.g_idade = g_idade;
    }

    public JTextField getG_nome() {
        return g_nome;
    }

    public void setG_nome(JTextField g_nome) {
        this.g_nome = g_nome;
    }

    public JTable getG_tabela() {
        return g_tabela;
    }

    public void setG_tabela(JTable g_tabela) {
        this.g_tabela = g_tabela;
    }

    public JTextField getC_curso() {
        return c_curso;
    }

    public void setC_curso(JTextField c_curso) {
        this.c_curso = c_curso;
    }

    public JTextField getC_nome() {
        return c_nome;
    }

    public void setC_nome(JTextField c_nome) {
        this.c_nome = c_nome;
    }

    public JTextField getC_fase() {
        return c_fase;
    }

    public void setC_fase(JTextField c_fase) {
        this.c_fase = c_fase;
    }

    public JTextField getC_idade() {
        return c_idade;
    }

    public void setC_idade(JTextField c_idade) {
        this.c_idade = c_idade;
    }

    public JTextField getF_funcao() {
        return f_funcao;
    }

    public void setF_funcao(JTextField f_funcao) {
        this.f_funcao = f_funcao;
    }

    public JTextField getF_matricula() {
        return f_matricula;
    }

    public void setF_matricula(JTextField f_matricula) {
        this.f_matricula = f_matricula;
    }

    public JTextField getF_nome() {
        return f_nomee;
    }

    public void setF_nome(JTextField f_nome) {
        this.f_nomee = f_nome;
    }

    public JTextField getF_salario() {
        return f_salario;
    }

    public void setF_salario(JTextField f_salario) {
        this.f_salario = f_salario;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipalCu;
        
    }

    public void limparCamps() {

        this.c_nome.setText("");
        this.c_curso.setText("");
        this.c_fase.setText("");
        this.c_idade.setText("");

    }

    public void limparCampsF() {

        this.f_nomee.setText("");
        this.f_funcao.setText("");
        this.f_matricula.setText("");
        this.f_salario.setText("");

    }
    
    public void InserirIcone(JFrame frm) {
        try {
            
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/imagens/cupp.png"));
            
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lista;
    private javax.swing.JButton c_cancelar;
    private javax.swing.JButton c_conexao;
    private javax.swing.JTextField c_curso;
    private javax.swing.JTextField c_fase;
    private javax.swing.JTextField c_idade;
    private javax.swing.JTextField c_nome;
    private javax.swing.JPanel cadastrarFuPanel;
    private javax.swing.JPanel cadastrarPanel;
    private javax.swing.JButton f_apagar;
    private javax.swing.JButton f_cadastrar;
    private javax.swing.JTextField f_funcao;
    private javax.swing.JTextField f_matricula;
    private javax.swing.JTextField f_nomee;
    private javax.swing.JTextField f_salario;
    private javax.swing.JButton g_alterar;
    private javax.swing.JButton g_apagar;
    private javax.swing.JTextField g_curso;
    private javax.swing.JTextField g_fase;
    private javax.swing.JTextField g_idade;
    private javax.swing.JTextField g_nome;
    private javax.swing.JTable g_tabela;
    private javax.swing.JPanel gerenciarPanel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton opcaoCadastro;
    private javax.swing.JButton opcaoCadastroF;
    private javax.swing.JButton opcaoGerenciar;
    private javax.swing.JButton opcaoSobre;
    private javax.swing.JPanel sobrePanel;
    private javax.swing.JLabel t_close;
    private javax.swing.JButton t_home;
    private javax.swing.JLabel t_min;
    private javax.swing.JButton t_mudarcor;
    private javax.swing.JPanel telaPrincipal;
    // End of variables declaration//GEN-END:variables

}
