package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerce {
	int i=0;
	int Bill;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 743, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Saved Pictures\\123.jpg"));
		lblNewLabel.setBounds(22, 46, 129, 159);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(224, 162, 46, -102);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Saved Pictures\\new_bg_image.png"));
		lblNewLabel_2.setBounds(224, 46, 122, 159);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\Saved Pictures\\RRR.jpg"));
		lblNewLabel_3.setBounds(427, 46, 129, 159);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Amazon ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(241, 2, 96, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("500/-");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(58, 216, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("581/-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(254, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("50/-");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(455, 216, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblBill = new JLabel("BILL:");
		lblBill.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBill.setBounds(593, 46, 46, 14);
		frame.getContentPane().add(lblBill);
		
		
		JLabel lblcart = new JLabel("CART:0");
		lblcart.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblcart.setBounds(593, 11, 46, 14);
		frame.getContentPane().add(lblcart);
		
		JButton btnNewButton = new JButton("add to cart");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			i++;
			lblcart.setText("Cart : "+i);
			Bill=Bill+500;
			lblBill.setText("Bill : "+Bill);
			
			}
		});
		btnNewButton.setBounds(30, 238, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("add to cart");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart : "+i);
				Bill=Bill+581;
				lblBill.setText("Bill : "+Bill);
			}
		});
		
		btnNewButton_1.setBounds(229, 238, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("add to cart");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lblcart.setText("Cart : "+i);
				Bill=Bill+50;
				lblBill.setText("Bill : "+Bill);
			}
		});
		btnNewButton_2.setBounds(465, 238, 89, 20);
		frame.getContentPane().add(btnNewButton_2);
		
	
		
	}
}
