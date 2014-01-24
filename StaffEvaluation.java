package ManagementProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class StaffEvaluation extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffEvaluation frame = new StaffEvaluation();
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
	public StaffEvaluation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 544);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(151, 131, 750, 336);
		contentPane.add(table);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(12, 131, 117, 25);
		contentPane.add(btnEdit);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(12, 168, 117, 25);
		contentPane.add(btnAdd);
		
		JButton btnDelrte = new JButton("Delete");
		btnDelrte.setBounds(12, 205, 117, 25);
		contentPane.add(btnDelrte);
		
		JButton btnEvaluete = new JButton("Evaluation");
		btnEvaluete.setBounds(12, 242, 117, 25);
		contentPane.add(btnEvaluete);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/gkroustis/Pictures/speakers.png"));
		lblNewLabel.setBounds(463, 12, 191, 88);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(151, 116, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(232, 116, 70, 15);
		contentPane.add(lblSurname);
		
		JLabel lblGenre = new JLabel("Genre");
		lblGenre.setBounds(325, 116, 70, 15);
		contentPane.add(lblGenre);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(749, 116, 70, 15);
		contentPane.add(lblSalary);
		
		JLabel lblNewLabel_1 = new JLabel("Department");
		lblNewLabel_1.setBounds(569, 116, 85, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setBounds(417, 116, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblDegrees = new JLabel("Degree");
		lblDegrees.setBounds(666, 116, 70, 15);
		contentPane.add(lblDegrees);
		
		JLabel lblLanguanges = new JLabel("Languanges");
		lblLanguanges.setBounds(817, 116, 108, 15);
		contentPane.add(lblLanguanges);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(487, 116, 70, 15);
		contentPane.add(lblAddress);
	}
}
