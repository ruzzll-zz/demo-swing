package com.swing.demo.app;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(final String[] args){
		System.out.print("asdasd");
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				Application app = new Application();
			}
		});
	}

}
