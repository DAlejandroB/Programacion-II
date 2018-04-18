package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.CompoundBorder;

import controller.CounterListener;

public class ToolBarContainer extends JToolBar {
	private static final long serialVersionUID = 1L;
	private int id;
	private JLabel mainLabel;
	private HintJTextField startField;
	private HintJTextField finishField;
	private HintJTextField incrementField;
	private HintJTextField speedField;

	public ToolBarContainer(int id) {
		this(0, id);
	}

	public ToolBarContainer(int start, int id) {
		this.id = id;
		this.mainLabel = new JLabel(start + "", JLabel.CENTER);
		this.startField = new HintJTextField("Start");
		this.finishField = new HintJTextField("Finish");
		this.incrementField = new HintJTextField("Increment");
		this.speedField = new HintJTextField("Speed");
		this.init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.darkGray),
				BorderFactory.createEmptyBorder(3, 3, 3, 3)));
		
		this.mainLabel.setFont(new Font("Arial", Font.PLAIN, 80));
		this.add(new MyToolBar(null, id),BorderLayout.NORTH);
		this.add(toolBarPanel(), BorderLayout.SOUTH);
		this.add(mainLabel, BorderLayout.CENTER);
	}

	public void setMainLabelTitle(int current) {
		this.mainLabel.setText("" + current);
	}

	public JPanel toolBarPanel() {
		JPanel panelFields = new JPanel(new GridLayout(1, 4));
		this.startField.setToolTipText("Comuenzo del conteo");
		this.finishField.setToolTipText("Final del conteo");
		this.incrementField.setToolTipText("Intervalo entre numeros");
		this.speedField.setToolTipText("Velocidad : n/s");
		panelFields.add(startField);
		panelFields.add(finishField);
		panelFields.add(incrementField);
		panelFields.add(speedField);
		return panelFields;
	}

	public int[] getData() {
		return new int[] { this.parseInt(startField.getText(), 0), this.parseInt(finishField.getText(), 0),
				Math.abs(this.parseInt(incrementField.getText(),0)), this.parseInt(speedField.getText(), 1) };
	}
	
	private int parseInt(String string, int ex) {
		int intNum = 0;
		try {
			intNum = Integer.parseInt(string);
		} catch (NumberFormatException e) {
			intNum = ex;
		}
		return intNum;
	}

	public int getId() {
		return id;
	}

	public void setBlankField() {
		this.startField.putHint();
		this.finishField.putHint();
		this.incrementField.putHint();
		this.speedField.putHint();
	}
}
