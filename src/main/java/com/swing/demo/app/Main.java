package com.swing.demo.app;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args){
		System.out.print("init project");
		
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				Application app = new Application();
				app.setTitle("-:: Demo ::-");
				app.setSize(800, 600);
				//app.setExtendedState(app.MAXIMIZED_BOTH);  
				app.setLocationRelativeTo(null);
				app.setDefaultCloseOperation(Application.EXIT_ON_CLOSE);
				
				/*URL url = ClassLoader.getSystemResource("src/main/resources/Camera.jpg");
				Toolkit kit = Toolkit.getDefaultToolkit();
				Image img = kit.createImage(url);
				app.setIconImage(img);*/
				
				app.setVisible(true);
			}
			
		});
	}

}
