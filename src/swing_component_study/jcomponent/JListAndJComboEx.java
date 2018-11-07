package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class JListAndJComboEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JList list_1;
	private ImageIcon[] icons;
	private JTextField tfName;
	private JComboBox<String> cmbList;

	public JListAndJComboEx() {
		initComponents();
	}

	private void initComponents() {
		setTitle("JListAndJComboEx");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 821, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 10, 0));

		JPanel pJList = new JPanel();
		pJList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJList);
		pJList.setLayout(new GridLayout(0, 3, 10, 0));
		// 과일
		JList<String> list = new JList<>(/* fruits */);// <>안에 제네릭(타입)선언
		list.setListData(getStringData());
		pJList.add(list);

		list_1 = new JList();
		list_1.setListData(getImgIcons());
		pJList.add(list_1);

		JPanel panel = new JPanel();
		pJList.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel pInput = new JPanel();
		panel.add(pInput, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("이름입력 후 <Enter>키");
		pInput.add(lblNewLabel);

		tfName = new JTextField();
		tfName.addActionListener(this);
		pInput.add(tfName);
		tfName.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);

		JList listName = new JList();
		scrollPane.setViewportView(listName);

		JPanel pJCombo = new JPanel();
		pJCombo.setBorder(new TitledBorder(null, "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJCombo);
		pJCombo.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel subPjcombo1 = new JPanel();
		pJCombo.add(subPjcombo1);

		String[] strArr1 = { "apple", "banana", "cherry" };
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(strArr1);
		JComboBox<String> cmb1 = new JComboBox<>(model);
		
		subPjcombo1.add(cmb1);

		String[] strArr2 = { "김보민", "우선미", "황경수", "이준민" };
		JComboBox<String> cmb2 = new JComboBox<>();
		subPjcombo1.add(cmb2);
		
		for (int i = 0; i < strArr2.length; i++) {
			cmb2.addItem(strArr2[i]);
		}
		
		cmb2.setSelectedIndex(-1);
		
		cmb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = (String) cmb2.getSelectedItem();
				int index = cmb2.getSelectedIndex();
				JOptionPane.showInputDialog(null,index + "번째 선택된 이름 : " + name);
				
			}
		});
		


		JPanel subPjcombo2 = new JPanel();
		pJCombo.add(subPjcombo2);
		subPjcombo2.setLayout(new GridLayout(0, 2, 10, 10));
		
		JPanel pCmb = new JPanel();
		subPjcombo2.add(pCmb);
		
		cmbList = new JComboBox<String>();
		cmbList.addActionListener(this);
		pCmb.add(cmbList);
		
		
		JLabel lblImg = new JLabel("");
		subPjcombo2.add(lblImg);
	}

	private Object[] getImgIcons() {
		String imgPath = System.getProperty("user.dir") + "\\images\\";
		icons = new ImageIcon[] { new ImageIcon(imgPath + "icon1.png"), new ImageIcon(imgPath + "icon2.png"),
				new ImageIcon(imgPath + "icon3.png"), new ImageIcon(imgPath + "icon4.png"), };
		return icons;
	}

	private String[] getStringData() {
		return new String[] { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry",
				"blackberry" };
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cmbList) {
			do_cmbList_actionPerformed(e);
		}
		if (e.getSource() == tfName) {
			do_tfName_actionPerformed(e);
		}
	}

	protected void do_tfName_actionPerformed(ActionEvent e) {
		tfName.getText();
	}
}