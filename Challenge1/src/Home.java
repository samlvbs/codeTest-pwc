import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Home() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 524, 327);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Desafio de código - Estágio Pwc");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(73, 26, 315, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnDesafio2 = new JButton("Desafio 2");
		btnDesafio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio2 window = new Desafio2();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnDesafio2.setBounds(398, 87, 89, 23);
		frame.getContentPane().add(btnDesafio2);
		
		JLabel lblNewLabel_1 = new JLabel("Desafio 1 - Reverter a ordem das palvaras na frase: ");
		lblNewLabel_1.setBounds(10, 65, 349, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Desafio 2 - Remover caracteres duplicados");
		lblNewLabel_1_1.setBounds(10, 96, 349, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnDesafio1 = new JButton("Desafio 1");
		btnDesafio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio1 window = new Desafio1();
				window.getFrame().setVisible(true);
				frame.dispose();
				
			}
		});
		btnDesafio1.setBounds(398, 56, 89, 23);
		frame.getContentPane().add(btnDesafio1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Desafio 3 - Encontrar substring palindroma mais longa");
		lblNewLabel_1_1_1.setBounds(10, 130, 349, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JButton btnDesafio3 = new JButton("Desafio 3");
		btnDesafio3.setBounds(398, 121, 89, 23);
		frame.getContentPane().add(btnDesafio3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Desafio 4 - Colocar em maisculo a primeira letra de cada frase:");
		lblNewLabel_1_1_2.setBounds(10, 159, 378, 14);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JButton btnDesafio4 = new JButton("Desafio 4");
		btnDesafio4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desafio4 window = new Desafio4();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnDesafio4.setBounds(398, 155, 89, 23);
		frame.getContentPane().add(btnDesafio4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Desafio 5 - Verifica se é um anagrama de um palindromo:");
		lblNewLabel_1_1_3.setBounds(10, 188, 349, 14);
		frame.getContentPane().add(lblNewLabel_1_1_3);
		
		JButton btnDesafio5 = new JButton("Desafio 5");
		btnDesafio5.setBounds(398, 184, 89, 23);
		frame.getContentPane().add(btnDesafio5);
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
