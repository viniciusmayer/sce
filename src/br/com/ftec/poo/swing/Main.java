package br.com.ftec.poo.swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new JFrame("Programacao Orientada a Objetos - Swing");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                MainFrame mainFrame = new MainFrame();
                JPanel jPanel = mainFrame.getPanel();

                Container contentPane = jFrame.getContentPane();
                contentPane.add(jPanel, BorderLayout.CENTER);

                MainMenuBar mainMenuBar = new MainMenuBar();
                JMenuBar jMenuBar = mainMenuBar.getMenuBar(mainFrame);
                jFrame.setJMenuBar(jMenuBar);

                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }
}
