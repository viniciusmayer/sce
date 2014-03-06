package br.com.ftec.poo.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("POO - Swing");

        new MainFrame(jFrame);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
