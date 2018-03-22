package model.entity;
import java.io.Serializable;
import java.util.ArrayList;

public class Line implements Serializable{
	private String name;
	private ArrayList<Model> modelList;
	
	public Line(String name) {
		setName(name);
		modelList = new ArrayList<Model>();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void addNewModel(String modelName,int cost) {
		Model model = new Model(modelName,cost);
		modelList.add(model);
	}
	public ArrayList<Model> getModelList(){
		return this.modelList;
	}
	public String getModelString() {
		String s = "";
		for (Model model : modelList) {
			if (model != null )s += "  . " + model.getName(); 
		}
		return s;
	}
}
