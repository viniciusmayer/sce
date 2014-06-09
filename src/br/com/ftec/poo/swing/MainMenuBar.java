package br.com.ftec.poo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenuBar {

	public JMenuBar getMenuBar(MainFrame mainFrame) {
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
		voltar.setActionCommand("primeira_tela");
		voltar.addActionListener(mainFrame);
		arquivo.add(voltar);

		criar.setText("Criar");
		criar.setActionCommand("criar_usuario");
		criar.addActionListener(mainFrame);
		arquivo.add(criar);

		listar.setText("Listar");
		listar.setActionCommand("listar_usuarios");
		listar.addActionListener(mainFrame);
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
