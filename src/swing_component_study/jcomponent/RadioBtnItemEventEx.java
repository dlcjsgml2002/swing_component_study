package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;


public class RadioBtnItemEventEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnApple;
	private JRadioButton rdbtnPear;
	private JRadioButton rdbtnCherry;
	private JLabel lblFruit;
	private String imagePath;
	private ImageIcon appleIcon;
	private ImageIcon pearIcon;
	private ImageIcon cherryIcon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioBtnItemEventEx frame = new RadioBtnItemEventEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RadioBtnItemEventEx() {
		appleIcon = new ImageIcon(imagePath + "apple.jpg");
		pearIcon = new ImageIcon(imagePath + "pear.jpg");
		cherryIcon = new ImageIcon(imagePath + "pear.jpg");
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		imagePath = System.getProperty("user.dir") + "\\images\\fruits\\";
		rdbtnApple = new JRadioButton("사과");
		rdbtnApple.addItemListener(this);
		buttonGroup.add(rdbtnApple);
		panel.add(rdbtnApple);
		
		rdbtnPear = new JRadioButton("배");
		rdbtnPear.addItemListener(this);
		buttonGroup.add(rdbtnPear);
		panel.add(rdbtnPear);
		
		rdbtnCherry = new JRadioButton("체리");
		rdbtnCherry.addItemListener(this);
		buttonGroup.add(rdbtnCherry);
		panel.add(rdbtnCherry);
		
		lblFruit = new JLabel("");
		lblFruit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFruit.setIcon(new ImageIcon(imagePath + "apple.jpg"));
		contentPane.add(lblFruit, BorderLayout.CENTER);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == rdbtnCherry) {
			do_rdbtnCherry_itemStateChanged(e);
		}
		if (e.getSource() == rdbtnPear) {
			do_rdbtnPear_itemStateChanged(e);
		}
		if (e.getSource() == rdbtnApple) {
			do_rdbtnApple_itemStateChanged(e);
		}
	}
	protected void do_rdbtnApple_itemStateChanged(ItemEvent e) {
		lblFruit.setIcon(appleIcon);
	}
	protected void do_rdbtnPear_itemStateChanged(ItemEvent e) {
		lblFruit.setIcon(pearIcon);
	}
	protected void do_rdbtnCherry_itemStateChanged(ItemEvent e) {
		lblFruit.setIcon(cherryIcon);
	}
}
