package br.com.ftec.poo.swing;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class MainFrame implements ActionListener {

    private JPanel cards;
    private JPanel primeiraTela;
    private CriarUsuarioPanel criarUsuario;
    private JPanel listarUsuarios;
    private ListarUsuariosTableModel listarUsuariosTableModel;

    private List<Usuario> usuarios;

    public JPanel getPanel() {
        this.usuarios = new ArrayList<>();

        this.cards = new JPanel(new CardLayout());

        this.primeiraTela = new JPanel();

        this.criarUsuario = new CriarUsuarioPanel(this.usuarios);

        this.listarUsuariosTableModel = new ListarUsuariosTableModel(this.usuarios);
        this.listarUsuarios = new ListarUsuariosPanel(this.listarUsuariosTableModel);

        this.cards.add(this.primeiraTela, "primeira_tela");
        this.cards.add(this.criarUsuario, "criar_usuario");
        this.cards.add(this.listarUsuarios, "listar_usuarios");

        return this.cards;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        CardLayout cardLayout = (CardLayout) this.cards.getLayout();
        String actionCommand = actionEvent.getActionCommand();
        switch (actionCommand) {
            case "criar_usuario":
                this.criarUsuario.limparCampos();
                break;
            case "listar_usuarios":
                this.listarUsuariosTableModel.fireTableDataChanged();
                break;
            case "primeira_tela":
            default:
                break;
        }

        cardLayout.show(this.cards, actionCommand);
    }
}
