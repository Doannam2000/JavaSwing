/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecodetay;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author May Tinh Hoang Phat
 */
public class JFrameCodeTay extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    JButton okButton,cancelButton,exitButton;
    public JFrameCodeTay()
    {
        creatAndShow();
    }
    public void creatAndShow()
    {
          
          JButton openBt;
          okButton = new JButton("Ok");
          cancelButton = new JButton("Cancel");
          exitButton = new JButton("Exit");
          setSize(400, 300);
          setLocationRelativeTo(null);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          
          
          
          add(okButton);
          okButton.setActionCommand("Ok");
          okButton.addActionListener(this);
         
          
          add(cancelButton);
          cancelButton.setActionCommand("Cancel");
          cancelButton.addActionListener(this);
          
          
          
          add(exitButton);
          exitButton.setActionCommand("Exit");
          exitButton.addActionListener(this);
          setLayout(new FlowLayout());
          setVisible(true);
          openBt = new JButton("Click");
		openBt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new NewClass().secondFrame.setVisible(true);
				
			}
		});
		this.add(openBt);
		this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new JFrameCodeTay();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Ok".equals(e.getActionCommand()))
            JOptionPane.showMessageDialog(rootPane,"Bạn biết thế đủ rồi");
        if("Cancel".equals(e.getActionCommand()))
            JOptionPane.showConfirmDialog(rootPane, "Chắc chứ");
        if("Exit".equals(e.getActionCommand()))
            System.exit(0);
 
   }
    
}
