import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Desafio1 {

	private JFrame frame;
	private JTextField fieldFrase;
	private JTextField fieldFraseInversa;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio1 window = new Desafio1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Desafio1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inverter a ordem da frase");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(120, 30, 215, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase: ");
		lblNewLabel_1.setBounds(40, 86, 91, 14);
		frame.getContentPane().add(lblNewLabel_1);

		
		JButton btnReverter = new JButton("Reverter frase");
		btnReverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = fieldFrase.getText();
				String[] palavra = frase.split(" ");
				ArrayList<String> listaPalavrasInvertidas = reverterFrase(palavra);
				String fraseInversa = String.join(" ", listaPalavrasInvertidas);
		        fieldFraseInversa.setText(fraseInversa);
			}
		});
		btnReverter.setBounds(166, 160, 120, 23);
		frame.getContentPane().add(btnReverter);
	
		JLabel lblNewLabel_2 = new JLabel("Frase inversa:");
		lblNewLabel_2.setBounds(40, 115, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton bntVoltar = new JButton("Voltar");
		bntVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		bntVoltar.setBounds(31, 210, 89, 23);
		frame.getContentPane().add(bntVoltar);
		
		fieldFrase = new JTextField();
		fieldFrase.setBounds(141, 83, 254, 20);
		frame.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		fieldFraseInversa = new JTextField();
		fieldFraseInversa.setEditable(false);
		fieldFraseInversa.setBounds(141, 112, 254, 20);
		frame.getContentPane().add(fieldFraseInversa);
		fieldFraseInversa.setColumns(10);
	}
	
	public static ArrayList<String> reverterFrase(String[] palavra){
		ArrayList<String> listaPalavras = new ArrayList();
		for (int i  = palavra.length -1; i>=0; i--) {
			listaPalavras.add(palavra[i]);
		}
		for(String fraseInversa : listaPalavras) {
			System.out.print(fraseInversa+" ");
		}	
		return listaPalavras;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
