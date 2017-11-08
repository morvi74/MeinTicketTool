package application;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class StartWindow extends JFrame {
	public StartWindow() {
		setTitle("Mein Ticket Tool");
		getContentPane().setLayout(null);
		
		JButton btnOpenDb = new JButton("Open DB");
		btnOpenDb.setBounds(249, 351, 89, 23);
		getContentPane().add(btnOpenDb);
	}
}
