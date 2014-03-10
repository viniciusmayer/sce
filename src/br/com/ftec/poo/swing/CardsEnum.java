package br.com.ftec.poo.swing;

public enum CardsEnum {

    PRIMEIRA_TELA("primeira_tela"),
    CRIAR_USUARIO("criar_usuario"),
    LISTAR_USUARIOS("listar_usuarios");
    
	private String actionCommand;

	private CardsEnum(String actionCommand) {
		this.actionCommand = actionCommand;
	}

	public static CardsEnum getFromActionCommand(String actionCommand){
		CardsEnum fromActionCommand = null;
		for (CardsEnum card: CardsEnum.values()) {
			if (card.getActionCommand().equals(actionCommand)){
				fromActionCommand = card;
				break;
			}
		}
		return fromActionCommand;
	}
	
	public String getActionCommand() {
		return actionCommand;
	}

	public void setActionCommand(String actionCommand) {
		this.actionCommand = actionCommand;
	}
}
