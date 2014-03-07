package br.com.ftec.poo.swing;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ListarUsuariosTableModel extends AbstractTableModel {

    private static final long serialVersionUID = -6695316058137636877L;

    private List<Usuario> usuarios;

    public ListarUsuariosTableModel() {
        this.usuarios = UsuarioDAO.getInstance().getUsuarios();
    }

    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Email";
            case 2:
                return "Senha";
            default:
                return "-";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = this.usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getEmail();
            case 2:
                return usuario.getSenha();
            default:
                return "-";
        }
    }
}
