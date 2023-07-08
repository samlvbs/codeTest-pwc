import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Desafio4 {

	private JFrame frame;
	private JTextField fieldFrase;
	private JTextField fieldFormatada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio4 window = new Desafio4();
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
	public Desafio4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Colocar a primeira letra da frase em maiusculo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 23, 379, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase: ");
		lblNewLabel_1.setBounds(10, 87, 50, -17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insira a frase");
		lblNewLabel_2.setBounds(30, 81, 26, -7);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Insira a frase:");
		lblNewLabel_3.setBounds(40, 68, 100, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		fieldFrase = new JTextField();
		fieldFrase.setBounds(143, 65, 266, 20);
		frame.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Frase formatada:");
		lblNewLabel_3_1.setBounds(40, 96, 100, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		fieldFormatada = new JTextField();
		fieldFormatada.setEditable(false);
		fieldFormatada.setColumns(10);
		fieldFormatada.setBounds(143, 93, 266, 20);
		frame.getContentPane().add(fieldFormatada);
	}
}
