import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Color;


public class graphics_interface {

	private JFrame frame;
	private JTextField txtTextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					graphics_interface window = new graphics_interface();
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
	public graphics_interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnButton = new JButton("Button-1");
		btnButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
			txtTextfield.setText("howdy");	
			}
		});
		btnButton.setBounds(279, 206, 89, 23);
		frame.getContentPane().add(btnButton);
		
		JLabel lblLabel = new JLabel("Label-1");
		lblLabel.setBounds(27, 154, 86, 23);
		frame.getContentPane().add(lblLabel);
		
		txtTextfield = new JTextField();
		txtTextfield.setForeground(Color.RED);
		txtTextfield.setBackground(Color.WHITE);
		txtTextfield.setBounds(77, 80, 86, 20);
		frame.getContentPane().add(txtTextfield);
		txtTextfield.setColumns(10);
		
		JList list = new JList();
		list.setBounds(306, 66, 101, 23);
		frame.getContentPane().add(list);
		
		JInternalFrame internalFrame = new JInternalFrame("JInternalFrame-1");
		internalFrame.setBounds(127, 11, 182, 34);
		frame.getContentPane().add(internalFrame);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(306, 106, 101, 22);
		frame.getContentPane().add(textArea);
		
		JCheckBox chckbxCheckBox = new JCheckBox("Check Box-1");
		chckbxCheckBox.setBounds(27, 206, 97, 23);
		frame.getContentPane().add(chckbxCheckBox);
		
		JRadioButton rdbtnRadioButton = new JRadioButton("Radio Button-1");
		rdbtnRadioButton.setBounds(145, 206, 109, 23);
		frame.getContentPane().add(rdbtnRadioButton);
		
		JLabel lblTextFiel = new JLabel("Text Field");
		lblTextFiel.setBounds(22, 83, 56, 14);
		frame.getContentPane().add(lblTextFiel);
		
		JLabel lblNewLabel = new JLabel("List");
		lblNewLabel.setBounds(262, 67, 34, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Text Area");
		lblNewLabel_1.setBounds(240, 111, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		internalFrame.setVisible(true);
	}
}
