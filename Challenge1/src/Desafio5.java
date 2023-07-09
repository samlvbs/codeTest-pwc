import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class Desafio5 {

	private JFrame frmCodeTest;
	private JTextField fieldPalavra;
	private JTextField fieldResposta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio5 window = new Desafio5();
					window.frmCodeTest.setVisible(true);
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
		frmCodeTest = new JFrame();
		frmCodeTest.setTitle("Code Test - Samuel Vilas Boas - Desafio 5");
		frmCodeTest.setBounds(100, 100, 450, 300);
		frmCodeTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCodeTest.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificar se é anagrama de um palindromo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(49, 26, 385, 22);
		frmCodeTest.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a palavra:");
		lblNewLabel_1.setBounds(95, 74, 104, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1);
		
		fieldPalavra = new JTextField();
		fieldPalavra.setText("racecar");
		fieldPalavra.setBounds(199, 71, 133, 20);
		frmCodeTest.getContentPane().add(fieldPalavra);
		fieldPalavra.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("A palavra é anagrama de um palindromo?");
		lblNewLabel_1_1.setBounds(24, 105, 239, 14);
		frmCodeTest.getContentPane().add(lblNewLabel_1_1);
		
		fieldResposta = new JTextField();
		fieldResposta.setEditable(false);
		fieldResposta.setColumns(10);
		fieldResposta.setBounds(273, 102, 95, 20);
		frmCodeTest.getContentPane().add(fieldResposta);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palavra = fieldPalavra.getText();
				String saida;
				if(possuiPalindromo(palavra)) {
					saida = "Sim";
				}else {
					saida = "Não";
				}
				fieldResposta.setText(saida);
			}
		});
		btnVerificar.setBounds(171, 152, 89, 23);
		frmCodeTest.getContentPane().add(btnVerificar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frmCodeTest.dispose();
			}
		});
		btnVoltar.setBounds(10, 209, 89, 23);
		frmCodeTest.getContentPane().add(btnVoltar);
	}
	
	public static boolean possuiPalindromo(String palavra) {
        Map<Character, Integer> frequencia = new HashMap<>();
        for (char c : palavra.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }
        int countImpares = 0;
        for (int freq : frequencia.values()) {
            if (freq % 2 != 0) {
                countImpares++;
            } 
            if (countImpares > 1) {
                return false;
            }
        }
        return true;
    }
	
	public JFrame getFrame() {
		return frmCodeTest;
	}

	public void setFrame(JFrame frame) {
		this.frmCodeTest = frame;
	}

}
