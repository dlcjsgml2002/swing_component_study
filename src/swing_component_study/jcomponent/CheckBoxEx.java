package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckBoxEx extends JFrame implements ActionListener, ItemListener {

	private JPanel contentPane;
	private JCheckBox chckbxCherry;
	private JCheckBox chckbxPear;
	private JCheckBox chckbxApple;
	private int result = 0;
	
	public CheckBoxEx() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblPrice = new JLabel("사과 100원, 배 500원, 체리 200000원");
		contentPane.add(lblPrice);

		chckbxApple = new JCheckBox("사과");
		chckbxApple.addItemListener(this);
		chckbxApple.addActionListener(this);
		contentPane.add(chckbxApple);

		chckbxPear = new JCheckBox("배");
		chckbxPear.addItemListener(this);
		chckbxPear.addActionListener(this);

		chckbxCherry = new JCheckBox("체리");
		chckbxCherry.addItemListener(this);
		chckbxCherry.addActionListener(this);

		contentPane.add(chckbxPear);
		contentPane.add(chckbxCherry);
		JLabel labelResult = new JLabel("현재 " + result + "원입니다.");
		contentPane.add(labelResult);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chckbxCherry) {
			do_chckbxCherry_itemStateChanged(e);
		}
		if (e.getSource() == chckbxPear) {
			do_chckbxPear_itemStateChanged(e);
		}
		if (e.getSource() == chckbxApple) {
			do_chckbxApple_itemStateChanged(e);
		}
	}
	protected void do_chckbxApple_itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			result += 100;
		} else {
			result -= 100;
		}
	}
	protected void do_chckbxPear_itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			result += 500;
		} else {
			result -= 500;
		}
	}
	protected void do_chckbxCherry_itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			result += 200000;
		} else {
			result -= 200000;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
