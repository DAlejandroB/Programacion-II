package test;

import com.afcr.area.ui.console.FormOutputTriangle;

public class TestFormResult {
	public static void main(String[] args) {
		FormOutputTriangle formOutputTriangle = new FormOutputTriangle();
		formOutputTriangle.showResult(4, 5, 3, 6);
		formOutputTriangle.showNotResult(1, 6, 20);
	}
}
