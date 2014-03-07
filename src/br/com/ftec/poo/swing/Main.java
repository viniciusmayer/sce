package br.com.ftec.poo.swing;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new JFrame("POO - Swing");
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                MainFrame mainFrame = new MainFrame();
                mainFrame.buildContainer(jFrame.getContentPane());
                
                JMenuBar jMenuBar = mainFrame.getMenuBar();
                jFrame.setJMenuBar(jMenuBar);
                
                jFrame.pack();
                jFrame.setVisible(true);
            }
        });
    }
}
