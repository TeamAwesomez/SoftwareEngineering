package ManagementProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.UIManager;
import javax.swing.JButton;

import ManagementProject.login.Action;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepartmentSelection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final DepartmentSelection frame = new DepartmentSelection();
					frame.setVisible(true);
					
					
					final class Action implements ActionListener{
						
						
						public void actionPerformed(ActionEvent e) {
							
							
							StaffEvaluation newstaff = new StaffEvaluation(); 
							newstaff.setVisible(true);
							frame.setVisible(false);
						}
						
					} 
					
					
					
					
					
					
					
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DepartmentSelection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Human Resources");
		chckbxNewCheckBox.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox.setBounds(243, 8, 174, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Marketing");
		chckbxNewCheckBox_1.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_1.setBounds(243, 35, 174, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("IT");
		chckbxNewCheckBox_2.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_2.setBounds(243, 62, 174, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Research and Dev.");
		chckbxNewCheckBox_3.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_3.setBounds(243, 89, 174, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox(" I.T.");
		chckbxNewCheckBox_4.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_4.setBounds(243, 116, 174, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Maintenance");
		chckbxNewCheckBox_5.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_5.setBounds(243, 143, 174, 23);
		contentPane.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Sales");
		chckbxNewCheckBox_6.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_6.setBounds(243, 170, 174, 23);
		contentPane.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Customer Service");
		chckbxNewCheckBox_7.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_7.setBounds(243, 197, 174, 23);
		contentPane.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Finance");
		chckbxNewCheckBox_8.setBackground(UIManager.getColor("Button.select"));
		chckbxNewCheckBox_8.setBounds(243, 224, 174, 23);
		contentPane.add(chckbxNewCheckBox_8);
		
		JLabel lblSelectDepartment = new JLabel("Select Department:");
		lblSelectDepartment.setFont(new Font("Dialog", Font.BOLD, 15));
		lblSelectDepartment.setBounds(68, 12, 185, 15);
		contentPane.add(lblSelectDepartment);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBounds(85, 78, 117, 25);
		contentPane.add(btnSelect);
		ActionListener Action = new Action();
		btnSelect.addActionListener(Action);
	
		
		
		
	
	
	
	}	
	
}

