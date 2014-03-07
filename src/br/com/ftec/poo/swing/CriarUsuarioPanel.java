package br.com.ftec.poo.swing;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

public class CriarUsuarioPanel extends JPanel {

	private static final long serialVersionUID = -1980347993255228219L;

	private JButton jButton1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JTextField jTextField1;
	private JTextField jTextField2;

	public CriarUsuarioPanel() {
		build();
	}

	private void build() {
		this.jLabel1 = new JLabel();
		this.jTextField1 = new JTextField();
		this.jLabel2 = new JLabel();
		this.jTextField2 = new JTextField();
		this.jButton1 = new JButton();

		this.jLabel1.setText("Email");
		this.jLabel2.setText("Senha");

		this.jButton1.setText("Salvar");

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel2)
										.addComponent(this.jLabel1))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(this.jTextField1)
										.addGroup(
												layout.createSequentialGroup().addComponent(this.jButton1)
														.addGap(0, 275, Short.MAX_VALUE))
										.addComponent(this.jTextField2)).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel1)
										.addComponent(this.jTextField1, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(this.jLabel2)
										.addComponent(this.jTextField2, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}
}