package com.afcr.area.runner;

import com.afcr.area.gui.splash.Splash;

public class RunnerGUI {
		public static void main(String[] args) {
			new Thread(new Splash()).start();
		}
}
