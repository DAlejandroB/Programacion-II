package com.afcr.area.gui.constants;

public enum Commands {
	CLOSE("Cerrar", "src/res/images/close_icon.png"),
	CALCULATE_AREA("Calcular area de triangulo", "/res/images/area_icon.png");
	private String  toolTipText, pathFile;
	
	private Commands(String toolTipText, String pathFile) {
		this.toolTipText = toolTipText;
		this.pathFile = pathFile;
	}
	
	public String getToolTipText() {
		return toolTipText;
	}
	
	public String getPathFile() {
		return pathFile;
	}
}
