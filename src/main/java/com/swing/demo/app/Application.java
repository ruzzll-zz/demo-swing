package com.swing.demo.app;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;


public class Application extends JFrame {
	public Application() {
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnAsdasd = new JButton("asdasd");
		btnAsdasd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		toolBar.add(btnAsdasd);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -4223644841114678439L;

}