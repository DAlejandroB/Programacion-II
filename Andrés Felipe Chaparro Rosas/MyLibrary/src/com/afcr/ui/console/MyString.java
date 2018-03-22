package com.afcr.ui.console;

/**
 * CLase MyString
 * 
 * @author Andrés Felipe Chaparro Rosas
 *
 */
public class MyString {
	/**
	 * Centra la linea introducida por medio de textLine en un borde de width ancho
	 * 
	 * @param textLine
	 *            texto introducido
	 * @param width
	 *            ancho del borde
	 * @return linea centrado
	 */
	public String centerLine(String textLine, int width) {
		int lenghtText = textLine.length();
		String sidestring = characterLine((width - lenghtText) / 2, ' ');

		if (width < lenghtText) {
			return centerLine(textLine.substring(0, width - 1) + "-", width) + "\n"
					+ centerLine(textLine.substring(width - 1), width);
		} else if ((((width % 2) == 0 && (lenghtText % 2) == 1) || ((width % 2) == 1 && (lenghtText % 2) == 0))
				&& ((sidestring.length() * 2) + textLine.length()) != width) {
			return sidestring + textLine + sidestring + ' ';
		} else {
			return sidestring + textLine + sidestring;
		}
	}

	/**
	 * centra un texto aojado en text de varias lineas
	 * 
	 * @param width
	 *            ancho maximo
	 * @return texto centrado y delimitado
	 */
	public String centerText(String text, int width) {
		String[] textLarge = null;
		textLarge = lineArray(text, width);
		text = "";
		for (int j = 0; j < textLarge.length; j++) {
			text += centerLine(textLarge[j], width);
			if (j + 1 != textLarge.length)
				text += "\n";
		}
		return text;
	}

	/**
	 * Rodea el texto entre caracteres border
	 * 
	 * @param text
	 *            texto a bordear
	 * @param width
	 *            ancho maximo
	 * @param border
	 *            tipo de caracter
	 * @return texto bordeado
	 */
	public String wrapText(String text, int width, char border) {
		if (text.length() > width) {
			String[] lines = text.split("[\n]");
			text = "";
			for (int i = 0; i < lines.length; i++) {
				text += wrapText(lines[i], width, border);
				if (i + 1 != lines.length)
					text += '\n';
			}
		} else if (text.charAt(0) == ' ' && text.charAt(text.length() - 1) == ' ') {
			return border + text.substring(1, text.length() - 1) + border;
		}
		return text;
	}

	/**
	 * Separa en lineas el texto introducido de manera que quepa en un maximo width
	 * 
	 * @param width
	 *            ancho maximo
	 * @return arreglo de lineas
	 */
	public String[] lineArray(String textLine, int width) {
		String[] textarray = null;
		String[] textLarge = textLine.split("[ ]");
		String line = "";
		textLine = "";
		for (int j = 0; j < textLarge.length; j++) {
			if ((line.length() + textLarge[j].length()) < width) {
				line = line + textLarge[j];
				if (textLarge.length != j + 1) {
					if ((line.length() + 1 + textLarge[j + 1].length()) < width) {
						if (line.length() != 0)
							line = line + ' ';
					} else {
						textLine = textLine + line + "\n";
						line = "";
					}
				} else {
					textLine = textLine + line;
				}
			}
		}
		textarray = textLine.split("\n");
		return textarray;
	}

	/**
	 * Separa en lineas el texto introducido de manera que quepa en un maximo width
	 * y divide con el character
	 * 
	 * @param width
	 *            ancho maximo
	 * @param character
	 *            caracter de division
	 * @return arreglo de lineas
	 */
	public String[] lineArray(String textLine, int width, char character) {
		String[] textarray = null;
		String[] textLarge = textLine.split("[" + character + "]");
		String line = "";
		textLine = "";
		for (int j = 0; j < textLarge.length; j++) {
			if ((line.length() + textLarge[j].length()) < width) {
				line = line + textLarge[j];
				if (textLarge.length != j + 1) {
					if ((line.length() + 1 + textLarge[j + 1].length()) < width) {
						if (line.length() != 0)
							line = line + ' ';
					} else {
						textLine = textLine + line + "\n";
						line = "";
					}
				} else {
					textLine = textLine + line;
				}
			}
		}
		textarray = textLine.split("\n");
		return textarray;
	}

	/**
	 * Genera una linea horizontal de caracteres con tamaño width y caracter border
	 * 
	 * @param width
	 *            tamaño
	 * @param border
	 *            caracter
	 * @return linea de caracteres
	 */
	public String characterLine(int width, char border) {
		String lineBorder = "";
		for (int i = 0; i < width; i++) {
			lineBorder += border;
		}
		return lineBorder;
	}
}