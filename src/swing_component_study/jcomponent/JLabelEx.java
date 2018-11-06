package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JLabelEx extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabelEx frame = new JLabelEx();
					frame.setVisible(true);
					
					String dir = System.getProperty("user.dir") + "\\images";
					
					System.out.println(dir);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JLabelEx() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel txtLabel = new JLabel("사랑합니다");
		contentPane.add(txtLabel);
		
		JLabel lblNewLabel = new JLabel("");
		String imagePath = System.getProperty("user.dir") + "\\images\\";
		lblNewLabel.setIcon(new ImageIcon(imagePath + "beauty.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("보고싶으면 카톡하세요");
		lblNewLabel_1.setIcon(new ImageIcon(imagePath + "normalIcon.gif"));
		contentPane.add(lblNewLabel_1);
	}

}
