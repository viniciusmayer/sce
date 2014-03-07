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

	private final static String PRIMEIRA_TELA = "primeira_tela";
	private final static String CRIAR_USUARIO = "criar_usuario";

	public void buildContainer(Container container) {
		this.cards = new JPanel(new CardLayout());

		JPanel criarUsuario = new CriarUsuarioPanel();
		JPanel primeiraTela = new JPanel();

		this.cards.add(primeiraTela, PRIMEIRA_TELA);
		this.cards.add(criarUsuario, CRIAR_USUARIO);

		container.add(this.cards, BorderLayout.CENTER);
	}

	public JMenuBar getMenuBar() {
		JMenuItem sobre = new JMenuItem();
		JMenuItem sair = new JMenuItem();
		JMenu arquivo = new JMenu();
		JMenu ajuda = new JMenu();
		JMenuItem criar = new JMenuItem();
		JMenuItem voltar = new JMenuItem();
		JMenuBar menuBar = new JMenuBar();

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

		sair.setMnemonic('x');
		sair.setText("Sair");
		sair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
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

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		CardLayout cardLayout = (CardLayout) (this.cards.getLayout());
		cardLayout.show(this.cards, (String) actionEvent.getActionCommand());
	}
}
