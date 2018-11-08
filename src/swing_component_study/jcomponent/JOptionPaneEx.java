package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JOptionPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfResult;
	private JButton btnInputName;
	private JButton btnMessage;
	private JButton btnConfirm;

	public JOptionPaneEx() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 10));

		JPanel panel = new JPanel();
		contentPane.add(panel);

		btnInputName = new JButton("Input Name");
		btnInputName.addActionListener(this);
		panel.add(btnInputName);

		btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);

		btnMessage = new JButton("Message");
		btnMessage.addActionListener(this);
		panel.add(btnMessage);

		tfResult = new JTextField();
		panel.add(tfResult);
		tfResult.setColumns(10);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			do_btnConfirm_actionPerformed(e);
		}
		if (e.getSource() == btnMessage) {
			do_btnMessage_actionPerformed(e);
		}
		if (e.getSource() == btnInputName) {
			do_btnInputName_actionPerformed(e);
		}
	}

	protected void do_btnInputName_actionPerformed(ActionEvent e) {
		String[] selectValues = { "가", "나", "다" };
		JOptionPane.showInputDialog(null, "showInputDialog", "showInputDialog", JOptionPane.INFORMATION_MESSAGE, null,
				selectValues, selectValues[0]);
	}

	protected void do_btnMessage_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "당신의 java 문제 있어요 시공좋아", "Message", JOptionPane.ERROR_MESSAGE);
	}

	protected void do_btnConfirm_actionPerformed(ActionEvent e) {
		int result = JOptionPane.showConfirmDialog(null, "계속할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.CLOSED_OPTION) {
			JOptionPane.showMessageDialog(null, "무아앙");
		} else if (result == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "이것은 자바다람쥐");
		} else {
			JOptionPane.showMessageDialog(null, "위너 위너 치킨 디너");
		}
	}
}
