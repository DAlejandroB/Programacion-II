package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CopyrightPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CopyrightPanel() {
		setBackground(Color.decode("#ffffff"));
		
		JLabel lb1 = new JLabel(" ");
		lb1.setBackground(Color.decode("#ffffff"));
		add(lb1);
		
		JLabel lb2 = new JLabel("<html> Copyright © 2018 Grupo Bancolombia. Productos y servicios de Banca, Fiducia, Leasing, Renting, Bolsa, Factoring, Banca de Inversión, <br> "
				+ "Financiamiento, además del portafolio ofrecido por las entidades del exterior en Panamá, Cayman, Puerto Rico, Renting Perú, Leasing Perú, Fidu <br> "
				+ "Perú y Valores Bancolombia Panamá." +  
				"<br> Te recomendamos usar los navegadores Web Chrome 43 o superior, Firefox 38 o superior, Safari 8 o superior, Internet Explorer 10, 11. <html>");
		lb2.setFont(new Font("Heveltica", Font.PLAIN, 14));
		lb2.setForeground(Color.decode("#808080"));
		lb2.setBorder(BorderFactory.createEmptyBorder(100, 0, 10, 0));
		add(lb2);
		
		JLabel lb3 = new JLabel(" ");
		lb3.setBackground(Color.decode("#ffffff"));
		add(lb3);
	}

}
