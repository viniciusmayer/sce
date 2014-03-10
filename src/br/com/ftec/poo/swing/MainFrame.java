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
    private CriarUsuarioPanel criarUsuario;
    private JPanel listarUsuarios;
    private JPanel primeiraTela;

    public void buildContainer(Container container) {
        this.cards = new JPanel(new CardLayout());
        this.listarUsuariosTableModel = new ListarUsuariosTableModel();

        this.criarUsuario = new CriarUsuarioPanel();
        this.listarUsuarios = new ListarUsuariosPanel(this.listarUsuariosTableModel);
        this.primeiraTela = new JPanel();

        this.cards.add(this.primeiraTela, CardsEnum.PRIMEIRA_TELA.getActionCommand());
        this.cards.add(this.criarUsuario, CardsEnum.CRIAR_USUARIO.getActionCommand());
        this.cards.add(this.listarUsuarios, CardsEnum.LISTAR_USUARIOS.getActionCommand());

        container.add(this.cards, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CardLayout cardLayout = (CardLayout) this.cards.getLayout();
        String actionCommand = actionEvent.getActionCommand();
        CardsEnum card = CardsEnum.getFromActionCommand(actionCommand);
        
        switch (card) {
		case CRIAR_USUARIO:
			this.criarUsuario.limparCampos();
			break;
		case LISTAR_USUARIOS:
			this.listarUsuariosTableModel.fireTableDataChanged();
			break;
		case PRIMEIRA_TELA:	
		default:
			break;
		}
        
		cardLayout.show(this.cards, actionCommand);
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
        voltar.setActionCommand(CardsEnum.PRIMEIRA_TELA.getActionCommand());
        voltar.addActionListener(this);
        arquivo.add(voltar);

        criar.setText("Criar");
        criar.setActionCommand(CardsEnum.CRIAR_USUARIO.getActionCommand());
        criar.addActionListener(this);
        arquivo.add(criar);

        listar.setText("Listar");
        listar.setActionCommand(CardsEnum.LISTAR_USUARIOS.getActionCommand());
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