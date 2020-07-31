package JFrameTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JavaTest2 extends JFrame implements ActionListener 
{
	JButton okButton,cancelButton,exitButton;
	
	
	public JavaTest2() 
	{
		creatAndShow();
	}

	public void creatAndShow()
	{
		okButton = new JButton("OK");
		cancelButton = new JButton("Cancel");
		exitButton = new JButton("Exit");
		setSize(300,300);
		setLocationRelativeTo(null);
		
		add(okButton);
		okButton.setActionCommand("OK");
		okButton.addActionListener(this);
		okButton.setMnemonic(KeyEvent.VK_O);
		okButton.setToolTipText("Ấn vào sẽ có điều đặc biệt");
		
		add(cancelButton);
		cancelButton.setActionCommand("Cancel");
		cancelButton.addActionListener(this);
		cancelButton.setMnemonic(KeyEvent.VK_C);
		cancelButton.setToolTipText("Cancel con mẹ mày");
		
		add(exitButton);
		exitButton.setActionCommand("Exit");
		exitButton.addActionListener(this);
		exitButton.setMnemonic(KeyEvent.VK_E);
		exitButton.setToolTipText("Ấn vào đây là thoát đấy bạn ê");
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new JavaTest2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if("OK".equals(e.getActionCommand()))
			JOptionPane.showMessageDialog(rootPane,"Mày biết thế đủ rồi");
		if("Cancel".equals(e.getActionCommand()))
			JOptionPane.showConfirmDialog(rootPane,"Bỏ ra bạn ê");
		if("Exit".equals(e.getActionCommand()))
			System.exit(0);
			
	}

}
