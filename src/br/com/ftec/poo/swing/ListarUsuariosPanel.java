package br.com.ftec.poo.swing;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ListarUsuariosPanel extends JPanel{

	private static final long serialVersionUID = 6630394552919411197L;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private ListarUsuariosTableModel listarUsuariosTableModel;
    // End of variables declaration//GEN-END:variables

	public ListarUsuariosPanel(ListarUsuariosTableModel listarUsuariosTableModel) {
		this.listarUsuariosTableModel = listarUsuariosTableModel;
		initComponents();
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(listarUsuariosTableModel);
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	int showConfirmDialog = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro?");
    	    	
    	UsuarioDAO.getInstance().deletar();
        this.listarUsuariosTableModel.fireTableDataChanged();
    	
    }//GEN-LAST:event_jButton2ActionPerformed
}