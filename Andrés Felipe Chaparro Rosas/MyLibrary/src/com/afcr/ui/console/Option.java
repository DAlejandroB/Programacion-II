package com.afcr.ui.console;

public class Option {
	private char identifer;
	private String title;
	private String action;

	/**
	 * Constructor que inicializa los atributos identifier title y action
	 * 
	 * @param identifer
	 *            es el valor que representa a el titulo
	 * @param title
	 *            es la opcion a ejecutar
	 * @param action
	 *            el comando a ejecutar
	 */
	public Option(char identifer, String title, String action) {
		this.identifer = identifer;
		this.title = title;
		this.action = action;
	}

	/**
	 * Muerstra la opcion ordenada
	 */
	public void show() {
		System.out.println(identifer + ". " + title);
	}

	/**
	 * Establece el valor de action
	 * 
	 * @param action
	 *            comando
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Establece el valor de identifier
	 * 
	 * @param identifer
	 *            identificador
	 */
	public void setIdentifer(char identifer) {
		this.identifer = identifer;
	}

	/**
	 * Establece el valor del titulo
	 * 
	 * @param title
	 *            titulo
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Obtiene el valor de action
	 * 
	 * @return comando
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Obtiene el valor del identifier
	 * 
	 * @return identificaador
	 */
	public char getIdentifer() {
		return identifer;
	}

	/**
	 * Obtiene el valor del titulo
	 * 
	 * @return titulo de opcions
	 */
	public String getTitle() {
		return title;
	}
}
