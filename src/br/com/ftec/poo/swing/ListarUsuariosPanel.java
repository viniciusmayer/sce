package br.com.ftec.poo.swing;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ListarUsuariosPanel extends JPanel {

    private static final long serialVersionUID = 6630394552919411197L;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    public ListarUsuariosPanel(ListarUsuariosTableModel listarUsuariosTableModel) {
        initComponents(listarUsuariosTableModel);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(ListarUsuariosTableModel listarUsuariosTableModel) {
        JScrollPane jScrollPane1 = new JScrollPane();
        JTable jTable1 = new JTable();

        jTable1.setModel(listarUsuariosTableModel);
        jScrollPane1.setViewportView(jTable1);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
}