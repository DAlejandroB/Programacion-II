package test;

import java.awt.Point;

import com.afcr.graphics.gui.Figure;
import com.afcr.graphics.gui.JFrameAppGraphic;

public class TestGraphic {

	public static void main(String[] args) {
		Figure figure = new Figure(100, new Point(450, 300), 0);
		 new JFrameAppGraphic(figure);
	}
}
