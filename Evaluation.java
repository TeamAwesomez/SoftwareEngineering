package ManagementProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JScrollBar;

public class Evaluation extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluation frame = new Evaluation();
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
	public Evaluation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 512);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(897, 61, 17, 393);
		contentPane.add(scrollBar_1);
		
		JButton btnEvaluation = new JButton("Evaluation");
		btnEvaluation.setBounds(37, 56, 117, 25);
		contentPane.add(btnEvaluation);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"New column", "New column", "New column"
			}
		));
		table_1.setBounds(199, 61, 265, 387);
		contentPane.add(table_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 240));
		textArea.setBounds(492, 61, 422, 393);
		contentPane.add(textArea);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(210, 44, 70, 15);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(292, 44, 70, 15);
		contentPane.add(lblSurname);
		
		JLabel lblRating = new JLabel("Rating");
		lblRating.setBounds(381, 44, 70, 15);
		contentPane.add(lblRating);
		
		JLabel lblCommnetForm = new JLabel("Comment Form");
		lblCommnetForm.setBounds(492, 44, 117, 15);
		contentPane.add(lblCommnetForm);
	}
}
