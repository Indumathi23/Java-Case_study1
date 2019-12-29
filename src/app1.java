import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;

public class app1 {

	private JFrame frame;
	private JTextField f1;
	private JTextField l1;
	private JTextField dob;
	private JTextField mob;
	private JTextField e;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app1 window = new app1();
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
	public app1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 532, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel.setBounds(40, 41, 73, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_1.setBounds(270, 41, 73, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date of Birth");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_2.setBounds(40, 66, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mobile Number");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_3.setBounds(270, 66, 89, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_4.setBounds(40, 91, 73, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		f1 = new JTextField();
		f1.setBounds(123, 38, 117, 20);
		frame.getContentPane().add(f1);
		f1.setColumns(10);
		
		l1 = new JTextField();
		l1.setBounds(369, 38, 117, 20);
		frame.getContentPane().add(l1);
		l1.setColumns(10);
		
		dob = new JTextField();
		dob.setBounds(123, 63, 117, 20);
		frame.getContentPane().add(dob);
		dob.setColumns(10);
		
		mob = new JTextField();
		mob.setBounds(369, 63, 117, 20);
		frame.getContentPane().add(mob);
		mob.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Application form");
		lblNewLabel_5.setBounds(173, 11, 133, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdb = new JRadioButton("M");
		buttonGroup.add(rdb);
		rdb.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdb.setBounds(123, 87, 35, 23);
		frame.getContentPane().add(rdb);
		
		JRadioButton rdb1 = new JRadioButton("F");
		buttonGroup.add(rdb1);
		rdb1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rdb1.setBounds(189, 87, 35, 23);
		frame.getContentPane().add(rdb1);
		
		e = new JTextField();
		e.setBounds(369, 88, 117, 20);
		frame.getContentPane().add(e);
		e.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Email id");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNewLabel_6.setBounds(270, 91, 73, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea ta = new JTextArea();
		ta.setBounds(40, 151, 446, 117);
		frame.getContentPane().add(ta);
		
		JButton act = new JButton("SUBMIT");
		act.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		String gen;
				if(rdb.isSelected())
				{
					gen="male";
				}
					else
					{
						gen="female";
				    }
			ta.setText("FIRST NAME\tLAST NAME\tDOB\tMOB NO\tMAIL ID\n"+f1.getText()+"\t"+l1.getText()+"\t"+dob.getText()+"\t"+mob.getText()+"\t"+e.getText());
				
			}
		});
		act.setFont(new Font("Times New Roman", Font.BOLD, 11));
		act.setBounds(221, 117, 89, 23);
		frame.getContentPane().add(act);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(40, 344, 627, 110);
		frame.getContentPane().add(textArea);
		
		
		
		
		
				
	}
}
