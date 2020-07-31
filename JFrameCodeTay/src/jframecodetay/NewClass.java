/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecodetay;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewClass {
	JFrame secondFrame;
	JLabel label;
	
	public NewClass(){
		initComponent();
	}
	
	public void initComponent(){
		secondFrame = new JFrame("Frame 2");
		secondFrame.setSize(300, 300);
		secondFrame.setLayout(new BoxLayout(secondFrame.getContentPane(),BoxLayout.PAGE_AXIS));
		
		label = new JLabel("Frame 2");
		secondFrame.add(label);
	}
	
	public static void main(String[] args) {
		new NewClass();
	}
}
/**
 *
 * @author May Tinh Hoang Phat
 */

