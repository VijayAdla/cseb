package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class data {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					data window = new data();
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
	public data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Load");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mrec","root","mysql");
					String query="select*from cse1";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
				    ResultSetMetaData rsmd = rs.getMetaData();
				    DefaultTableModel m=(DefaultTableModel) table.getModel();
				    int cols=rsmd.getColumnCount();
				    String[] colName=new String[cols];
				    for(int i=0;i<cols;i++)
				    	colName[i]=rsmd.getColumnName(i+1);
				    m.setColumnIdentifiers(colName);
				    String sno,name,marks;
				    while(rs.next())
				    {
				    	sno=rs.getString(1);
				    	name=rs.getString(2);
				    	marks=rs.getString(3);
				    	String[] row= {sno,name,marks};
				    	m.addRow(row);
				    }
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(64, 68, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(44, 102, 317, 182);
		frame.getContentPane().add(table);
	}
}
