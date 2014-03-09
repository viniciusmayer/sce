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
    public Class getColumnClass(int columnIndex) {
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    @Override
    public int getRowCount() {
        return this.usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
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
            case 3:
        		return "Deletar?";
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
            case 3:
                return usuario.getSelected();
            default:
                return "-";
        }
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		this.usuarios.get(rowIndex).setSelected((Boolean)aValue);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
    	return (columnIndex > 2);
    }
}
