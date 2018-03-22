package model.entity;
import java.io.Serializable;
import java.util.ArrayList;

public class Brand implements Serializable{
	private String name;
	private ArrayList<Line>lineList = new ArrayList<Line>();

	public Brand(String name) {
		setName(name);
	}
	public void addNewLine(String lineName) {
		Line line = new Line(lineName);
		lineList.add(line);
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLineString() {
		String retorno = "";
		if (!lineList.isEmpty())
		for (Line l: lineList) {
			if(l != null)
				retorno += "-" + l.getName() + "\n"+ l.getModelString() + "\n";
		}
		return retorno;
	}
	public ArrayList<Line> getLineList() {
		return this.lineList;
	}
	public String getName() {
		return this.name;
	}
	public void setLineList(ArrayList<Line> lineList) {
		this.lineList = lineList;
	}
}
