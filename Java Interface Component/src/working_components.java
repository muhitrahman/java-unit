import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")

public class working_components {
	
	private JFrame frame;
	private JPanel MacMenu; 
    private JPanel MacBurger; 
    private JPanel MacChicken;
    private JPanel MacVege; 
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					working_components window = new working_components();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public working_components() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		 final JPanel MacMenu = new JPanel();
		frame.getContentPane().add(MacMenu, "name_260536985401143");
		MacMenu.setLayout(null);
		MacMenu.setVisible(true);
		
		final JPanel MacBurger = new JPanel();
		frame.getContentPane().add(MacBurger, "name_260541878401569");
		MacBurger.setLayout(null);
		MacBurger.setVisible(false);
		
		final JPanel MacChicken = new JPanel();
		frame.getContentPane().add(MacChicken, "name_260546094581940");
		MacChicken.setLayout(null);
		MacChicken.setVisible(false);
		
		final JPanel MacSalad = new JPanel();
		frame.getContentPane().add(MacSalad, "name_260600803154251");
		MacSalad.setLayout(null);
		MacSalad.setVisible(false);
		
		JButton btnNewButton = new JButton("Mac Burgers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				MacBurger.setVisible(true);
				MacMenu.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 72, 113, 23);
		MacMenu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mac Chicken");
		btnNewButton_1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent arg0){
				MacChicken.setVisible(true);
				MacMenu.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(10, 135, 113, 23);
		MacMenu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Mac Salad");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MacMenu.setVisible(false);
				MacSalad.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(10, 198, 105, 23);
		MacMenu.add(btnNewButton_2);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(156, 71, 200, 152);
		MacMenu.add(textArea);
		
		JLabel lblWaiting = new JLabel("Waiting........");
		lblWaiting.setForeground(Color.RED);
		lblWaiting.setBounds(204, 33, 113, 23);
		MacMenu.add(lblWaiting);
		
		
		final JCheckBox chckbxBurgers = new JCheckBox("Mac Burgers");
		chckbxBurgers.setBounds(74, 66, 200, 50);
		MacBurger.add(chckbxBurgers);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Mac Fries");
		chckbxNewCheckBox.setBounds(74, 119, 200, 50);
		MacBurger.add(chckbxNewCheckBox);
		
		final JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mac Drinks");
		chckbxNewCheckBox_1.setBounds(74, 172, 200, 50);
		MacBurger.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("Burger Meal");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(176, 11, 127, 50);
		MacBurger.add(lblNewLabel);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s = new String();
				
				if (chckbxBurgers.isSelected()){
					
					s = s + "Burgers,  ";
				}
				if (chckbxNewCheckBox.isSelected()){
					s = s + "Fries,  ";
				}
				if (chckbxNewCheckBox_1.isSelected()){
					s = s + "Drinks,  ";
				}
				textArea.setText(s);
				
				MacMenu.setVisible(true);
				MacBurger.setVisible(false);
			}
		});
		btnDone.setBackground(Color.GREEN);
		btnDone.setBounds(287, 186, 89, 23);
		MacBurger.add(btnDone);
		
		final JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Mac Chicken");
		chckbxNewCheckBox_2.setBounds(59, 75, 134, 41);
		MacChicken.add(chckbxNewCheckBox_2);
		
		final JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Mac Fries");
		chckbxNewCheckBox_3.setBounds(59, 133, 134, 41);
		MacChicken.add(chckbxNewCheckBox_3);
		
		final JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Mac Drinks");
		chckbxNewCheckBox_4.setBounds(59, 187, 134, 50);
		MacChicken.add(chckbxNewCheckBox_4);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Meal");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(167, 27, 128, 32);
		MacChicken.add(lblNewLabel_1);
		
		JButton btnDone_1 = new JButton("Done");
		btnDone_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s = new String();
				
				if(chckbxNewCheckBox_2.isSelected()){
					s = s + "Chicken,  ";
				}
				if (chckbxNewCheckBox_3.isSelected()){
					s = s+ "Fries,  ";
				}
				if(chckbxNewCheckBox_4.isSelected()){
					s = s + "Drinks,  ";
				}
				textArea.setText(s);
				
				MacMenu.setVisible(true);
				MacChicken.setVisible(false);
			}
		});
		btnDone_1.setBackground(Color.GREEN);
		btnDone_1.setBounds(264, 201, 89, 23);
		MacChicken.add(btnDone_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad Meal");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(163, 23, 138, 50);
		MacSalad.add(lblNewLabel_2);
		
		final JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Mac Salad");
		chckbxNewCheckBox_5.setBounds(53, 80, 200, 50);
		MacSalad.add(chckbxNewCheckBox_5);
		
		final JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Mac Fries");
		chckbxNewCheckBox_6.setBounds(53, 133, 200, 50);
		MacSalad.add(chckbxNewCheckBox_6);
		
		final JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Mac Drinks");
		chckbxNewCheckBox_7.setBounds(53, 186, 200, 50);
		MacSalad.add(chckbxNewCheckBox_7);
		
		JButton btnDone_2 = new JButton("Done");
		btnDone_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String s = new String ();
				if (chckbxNewCheckBox_5.isSelected()){
					s = s + "Salads,  ";
				}
				if (chckbxNewCheckBox_6.isSelected()){
					s = s+ "Fries,  ";
				}
				if (chckbxNewCheckBox_7.isSelected()){
					s = s+ "Drinks,  ";
				}
				textArea.setText(s);
;
				MacMenu.setVisible(true);
				MacSalad.setVisible(false);
			}
		});
		btnDone_2.setBackground(Color.GREEN);
		btnDone_2.setBounds(258, 200, 89, 23);
		MacSalad.add(btnDone_2);
	}
}
