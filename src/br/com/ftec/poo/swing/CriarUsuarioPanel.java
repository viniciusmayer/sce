package br.com.ftec.poo.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class CriarUsuarioPanel extends JPanel {

	private static final long serialVersionUID = -1980347993255228219L;

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JTextField jTextField1;
	private JPasswordField jTextField2;
	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	// End of variables declaration//GEN-END:variables

	public CriarUsuarioPanel() {
		initComponents();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		this.jTextField1 = new JTextField();
		this.jTextField2 = new JPasswordField();
		this.jLabel1 = new JLabel();
		this.jLabel2 = new JLabel();
		this.jButton1 = new JButton();

		this.jLabel1.setText("Email");

		this.jLabel2.setText("Senha");

		this.jButton1.setText("Salvar");
		this.jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addComponent(this.jLabel2).addComponent(this.jLabel1))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jTextField1)
										.addGroup(
												layout.createSequentialGroup().addComponent(this.jButton1)
														.addGap(0, 275, Short.MAX_VALUE)).addComponent(this.jTextField2))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel1)
										.addComponent(this.jTextField1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel2)
										.addComponent(this.jTextField2, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}// </editor-fold>//GEN-END:initComponents

	private void jButton1ActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		String email = this.jTextField1.getText();
		String senha = String.valueOf(this.jTextField2.getPassword());
		
		boolean emailValido = email != null && !email.trim().isEmpty();
		boolean senhaValida = senha != null && !senha.isEmpty();
		if (!emailValido || !senhaValida){
			JOptionPane.showMessageDialog(this, "Preencha os campos email e senha.");
			return;
		}

		UsuarioDAO.getInstance().add(new Usuario(email, senha));
		JOptionPane.showMessageDialog(this, "Usuario '" + email + "' salvo com sucesso.");
                
        this.jTextField1.setEditable(false);
        this.jTextField2.setEditable(false);
	}// GEN-LAST:event_jButton1ActionPerformed
	
	public void limparCampos(){
		this.jTextField1.setText("");
		this.jTextField1.setEditable(true);
		
		this.jTextField2.setText("");
        this.jTextField2.setEditable(true);
	}
}