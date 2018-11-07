package swing_component_study.jcomponent;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JComponentMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComponentMain frame = new JComponentMain();
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
	public JComponentMain() {
		initComponents();
	}
	private void initComponents() {
		setTitle("모든 JComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));
		
		btn1 = new JButton("btnCheckBoxEx");
		btn1.addActionListener(this);
		contentPane.add(btn1);
		
		btn2 = new JButton("JButtonEx");
		btn2.addActionListener(this);
		contentPane.add(btn2);
		
		btn3 = new JButton("JComponentEx");
		btn3.addActionListener(this);
		contentPane.add(btn3);
		
		btn4 = new JButton("JLabelEx");
		btn4.addActionListener(this);
		contentPane.add(btn4);
		
		btn5 = new JButton("JListAndJComboEx");
		btn5.addActionListener(this);
		contentPane.add(btn5);
		
		btn6 = new JButton("JTextFieldOtherEx");
		btn6.addActionListener(this);
		contentPane.add(btn6);
		
		btn7 = new JButton("RadioBtnItemEventEx");
		btn7.addActionListener(this);
		contentPane.add(btn7);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn7) {
			do_RadioBtnItemEventEx_actionPerformed(e);
		}
		if (e.getSource() == btn6) {
			try {
				do_JTextFieldOtherEx_actionPerformed(e);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (e.getSource() == btn5) {
			do_JListAndJComboEx_actionPerformed(e);
		}
		if (e.getSource() == btn4) {
			do_JLabelEx_actionPerformed(e);
		}
		if (e.getSource() == btn3) {
			do_JComponentEx_actionPerformed(e);
		}
		if (e.getSource() == btn2) {
			do_JButtonEx_actionPerformed(e);
		}
		if (e.getSource() == btn1) {
			do_btnCheckBoxEx_actionPerformed(e);
		}
	}
	protected void do_btnCheckBoxEx_actionPerformed(ActionEvent e) {
		CheckBoxEx newForm = new CheckBoxEx();
		newForm.setVisible(true);
	}
	protected void do_JButtonEx_actionPerformed(ActionEvent e) {
		JButtonEx newForm = new JButtonEx();
		newForm.setVisible(true);
	}
	protected void do_JComponentEx_actionPerformed(ActionEvent e) {
		JComponentEx newForm = new JComponentEx();
		newForm.setVisible(true);
	}
	protected void do_JLabelEx_actionPerformed(ActionEvent e) {
		JLabelEx newForm = new JLabelEx();
		newForm.setVisible(true);
	}
	protected void do_JListAndJComboEx_actionPerformed(ActionEvent e) {
		JListAndJComboEx newForm = new JListAndJComboEx();
		newForm.setVisible(true);
	}
	protected void do_JTextFieldOtherEx_actionPerformed(ActionEvent e) throws ParseException {
		JTextFieldOtherEx newForm = new JTextFieldOtherEx();
		newForm.setVisible(true);
	}
	protected void do_RadioBtnItemEventEx_actionPerformed(ActionEvent e) {
		RadioBtnItemEventEx newForm = new RadioBtnItemEventEx();
		newForm.setVisible(true);
	}
}
