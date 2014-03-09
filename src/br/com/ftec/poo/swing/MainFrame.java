package br.com.ftec.poo.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame implements ActionListener {

    private JPanel cards;
    private ListarUsuariosTableModel listarUsuariosTableModel;

    private final static String PRIMEIRA_TELA = "primeira_tela";
    private final static String CRIAR_USUARIO = "criar_usuario";
    private final static String LISTAR_USUARIOS = "listar_usuarios";

    public void buildContainer(Container container) {
        this.cards = new JPanel(new CardLayout());
        this.listarUsuariosTableModel = new ListarUsuariosTableModel();

        JPanel criarUsuario = new CriarUsuarioPanel();
        JPanel listarUsuarios = new ListarUsuariosPanel(this.listarUsuariosTableModel);
        JPanel primeiraTela = new JPanel();

        this.cards.add(primeiraTela, PRIMEIRA_TELA);
        this.cards.add(criarUsuario, CRIAR_USUARIO);
        this.cards.add(listarUsuarios, LISTAR_USUARIOS);

        container.add(this.cards, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CardLayout cardLayout = (CardLayout) this.cards.getLayout();
        cardLayout.show(this.cards, actionEvent.getActionCommand());
        this.listarUsuariosTableModel.fireTableDataChanged();
    }

    public JMenuBar getMenuBar() {
    	JMenuBar menuBar = new JMenuBar();

    	JMenu arquivo = new JMenu();
    	JMenuItem voltar = new JMenuItem();
        JMenuItem criar = new JMenuItem();
        JMenuItem listar = new JMenuItem();
        JMenuItem sair = new JMenuItem();
        
        JMenu ajuda = new JMenu();
        JMenuItem sobre = new JMenuItem();

        arquivo.setMnemonic('f');
        arquivo.setText("Arquivo");

        voltar.setText("Voltar");
        voltar.setActionCommand(PRIMEIRA_TELA);
        voltar.addActionListener(this);
        arquivo.add(voltar);

        criar.setText("Criar");
        criar.setActionCommand(CRIAR_USUARIO);
        criar.addActionListener(this);
        arquivo.add(criar);

        listar.setText("Listar");
        listar.setActionCommand(LISTAR_USUARIOS);
        listar.addActionListener(this);
        arquivo.add(listar);

        sair.setMnemonic('x');
        sair.setText("Sair");
        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        arquivo.add(sair);

        menuBar.add(arquivo);

        ajuda.setMnemonic('h');
        ajuda.setText("Ajuda");

        sobre.setMnemonic('a');
        sobre.setText("Sobre");
        ajuda.add(sobre);

        menuBar.add(ajuda);
        return menuBar;
    }
}