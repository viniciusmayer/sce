package br.com.ftec.poo.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainFrame implements ActionListener {

    private final JPanel cards;

    private final static String PRIMEIRA_TELA = "primeira_tela";
    private final static String CRIAR_USUARIO = "criar_usuario";

    public MainFrame(JFrame frame) {

        JPanel card3 = new CriarUsuarioPanel();
        JPanel card1 = new JPanel();

        this.cards = new JPanel(new CardLayout());

        this.cards.add(card1, PRIMEIRA_TELA);
        this.cards.add(card3, CRIAR_USUARIO);

        Container pane = frame.getContentPane();
        pane.add(this.cards, BorderLayout.CENTER);

        JMenuItem aboutMenuItem = new JMenuItem();
        JMenuItem exitMenuItem = new JMenuItem();
        JMenu fileMenu = new JMenu();
        JMenu helpMenu = new JMenu();
        JMenuItem jMenuItem1 = new JMenuItem();
        JMenuItem jMenuItem2 = new JMenuItem();
        JMenuBar menuBar = new JMenuBar();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Arquivo");

        jMenuItem2.setText("Voltar");
        jMenuItem2.setActionCommand(PRIMEIRA_TELA);
        jMenuItem2.addActionListener(this);
        fileMenu.add(jMenuItem2);

        jMenuItem1.setText("Criar");
        jMenuItem1.setActionCommand(CRIAR_USUARIO);
        jMenuItem1.addActionListener(this);
        fileMenu.add(jMenuItem1);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ajuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Sobre");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
    }

    public void actionPerformed(ActionEvent e) {
        CardLayout cl = (CardLayout) (this.cards.getLayout());
        cl.show(this.cards, e.getActionCommand());
    }
}
