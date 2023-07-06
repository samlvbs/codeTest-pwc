import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ArrayList;

public class Window {

	private JFrame frame;
	private JTextField fieldFrase;
	private JTextField fieldFraseInversa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		String frase;
		String[] palavra;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window() {
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
		
		JLabel lblNewLabel = new JLabel("Reverta a ordem da frase");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(120, 30, 215, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase: ");
		lblNewLabel_1.setBounds(40, 86, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fieldFrase = new JTextField();
		fieldFrase.setBounds(130, 83, 244, 20);
		frame.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		
		JButton btnReverter = new JButton("Reverter frase");
		btnReverter.setBounds(166, 160, 120, 23);
		frame.getContentPane().add(btnReverter);
		
		fieldFraseInversa = new JTextField();
		fieldFraseInversa.setEditable(false);
		fieldFraseInversa.setBounds(130, 112, 244, 20);
		frame.getContentPane().add(fieldFraseInversa);
		fieldFraseInversa.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Frase inversa:");
		lblNewLabel_2.setBounds(40, 115, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton bntVoltar = new JButton("Voltar");
		bntVoltar.setBounds(31, 210, 89, 23);
		frame.getContentPane().add(bntVoltar);
	}
	
	public static ArrayList<String> reverterFrase(String[] palavra){
		ArrayList<String> listaPalavras = new ArrayList();
		for (int i  = palavra.length -1; i>=0; i--) {
			listaPalavras.add(palavra[i]);
		}
		return listaPalavras;
	}
}
