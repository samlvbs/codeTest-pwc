import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Desafio5 {

	private JFrame frame;
	private JTextField fieldPalavra;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio5 window = new Desafio5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Desafio5() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificar se é anagrama de um palindromo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(49, 26, 385, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a palavra:");
		lblNewLabel_1.setBounds(31, 77, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fieldPalavra = new JTextField();
		fieldPalavra.setBounds(145, 71, 133, 20);
		frame.getContentPane().add(fieldPalavra);
		fieldPalavra.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Insira a frase:");
		lblNewLabel_1_1.setBounds(31, 105, 82, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 99, 260, 20);
		frame.getContentPane().add(textField_1);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVerificar.setBounds(171, 152, 89, 23);
		frame.getContentPane().add(btnVerificar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(10, 209, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

}
