package runner;

import java.util.Random;

import com.afcr.figures.models.Color;
import com.afcr.figures.models.FigureDao;
import com.afcr.figures.models.MyLocation;
import com.afcr.figures.models.Status;
import com.afcr.graphics.gui.Figure;
import com.afcr.graphics.gui.JFrameAppGraphic;

public class Runner {
	public static void main(String[] args) {

		if (args.length == 1) {
			int num = 0;
			try {
				num = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.exit(0);
			}
			Random random = new Random();
			Figure[] figures = new Figure[num];
			for (int i = 0; i < figures.length; i++) {
				figures[i] = new Figure(new FigureDao(
						new MyLocation(random.nextInt(1000), random.nextInt(430)),
						random.nextInt(50) + 50, random.nextInt(360),
						Status.values()[random.nextInt(Status.values().length)],
						Color.values()[random.nextInt(Color.values().length)]));
			}
			JFrameAppGraphic appGraphic =new JFrameAppGraphic(figures);
			while (true) {
				appGraphic.getjPanelWorkArea().moveBikes();
				appGraphic.getjPanelWorkArea().repaint();
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		} else {
			System.out.println("Digite unicamente un parametro");
		}
	}
}
