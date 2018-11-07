package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class JComponentEx extends JFrame implements ActionListener {

	private JPanel contentPane;

	public JComponentEx() {
		
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 260, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("Magenta/yellow Button");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Arial", Font.ITALIC, 20));
		btnNewButton.setBackground(Color.YELLOW);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Disabled Button");
		btnNewButton_1.setEnabled(false);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("getX(), getY()");
		contentPane.add(btnNewButton_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
