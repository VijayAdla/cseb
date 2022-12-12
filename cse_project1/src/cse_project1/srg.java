package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class srg {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					srg window = new srg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public srg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 517, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Registration = new JLabel("Registration");
		Registration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Registration.setBounds(167, 11, 257, 33);
		frame.getContentPane().add(Registration);
		
		table = new JTable();
		table.setBounds(57, 96, 1, 1);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel(" name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(65, 83, 58, 14);
		frame.getContentPane().add(lblNewLabel);
		
		table_1 = new JTable();
		table_1.setBounds(39, 96, 1, 1);
		frame.getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(39, 124, 1, 1);
		frame.getContentPane().add(table_2);
		
		table_3 = new JTable();
		table_3.setBounds(39, 112, 1, 1);
		frame.getContentPane().add(table_3);
		
		table_4 = new JTable();
		table_4.setBounds(28, 124, 1, 1);
		frame.getContentPane().add(table_4);
		
		JLabel lblNewLabel_1 = new JLabel(" email id :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(57, 108, 63, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(190, 109, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 75, 86, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel(" serial no :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(57, 146, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 140, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tahoma", Font.BOLD, 11));
		r2.setBounds(265, 186, 109, 23);
		frame.getContentPane().add(r2);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tahoma", Font.BOLD, 11));
		r1.setBounds(182, 186, 53, 23);
		frame.getContentPane().add(r1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Java", "python", "C++", "Oracle"}));
		c1.setBounds(192, 216, 129, 22);
		frame.getContentPane().add(c1);
		
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField_1.getText();
				String i=(String) c1.getSelectedItem();
				if(r1.isSelected())
				{
					JOptionPane.showMessageDialog(btnNewButton, "Name:"+name+"\nGender:male \n Selected :"+i);
				}
		
			if(r2.isSelected())
			{
				JOptionPane.showMessageDialog(btnNewButton, "Name:"+name+"\nGender:Female \n selected ;"+i);
			}
			else
			{
			
				JOptionPane.showMessageDialog(btnNewButton, "please select Gender");
				}	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(373, 389, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(69, 190, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
	
		
		JLabel lblNewLabel_4 = new JLabel("Fav.pro");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(57, 219, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
