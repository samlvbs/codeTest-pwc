import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Desafio3 {

	private JFrame frame;
	private JTextField fieldFrase;
	private JTextField fieldPalindromo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desafio3 window = new Desafio3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Desafio3() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Encontrar o maior palindromo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(96, 22, 247, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Insira a frase:");
		lblNewLabel_1.setBounds(33, 80, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fieldFrase = new JTextField();
		fieldFrase.setText("babad");
		fieldFrase.setBounds(151, 77, 247, 20);
		frame.getContentPane().add(fieldFrase);
		fieldFrase.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Maior palindromo: ");
		lblNewLabel_1_1.setBounds(33, 108, 108, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		fieldPalindromo = new JTextField();
		fieldPalindromo.setEditable(false);
		fieldPalindromo.setColumns(10);
		fieldPalindromo.setBounds(151, 105, 247, 20);
		frame.getContentPane().add(fieldPalindromo);
		
		JButton btnEncontrar = new JButton("Encontrar");
		btnEncontrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String frase = fieldFrase.getText();
				String palindromo = maiorPalindromo(frase);
				fieldPalindromo.setText(palindromo);
			}
		});
		btnEncontrar.setBounds(167, 156, 89, 23);
		frame.getContentPane().add(btnEncontrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home window = new Home();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnVoltar.setBounds(10, 207, 89, 23);
		frame.getContentPane().add(btnVoltar);
	}
	
	public static boolean verificaPalindromo(String palavra) {
        int inicio = 0;
        int fim = palavra.length() - 1;
        
        while (inicio<fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
                return false;
            }
            
            inicio++;
            fim--;
        }
        
        return true;
    }
	public static String maiorPalindromo(String palavra) {
        int tamanho = palavra.length();
        ArrayList<String> palindromos = new ArrayList<>();
        
        for (int i = 0; i<tamanho; i++) {
            for (int j = i + 1; j<=tamanho; j++) {
                String substring = palavra.substring(i, j);
                if (verificaPalindromo(substring)) {
                    palindromos.add(substring);
                }
            }
        }
        
        String maiorPalindromo = "";
        for (String palindromo : palindromos) {
            if (palindromo.length() > maiorPalindromo.length()) {
                maiorPalindromo = palindromo;
            }
        }
        
        return maiorPalindromo;
    }
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
