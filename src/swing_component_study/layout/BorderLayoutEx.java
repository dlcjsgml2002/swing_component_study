package swing_component_study.layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;

public class BorderLayoutEx extends JFrame {

	private JPanel contentPane;

	public BorderLayoutEx() {
		initComponents();
	}
	private void initComponents() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "borderLayout", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("North");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("South");
		contentPane.add(btnNewButton_1, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("West");
		contentPane.add(btnNewButton_2, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("East");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("Center");
		btnNewButton_4.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		contentPane.add(btnNewButton_4, BorderLayout.CENTER);
	}

}
