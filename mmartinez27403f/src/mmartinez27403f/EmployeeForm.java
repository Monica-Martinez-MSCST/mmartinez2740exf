package mmartinez27403f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private JTextField empIdTextField;
	private JTextField empNameTextField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField positionTextField;
	private JComboBox deptComboBox;
	private JList employeeList;
	private DefaultListModel employeeListModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
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
	public EmployeeForm() {
		setTitle("Exercise 3F: Overloaded Constructors");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 132);
		contentPane.add(scrollPane);
		
		employeeListModel = new DefaultListModel();
		employeeList = new JList(employeeListModel);
		scrollPane.setViewportView(employeeList);
		
		JLabel lblNewLabel = new JLabel("Employee ID:");
		lblNewLabel.setBounds(22, 161, 64, 14);
		contentPane.add(lblNewLabel);
		
		empIdTextField = new JTextField();
		empIdTextField.setText("101");
		lblNewLabel.setLabelFor(empIdTextField);
		empIdTextField.setBounds(107, 155, 134, 20);
		contentPane.add(empIdTextField);
		empIdTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Employee name:");
		lblNewLabel_1.setBounds(20, 192, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		empNameTextField = new JTextField();
		empNameTextField.setText("Monica Martinez");
		lblNewLabel_1.setLabelFor(empNameTextField);
		empNameTextField.setBounds(107, 186, 134, 20);
		contentPane.add(empNameTextField);
		empNameTextField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Department:");
		lblNewLabel_2.setBounds(20, 223, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Position:");
		lblNewLabel_3.setBounds(20, 254, 56, 14);
		contentPane.add(lblNewLabel_3);
		
		positionTextField = new JTextField();
		positionTextField.setText("Student");
		lblNewLabel_3.setLabelFor(positionTextField);
		positionTextField.setBounds(107, 248, 134, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		deptComboBox = new JComboBox();
		lblNewLabel_2.setLabelFor(deptComboBox);
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Business Office", "Human Resources", "Manufacturing", "Shipping", "Maintenance "}));	
		deptComboBox.setBounds(107, 217, 134, 20);
		contentPane.add(deptComboBox);
		
		JButton noArgConstructorButton = new JButton("No Arg");
		noArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_noArgConstructorButton_actionPerformed(e);
			}
		});
		noArgConstructorButton.setBounds(10, 307, 89, 23);
		contentPane.add(noArgConstructorButton);
		
		JButton twoArgConstructorButton = new JButton("2 Arg");
		twoArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_twoArgConstructorButton_actionPerformed(arg0);
			}
		});
		twoArgConstructorButton.setBounds(141, 307, 89, 23);
		contentPane.add(twoArgConstructorButton);
		
		JButton fourArgConstructorButton = new JButton("4 Arg");
		fourArgConstructorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_fourArgConstructorButton_actionPerformed(arg0);
			}
		});
		fourArgConstructorButton.setBounds(283, 307, 89, 23);
		contentPane.add(fourArgConstructorButton);
	}
	protected void do_twoArgConstructorButton_actionPerformed(ActionEvent e) {
		int id = Integer.parseInt(empIdTextField.getText());
		Employee emp = new Employee(id, empNameTextField.getText());
		employeeListModel.addElement(emp);
	}
	protected void do_noArgConstructorButton_actionPerformed(ActionEvent e) {
		Employee emp = new Employee();
		employeeListModel.addElement(emp);
	}
	protected void do_fourArgConstructorButton_actionPerformed(ActionEvent arg0) {
		int id = Integer.parseInt(empIdTextField.getText());
		String dept = (String) deptComboBox.getSelectedItem();
		Employee emp = new Employee(id, empNameTextField.getText(), dept, positionTextField.getText());
		employeeListModel.addElement(emp);
	}
}



    
    