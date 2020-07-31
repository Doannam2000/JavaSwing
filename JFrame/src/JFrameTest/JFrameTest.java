package JFrameTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameTest extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton okButton,cancelButton,exitButton;
	public JFrameTest() {
		creatAndShow();
	}
	public void creatAndShow()
	{
		okButton = new JButton("Ok");
		cancelButton = new JButton("Cancel");
		exitButton = new JButton("Exit");
		setSize(400,300);
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
	}
	public static void main(String[] args) 
	{
		new JFrameTest();
	}

	/**
	 * Create the frame.
	 */
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if("Ok".equals(e.getActionCommand()))
			JOptionPane.showMessageDialog(rootPane, "Bạn biết hơi bị nhiều rồi đấy");
		if("Cancel".equals(e.getActionCommand()))
			JOptionPane.showConfirmDialog(rootPane,"Bỏ ra bạn ê");
		if("Exit".equals(e.getActionCommand()))
			System.exit(0);
	}

}
