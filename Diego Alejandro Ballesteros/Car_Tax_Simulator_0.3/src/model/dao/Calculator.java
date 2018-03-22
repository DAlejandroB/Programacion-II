package model.dao;
import java.util.ArrayList;
import persistence.ObjectFileOperations;
import model.entity.*;
import java.util.Properties;
import java.io.FileReader;
import persistence.FileOperations;

public class Calculator {
	//Declaration
	private ArrayList<Brand> brandList = new ArrayList<Brand>();
	private ArrayList<Range> rangeList;
	private FileOperations fo = new FileOperations();
	//Constructor
	public Calculator() {
		this.createRanges();
	}
	//Class methods
	private void createRanges() {
		rangeList = new ArrayList<Range>();
		ArrayList<String> tempList = fo.loadTextFile("resources/ranges.txt");
		String[]info = new String[3];
		for (String s: tempList) {
			if(s != null) {
				info = s.split("_");
				int min = Integer.parseInt(info[0]);
				int max = Integer.parseInt(info[1]);
				double percentage = Double.parseDouble(info[2]);
				addRange(min,max,percentage);
			}
		}
	}
	public void addNewBrand(String name) {
		Brand brand = new Brand(name);
		brandList.add(brand);
	}
	public void createRanges(int min, int max, double per) {
		String[] list = new String[3];
		list[0] = Integer.toString(min);
		list[1] = Integer.toString(max);
		list[2] = Double.toString(per);
		this.addRange(min, max, per);
		fo.writeTextFile("ranges.txt", list[0] + ',' + list[1] + ',' + list[2]);
	}
	public void addLine(String brand, String name){
		for(Brand b: brandList){
			if(b.getName() != null && brand != null && name != null)
				if(b.getName().equals(brand)){
					b.addNewLine(name);
				}
		}
	}
	public double calculateBrute(String brand, String line, String model, boolean a, boolean b, boolean c){
		double cost;
		double percentage;
		cost = this.findCost(brand,line,model);
		percentage = this.findPer((int)cost)/100;
		cost *= percentage;
		cost -= this.discount((int)cost, a, b, c);
		return cost;
	}
	private double discount(int value, boolean pp, boolean publicCar, boolean move){
		double sale = 0;
		try {
			Properties p = this.getProperties();
			p.load(new FileReader("resources/config.properties"));
			double disPP = Double.parseDouble(p.getProperty("per0"));
			double disPC = Double.parseDouble(p.getProperty("per1"));
			double disM = Double.parseDouble(p.getProperty("per2"));
			if(pp) sale += value*disPP;
			if(publicCar) sale += disPC;
			if(move) sale += value*disM;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sale;
	}

	public void addRange(int min, int max, double per){
		Range r = new Range ();
		r.setMin(min);
		r.setMax(max);
		r.setPercentage(per);
		rangeList.add(r);
	}
	public void addModel(String brand, String line, String name, int cost){
		for (Brand b: brandList) {
			if(b.getName() != null)	
				if(b.getName().equals(brand)){
					for (Line l: b.getLineList()) {
						if(l.getName().equals(line)){
							l.addNewModel(name,cost);
						}
					}
				}
		}
	}
	private int findCost(String brand, String line, String name){
		int cost = 0;
		for (Brand b: brandList) {
			if(b != null)
				if(b.getName().equals(brand)){
					for (Line l: b.getLineList()) {
				if(l.getName().equals(line)){
					for(Model m: l.getModelList()) {
						if(m.getName().equals(name)) {
							cost = m.getCost();
						}
					}
								}
							}
						}
					}
		return cost;
	}

	public double findPer(int value){
		double per = 0; 
		for (Range r : rangeList) {
			if (r.getMin() < value && r.getMax() > value){
				per = r.getPercentage();
			}
		}
		return per;
	}
	public String getBrandString() {
		String retorno = "";
		for (Brand b: brandList) {
			if(b != null) {
					retorno += b.getName() + "\n" + " " + b.getLineString();
			}
		}
		return retorno;
	}
	public ArrayList<Brand> getBrandList() {
		return this.brandList;
	}
	public void setBrandList(ArrayList<Brand> brand) {
		this.brandList = brand;
	}
	private Properties getProperties() {
		Properties p = new Properties();
		return p;
	}
	public void load() {
		ArrayList<Brand> loadList = (ArrayList<Brand>)ObjectFileOperations.loadBinFile("resources/data.bin");
		for(Brand b: loadList) {
			addNewBrand(b.getName());
		}
		for(int i = 0; i < loadList.size() ; i++) {
			int c = loadList.get(i).getLineList().size();
			for(int j = 0; j < c;j++) {
				loadList.get(i).addNewLine(loadList.get(i).getLineList().get(j).getName());
			}
		}
	}
	public void save() {
		ObjectFileOperations.saveBinFile(getBrandList(), "resources/data.bin");
	}
}
